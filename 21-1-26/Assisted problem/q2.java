import java.util.*;

class Customer {

    String customerName;
    ArrayList<Account> accounts;

    Customer(String customerName) {
        this.customerName = customerName;
        accounts = new ArrayList<>();
    }

    void addAccount(Account acc) {
        accounts.add(acc);
    }

    void viewBalances() {
        System.out.println("Customer: " + customerName);
        for (Account a : accounts) {
            a.viewBalance();
        }
    }
}

class Bank {

    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    Account openAccount(Customer customer, int accNo, double balance) {
        Account account = new Account(accNo, balance, this);
        customer.addAccount(account);
        return account;
    }
}

class Account {

    int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    void viewBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("Balance: ₹" + balance);
    }
}

public class q2 {

    public static void main(String[] args) {

        Bank sbi = new Bank("SBI Bank");
        Bank hdfc = new Bank("HDFC Bank");

        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Anita");

        sbi.openAccount(c1, 101, 50000);
        sbi.openAccount(c1, 102, 25000);

        hdfc.openAccount(c2, 201, 80000);

        c1.viewBalances();
        c2.viewBalances();
    }
}
