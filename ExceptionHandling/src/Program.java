import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        try {
            System.out.print("Enter number x: ");
            x = scanner.nextInt();
            System.out.print("Enter number y: ");
            y = scanner.nextInt();

            System.out.printf("The sum is: %d\n", x/y);

        } catch (InputMismatchException e) {
            System.out.println("You can enter a letter in place of a number! Idiot.");
        } catch (ArithmeticException e) { // specific exceptions
            System.out.println("You can't divide by zero!");
        } catch (Exception e) { // generic exceptions
            System.out.println("Something went wrong");
        } finally { // this block will always be executed
            System.out.println("This will always print");
            scanner.close();
        }
    }
}
