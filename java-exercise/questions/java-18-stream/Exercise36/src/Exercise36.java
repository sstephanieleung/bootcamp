import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output: 
Writer: Susan
Writer: Tracy
Book Name: Book A, Book Price: 34.9
Book Name: Book B, Book Price: 78.9
Book Name: Book C, Book Price: 104.9
Book Name: Book D, Book Price: 449.9
The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...
class Book{

    private String bookName;

    private double price;

    public Book(double price, String bookName){
        this.bookName = bookName;
        this.price = price;
    }

    public String getName(){
        return this.bookName;
    }

    public double getPrice(){
        return this.price;
    }
}

// Implement Wrtier Class
// Code here ...
class Writer{

    private String author;

    private List<Book> books;

    public Writer(String author, List<Book> books){
        this.author = author;
        this.books = books;
    }

    public String getAuthor(){
        return this.author;
    }

    public List<Book> getBooks(){
        return this.books;
    }

}

// Implement a Comparator to compare the book price
// Code here ...
class BookSortByPrice implements Comparator<Book>{

    @Override
    public int compare(Book b1, Book b2){
        return b2.getPrice() > b1.getPrice()? -1:1;  //ascending order
    }
}

class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = Arrays.asList(new Book(34.9, "Book A"), new Book(78.9, "Book B"));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = Arrays.asList(new Book(104.9, "Book C"), new Book(449.9, "Book D"));
        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = Arrays.asList(w1, w2);
        // Print all Writers names
        // Code here ...
        for(Writer e: writers)
            System.out.println(e.getAuthor());

        // Use flatMap method to return all books written by our writers, storing in a List<Book>
        // Just return the Books!
        // Code here ...
        List<Book> allBooks = writers.stream().flatMap(e -> e.getBooks().stream()).collect(Collectors.toList());

        // Print out all books' Name and Price.
        // Code here
        for(Book e: allBooks)
            System.out.println(e.getName()+":"+e.getPrice());

        // Create Comparator for stream max() method use, aims to find the most expensive book
        // Book maxPriceBook = ...
        Book maxPriceBook = allBooks.stream().max(new BookSortByPrice()).get();
                
        // Print out the most expensive book
        System.out.println("Name:" + maxPriceBook.getName() + ", Price:" + maxPriceBook.getPrice());
    }
}
