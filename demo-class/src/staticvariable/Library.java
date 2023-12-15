package staticvariable;

import java.util.Arrays;

import javax.swing.UIDefaults.LazyInputMap;

public class Library {
    
    private static int bookCount = 0;

    private static Librarian librarian;

    private Book[] books;

    public Library(){
        this.books = new Book[0];
        this.librarian = new Librarian();
    }

    public Library(Librarian librarian){
        this.books = new Book[0];
        Library.librarian = librarian;
    }

    public Book addBook(Book book){
        Book[] newBooks = Arrays.copyOf(this.books, this.books.length +1);
        newBooks[newBooks.length-1] = book;
        this.books = newBooks;
        bookCount++;
        return this.books[this.books.length-1];
    }
    
    public int bookCount(){
        return this.bookCount;
    }

    public String librarianName(){
        return librarian.getName();
    }

    public static void main(String[] args){
        Library library = new Library();
        library.addBook(new Book());
        System.out.println(library.bookCount());
        library.addBook(new Book());
        library.addBook(new Book());
        System.out.println(library.bookCount());

        Librarian librarian = new Librarian("Vincent", "Lau");
        Library library2 = new Library(librarian);
        System.out.println(library.librarianName());
        System.out.println(library2.librarianName());
    }
}
