package HierarchicalInheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    char grade;
    int marks;

    Student(String name, int age, char grade, int marks) {
        super(name, age);
        this.grade = grade;
        this.marks = marks;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
    }
}

class Staff extends Person {
    String role;

    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + role);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Teacher t = new Teacher("Rahul", 35, "Mathematics");
        Student s = new Student("Tanish", 21, 'A', 88);
        Staff st = new Staff("Suresh", 42, "Administration");

        t.displayPerson();
        t.displayRole();
        s.displayPerson();
        s.displayRole();

        st.displayPerson();
        st.displayRole();
    }
}
