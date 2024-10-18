public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("The car is going");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }
}
