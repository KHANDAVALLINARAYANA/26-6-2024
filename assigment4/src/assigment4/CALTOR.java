package assigment4;

import java.util.Scanner;

public class CALTOR {

	public static void main(String[] args) {
		
	
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

       
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        
        switch (choice) {
            case 1:
                System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid input! Please choose a valid operation.");
        }

        scanner.close();
    }
}


