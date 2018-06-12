package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lhhxkj on 2016/12/06.
 */

public class FrameTabPanel extends JPanel {

    // 显示输出结果的文本域
    private JTextArea jTextArea = null;

    // 构造函数构造输出控制台
    public FrameTabPanel() {
        jTextArea = new JTextArea(8,100);
        jTextArea.setFont(new Font("Calibri", Font.BOLD, 16));
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        this.setLayout(new BorderLayout());
        // JTextArea的大小随着尺寸而变化
        this.add(jScrollPane);
    }

    // 控制文本域编辑属性的接口
    public void setEditable(boolean b)
    {
        jTextArea.setEditable(b);
    }


    // 获取文本域对象，对其文本的显示输入进行控制
    public JTextArea getJTextArea()
    {
        return this.jTextArea;
    }
}
