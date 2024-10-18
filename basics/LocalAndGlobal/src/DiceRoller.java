import java.util.Random;

public class DiceRoller {
    Random random;

    public DiceRoller() {
        this.random = new Random();
        roll();
    }

    public void roll() {
        final int number = this.random.nextInt(6) + 1;
        System.out.println(number);
    }
}
