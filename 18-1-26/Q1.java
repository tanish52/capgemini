class BankAccount{
    static String bankName="Punjab National Bank";
    static int totalAccount;
    static void getTotalBankAccounts(){
      System.out.println("The Total number of Bank account is "+totalAccount);
    }
    String accountHolderName;
     final int accountNumber;
    BankAccount(String a,int b){
      this.accountHolderName=a;
      this.accountNumber=b;
      totalAccount++;
    }
}
public class Q1{
  public static void main(String[] args) {
    BankAccount b1=new BankAccount("Tanish", 354657);
    BankAccount b2=new BankAccount("Sanket", 356657);    b1.getTotalBankAccounts();
    if(b1 instanceof BankAccount){
     System.out.println(b1.accountHolderName);
     System.out.println(b1.accountNumber); 
    }
  }
}