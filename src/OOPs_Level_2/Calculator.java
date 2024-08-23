package OOPs_Level_2;

import java.util.Scanner;

public class Calculator {

      // Method to get input from the user
        public int input() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Call the add method and store the result
            int result = add(num1, num2);

            // Return the result to be printed
            return result;
        }

        // Method to perform addition and return the result
        public int add(int a, int b)
        {
            return a + b;
        }

        public static void main(String[] args) {
            // Create an instance of the Calculator class
            Calculator calculator = new Calculator();

            // Call the input method and print the result
            int result = calculator.input();
            System.out.println("The result of addition is: " + result);
        }
}
