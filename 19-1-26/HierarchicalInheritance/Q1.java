package HierarchicalInheritance;
class BankAccount{
  long accountNumber;
  int balance;
}
class FixedAccount extends BankAccount{
  int duration;
  void displayAccounttype(){
    System.out.println("The account type is fixed");
  }
}
class SavingsAccount extends BankAccount{
  int interestRate;
  void displayAccounttype(){
    System.out.println("The account type is Savings");
  }
}
class CheckingAccount extends BankAccount{
  int withdrawlLimit;
   void displayAccounttype(){
    System.out.println("The account type is Checking");
  }
}
public class Q1 {
  public static void main(String[] args) {
    
  }
}
