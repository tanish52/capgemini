class Student{
  static String universityName="Chitkara University";
  static int count;
  static void studentCount(){
    System.out.println("The number of students is "+count);
  }
  String name;
  final int rollnumber;
  Character grade;
  Student(String n,int r,Character g){
    this.name=n;
    this.rollnumber=r;
    this.grade=g;
    count++;
  }
  void details(){
    System.out.println("The name of the student is "+ this.name);
    System.out.println("Thr roll number is "+this.rollnumber);
    System.out.println("The Grade is "+this.grade);
  }

}
public class Q5 {
  public static void main(String[] args) {
    Student s1=new Student("Tanish", 2438, 'A');
     Student s2=new Student("Tanmay", 2449, 'B');
    if(s1 instanceof Student){
      s1.details();
    }
    Student.studentCount();
  }
}
