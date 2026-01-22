import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showData() {
        System.out.println("University: " + name);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println(d.name);
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println(f.name);
        }
    }

    void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted");
        System.out.println("All departments removed");
    }
}

public class Q2{
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University uni = new University("Delhi University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");
        uni.addDepartment("Civil");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showData();

        System.out.println();

        uni.deleteUniversity();

        System.out.println();

        f1.show();
        f2.show();
    }
}
