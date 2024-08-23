package OOPs_Level_2;

import java.util.Scanner;

public class SumOfTwoByteValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two byte values from the user
        System.out.print("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();
        System.out.print("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();

        // Convert byte values to int to avoid overflow
        int int1 = (int) byte1;
        int int2 = (int) byte2;

        // Calculate the sum
        int sum = int1 + int2;

        // Print the result
        System.out.println("The sum of " + byte1 + " and " + byte2 + " is: " + sum);
    }
}
