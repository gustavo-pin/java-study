import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank() || name.length() < 3) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, "+name);
    }
}
