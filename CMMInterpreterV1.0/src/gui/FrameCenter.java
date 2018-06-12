package gui;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by lhhxkj on 2016/12/06.
 */

public class FrameCenter extends JPanel {

    // 利用singleton的设计模式来实现，在本项目中菜单栏只需要被使用一次，即只需要一个对象

    private JTextArea lineNumber = null;
    private static FrameCenter instance = null;
    private GridBagLayout gridBagLayout;

    /**
     * 有GUI方法构造语法树以后
     * 舍弃jtree控件
     */

    private JTextPane editor = null;

    private JTabbedPane jTabbedPane = null;

    // 左边的tab
    private FrameTabPanel lexerTab = new FrameTabPanel();
    private FrameTabPanel parserTab = new FrameTabPanel();
    private FrameTabPanel intermediateTab = new FrameTabPanel();

    // 获取FrameCenter的对象
    public static FrameCenter getInstance()
    {
        // 确保对象只有一个
        if(instance == null)
        {
            instance = new FrameCenter();
        }
        return instance;
    }
    // 私有的构造函数，外部不能调用
    private FrameCenter() {
        setContent();
    }

    // 中间两个模块的布局管理
    private void setContent() {
        // 为了方便控件随窗体大小变化，使用网格布局
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        // 设置窗体占据整个center框架
        gridBagConstraints.fill = GridBagConstraints.BOTH;        // 全填充
        gridBagConstraints.weighty = GridBagConstraints.BOTH;     // 高度填充
        gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);


        // 左边的词法语法和中间代码生成tab
        gridBagConstraints.weightx = 38.2;

        lexerTab.setEditable(false);
        parserTab.setEditable(false);
        intermediateTab.setEditable(false);
        jTabbedPane = new JTabbedPane(JTabbedPane.TOP);
        jTabbedPane.addTab("Lexer", lexerTab);
        jTabbedPane.addTab("Parser", parserTab);
        jTabbedPane.addTab("Intermediate Code", intermediateTab);
        jTabbedPane.setFont(new Font("Calibri", Font.PLAIN, 18));
        JScrollPane jScrollPaneLeft = new JScrollPane(jTabbedPane);
        jTabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        gridBagLayout.setConstraints(jScrollPaneLeft, gridBagConstraints);
        this.add(jScrollPaneLeft);

        // 右边的 edit text
        gridBagConstraints.weightx = 61.8;
        editor = new JTextPane();
        editor.setFont(new Font("Calibri", Font.PLAIN, 18));
        // 创建行号
        editor.setBorder(new CompoundBorder(new LineNumberBorder(),
                new MatteBorder(0,2,0,0,Color.CYAN)));
        editor.getDocument().addDocumentListener(new TextHighlighter(editor));

        JScrollPane jScrollPaneRight = new JScrollPane(editor);
        gridBagLayout.setConstraints(jScrollPaneRight, gridBagConstraints);
        // 创建行号
        //
        this.add(jScrollPaneRight);

    }

    // 获取editor，以对其内容进行操作
    public JTextArea getJTextArea() {
        return lineNumber;
    }
    public JTextPane getJTextPane(){
        return editor;
    }


    // 获取相应的Tab,对其中的文本域进行操作
    public FrameTabPanel getTab(int i) {
        if (i == 1) {
            return lexerTab;
        }
        else if (i == 2) {
            return parserTab;
        }
        else if (i == 3) {
            return intermediateTab;
        }
        else {
            System.out.println("Error! Please input the right argument!");
            return null;
        }
    }
}
