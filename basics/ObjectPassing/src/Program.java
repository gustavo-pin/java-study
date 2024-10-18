public class Program {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car sonata = new Car("Sonata");
        Car camaro = new Car("Camaro");

        garage.park(sonata);
        garage.park(camaro);

        garage.viewParkedCars();
    }
}
