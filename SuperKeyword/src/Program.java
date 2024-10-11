public class Program {
    public static void main(String[] args) {
        Person patrick = new Person("Patrick", 22);
        Hero batman = new Hero("Batman", 51, "Money");

        System.out.println(patrick.toString());
        System.out.println(batman.toString());
    }
}
