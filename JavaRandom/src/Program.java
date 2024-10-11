import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();

        while(true) {
            int x = random.nextInt(1, 100000);
            System.out.println(x);
        }
    }
}
