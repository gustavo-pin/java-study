public class Dog extends Animal {
    public Dog(String name,String owner, int age) {
        super(name, owner, age);
    }

    @Override
    void makeSound() {
        Console.log("auau");
    }
}
