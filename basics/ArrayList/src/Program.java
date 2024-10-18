import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<String>();

        String newCar = "";
        while(cars.size() < 10) {
            System.out.println("Enter a new car:");
            cars.add(scanner.nextLine());
        }

        System.out.println(cars);

        for(String car : cars) {
            System.out.println(car);
        }
    }
}
