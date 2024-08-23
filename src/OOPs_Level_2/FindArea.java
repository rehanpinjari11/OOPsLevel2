package OOPs_Level_2;

import java.util.Scanner;

public class FindArea {

    public static double calculateArea(double side) {
        return side * side;
    }

    public static double calculateArea(double length, double breadth)
    {
        return length * breadth;
    }

    public static double calculateArea(double radius, boolean isCircle)
    {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for each shape
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();

        System.out.print("Enter length and breadth of rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        // Calculate and print areas
        double squareArea = calculateArea(side);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = calculateArea(length, breadth);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = calculateArea(radius, true);
        System.out.println("Area of circle: " + circleArea);

    }
}
