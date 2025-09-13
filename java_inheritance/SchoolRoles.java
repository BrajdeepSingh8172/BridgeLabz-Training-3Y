
// Hierarchical Inheritance Example 2: School System with Different Roles
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    String role;

    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    void displayRole() {
        System.out.println(name + " works as " + role);
    }
}

public class SchoolRoles {
    public static void main(String[] args) {
        new Teacher("Alice", 30, "Math").displayRole();
        new Student("Bob", 16, "10th").displayRole();
        new Staff("Charlie", 40, "Clerk").displayRole();
    }
}
