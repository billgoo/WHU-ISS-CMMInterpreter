package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lhhxkj on 2016/12/06.
 */

public class FrameBottom extends JPanel {
    // 利用singleton的设计模式来实现，在本项目中菜单栏只需要被使用一次，即只需要一个对象

    private static FrameBottom instance = null;
    private FrameTabPanel consoleTab = new FrameTabPanel();
    private FrameTabPanel terminalTab = new FrameTabPanel();
    private FrameTabPanel eventTab = new FrameTabPanel();
    private GridBagLayout gridBagLayout;

    private JTabbedPane jTPLeft = null;
    private JTabbedPane jTPRight = null;

    public static FrameBottom getInstance()
    {
        // 确保对象只有一个
        if(instance == null)
        {
            instance = new FrameBottom();
        }
        return instance ;
    }

    // 私有的构造函数，外部不能调用
    private FrameBottom() {
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
        gridBagConstraints.weightx = 5;

        consoleTab.setEditable(false);
        eventTab.setEditable(false);
        jTPLeft = new JTabbedPane(JTabbedPane.TOP);
        jTPLeft.addTab("Console", consoleTab);
        //jTPLeft.addTab("Event Log",  eventTab);
        jTPLeft.setFont(new Font("Calibri", Font.PLAIN, 18));
        JScrollPane jScrollPaneLeft = new JScrollPane(jTPLeft);
        //
        jTPLeft.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        gridBagLayout.setConstraints(jScrollPaneLeft, gridBagConstraints);
        this.add(jScrollPaneLeft);

        // 右边的
        gridBagConstraints.weightx = 5;
        terminalTab.setEditable(true);
        jTPRight = new JTabbedPane(JTabbedPane.TOP);
        jTPRight.addTab("Event Log",  eventTab);
        jTPRight.addTab("Terminal", terminalTab);
        jTPRight.setFont(new Font("Calibri", Font.PLAIN, 18));
        JScrollPane jScrollPaneRight = new JScrollPane(jTPRight);
        //
        jTPRight.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        gridBagLayout.setConstraints(jScrollPaneRight, gridBagConstraints);
        this.add(jScrollPaneRight);

    }

    // 获取相应的Tab,对其中的文本域进行操作
    public FrameTabPanel getTab(int i) {
        if (i == 1) {
            return consoleTab;
        }
        else if (i == 2) {
            return terminalTab;
        }
        else if (i == 3) {
            return eventTab;
        }
        else {
            System.out.println("Error! Please input the right argument!");
            return null;
        }
    }
}
