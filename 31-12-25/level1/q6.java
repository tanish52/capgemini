public class q6 {
  public static void main(String[] args) {
    int fee=125000;
    int discountPrecent=10;
    int  discount=(125000/100)*10;
    int feeAfterDiscount=fee-discount;
    System.out.println("The discount amount is INR " +discount+" and final discounted fee is INR "+feeAfterDiscount);
  }
}
