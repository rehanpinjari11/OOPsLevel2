package OOPs_Level_2;

class MyClass {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Constructor
    public MyClass()
    {
        // Increment the counter whenever a new object is created
        objectCount++;
    }

    // Static method to return the count of objects created
    public static int getObjectCount()
    {
        return objectCount;
    }
}


public class Main {

    public static void main(String[] args)
    {
        // Creating objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Printing the number of objects created
        System.out.println("Number of objects created: " + MyClass.getObjectCount());

    }
}

