public class Program {
    public static void main(String[] args) {
        //Car car1 = new Car("Tesla", "ModelX", (short) 2022);
        Car car1 = new Car("Hyundai", "Sonata", (short) 2013);
        Car car2 = new Car(car1);

        //car1.copy(car2);

        System.out.println(car2.toString());
    }
}
