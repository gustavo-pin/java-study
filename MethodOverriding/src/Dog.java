public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    void speak() {
        System.out.println("Au-au-auu");
    }

}
