public class Program {
    public static void main(String[] args) {
        /*
        * abstract classes can't be initialized, but they
        * can have classes.
        * */

        Car car = new Car();

        car.go();
        car.stop();
    }
}
