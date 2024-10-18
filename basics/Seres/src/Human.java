public class Human extends Ser {
    String lastname;
    public Human(String name, String lastname, int age) {
        super(name, age);
        this.lastname = lastname;
    }

    @Override
    void makeSound() {
        Console.log("Hello, my name is " + name);
    }

    void makeSound(String msg) {
        Console.log(msg);
    }
}
