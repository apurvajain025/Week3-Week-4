import java.util.Scanner;
 
public class SmallestNumber {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user inputs
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
 
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
 
        System.out.print("Enter third number: ");
        double number3 = scanner.nextDouble();
 
        // Step 2: Check if number1 is the smallest of all three
        // number1 must be less than both number2 and number3
        boolean isSmallest = (number1 < number2) && (number1 < number3);
 
        // Step 3: Print the result
        System.out.println("\nIs the first number the smallest? " + isSmallest);
 
        scanner.close();
    }
}
 