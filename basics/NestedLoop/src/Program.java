import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int col, row;
        String character;

        System.out.println("Number of columns:");
        col = scanner.nextInt();

        System.out.println("Number of rows:");
        row = scanner.nextInt();

        System.out.println("Enter the character");
        character = scanner.next();

        for(int i = 1; i <= row; i++) {
            System.out.println();
            for(int j = 1; j <= col; j++) {
                System.out.print(character+" ");
            }
        }
    }
}
