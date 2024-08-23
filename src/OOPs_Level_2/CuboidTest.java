package OOPs_Level_2;

import java.util.Scanner;

class Cuboid {
    private double length;
    private double breadth;
    private double height;

    // Constructor to initialize dimensions of the cuboid
    public Cuboid(double length, double breadth, double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate the perimeter of the base rectangle
    private double perimeter()
    {
        return 2 * (length + breadth);
    }

    // Method to calculate the area of the base rectangle and calls perimeter()
    private double area()
    {
        double perimeter = perimeter(); // Call perimeter method
        System.out.println("Perimeter of the base: " + perimeter);
        return length * breadth;
    }

    // Method to calculate the volume of the cuboid and calls area()
    public double volume()
    {
        double area = area(); // Call area method
        System.out.println("Area of the base: " + area);
        return length * breadth * height;
    }

    // Method to display the perimeter, area, and volume
    public void displayDetails()
    {
        double volume = volume(); // Call volume method
        System.out.println("Volume of the cuboid: " + volume);
    }
}

public class CuboidTest {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       // Taking input for length, breadth, and height
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

       // Creating an object of Cuboid
        Cuboid cuboid = new Cuboid(length, breadth, height);

       // Displaying the details
        cuboid.displayDetails();
    }

}
