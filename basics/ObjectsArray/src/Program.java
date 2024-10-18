public class Program {
    public static void main(String[] args) {
        Food bean = new Food("Bean");
        Food pizza = new Food("Pizza");
        Food meat = new Food("Meat");

        Food[] refrigerator = {bean, pizza, meat};

        for(Food item : refrigerator) {
            System.out.println(item.name);
        }
    }
}
