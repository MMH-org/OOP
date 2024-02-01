package src.Abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle myCircle = new Circle(5.0);
        Rectangle myRectangle = new Rectangle(4.0, 6.0);

        // Calculating and printing the areas
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}

// Data Abstraction may also be defined as the process of identifying only
// the required characteristics of an object ignoring the irrelevant details.
// The properties and behaviors of an object differentiate it from other
// objects of a similar type and also help in classifying/grouping the objects.