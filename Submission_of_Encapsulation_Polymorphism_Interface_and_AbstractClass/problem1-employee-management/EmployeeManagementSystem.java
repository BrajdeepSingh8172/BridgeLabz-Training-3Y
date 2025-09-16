import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    protected double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", BaseSalary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { if (bonus >= 0) this.bonus = bonus; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void setHoursWorked(int hours) { if (hours >= 0) this.hoursWorked = hours; }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class HRDepartment implements Department {
    private String deptName;

    @Override
    public void assignDepartment(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + deptName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee fte = new FullTimeEmployee("E001", "Anjali", 50000, 5000);
        PartTimeEmployee pte = new PartTimeEmployee("E002", "Suresh", 300, 80);

        employees.add(fte);
        employees.add(pte);

        Department hr = new HRDepartment();
        hr.assignDepartment("Human Resources");

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
        }

        System.out.println(hr.getDepartmentDetails());
    }
}