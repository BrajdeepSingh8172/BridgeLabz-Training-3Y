package campusconnect;

import java.util.*;

abstract class Person {
    protected String name;
    protected String email;
    protected String id;
    public Person(String id, String name, String email) { this.id=id; this.name=name; this.email=email; }
    public abstract void printDetails();
}

class Student extends Person {
    private Map<String, String> grades = new HashMap<>();

    public Student(String id, String name, String email) { super(id,name,email); }

    public void addGrade(String course, String grade) { grades.put(course, grade); }
    @Override public void printDetails() { System.out.println("Student: " + id + ", " + name + ", grades=" + grades); }
}

class Faculty extends Person {
    public Faculty(String id, String name, String email) { super(id,name,email); }
    @Override public void printDetails() { System.out.println("Faculty: " + id + ", " + name + ", email=" + email); }
}

interface ICourseActions {
    void enrollCourse(Student s, Course c);
    void dropCourse(Student s, Course c);
}

class Course {
    private String code;
    private String title;
    private Faculty faculty;
    private List<Student> students = new ArrayList<>();

    public Course(String code, String title) { this.code=code; this.title=title; }

    public void assignFaculty(Faculty f) { this.faculty = f; }
    public void addStudent(Student s) { students.add(s); }
    public void removeStudent(Student s) { students.remove(s); }

    public void printInfo() { System.out.println("Course:" + code + ", faculty=" + (faculty!=null?faculty.name:"NA") + ", students=" + students.size()); }
}

public class CampusConnectDemo {
    public static void main(String[] args) {
        Student s = new Student("ST01","Anu","anu@uni.edu");
        Faculty f = new Faculty("F01","Dr. Mehta","mehta@uni.edu");
        Course c = new Course("MATH101","Calculus");
        c.assignFaculty(f);
        c.addStudent(s);
        s.addGrade("MATH101","A");
        s.printDetails();
        c.printInfo();
    }
}
