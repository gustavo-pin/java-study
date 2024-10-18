package ControlStructure;

public class BasicControllers {
    public static void main(String[] args) {
        int x = 10;

//        if(x < 18) {
//            System.out.println("Too young");
//        } else if (x >= 50) {
//            System.out.println("Too old");
//        } else {
//            System.out.println("Ok");
//        }

        // ternary statement is shorthand for if else
        System.out.println(x >= 18  ? "Ok" : "Too young");

        SwitchStatement.dayOfWeek((byte) 3);

        Loops.forLoop(100); // prints only even numbers
        //Loops.whileLoop(1000); // (finished)
    }
}
