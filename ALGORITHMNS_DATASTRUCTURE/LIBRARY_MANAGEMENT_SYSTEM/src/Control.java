import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Control {
    public static void main(String[] args) {
        // Setup books
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(3, "1984", "George Orwell"));
        books.add(new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"));

        // Sort books by title for binary search
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        LibraryManager manager = new LibraryManager();

        // Linear search
        Book bookLinear = manager.searchBookByTitleLinear(books, "1984");
        System.out.println("Linear Search Result: " + bookLinear);

        // Binary search
        Book bookBinary = manager.searchBookByTitleBinary(books, "1984");
        System.out.println("Binary Search Result: " + bookBinary);
    }
}
