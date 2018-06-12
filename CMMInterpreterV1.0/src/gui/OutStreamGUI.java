package gui;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by BG on 2016/12/17.
 * 重写输出流接口
 */
public class OutStreamGUI extends PrintStream {

    private JTextComponent jTextComponent;
    private StringBuffer stringBuffer = new StringBuffer();

    public OutStreamGUI(OutputStream outputStream, JTextComponent component) {
        super(outputStream);
        this.jTextComponent = component;
    }

    public String input() {
        return JOptionPane.showInputDialog(null,
                "Please Input Here!");
    }

    /*
    * 重写write方法
    * write 到 GUI component 上
    * */
    @Override
    public void write(byte[] buf, int off, int len){
        final String message = new String(buf, off, len);

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                stringBuffer.append(message);
                jTextComponent.setText(stringBuffer.toString());
            }
        });
    }

}
