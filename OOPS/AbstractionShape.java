// Abstract base class
abstract class Shape{
    // Abstract methods (no body)
    abstract void area();
    abstract void perimeter();

    // You can also have normal methods
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }
}

// Concrete subclass: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

// Main class to test
public class AbstractionShape {
    public static void main(String[] args) {
        // Using Circle
        Shape circle = new Circle(5);
        circle.display();
        circle.area();
        circle.perimeter();

        System.out.println();

        // Using Rectangle
        Shape rectangle = new Rectangle(4, 6);
        rectangle.display();
        rectangle.area();
        rectangle.perimeter();
    }
}

