import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("What's your age? ");
        byte age = scanner.nextByte();

        Person gustavo = new Person(name, age);

        gustavo.speak(null);
    }
}
