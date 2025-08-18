// Base class
class Figure {
    public void area(){
        System.out.println("Area method from Figure class (generic).");
    }

    public void perimeter(){
        System.out.println("Perimeter method from Figure class (generic).");
    }
}

// Subclass
class Triangle extends Figure{
    double a, b, c,base,height;

    // Constructor
    public Triangle(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    // Triangle-specific method for area
    public void triangleArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    // Triangle-specific method for perimeter
    public void trianglePerimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}

// Main class to run the program
public class figure_triangle_inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5, 4, 3);

        // Calling methods from base class
        t.area();         // Figure's method
        t.perimeter();    // Figure's method

        // Calling triangle-specific methods
        t.triangleArea();
        t.trianglePerimeter();
    }
}

