import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
}

class BookRecommendation {
    String title;
    double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + " (" + rating + ")";
    }
}

public class Q3 {

    public static List<List<BookRecommendation>> getTopScienceFictionBooks(List<Book> books) {
       
        List<BookRecommendation> recommendations = books.stream()
                .filter(b -> b.getGenre().equalsIgnoreCase("Science Fiction") && b.getRating() > 4.0)
                .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                .sorted((b1, b2) -> Double.compare(b2.rating, b1.rating)) // descending
                .limit(10)
                .collect(Collectors.toList());

        
        List<List<BookRecommendation>> pages = new ArrayList<>();
        int pageSize = 5;
        for (int i = 0; i < recommendations.size(); i += pageSize) {
            pages.add(recommendations.subList(i, Math.min(i + pageSize, recommendations.size())));
        }

        return pages;
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Dune", "Frank Herbert", "Science Fiction", 4.8),
            new Book("Neuromancer", "William Gibson", "Science Fiction", 4.5),
            new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.3),
            new Book("Hyperion", "Dan Simmons", "Science Fiction", 4.2),
            new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.1),
            new Book("Ender's Game", "Orson Scott Card", "Science Fiction", 4.0),
            new Book("The Martian", "Andy Weir", "Science Fiction", 4.6),
            new Book("Ready Player One", "Ernest Cline", "Science Fiction", 4.0),
            new Book("Ringworld", "Larry Niven", "Science Fiction", 4.1),
            new Book("Old Man's War", "John Scalzi", "Science Fiction", 4.2),
            new Book("I, Robot", "Isaac Asimov", "Science Fiction", 4.3)
        );

        List<List<BookRecommendation>> pages = getTopScienceFictionBooks(books);

        int pageNum = 1;
        for (List<BookRecommendation> page : pages) {
            System.out.println("Page " + pageNum++);
            page.forEach(System.out::println);
            System.out.println();
        }
    }
}
