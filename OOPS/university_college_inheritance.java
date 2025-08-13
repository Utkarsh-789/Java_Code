// Base class
class University {
    public void exams() {
        System.out.println("University conducts semester exams.");
    }

    public void attendance() {
        System.out.println("Minimum 75% attendance required by the university.");
    }
}

// Derived class
class College extends University {
    public void performance() {
        System.out.println("College evaluates student performance based on exams and attendance.");
    }
}

// Main class to test
public class university_college_inheritance {
    public static void main(String[] args) {
        // Create object of College class
        College myCollege = new College();

        // Call inherited methods from University
        myCollege.exams();
        myCollege.attendance();

        // Call own method of College
        myCollege.performance();
    }
}
