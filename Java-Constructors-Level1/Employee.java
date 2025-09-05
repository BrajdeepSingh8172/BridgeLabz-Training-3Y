/**
 * Access Modifiers - Problem 4: Employee Records
 */
class Employee {
    public String employeeID;    // public
    protected String department; // protected
    private double salary;       // private

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Salary must be non-negative.");
        this.salary = salary;
    }
}

public class Manager extends Employee {
    private int teamSize;

    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void display() {
        // Access to employeeID (public) and department (protected)
        System.out.println("Manager[id=" + employeeID + ", dept=" + department +
                ", salary=" + getSalary() + ", teamSize=" + teamSize + "]");
    }

    public static void main(String[] args) {
        Manager m = new Manager("EMP-1001", "IT", 900000.0, 8);
        m.display();
    }
}