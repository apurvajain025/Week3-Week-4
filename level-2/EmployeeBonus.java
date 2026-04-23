import java.util.Scanner;
 
public class EmployeeBonus {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user inputs
        System.out.print("Enter employee name: ");
        String name = scanner.next();
 
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
 
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
 
        // Step 2: Check years of service and calculate bonus
        // Zara gives 5% bonus to employees with more than 5 years of service
        if (yearsOfService > 5) {
            double bonus = salary * 5 / 100;
            System.out.println("\nCongratulations " + name + "! You are eligible for a bonus.");
            System.out.println("Years of Service : " + yearsOfService + " years");
            System.out.println("Salary           : " + salary);
            System.out.println("Bonus (5%)       : " + bonus);
            System.out.println("Total Pay        : " + (salary + bonus));
        } else {
            System.out.println("\nSorry " + name + ", you are not eligible for a bonus.");
            System.out.println("Years of Service : " + yearsOfService + " years");
            System.out.println("Requirement      : More than 5 years of service needed");
        }
 
        scanner.close();
    }
}