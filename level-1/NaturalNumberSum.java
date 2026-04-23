import java.util.Scanner;
 
public class NaturalNumberSum {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        // Step 2: Check if the number is a natural number (positive integer >= 1)
        if (number >= 1) {
 
            // Step 3: Calculate the sum of n natural numbers
            // Formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;
 
            // Step 4: Print the result
            System.out.println("\nThe sum of " + number + " natural numbers is " + sum);
 
        } else {
 
            // Step 4: Number is not a natural number
            System.out.println("\nThe number " + number + " is not a natural number");
        }
 
        scanner.close();
    }
}