import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        JOptionPane.showMessageDialog(null, "Your name is "+name+" and you are "+age+" years old");
    }
}
