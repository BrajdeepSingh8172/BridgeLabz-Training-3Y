import java.util.*;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) { this.name = name; }

    public void addEmployee(Employee emp) { employees.add(emp); }

    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName());
        }
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) { this.name = name; }

    public void addDepartment(Department d) { departments.add(d); }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.showEmployees();
    }
}

public class CompanyDepartments {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d1 = new Department("HR");
        d1.addEmployee(new Employee("Anita"));
        d1.addEmployee(new Employee("Vikram"));
        c.addDepartment(d1);
        c.showCompany();
    }
}