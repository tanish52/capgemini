package level2;
class Student{
  String name;
  int rollnumber;
  int marks;
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 40)
            return 'D';
        else
            return 'F';
    }
    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}
public class Q1 {
  public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Tanish";
    s1.rollnumber=2438;
    s1.marks=83;
    s1.displayDetails();
  }
}
