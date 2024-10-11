import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("What animal do you want?");
        int choice = 0;
        while(choice == 0) {
            System.out.println("1- dog");
            System.out.println("2- cat");

            choice = scanner.nextInt();

            if(choice == 1 || choice == 2) {
                break;
            }
        }

        if(choice == 1) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        animal.speak();

    }
}
