public class Program {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = { car, bike, boat };

        for(Vehicle r : racers) {
            r.go();
        }
    }
}
