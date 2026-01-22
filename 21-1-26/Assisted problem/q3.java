import java.util.*;

class Company {

    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

class Department {

    String departmentName;
    ArrayList<Employee> employees;

    Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    void showDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Employee {

    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void showEmployee() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

public class q3 {

    public static void main(String[] args) {

        Company company = new Company("Capgemini");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.departments.get(0).addEmployee(101, "Rahul");
        company.departments.get(0).addEmployee(102, "Amit");

        company.departments.get(1).addEmployee(201, "Neha");

        company.showCompanyDetails();

        company = null;

        System.out.println("Company deleted. Departments and Employees also removed.");
    }
}
