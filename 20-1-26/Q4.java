abstract class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int an, String hn, double b) {
        accountNumber = an;
        holderName = hn;
        balance = b;
    }

    void deposit(double dep) {
        balance += dep;
    }

    void withdraw(double with) {
        balance -= with;
    }

    abstract void calculateInterest();
}

interface Loanable {
    void applyForLoan();
    void calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {

    double interest;

    SavingsAccount(int an, String hn, double b, double i) {
        super(an, hn, b);
        interest = i;
    }

    void calculateInterest() {
        balance += balance * (interest / 100);
    }

    public void applyForLoan() {
        System.out.println("Savings account loan applied");
    }

    public void calculateLoanEligibility() {
        System.out.println("Savings account loan eligibility checked");
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    double interest;

    CurrentAccount(int an, String hn, double b, double i) {
        super(an, hn, b);
        interest = i;
    }

    void calculateInterest() {
        balance += balance * (interest / 100);
    }

    public void applyForLoan() {
        System.out.println("Current account loan applied");
    }

    public void calculateLoanEligibility() {
        System.out.println("Current account loan eligibility checked");
    }
}

public class Q4 {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(101, "Tanish", 10000, 4);
        BankAccount acc2 = new CurrentAccount(102, "Rahul", 20000, 2);

        BankAccount[] accounts = { acc1, acc2 };

        for (BankAccount acc : accounts) {
            acc.calculateInterest();
            System.out.println("Balance: " + acc.balance);
        } 
    }
}
