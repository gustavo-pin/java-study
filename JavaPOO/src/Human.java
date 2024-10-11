public class Human {
    String name;
    int age;
    double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void speak(String phrase) {
        if(phrase == null) {
            System.out.printf("Hello my name is %s and I am %d years old", this.name, this.age);
            return;
        }
        System.out.println(phrase);
    }
}
