import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Hello world");

        //label.setText("Hello world");

        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Labels");
        frame.setVisible(true);

        frame.add(label);
    }
}
