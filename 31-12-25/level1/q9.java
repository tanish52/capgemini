import java.util.*;
public class q9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       int fee=sc.nextInt();
    int discountPrecent=sc.nextInt();
    int  discount=(fee/100)*discountPrecent;
    int feeAfterDiscount=fee-discount;
    System.out.println("The discount amount is INR " +discount+" and final discounted fee is INR "+feeAfterDiscount);
  }
}
