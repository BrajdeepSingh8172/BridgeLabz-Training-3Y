package university;

import java.util.*;

interface Graded {
    void assignGrade(String studentId, String grade);
}

class Student {
    private String id;
    private String name;
    private double gpa;
    private List<String> grades = new ArrayList<>();

    public Student(String id, String name) {
        this.id = id; this.name = name;
    }

    public void addGrade(String grade) {
        grades.add(grade);
        recalcGpa();
    }

    private void recalcGpa() {
        // naive: A=4,B=3,C=2,D=1,F=0
        int total = 0;
        for (String g: grades) {
            switch(g) {
                case "A": total += 4; break;
                case "B": total += 3; break;
                case "C": total += 2; break;
                case "D": total += 1; break;
                default: total += 0;
            }
        }
        if (grades.size() > 0) gpa = (double) total / grades.size();
    }

    public String getTranscript() {
        return "Student[" + id + "," + name + ", GPA=" + String.format("%.2f", gpa) + ", grades=" + grades + "]";
    }
}

class Undergraduate extends Student {
    public Undergraduate(String id, String name) { super(id, name); }
}

class Postgraduate extends Student {
    public Postgraduate(String id, String name) { super(id, name); }
}

class Course implements Graded {
    private String code;
    private String title;
    private Map<String,String> studentGrades = new HashMap<>();

    public Course(String code, String title) {
        this.code = code; this.title = title;
    }

    @Override
    public void assignGrade(String studentId, String grade) {
        studentGrades.put(studentId, grade);
    }

    public void printGrades() {
        System.out.println("Course " + code + " grades: " + studentGrades);
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Undergraduate s1 = new Undergraduate("S01", "Nitin");
        Postgraduate s2 = new Postgraduate("S02", "Rekha");
        Course c = new Course("CS101", "Data Structures");
        c.assignGrade(s1.toString(), "A"); // illustrative: mapping by id string
        c.assignGrade(s2.toString(), "B");
        s1.addGrade("A"); s2.addGrade("B");
        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
        c.printGrades();
    }
}
