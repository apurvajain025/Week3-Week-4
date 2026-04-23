import java.util.Scanner;
 
public class LargestNumber {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user inputs
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
 
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
 
        System.out.print("Enter third number: ");
        double number3 = scanner.nextDouble();
 
        // Step 2: Check if each number is the largest
        // A number is the largest if it is greater than both the other two
        boolean isFirstLargest  = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest  = (number3 > number1) && (number3 > number2);
 
        // Step 3: Print the results
        System.out.println("\nIs the first number the largest?  " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest?  " + isThirdLargest);
 
        scanner.close();
    }
}