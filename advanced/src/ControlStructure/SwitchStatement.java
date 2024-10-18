package ControlStructure;

public class SwitchStatement {

    public static void dayOfWeek(byte day) {
        switch (day) {
            case 0:
                System.out.println("There isn't a day 0, begins in 1 and ends in 7");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
