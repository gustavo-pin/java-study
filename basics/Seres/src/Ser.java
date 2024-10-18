public class Ser {
    String name;
    int age;

    public Ser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        Console.log("ajsklfd");
    }

}

class Animal extends Ser {
    String owner;

    public Animal(String name,  String owner, int age) {
        super(name, age);
        this.owner = owner;
    }
}