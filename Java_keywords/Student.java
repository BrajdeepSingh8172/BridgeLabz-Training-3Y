public class Student {
    private static String universityName;
    private static int totalStudents = 0;
    private final int rollNumber; // Final variable to ensure the roll number cannot be changed
    private String name;
    private char grade;
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void setUniversityName(String name) {
        universityName = name;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public char getGrade() { return grade; }
    public static void main(String[] args) {
        Student.setUniversityName("Global University");
        Student student1 = new Student("Hemashree", 101, 'A');
        Student student2 = new Student("Sharmila", 102, 'B');
        Student.displayTotalStudents();
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        student2.updateGrade('A');
        System.out.println();
        student2.displayStudentDetails();
    }
}