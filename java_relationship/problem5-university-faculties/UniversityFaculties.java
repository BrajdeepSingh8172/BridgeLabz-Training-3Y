import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String name;
    public Department(String name) { this.name = name; }
    public String getName() { return name; }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) { this.name = name; }

    public void addDepartment(Department d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }

    public void showUniversity() {
        System.out.println("University: " + name);
        for (Department d : departments) System.out.println("Department: " + d.getName());
        for (Faculty f : faculties) System.out.println("Faculty: " + f.getName());
    }
}

public class UniversityFaculties {
    public static void main(String[] args) {
        University u = new University("Delhi University");
        u.addDepartment(new Department("Computer Science"));
        u.addFaculty(new Faculty("Dr. Sharma"));
        u.showUniversity();
    }
}