public class IfElseSwitch {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("task 1: ");
        byte clientOS = 1;

        if (clientOS == 1) {
            System.out.println("For Android installation follow this link");
        } else
            System.out.println("For iOS installation follow this link");
        System.out.println();
    }

    public static void task2() {
        System.out.println("task 2: ");
        byte clientOS = 0;
        short deviceYear = 2014;

        if (clientOS == 1 && deviceYear >= 2015) {
            System.out.println("For Android installation follow this link");
        } else if (clientOS == 1)
            System.out.println("You have an obsolete Android device, follow this link to install light app");

        if (clientOS == 0 && deviceYear >= 2015) {
            System.out.println("For iOS installation follow this link");
        } else if (clientOS == 0) {
            System.out.println("You have an obsolete iOS device, follow this link to install light app");
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("task 3: ");
        int year = 400;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap-year");
        } else System.out.println(year + " is not a leap-year");
        System.out.println();
    }

    public static void task4() {
        System.out.println("task 4: ");
        int distance = 101;
        int days = 1;

        if (distance > 100) {
            System.out.println("You're out of delivery range, sorry");
        } else {
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
            System.out.println("Required days for delivery " + days);
        }
/*
        if (distance > 100) {
            System.out.println("You're out of delivery range, sorry");
        } else if (distance <= 100 && distance >= 60) {
            System.out.println("Delivery will be completed in 3 days");
        } else if (distance < 60 && distance >= 20)
            System.out.println("Delivery will be completed in 2 days");
        else
            System.out.println("Delivery will be completed in 1 day");
*/
        System.out.println();
    }

    public static void task5() {
        System.out.println("task 5: ");
        int monthNumber = 13;

        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There are only 12 months in a year");
        }
    }
}
