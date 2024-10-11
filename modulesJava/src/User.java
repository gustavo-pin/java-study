public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("Hello my name is " + this.name);
    }
}
