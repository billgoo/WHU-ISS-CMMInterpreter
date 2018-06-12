package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

/**
 * Created by lhhxkj on 2016/12/06.
 */

public class FrameMain extends JFrame {

    private static FrameMain instance = null;

    public static FrameMain getInstance(){
        if (instance == null){
            instance = new FrameMain();
        }
        return instance;
    }

    private FrameMain() {

        // settings for JFrame
        super("CMM Interpreter");
        // widget for 1200*1200 px
        setSize(1200,800);
        setVisible(true);
        // set the icon
        URL url = this.getClass().getResource("/images/icon2.jpg");
        Image img = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(img);

        // click to exit
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(FrameMain.this,
                        "是否要退出？ ", "确认 ", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    if (e.getWindow() == FrameMain.this) {
                        System.exit(0);
                    } else {
                        return;
                    }
                }
            }
        });

        // layout settings (gap size)
        BorderLayout b1 = new BorderLayout();
        b1.setHgap(10);             // Horizontal gap between control
        b1.setVgap(10);             // Vertical gap between control
        // build a panel
        JPanel jPanel = new JPanel(b1);
        setContentPane(jPanel);

        //( BorderLayout.EAST / SOUTH / WEST / NORTH )
        // NORTH  - menu bar
        // CENTER - left  - tab
        // CENTER - right - text editor
        // SOUTH  - left  - console widget
        // SOUTH  - right - input

        // set menu bar
        MenuBarPanel menuBarPanel = new MenuBarPanel();
        jPanel.add(menuBarPanel,"North");

        // set main context for text
        FrameCenter frameCenter = FrameCenter.getInstance();
        jPanel.add(frameCenter,"Center");

        // set console
        FrameBottom frameSouth = FrameBottom.getInstance();
        jPanel.add(frameSouth,"South");

    }


    // MAIN function
    public static void main(String[] args) {
        // show the main frame
        FrameMain frame = FrameMain.getInstance();
        // frame.show();
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
