import java.util.Scanner;

public class MonthDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1 for January, 2 for February, etc.): ");
        int monthNumber = scanner.nextInt();

        int daysInMonth = getDaysInMonth(monthNumber);

        if (daysInMonth != -1) {
            System.out.println("The number of days in month " + monthNumber + " is " + daysInMonth + ".");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
            /** {
                // for loop
                for(int i = 0; i < 10; i++)
                    System.out.println("i = " + i);

                for(;;)
                    System.out.println("Infinite Loop");
            } **/

        }
    }
}
