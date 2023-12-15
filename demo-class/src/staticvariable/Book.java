package staticvariable;

public class Book {

    private int bookId;

    private String bookName;

    private int quantity;

    public Book() {
        this(0,"",0);
    }
    public Book(int bookId) {
        this(bookId,"",0);
    }
    public Book(String bookName) {
        this(0,bookName,0);
    }

    public Book(int bookId, String bookName, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public Book(int bookId, String bookName) {
        this(bookId, bookName, 0);
    }

    public Book(String bookName, int quantity){
        this(0,bookName,quantity);
    }

    public Book(int bookId, int quantity){
        this(bookId,"",quantity);
    }
   
    public void setId(int bookId) {
        this.bookId = bookId;
    }
    public void setName(String bookName) {
        this.bookName = bookName;
    }
    public void setQty(int quantity){
        this.quantity = quantity;
    }
    
}
