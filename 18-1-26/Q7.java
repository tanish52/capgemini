class Patient{
  static String hospitalName="Neelam";
  static int patientcount;
  static void getTotalPatients(){
    System.out.println("The number of patients are "+patientcount);
  }
  String name;
  int age;
  String ailment;
  final int patientId;
  Patient(String n,int a,String ail,int pid){
    this.name=n;
    this.age=a;
    this.patientId=pid;
    this.ailment=ail;
    patientcount++;
  }
  void details(){
    System.out.println("The patient name is "+this.name);
    System.out.println("The patient age is "+this.age);
    System.out.println("The patientid is "+this.patientId);
    System.out.println("The patient has "+this.ailment);
  }

}
public class Q7 {
  public static void main(String[] args) {
    Patient p1=new Patient(
      "Tanish", 21, "fever", 213);
      if(p1 instanceof Patient){
        p1.details();
      }

  }
}
