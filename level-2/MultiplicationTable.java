import java.util.Scanner;
 
public class MultiplicationTable {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        // Step 2: Use a for loop to print multiplication table from 6 to 9
        System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
        System.out.println("-----------------------------");
 
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
 
        scanner.close();
    }
}
 