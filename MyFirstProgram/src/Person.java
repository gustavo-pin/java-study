import java.util.Date;

public class Person {
    String name;
    byte age;

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String something) {
        if(something == null) {
            System.out.println("Hello, my name is "+this.name+" and I am "+this.age+" years old");
            return;
        }

        System.out.println(something);
    }
}
