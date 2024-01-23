package lambda;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
    
    public static void main(String[] args) {
        Supplier<Book> emptyBook = () -> new Book();
        Book book = emptyBook.get();  //.get() is a method of Supplier.class
    }

    public static int random(){
        return new Random().nextInt(100);
    }
}
