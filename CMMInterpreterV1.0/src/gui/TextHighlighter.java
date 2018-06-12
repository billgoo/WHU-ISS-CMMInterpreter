package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by BG on 2016/12/18.
 */
class TextHighlighter implements DocumentListener {
    private Set<String> reserveWords;
    private Style typeStyle;
    private Style structStyle;
    private Style flowStyle;
    private Style jumpStyle;
    private Style streamStyle;
    private Style mainStyle;
    private Style returnStyle;
    private Style normalStyle;

    public TextHighlighter(JTextPane editor) {
        // 准备着色使用的样式
        typeStyle = ((StyledDocument) editor.getDocument()).addStyle("type_Style", null);
        structStyle = ((StyledDocument) editor.getDocument()).addStyle("struct_Style", null);
        flowStyle = ((StyledDocument) editor.getDocument()).addStyle("flow_Style", null);
        jumpStyle = ((StyledDocument) editor.getDocument()).addStyle("jump_Style", null);
        streamStyle = ((StyledDocument) editor.getDocument()).addStyle("stream_Style", null);
        mainStyle = ((StyledDocument) editor.getDocument()).addStyle("main_Style", null);
        returnStyle = ((StyledDocument) editor.getDocument()).addStyle("return_Style", null);
        normalStyle = ((StyledDocument) editor.getDocument()).addStyle("Keyword_Style", null);

        StyleConstants.setForeground(normalStyle, Color.BLACK);

        reserveWords = new HashSet<String>();
        reserveWords.add("main");
        reserveWords.add("struct");
        reserveWords.add("if");
        reserveWords.add("else");
        reserveWords.add("do");
        reserveWords.add("while");
        reserveWords.add("for");
        reserveWords.add("switch");
        reserveWords.add("case");
        reserveWords.add("default");
        reserveWords.add("read");
        reserveWords.add("write");
        reserveWords.add("int");
        reserveWords.add("double");
        reserveWords.add("bool");
        reserveWords.add("void");
        reserveWords.add("break");
        reserveWords.add("continue");
    }

    /**
     * 取得在文档中下标在pos处的字符.
     * 如果pos为doc.getLength(), 返回的是一个文档的结束符, 不会抛出异常. 如果pos<0, 则会抛出异常.
     * 所以pos的有效值是[0, doc.getLength()]
     *
     * @param doc
     * @param pos
     * @return
     * @throws BadLocationException
     */
    public char getCharAt(Document doc, int pos) throws BadLocationException {
        return doc.getText(pos, 1).charAt(0);
    }

    /**
     * 对单词进行拼接, 并返回单词开始的下标.
     *
     * @param doc
     * @param pos
     * @param len
     * @return
     * @throws BadLocationException
     */
    public void colouring(StyledDocument doc, int pos, int len) throws BadLocationException {
        // 取得插入或者删除后影响到的单词.
        // 例如"public"在b后插入一个空格, 就变成了:"pub lic", 这时就有两个单词要处理:"pub"和"lic"
        // 这时要取得的范围是pub中p前面的位置和lic中c后面的位置
        int start = indexOfWordStart(doc, pos);
        int end = indexOfWordEnd(doc, pos + len);

        char c;
        while (start < end) {
            c = getCharAt(doc, start);
            if (Character.isLetter(c) || c == '_') {
                // 如果是以字母或者下划线开头, 说明是单词
                // pos为处理后的最后一个下标
                start = colouringWord(doc, start);
            } else {
                ++start;
            }
        }
    }

    /**
     * 对单词进行着色, 并返回单词结束的下标.
     *
     * @param doc
     * @param pos
     * @return
     * @throws BadLocationException
     */
    public int colouringWord(StyledDocument doc, int pos) throws BadLocationException {
        int wordEnd = indexOfWordEnd(doc, pos);
        String word = doc.getText(pos, wordEnd - pos);

        if (reserveWords.contains(word)) {
            // 如果是关键字, 就进行关键字的着色, 否则使用普通的着色.
            // 这里有一点要注意, 在insertUpdate和removeUpdate的方法调用的过程中, 不能修改doc的属性.
            // 但我们又要达到能够修改doc的属性, 所以把此任务放到这个方法的外面去执行.
            // 实现这一目的, 可以使用新线程, 但放到swing的事件队列里去处理更轻便一点.
            Style s = setColor(word);
            SwingUtilities.invokeLater(new ColouringTask(doc, pos, wordEnd - pos,s ));
        } else {
            SwingUtilities.invokeLater(new ColouringTask(doc, pos, wordEnd - pos, normalStyle));
        }

        return wordEnd;
    }

    /**
     * 取得下标为pos时, 它所在的单词开始的下标. word(表示pos, ±表示开始或结束的下标)
     *
     * @param doc
     * @param pos
     * @return
     * @throws BadLocationException
     */
    public int indexOfWordStart(Document doc, int pos) throws BadLocationException {
        // 从pos开始向前找到第一个非单词字符.
        while (pos > 0 && isWordCharacter(doc, pos - 1)){
            --pos;
        }
        return pos;
    }

    public int indexOfWordEnd(Document doc, int pos) throws BadLocationException {
        // 从pos开始向后找到第一个非单词字符.
        while (isWordCharacter(doc, pos)){
            ++pos;
        }
        return pos;
    }

    /**
     * 如果一个字符是字母, 数字, 下划线, 则返回true.
     *
     * @param doc
     * @param pos
     * @return
     * @throws BadLocationException
     */
    public boolean isWordCharacter(Document doc, int pos) throws BadLocationException {
        char c = getCharAt(doc, pos);
        if (Character.isLetter(c) || Character.isDigit(c) || c == '_') {
            return true;
        }
        return false;
    }

    /**
     * 在Pane中进行替换
     */
    public void insertUpdate(DocumentEvent e) {

        try {
            colouring((StyledDocument) e.getDocument(), e.getOffset(), e.getLength());
        } catch (BadLocationException e1) {
            e1.printStackTrace();
        }

    }
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }

    public void removeUpdate(DocumentEvent e) {
        try {
            // 因为删除后光标紧接着影响的单词两边, 所以长度就不需要了
            colouring((StyledDocument) e.getDocument(), e.getOffset(), 0);
        } catch (BadLocationException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 设置颜色Style
     * @param word
     * @return Style
     */
    public Style setColor(String word)
    {
        if(word.equals("int") || word.equals("double")
                || word.equals("bool") || word.equals("void"))
        {
            StyleConstants.setForeground(typeStyle, Color.ORANGE);
            return typeStyle;
        }
        else if(word.equals("struct"))
        {
            StyleConstants.setForeground(structStyle, Color.GREEN);
            return structStyle;
        }
        else if(word.equals("if") || word.equals("else") || word.equals("do")
                || word.equals("while") || word.equals("for") || word.equals("switch"))
        {
            StyleConstants.setForeground(flowStyle, Color.BLUE);
            return flowStyle;
        }
        else if(word.equals("case") || word.equals("default") || word.equals("break")
                || word.equals("continue"))
        {
            StyleConstants.setForeground(jumpStyle, Color.CYAN);
            return jumpStyle;
        }
        else if(word.equals("read")||word.equals("write"))
        {
            StyleConstants.setForeground(streamStyle, Color.MAGENTA);
            return streamStyle;
        }
        else if(word.equals("main"))
        {
            StyleConstants.setForeground(mainStyle, Color.PINK);
            return mainStyle;
        }
        else if(word.equals("return"))
        {
            StyleConstants.setForeground(returnStyle, Color.RED);
            return returnStyle;
        }
        return normalStyle;
    }
    /**
     * 完成着色任务
     */
    private class ColouringTask implements Runnable {
        private StyledDocument doc;
        private Style style;
        private int pos;
        private int len;

        public ColouringTask(StyledDocument doc, int pos, int len, Style style) {
            this.doc = doc;
            this.pos = pos;
            this.len = len;
            this.style = style;
        }

        public void run() {
            try {
                // 这里就是对字符进行着色
                doc.setCharacterAttributes(pos, len, style, true);
            } catch (Exception e) {

            }
        }
    }
}
