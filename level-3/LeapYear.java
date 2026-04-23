import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // -------------------------------------------------------
        // PART 1: Using Multiple if-else statements
        // -------------------------------------------------------
        System.out.println("\n--- Part 1: Using Multiple if-else Statements ---");

        if (year < 1582) {
            // Not a valid Gregorian calendar year
            System.out.println(year + " is not a valid year (Gregorian calendar starts from 1582)");

        } else if (year % 400 == 0) {
            // Divisible by 400 => Always a Leap Year (e.g. 2000)
            System.out.println(year + " is a Leap Year");

        } else if (year % 100 == 0) {
            // Divisible by 100 but NOT 400 => Not a Leap Year (e.g. 1800)
            System.out.println(year + " is not a Leap Year");

        } else if (year % 4 == 0) {
            // Divisible by 4 but NOT 100 => Leap Year (e.g. 2024)
            System.out.println(year + " is a Leap Year");

        } else {
            // Not divisible by 4 => Not a Leap Year
            System.out.println(year + " is not a Leap Year");
        }

        // -------------------------------------------------------
        // PART 2: Using a Single if statement with Logical Operators
        // -------------------------------------------------------
        System.out.println("\n--- Part 2: Using Single if with Logical Operators ---");

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year < 1582) {
            System.out.println(year + " is not a valid year (Gregorian calendar starts from 1582)");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        scanner.close();
    }
}