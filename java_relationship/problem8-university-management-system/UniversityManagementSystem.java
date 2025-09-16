import java.util.*;

class Professor {
    private String name;
    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
}

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String name) { this.name = name; }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to " + name);
    }

    public void enrollStudent(Student s) {
        students.add(s);
        System.out.println("Student " + s.getName() + " enrolled in " + name);
    }
}

class Student {
    private String name;
    public Student(String name) { this.name = name; }
    public String getName() { return name; }

    public void enrollCourse(Course c) { c.enrollStudent(this); }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Singh");
        Course c1 = new Course("Physics");
        c1.assignProfessor(prof);

        Student s1 = new Student("Amit");
        s1.enrollCourse(c1);
    }
}