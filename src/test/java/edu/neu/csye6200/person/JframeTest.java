package edu.neu.csye6200.person;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class JframeTest extends  JFrame {
    JFrame window;
    JButton enrollButton;
    public JframeTest() {
        window = new JFrame("DayCare System");
        enrollButton = new JButton("Click to Enroll");
        Container contentPane = window.getContentPane();
        contentPane.add(enrollButton);

        // icon image path
        final URL iconPath = JframeTest.class.getClassLoader().getResource("icon.png");
        assert iconPath != null;
        final Image iconImage = new ImageIcon(iconPath).getImage();
        // set Dock image for MacOSX
        // Delete this part if showing error log
        final Taskbar taskbar = Taskbar.getTaskbar();
        try {
            taskbar.setIconImage(iconImage);
        } catch (final UnsupportedOperationException e) {
            System.out.println("Not running in Mac OSX");
        } catch (final  SecurityException e) {
            System.out.println("Security expception for Taskbar.setIconImage");
        }
        // set icon image for Windows operating system;
        window.setIconImage(iconImage);

        // set window
        window.setSize(600, 400); // in px
        window.setVisible(true);
        window.setResizable(false); // make it nonchangeable
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE); // exit when closing
        Dimension curScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((curScreenSize.width - 600) /2, (curScreenSize.height - 400) /2);
    }
    public static void main(String[] args) {
        new JframeTest();
    }
}
