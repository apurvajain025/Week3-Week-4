import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Check for positive integer
        if (number >= 1) {

            System.out.println("\nFizzBuzz from 1 to " + number + ":");
            System.out.println("-----------------------------");

            // Step 3: Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Step 4: Check conditions in order (most specific first)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");   // Multiple of both 3 and 5
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");       // Multiple of 3 only
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");       // Multiple of 5 only
                } else {
                    System.out.println(i);            // Not a multiple of 3 or 5
                }
            }

        } else {
            System.out.println("\nThe number " + number + " is not a positive integer");
        }

        scanner.close();
    }
}