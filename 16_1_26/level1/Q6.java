class CarRental{
  String customerName;
  String Carmodel;
  int rentdays;
  CarRental(String n, String m,int r){
    this.customerName=n;
    this.rentdays=r;
    this.Carmodel=m;
    System.out.println("Customer name is "+customerName);
    System.out.println("Car model is "+Carmodel);
    System.out.println("Total days of rent is "+rentdays);
    System.out.println("Per day rent is "+1000);
    System.out.println("Total rent is "+rentdays*1000);
  }

}
public class Q6 {
  public static void main(String[] args) {
    CarRental c1=new CarRental("Sanket", "Mustang", 5);
  }
}
