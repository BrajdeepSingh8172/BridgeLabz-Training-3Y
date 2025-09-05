/**
 * Instance vs Class - Problem 2: Online Course Management
 */
public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course[name=" + courseName + ", duration=" + duration + " weeks, fee=" + fee +
                ", institute=" + instituteName + "]");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Basics", 6, 3500.0);
        Course c2 = new Course("DSA", 8, 5000.0);
        c1.displayCourseDetails();
        Course.updateInstituteName("TechLift Academy");
        c2.displayCourseDetails();
        c1.displayCourseDetails();
    }
}