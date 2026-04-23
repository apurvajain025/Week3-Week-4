import java.util.Scanner;
 
public class OddEvenNumbers {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user input and check for Natural Number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        if (number >= 1) {
 
            // Step 2: Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
 
                // Step 3: Check if each number is odd or even using modulus operator
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
 
        } else {
            System.out.println("\nThe number " + number + " is not a natural number");
        }
 
        scanner.close();
    }
}