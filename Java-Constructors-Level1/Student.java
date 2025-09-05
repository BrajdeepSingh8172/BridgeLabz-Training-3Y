/**
 * Access Modifiers - Problem 1: University Management System
 */
class Student {
    public int rollNumber;        // public
    protected String name;        // protected
    private double cgpa;          // private

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCgpa(cgpa);
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new IllegalArgumentException("CGPA must be between 0 and 10.");
        }
        this.cgpa = cgpa;
    }
}

public class PostgraduateStudent extends Student {
    private String thesisTopic;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String thesisTopic) {
        super(rollNumber, name, cgpa);
        this.thesisTopic = thesisTopic;
    }

    public void display() {
        // Access to rollNumber (public) and name (protected) is allowed
        System.out.println("PGStudent[roll=" + rollNumber + ", name=" + name + ", cgpa=" + getCgpa() +
                ", thesisTopic=" + thesisTopic + "]");
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent(101, "Meera", 8.5, "ML in Healthcare");
        s.display();
    }
}