import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) { this.name = name; }

    public void enroll(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public String getName() { return name; }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("Course: " + c.getClass().getSimpleName());
        }
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) { this.name = name; }

    public void addStudent(Student s) { students.add(s); }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("Greenwood");
        Student s1 = new Student("Meera");
        Course c1 = new Course("Math");
        s1.enrollCourse(c1);
        school.addStudent(s1);
        school.showStudents();
        c1.showStudents();
    }
}