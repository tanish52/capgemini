import java.util.*;
class Book1 {
    String title;
    String author;
    int price;
    boolean availability;

    Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully: " + title);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Book1 b1 = new Book1("Java Programming", "James Gosling", 500);
        b1.borrowBook();
        b1.borrowBook();
    }
}
