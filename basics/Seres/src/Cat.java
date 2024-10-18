public class Cat extends Animal {
    public Cat(String name, String owner, int age) {
        super(name, owner, age);
    }

    @Override
    void makeSound(){
        Console.log("Miau miau");
    }
}
