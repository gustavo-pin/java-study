public class Program {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        Fish fish = new Fish();

        hawk.hunt();
        fish.flee();
    }
}
