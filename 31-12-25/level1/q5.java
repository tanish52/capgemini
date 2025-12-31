public class q5 {
  public static void main(String[] args) {
    int totalPens=14;
    int students=3;
    int remainingpen=totalPens%students;
    int pensDistributed=totalPens-remainingpen;
    System.out.println("The Pen Per Student is " + pensDistributed+" and the remaining pen not distributed is " +remainingpen);
  }
}
