import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

public class Q1 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Engineering", 90000),
            new Employee(2, "Bob", "Engineering", 85000),
            new Employee(3, "Charlie", "HR", 75000),
            new Employee(4, "David", "Engineering", 80000),
            new Employee(5, "Eve", "Marketing", 95000)
        );

        List<Employee> filteredSorted = employees.stream()
            .filter(e -> e.getDepartment().equals("Engineering") && e.getSalary() > 80000)
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());

        System.out.println("Filtered & Sorted Employees:");
        filteredSorted.forEach(System.out::println);

        Map<String, List<Employee>> grouped = filteredSorted.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\nGrouped by Department:");
        grouped.forEach((dept, empList) -> System.out.println(dept + ": " + empList));

        Map<String, Double> avgSalary = filteredSorted.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println("\nAverage Salary per Department:");
        avgSalary.forEach((dept, avg) -> System.out.println(dept + ": $" + avg));
    }
}
