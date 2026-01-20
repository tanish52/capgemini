abstract class Employee {
    int employeeId;
    String name;
    int baseSalary;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

interface Department {
    void assigndepartment(String d);
    void getDepartmentDetail();
}

class FullTimeEmployee extends Employee implements Department {
    String department;
    private int workhours;
    private int salary;

    public FullTimeEmployee(int employeeId, String name, int workHours) {
        super(employeeId, name);
        this.workhours = workHours;
    }

    void calculateSalary() {
        baseSalary = 10000;
    }

    public void timeworked(int t) {
        workhours = t;
    }

    public int totalSalary() {
        salary = workhours * baseSalary;
        return salary;
    }

    public void assigndepartment(String d) {
        department = d;
    }

    public void getDepartmentDetail() {
        System.out.println(department);
    }

    void displayDetails() {
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + totalSalary());
        getDepartmentDetail();
    }
}

class PartTimeEmployee extends Employee implements Department {
    String department;
    private int workhours;
    private int salary;

    public PartTimeEmployee(int employeeId, String name, int workHours) {
        super(employeeId, name);
        this.workhours = workHours;
    }

    void calculateSalary() {
        baseSalary = 1000;
    }

    public void timeworked(int t) {
        workhours = t;
    }

    public int totalSalary() {
        salary = workhours * baseSalary;
        return salary;
    }

    public void assigndepartment(String d) {
        department = d;
    }

    public void getDepartmentDetail() {
        System.out.println(department);
    }

    void displayDetails() {
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + totalSalary());
        getDepartmentDetail();
    }
}

public class Q1 {
    public static void main(String[] args) {
        
        FullTimeEmployee fte = new FullTimeEmployee(1, "Tanish", 40);
        fte.assigndepartment("B.A.");
        fte.calculateSalary();
        fte.displayDetails();

        System.out.println();

        PartTimeEmployee pte = new PartTimeEmployee(2, "Tanish", 20);
        pte.assigndepartment("HR");
        pte.calculateSalary();
        pte.displayDetails();
    }
}
