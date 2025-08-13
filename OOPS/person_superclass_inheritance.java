// Superclass
class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called.");
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Subclass
class Student extends Person {
    int rollNumber;

    // Constructor
    Student(String name, int rollNumber) {
        super(name); // Calls constructor of Person class
        this.rollNumber = rollNumber;
        System.out.println("Student constructor called.");
    }

    // Method
    void displayStudentInfo() {
        super.displayInfo(); // Calls method from Person class
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class
public class person_superclass_inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Shikhar", 101);
        s1.displayStudentInfo();
    }
}
