import java.util.*;
import java.util.stream.Collectors;

class Sale {
    private int productId;
    private int quantity;
    private double price;

    public Sale(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

class ProductSales {
    private int productId;
    private double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public int getProductId() { return productId; }
    public double getTotalRevenue() { return totalRevenue; }

    @Override
    public String toString() {
        return "Product " + productId + ": $" + totalRevenue;
    }
}

public class Q2 {

    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
            new Sale(101, 5, 20.0),
            new Sale(102, 15, 10.0),
            new Sale(103, 25, 5.0),
            new Sale(101, 20, 20.0),
            new Sale(104, 12, 8.0),
            new Sale(105, 7, 30.0),
            new Sale(106, 30, 2.0)
        );

        List<ProductSales> topProducts = sales.stream()
            .filter(s -> s.getQuantity() > 10)
            .collect(Collectors.groupingBy(
                Sale::getProductId,
                Collectors.summingDouble(s -> s.getQuantity() * s.getPrice())
            ))
            .entrySet().stream()
            .map(e -> new ProductSales(e.getKey(), e.getValue()))
            .sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed())
            .limit(5)
            .collect(Collectors.toList());

        topProducts.forEach(System.out::println);
    }
}
