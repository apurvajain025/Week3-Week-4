import java.util.Scanner;
 
public class DivisibleByFive {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        // Step 2: Check divisibility by 5 using modulus operator
        boolean isDivisible = (number % 5 == 0);
 
        // Step 3: Print the result
        System.out.println("\nIs the number " + number + " divisible by 5? " + isDivisible);
 
        scanner.close();
    }
}
 