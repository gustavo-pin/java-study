import java.lang.Math;
import java.lang.String;
import java.lang.System;


public class Program {
    public static void main(String[] args) {
        // java.lang.System
        System.out.println("Hello world");

        Person person = new Person(18, "Gustavo");

        System.out.println(Math.sqrt(25));
    }
}

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}