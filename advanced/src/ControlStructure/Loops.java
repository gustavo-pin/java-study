package ControlStructure;

public class Loops {
    public static void forLoop(int r) {
        for(int i = 0; i <= r; i++) {
            if(i % 2 != 0 || i == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void whileLoop(int r) {
        while(r > 0) {
            if(r == 1000) {
                System.out.println("Finished");
                break; // exit from loop
            }

            System.out.println(r);
            r--;
        }
    }
}
