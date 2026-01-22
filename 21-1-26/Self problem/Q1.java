import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {

        School school = new School("ABC School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);

        s2.enroll(c1);

        school.showStudents();
        System.out.println();

        s1.showCourses();
        System.out.println();

        s2.showCourses();
        System.out.println();

        c1.showStudents();
    }
}
