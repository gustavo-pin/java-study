public class Car {
    String make;
    String model;
    int year;
    String color;
    double price;

    public Car(String make,
            String model,
            int year,
            String color,
            double price)
    {

            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
            this.price = price;
    }

    public void drive() {
        System.out.println("You are driving the car");
    }
}
