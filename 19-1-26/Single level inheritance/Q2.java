class Device{
  int deviceId;
  String deviceStatus;
}
class Thermostat extends Device{
  String  tempertaureSetting;
  void displaystatus(){
    System.out.println("The setting is "+ tempertaureSetting);
    
  }
  Thermostat(String t){
    this.tempertaureSetting=t;
  }
}
public class Q2 {
  public static void main(String[] args) {
    Thermostat t1=new Thermostat("Mild");
    t1.displaystatus();
  }
}
