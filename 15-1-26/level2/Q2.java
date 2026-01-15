package level2;
class BankAccount{
  String accountHolder;
  int accountNumber;
  int balance;
  void depositMoney(int deposit){
    this.balance+=deposit;

  }
  void withdraw(int withdrawmoney){
    if(withdrawmoney<=this.balance){
      this.balance-=withdrawmoney;
    }
  }

  void display(){
    System.out.println("Current Balance is "+this.balance);
  }
}
public class Q2 {
  public static void main(String[] args) {
    
    BankAccount a = new BankAccount();

    a.accountHolder = "Tanish Singla";
    a.accountNumber = 17652163;
    
    a.depositMoney(100000);

    a.display();

    a.withdraw(2000);
    a.display();
  }
}
