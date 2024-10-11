import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("This is my first JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(780, 800);
        this.getContentPane().setBackground(new Color(0x2ea8d1));
        this.setVisible(true);
    }
}
