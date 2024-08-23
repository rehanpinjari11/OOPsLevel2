package OOPs_Level_2;

import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;
    double area;

    // Constructor
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    void calculateArea()
    {
        area = length * breadth;
    }
}

class Triangle {
    double base;
    double height;
    double area;

    // Constructor
    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area
    void calculateArea()
    {
        area = 0.5 * base * height;
    }
}


public class AreaCalculator {

    static Rectangle calculateRectangleArea(Rectangle rect)
    {
        rect.calculateArea();
        return rect;
    }

    // Method to calculate area of Triangle and return the object
    static Triangle calculateTriangleArea(Triangle tri)
    {
        tri.calculateArea();
        return tri;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // Create Rectangle object
        Rectangle rect = new Rectangle(length, breadth);

        // Input for Triangle
        System.out.print("Enter base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = sc.nextDouble();

        // Create Triangle object
        Triangle tri = new Triangle(base, height);

        // Calculate areas by passing objects to methods
        rect = calculateRectangleArea(rect);
        tri = calculateTriangleArea(tri);

        // Print the areas
        System.out.println("Area of Rectangle: " + rect.area);
        System.out.println("Area of Triangle: " + tri.area);
    }
}
