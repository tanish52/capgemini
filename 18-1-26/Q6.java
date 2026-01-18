class Vehicle{
  static int registartionFee=100;
  static void updateRegistartionfee(int a){
    registartionFee=a;
  }
  String ownerName;
  String vehicleType;
  final int registrationNumber;
  Vehicle(String o,String t,int r){
    this.ownerName=o;
    this.vehicleType=t;
    this.registrationNumber=r;
  }
  void details(){
    System.out.println("The owner name of the vehicle is "+ownerName);
    System.out.println("The vehicle type is "+ vehicleType);
    System.out.println("The reigistration number of vehicle is "+registrationNumber);

  }

}
public class Q6{
  public static void main(String[] args) {
    Vehicle v1=new Vehicle("Tanish","Sedan",1234);
    if(v1 instanceof Vehicle){
      v1.details();
    }
    
  }

}