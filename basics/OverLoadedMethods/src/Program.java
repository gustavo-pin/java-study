public class Program {
    public static void main(String[] args) {
        int total = sum(3, 2, 1);
        double total2 = sum(1.2, 1.3);
    }

    static int sum(int x, int y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    static double sum(double x, double y) {
        return x + y;
    }
}
