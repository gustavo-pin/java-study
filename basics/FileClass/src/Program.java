import java.io.File;

public class Program {
    public static void main(String[] args) {
        File file = new File("file.txt");

        if(file.exists()) {
            System.out.println("That file exists!");
        } else {
            System.out.println("That file doesn't exists");
        }
        System.out.println(file.getAbsolutePath());
    }
}
