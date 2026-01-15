package level2;

class Q5 {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
    }

    void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + totalCost);
    }

    public static void main(String[] args) {
        Q5 item = new Q5();

        item.addItem("Book", 250, 2);
        item.displayTotalCost();

        item.removeItem();
        item.displayTotalCost();
    }
}
