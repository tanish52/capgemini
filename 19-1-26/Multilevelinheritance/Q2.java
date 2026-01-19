package Multilevelinheritance;
class Course{
  String courseName;
  int duration;
  
  Course(String c,int du){
    this.courseName=c;
    this.duration=du;
  }
}
class Onlinecourse extends Course{
  String platform;
  boolean isRecorded;
  Onlinecourse(String c,int du,String plat,boolean isr){
    super(c, du);
    this.platform=plat;
    this.isRecorded=isr;
  }

}

class Paidonlinecourse extends Onlinecourse{
  int fee;
  int discount;
  Paidonlinecourse(String cu,int d,String plat,boolean isr,int f,int di){
    super(cu,d,plat,isr);
    this.fee=f;
    this.discount=di;
  }
}
public class Q2 {
  public static void main(String[] args) {
    
  }
}
