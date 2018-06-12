package gui;

import cmm.CMMLexer;
import cmm.CMMParser;
import compiler.DefPhaseListener;
import compiler.RefPhaseVisitor;
import generatecode.DefPhase;
import generatecode.util.element;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MyCMMParserVisitor;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.BadLocationException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * Created by lhhxkj on 2016/12/06.
 * 操作主方法
 * 按钮方法定义
 */

public class MenuBarPanel extends JPanel {

    private String fileName = "";
    private final UndoManager undoMgr = new UndoManager();

    private boolean treeShowCheck = false;

    // add menu
    public MenuBarPanel() {
        addMenu();
    }

    // add menu item
    public void addMenu() {

        /**
        * Four Menus
        * First  - File IO
        *   - new
        *   - open
        *   - save
        *   - save as
        *   - exit
        * Second - Edit
        *   - cut
        *   - copy
        *   - paste
        *   - delete
        *   - undo
        *   - redo
        *   - select all
        *   - delete all
        * Second - Four Analysis
        *   - lexer
        *   - parser
        *   - syntax
        *   -- show-tree(check box)
        *   - run
        * Third  - Help
        *   - help
        *   - licenses
        *   - about
        * ps: Run/undo/redo BUTTON (addition: unable to do now)
        */

        JMenu jMenuFile = new JMenu("File");
        JMenu jMenuEdit = new JMenu("Edit");
        JMenu jMenuAnalysis = new JMenu("Analysis");
        JMenu jMenuHelp = new JMenu("Help");

        // Menu Items
        JMenuItem jMenuItemNe = new JMenuItem("New");
        JMenuItem jMenuItemOp = new JMenuItem("Open");
        JMenuItem jMenuItemSa = new JMenuItem("Save");
        JMenuItem jMenuItemSo = new JMenuItem("Save As...");
        JMenuItem jMenuItemEx = new JMenuItem("Exit");

        JMenuItem jMenuItemX = new JMenuItem("Cut");
        JMenuItem jMenuItemC = new JMenuItem("Copy");
        JMenuItem jMenuItemV = new JMenuItem("Paste");
        JMenuItem jMenuItemD = new JMenuItem("Delete");
        JMenuItem jMenuItemZ = new JMenuItem("Undo");
        JMenuItem jMenuItemSZ = new JMenuItem("Redo");
        JMenuItem jMenuItemA = new JMenuItem("Select All");
        JMenuItem jMenuItemCl = new JMenuItem("Clear All");

        JMenuItem jMenuItemLe = new JMenuItem("Lexer");
        JMenuItem jMenuItemPa = new JMenuItem("Parser");
        JMenuItem jMenuItemSy = new JMenuItem("Syntax");
        JCheckBoxMenuItem treeCheck = new JCheckBoxMenuItem("Show Tree",false);
        JMenuItem jMenuItemRun = new JMenuItem("Run");

        JMenuItem jMenuItemHe = new JMenuItem("Help");
        JMenuItem jMenuItemLi = new JMenuItem("Licenses");
        JMenuItem jMenuItemAb = new JMenuItem("About");

        // set font
        jMenuFile.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuAnalysis.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuEdit.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuHelp.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemNe.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemOp.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemSa.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemSo.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemX.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemC.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemV.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemD.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemZ.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemSZ.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemA.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemCl.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemEx.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemLe.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemPa.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemSy.setFont(new Font("Calibri", Font.PLAIN, 18));
        treeCheck.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemRun.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemHe.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemLi.setFont(new Font("Calibri", Font.PLAIN, 18));
        jMenuItemAb.setFont(new Font("Calibri", Font.PLAIN, 18));

        // 热键
        jMenuItemNe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
                ActionEvent.CTRL_MASK));
        jMenuItemOp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                ActionEvent.CTRL_MASK));
        jMenuItemSa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                ActionEvent.CTRL_MASK));
        jMenuItemSo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                ActionEvent.CTRL_MASK|ActionEvent.SHIFT_MASK));
        jMenuItemX.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
                ActionEvent.CTRL_MASK));
        jMenuItemC.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
                ActionEvent.CTRL_MASK));
        jMenuItemV.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
                ActionEvent.CTRL_MASK));
        jMenuItemD.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,
                ActionEvent.CTRL_MASK));
        jMenuItemZ.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
                ActionEvent.CTRL_MASK));
        jMenuItemSZ.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
                ActionEvent.CTRL_MASK|ActionEvent.SHIFT_MASK));
        jMenuItemA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
                ActionEvent.CTRL_MASK));
        jMenuItemRun.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,
                ActionEvent.CTRL_MASK));
        jMenuItemAb.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
                ActionEvent.CTRL_MASK|ActionEvent.SHIFT_MASK));

        // add menu
        jMenuFile.add(jMenuItemNe);
        jMenuFile.add(jMenuItemOp);
        jMenuFile.add(jMenuItemSa);
        jMenuFile.add(jMenuItemSo);
        jMenuFile.addSeparator();
        jMenuFile.add(jMenuItemEx);

        jMenuEdit.add(jMenuItemX);
        jMenuEdit.add(jMenuItemC);
        jMenuEdit.add(jMenuItemV);
        jMenuEdit.add(jMenuItemD);
        jMenuEdit.addSeparator();
        jMenuEdit.add(jMenuItemZ);
        jMenuEdit.add(jMenuItemSZ);
        jMenuEdit.addSeparator();
        jMenuEdit.add(jMenuItemA);
        jMenuEdit.add(jMenuItemCl);

        jMenuAnalysis.add(jMenuItemLe);
        jMenuAnalysis.add(jMenuItemPa);
        jMenuAnalysis.add(jMenuItemSy);
        jMenuAnalysis.addSeparator();
        jMenuAnalysis.add(treeCheck);
        jMenuAnalysis.addSeparator();
        jMenuAnalysis.add(jMenuItemRun);

        jMenuHelp.add(jMenuItemHe);
        jMenuHelp.add(jMenuItemLi);
        jMenuHelp.addSeparator();
        jMenuHelp.add(jMenuItemAb);

        // menu separator for vertical
        // 设置竖直分隔线
        JSeparator jSeparator = new JToolBar.Separator(new Dimension(15, 30));
        jSeparator.setOrientation(SwingConstants.VERTICAL);

        // set menu bar
        JMenuBar jMenuBar = new JMenuBar();

        jMenuBar.add(jMenuFile);
        jMenuBar.add(jSeparator);
        jMenuBar.add(jMenuEdit);
        jMenuBar.add(jSeparator);
        jMenuBar.add(jMenuAnalysis);
        jMenuBar.add(jSeparator);
        jMenuBar.add(jMenuHelp);
        jMenuBar.add(jSeparator);

        // add to the BorderLayout
        this.setLayout(new BorderLayout());
        this.add(jMenuBar,"Center");

        // action for menu item
        //new
        jMenuItemNe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newfile();
            }
        });

        // open
        jMenuItemOp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // open files in directory
                FrameCenter.getInstance().getTab(1).getJTextArea().setText("");
                FrameCenter.getInstance().getTab(2).getJTextArea().setText("");
                FrameCenter.getInstance().getTab(3).getJTextArea().setText("");
                FrameBottom.getInstance().getTab(1).getJTextArea().setText("");
                FrameBottom.getInstance().getTab(2).getJTextArea().setText("");
                FrameBottom.getInstance().getTab(3).getJTextArea().setText("");
                openfile();
            }
        });

        // save
        jMenuItemSa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savefile();
            }
        });

        // save as
        jMenuItemSo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAsfile();
            }
        });

        // Exit
        jMenuItemEx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(FrameMain.getInstance(),
                        "是否要退出？ ", "确认 ", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION)
                    System.exit(0);
                //System.exit(0);
            }
        });

        // cut
        jMenuItemX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameCenter.getInstance().getJTextPane().cut();
            }
        });

        // copy
        jMenuItemC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameCenter.getInstance().getJTextPane().copy();
            }
        });

        // paste
        jMenuItemV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameCenter.getInstance().getJTextPane().paste();
            }
        });

        // delete
        jMenuItemD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int start = FrameCenter.getInstance().getJTextPane().getSelectionStart();
                int end = FrameCenter.getInstance().getJTextPane().getSelectionEnd();
                try {
                    FrameCenter.getInstance().getJTextPane().getDocument().remove(start, end - start);
                } catch (BadLocationException e1) {
                    undoMgr.discardAllEdits();
                }
            }
        });

        // undo
        jMenuItemZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoMgr.canUndo()) {
                    undoMgr.undo();
                }
            }
        });

        // redo
        jMenuItemSZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoMgr.canRedo())
                    undoMgr.redo();
            }
        });

        // select all
        jMenuItemA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameCenter.getInstance().getJTextPane().setSelectionStart(0);
                FrameCenter.getInstance().getJTextPane().setSelectionEnd(
                        FrameCenter.getInstance().getJTextPane().getText().length());
            }
        });

        // clear all
        jMenuItemCl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameCenter.getInstance().getTab(1).getJTextArea().setText("");
                FrameCenter.getInstance().getTab(2).getJTextArea().setText("");
                FrameCenter.getInstance().getTab(3).getJTextArea().setText("");
                FrameBottom.getInstance().getTab(1).getJTextArea().setText("");
                FrameBottom.getInstance().getTab(2).getJTextArea().setText("");
                FrameBottom.getInstance().getTab(3).getJTextArea().setText("");
            }
        });


        // lexer
        jMenuItemLe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playLexer();
            }
        });

        // parse
        jMenuItemPa.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        playParser();
                    }

                }
        );

        // syntax
        jMenuItemSy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playSyntax();
            }
        });

        // tree
        treeCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                treeShowCheck = treeCheck.getState();
            }
        });

        // run
        jMenuItemRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playLexer();
                playParser();
                playSyntax();
                playCompiler();
            }
        });

        // help
        jMenuItemHe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "注意：不支持声明时对数组赋值或索引不为整数！\n" +
                                "非声明语句，赋值和比较运算符两侧不支持不同类型值！\n" +
                                "如果有任何问题欢迎发送邮件到：\n" +
                                "952361589@qq.com 或 billgoo@gmail.com");
            }
        });

        // license
        jMenuItemLi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "解释器构造实践    2014级卓越班   \n" +
                                "        顾岩      2014302580191       \n" +
                                "        朱雨晨   2014302580350       \n\n" +
                                "如果有任何问题欢迎发送邮件到：   \n" +
                                "952361589@qq.com 或 billgoo@gmail.com\n\n" +
                                "All Right Reserved.");
            }
        });

        // about
        jMenuItemAb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {

                final Dialog jd =new Dialog( FrameMain.getInstance(), "dialog", true);
                jd.setUndecorated(true);
                // 我也不知道为什么相对路径就取不到文件
                JLabel jl=new JLabel(new ImageIcon(
                        "D:\\Program Files\\JetBrains\\Project\\JSQ\\CMMInterpreterV1.0\\src\\images\\background.jpg"));
                //jl.setIcon(new ImageIcon("gui/background.jpg"));
                jd.add(jl);
                jd.setSize(800, 480);
                jd.setLocation((FrameMain.getInstance().getWidth()-jd.getWidth())/2,
                        (FrameMain.getInstance().getHeight()-jd.getHeight())/2);
                jd.addMouseListener( new  MouseAdapter() {
                                         public void mouseClicked(MouseEvent arg0) {
                                             jd.setVisible(false);
                                         }
                                     }
                );
                jd.setVisible(true);
            }


        });
    }

    //函数重写
    protected void newfile(){
        JFileChooser fc = new JFileChooser(".");
        fc.setDialogTitle("新建文件");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                if (f.getName().endsWith(".cmm") || f.isDirectory()) {
                    return true;
                }
                return false;
            }

            public String getDescription() {
                return "CMM源程序(*.cmm)";
            }
        });

        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            fileName = fc.getSelectedFile().getPath();
            if (!fileName.endsWith(".cmm"))
                fileName += ".cmm";
            File f = new File(fileName);
            FrameCenter.getInstance().getJTextPane().setText(null);

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write("", 0, 0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void openfile() {
        JFileChooser fc = new JFileChooser(".");
        fc.setDialogTitle("打开");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new FileFilter() {
            public boolean accept(File f) {
                if (f.getName().endsWith(".cmm") || f.isDirectory()) {
                    return true;
                }
                return false;
            }

            public String getDescription() {
                return "CMM源程序(*.cmm)";
            }
        });
        if (fc.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
            return;
        // 建立新文件
        fileName = fc.getSelectedFile().getPath();
        if (!fileName.endsWith(".cmm"))
            fileName += ".cmm";
        File f = new File(fileName);
        // 用此文件的长度建立一个字符数组 （特别标注）
        char ch[] = new char[(int) f.length()];
        // 异常处理
        try {
            // 读出数据，并存入字符数组ch中,并防止中文乱码

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "gb2312"));
            br.read(ch);
            br.close();
        } catch (FileNotFoundException fe) {
            System.out.println("file not found");
            System.exit(0);
        } catch (IOException ie) {
            System.out.println("IO error");
            System.exit(0);
        }
        String s = new String(ch);

        FrameCenter.getInstance().getJTextPane().setText(s);
    }

    protected void savefile() {
        if (fileName.equals("")) {
            JFileChooser fc = new JFileChooser(".");
            fc.setDialogTitle("保存");
            fc.setAcceptAllFileFilterUsed(false);
            fc.setFileFilter(new FileFilter() {
                public boolean accept(File f) {
                    if (f.getName().endsWith(".cmm") || f.isDirectory())
                        return true;
                    return false;
                }

                @Override
                public String getDescription() {
                    return "CMM源程序(*.cmm)";
                }
            });
            String s = FrameCenter.getInstance().getJTextPane().getText();

            if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
                try {
                    fileName = fc.getSelectedFile().getPath();
                    if (!fileName.endsWith(".cmm"))
                        fileName += ".cmm";
                    File f = new File(fileName);
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                    bw.write(s, 0, s.length());
                    bw.close();
                } catch (FileNotFoundException fe_) {
                    System.out.println("file not found");
                    System.exit(0);
                } catch (IOException ie_) {
                    System.out.println(" IO error");
                    System.exit(0);
                }
        }
        // 如果文件已经保存过
        else {
            String s = FrameCenter.getInstance().getJTextPane().getText();

            try {
                File f = new File(fileName);

                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(s, 0, s.length());
                bw.close();

            } catch (FileNotFoundException fe_) {
                System.out.println("file not found");
                System.exit(0);
            } catch (IOException ie_) {
                System.out.println(" IO error");
                System.exit(0);
            }

        }

    }

    protected void saveAsfile() {
        JFileChooser fc = new JFileChooser(".");
        fc.setDialogTitle("另存为");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new FileFilter() {
            public boolean accept(File f) {
                if (f.getName().endsWith(".cmm") || f.isDirectory()) {
                    return true;
                }
                return false;
            }

            public String getDescription() {
                return "CMM源程序(*.cmm)";
            }
        });
        String s = FrameCenter.getInstance().getJTextPane().getText();
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
            try {
                fileName = fc.getSelectedFile().getPath();
                if (!fileName.endsWith(".cmm"))
                    fileName += ".cmm";
                File f = new File(fileName);
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(s, 0, s.length());
                bw.close();
            } catch (FileNotFoundException fe_) {
                System.out.println("file not found");
                System.exit(0);
            } catch (IOException ie_) {
                System.out.println(" IO error");
                System.exit(0);
            }
    }

    // 输出重定向打印中间代码
    public void display(LinkedList<element> list){
        OutStreamGUI outStreamGUI = new OutStreamGUI(
                System.out, FrameCenter.getInstance().getTab(3).getJTextArea());
        System.setErr(outStreamGUI);
        System.setOut(outStreamGUI);
        int count = list.size();
        element e;
        String s;
        int line = 0;
        for(int i=0; i<count; i++){
            e = list.get(i);
            line=i+1;
            s = "\n" + line + ":" + e.getType()+",  "+e.getOperator1()+",  "
                    +e.getOperator2()+",  "+e.getResult()+";";
            System.out.println(s);
        }

    }

    // 词法 -- 根据第二次作业改进
    public void playLexer() {
        String editText = "";
        editText = FrameCenter.getInstance().getJTextPane().getText();

        String[] lineContent = editText.split("\n");

        String output = "";
        try {
            // 文本域作为词法分析的输入
            ANTLRInputStream inputStream =
                    new ANTLRInputStream(new ByteArrayInputStream(editText.getBytes()));
            // LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));     //文件流操作参考自官方文档
            // 输出到文本域
            FrameCenter.getInstance().getTab(1).getJTextArea().setText("");
            OutStreamGUI outStreamGUI =
                    new OutStreamGUI(System.out,FrameCenter.getInstance().getTab(1).getJTextArea());
            // 重定向标准错误输出流
            System.setErr(outStreamGUI);
            System.setOut(outStreamGUI);
            CMMLexer lexer = new CMMLexer(inputStream);
            //队列存储token
            ArrayDeque<Token> arrayDeque = new ArrayDeque<>();
            String[] tokenTags = CMMLexer._TOKEN_TAGS;
            int lineNum = 1;
            //visit整个文件并在eof的时候停止
            String s0 = lineContent[0];
            System.out.printf("%d:  %s\n", 1, s0);
            for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
                //转到下一行第一个token的时候开始处理上一行的输出，若多行注释则在遍历到注释后第一个token时整体输出
                if (lineNum != token.getLine()) {
                    /*//整行先输出
                    for (int i=lineNum; i<token.getLine(); i++) {
                        String s = lineContent[i-1];
                        System.out.printf("%d: %s\n", i, s);
                    }*/
                    //非注释行逐个token输出
                    while (!arrayDeque.isEmpty()) {
                        Token t = arrayDeque.pollFirst();
                        if (!tokenTags[t.getType()].equals("COMMENT") && !tokenTags[t.getType()].equals("LINE_COMMENT"))
                        {
                            System.out.printf("      %d:  %s  %s\n", lineNum, tokenTags[t.getType()], t.getText());
                        }
                    }
                    //整行先输出
                    for (int i=lineNum; i<token.getLine(); i++) {
                        String s = lineContent[i];
                        System.out.printf("%d:  %s\n", i+1, s);
                    }
                    //进入下一行
                    lineNum = token.getLine();
                }
                arrayDeque.addLast(token);               //同一行轮流进queue
            }
            //EOF前一行
            Token token = lexer.nextToken();
            int temp=token.getLine()-lineNum;
            if (token.getType() == Token.EOF){
                // lineNumberReader.setLineNumber(lineNum);
                // String s = lineNumberReader.readLine();
                while (temp>1){
                    //String s = lineContent[lineNum-temp];
                    while (!arrayDeque.isEmpty()) {
                        Token t = arrayDeque.pollFirst();
                        if (!tokenTags[t.getType()].equals("COMMENT") && !tokenTags[t.getType()].equals("LINE_COMMENT"))
                        {
                            System.out.printf("      %d:  %s  %s\n", lineNum, tokenTags[t.getType()], t.getText());
                        }

                    }
                    String s = lineContent[token.getLine()-temp];
                    System.out.printf("%d:  %s\n", token.getLine() - temp + 1, s);
                    temp--;
                }

                //System.out.printf("%d: %s\n", lineNum, s);
                lineNum++;
                System.out.println("  "+token.getLine()+" : EOF" );
            }
        } catch (IOException e1) {
            e1.printStackTrace();
            OutStreamGUI errStream = new OutStreamGUI(
                    System.err,FrameBottom.getInstance().getTab(3).getJTextArea());
            System.setErr(errStream);
            System.err.println("Lexer:"+e1.getMessage());
        }
    }

    // 语法 -- 根据第三次作业改进
    public void playParser() {
        String txtInput = "";
        txtInput = FrameCenter.getInstance().getJTextPane().getText();
        String txtOutput = "";
        try {

            // 输入重定向，文本域作为语法分析的输入
            ANTLRInputStream inputStream = new ANTLRInputStream(
                    new ByteArrayInputStream(txtInput.getBytes()));
            CMMLexer lexer = new CMMLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // 输出重定向，文本域Tab成为分析结果的输出
            FrameCenter.getInstance().getTab(2).getJTextArea().setText("");
            OutStreamGUI outStreamGUI = new OutStreamGUI(
                    System.out, FrameCenter.getInstance().getTab(2).getJTextArea());
            System.setErr(outStreamGUI);
            System.setOut(outStreamGUI);

            /**
             * 测试用
             * System.out.print(inputStream);
             * System.setOut(outStreamGUI);
             */

            // 语法分析生成语法树
            CMMParser parser = new CMMParser(tokenStream);
            // CMMParser.translation_unit_return r = parser.translation_unit();

            ParseTree tree = parser.prog();

            // 重写语法分析方法
            MyCMMParserVisitor visitor = new MyCMMParserVisitor();
            ArrayList<String> resultList = visitor.visit(tree);
            String output = "";
            for (String string : resultList) {
                output += string;
            }
            System.out.print(output);
            // System.setOut(outStreamGUI);
            // 生成GUI树
            if (FrameBottom.getInstance().getTab(2).getJTextArea().getText().equals("showtree")
                    || treeShowCheck)
            {
                Trees.inspect(tree, parser);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }catch (Exception e1) {
            OutStreamGUI errStream = new OutStreamGUI(
                    System.err,FrameBottom.getInstance().getTab(3).getJTextArea());
            System.setErr(errStream);
            System.err.println("Parser:"+e1.getMessage());
            e1.printStackTrace();
        }
    }

    // 生成代码
    public void playSyntax() {
        String txtInput = "";
        txtInput = FrameCenter.getInstance().getJTextPane().getText();
        String txtOutput = "";
        try {

            // 输入重定向，文本域作为语法分析的输入
            ANTLRInputStream inputStream = new ANTLRInputStream(
                    new ByteArrayInputStream(txtInput.getBytes()));
            CMMLexer lexer = new CMMLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // 输出重定向，文本域Tab成为分析结果的输出
            FrameCenter.getInstance().getTab(3).getJTextArea().setText("");
            OutStreamGUI outStreamGUI = new OutStreamGUI(
                    System.out, FrameCenter.getInstance().getTab(3).getJTextArea());
            System.setErr(outStreamGUI);
            System.setOut(outStreamGUI);

            /**
             * 测试用
             * System.out.print(inputStream);
             * System.setOut(outStreamGUI);
             */

            // 语法分析生成语法树
            CMMParser parser = new CMMParser(tokenStream);
            ParseTree tree = parser.prog();

            // 定义树遍历器
            ParseTreeWalker walker = new ParseTreeWalker();
            // 声明树
            DefPhase def = new DefPhase();
            walker.walk(def, tree);
            // 引用树 -- 原本作四元式翻译用 - 未实现
            //RefPhase ref = new RefPhase(def.globalScope, def.scopes);
            //walker.walk(ref, tree);

            // 输出中间代码
            LinkedList<element> intermediateCode = def.getList();
            //display(intermediateCode);

            int count = intermediateCode.size();
            element e;
            String s;
            int line = 0;
            for(int i=0; i<count; i++){
                e = intermediateCode.get(i);
                line=i+1;
                s = "\n" + line + ": ( " + e.getType()+" ,  "+e.getOperator1()+" ,  "
                        +e.getOperator2()+" ,  "+e.getResult()+" ) ;";
                //intermediate.setText(s);
                System.out.println(s);
            }


        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e1) {
            OutStreamGUI errStream = new OutStreamGUI(
                    System.err,FrameBottom.getInstance().getTab(3).getJTextArea());
            System.setErr(errStream);
            System.err.println("Generate Code:"+e1.getMessage());
            e1.printStackTrace();
        }
    }

    // 编译运行分析结果
    public void playCompiler() {
        String txtInput = "";
        txtInput = FrameCenter.getInstance().getJTextPane().getText();
        String txtOutput = "";
        try {

            // 输入重定向，文本域作为语法分析的输入
            ANTLRInputStream inputStream = new ANTLRInputStream(
                    new ByteArrayInputStream(txtInput.getBytes()));
            CMMLexer lexer = new CMMLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // 输出重定向，文本域Tab成为分析结果的输出
            FrameBottom.getInstance().getTab(1).getJTextArea().setText("");
            OutStreamGUI outStreamGUI = new OutStreamGUI(
                    System.out, FrameBottom.getInstance().getTab(1).getJTextArea());
            System.setErr(outStreamGUI);
            System.setOut(outStreamGUI);

            /**
             * 测试用
             * System.out.print(inputStream);
             * System.setOut(outStreamGUI);
             */

            System.out.println("======== Starting Compiler... ========");
            System.out.println("========== Lexer Analysis ===========");
            System.out.println("========== Parser Analysis ==========");
            if (FrameBottom.getInstance().getTab(2).getJTextArea().getText().equals("Show-GUI-Tree"))
            {
                System.out.println("============ Show Tree ============");
            }
            System.out.println("========="+ new Date().toLocaleString() +"========");
            System.out.println("======= Compiling Complete! ========");

            // 语法分析生成语法树
            CMMParser parser = new CMMParser(tokenStream);
            ParseTree tree = parser.prog();

            // 定义树遍历器
            ParseTreeWalker walker = new ParseTreeWalker();
            // 接下来代码的核心部分设计使用泛型定义可以省去很多麻烦
            // 定义阶段，语法分析，将变量放入符号表
            DefPhaseListener def = new DefPhaseListener(outStreamGUI);
            walker.walk(def, tree);

            // 引用阶段改为visitor方法
            RefPhaseVisitor ref = new RefPhaseVisitor(def.globals, def.scopes, outStreamGUI);
            ref.visit(tree);

        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e1) {
            OutStreamGUI errStream = new OutStreamGUI(
                    System.err,FrameBottom.getInstance().getTab(3).getJTextArea());
            System.setErr(errStream);
            System.err.println("Run:"+e1.getMessage());
            e1.printStackTrace();
        }
    }
}
