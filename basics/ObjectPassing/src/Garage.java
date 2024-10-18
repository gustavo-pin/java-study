import java.util.ArrayList;
import java.util.Arrays;

public class Garage {
    final ArrayList<Car> parkedCars = new ArrayList<Car>();

    public void park(Car car) {
        parkedCars.add(car);
    }

    public void viewParkedCars() {
        for(Car pCar : parkedCars) {
            System.out.println(pCar.name);
        }
    }
}
