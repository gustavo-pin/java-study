import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X = ");
        double x = scanner.nextDouble();

        System.out.print("Y = ");
        double y = scanner.nextDouble();

        System.out.println("H = " + Math.sqrt((x * x) + (y * y)));

        scanner.close();
    }
}