abstract class Product {
    int productId;
    String name;
    int price;

    Product(int pid, String n, int p) {
        productId = pid;
        name = n;
        price = p;
    }

    abstract void calculateDiscount();
}

interface Taxable {
    void calculateTax();
    void getTaxDetails();
}

class Groceries extends Product {
    private int numberOfProducts;
    private String qualityOfProducts;
    private int discount;

    Groceries(int pid, String n, int p, int nop, String qop) {
        super(pid, n, p);
        numberOfProducts = nop;
        qualityOfProducts = qop;
    }

    void setDiscount(int n) {
        discount = n;
    }

    void calculateDiscount() {
        System.out.println("Discount on " + name + ": $" + (price * discount / 100.0));
    }
}

class Electronics extends Product implements Taxable {
    private int numberOfProducts;
    private String qualityOfProducts;
    private int discount;

    Electronics(int pid, String n, int p, int nop, String qop) {
        super(pid, n, p);
        numberOfProducts = nop;
        qualityOfProducts = qop;
    }

    void setDiscount(int n) {
        discount = n;
    }

    void calculateDiscount() {
        System.out.println("Discount on " + name + ": $" + (price * discount / 100.0));
    }

    public void calculateTax() {
        System.out.println("Tax on " + name + ": $" + (price * 0.18));
    }

    public void getTaxDetails() {
        System.out.println(name + " is taxable at 18%");
    }
}

class Clothing extends Product implements Taxable {
    private int numberOfProducts;
    private String qualityOfProducts;
    private int discount;

    Clothing(int pid, String n, int p, int nop, String qop) {
        super(pid, n, p);
        numberOfProducts = nop;
        qualityOfProducts = qop;
    }

    void setDiscount(int n) {
        discount = n;
    }

    void calculateDiscount() {
        System.out.println("Discount on " + name + ": $" + (price * discount / 100.0));
    }

    public void calculateTax() {
        System.out.println("Tax on " + name + ": $" + (price * 0.05));
    }

    public void getTaxDetails() {
        System.out.println(name + " is taxable at 5%");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Groceries rice = new Groceries(101, "Rice", 100, 10, "A+");
        rice.setDiscount(5);
        rice.calculateDiscount();

        Electronics laptop = new Electronics(102, "Laptop", 1000, 5, "High");
        laptop.setDiscount(10);
        laptop.calculateDiscount();
        laptop.calculateTax();
        laptop.getTaxDetails();

        Clothing shirt = new Clothing(103, "Shirt", 50, 20, "Premium");
        shirt.setDiscount(20);
        shirt.calculateDiscount();
        shirt.calculateTax();
        shirt.getTaxDetails();
    }
}
