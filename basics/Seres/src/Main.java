public class Main {
    public static void main(String[] args) {
        Human gustavo = new Human("Gustavo", "Henrique" , 17);
        Dog cacau = new Dog("Cacau", "Gustavo", 5);

        gustavo.makeSound();
        cacau.makeSound();
    }
}