import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Before Java 1.5 (No Generic)
        ArrayList<String> strs = new ArrayList<String>(); // Still OKAY

        // After 1.7
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ABC");
        strings.add("ADE"); // new Array -> copyOf -> reason of very slow operation with Arrays / Arraylist
        strings.add("AFG"); // new Array -> copyOf -> reason of very slow operation with Arrays / Arraylist
        System.out.println(strings.size());
        System.out.println(strings.toString()); // override Object.class toString() method

        // for-each
        for (String s : strings) {
            System.out.println(s);
        }

        strings.remove(2);
        System.out.println(strings.toString());
        strings.remove(new String("ABC"));
        strings.remove("ABC");
        System.out.println(strings.toString());

        ArrayList<String> anotherList = new ArrayList<>(List.of("1234", "2345", "3456"));
        strings.addAll(anotherList);
        System.out.println(strings.toString());
        strings.add(1, "CCC"); // insert by index
        System.out.println(strings); // [ADE, CCC, 1234, 2345, 3456]
        strings.set(1, "DDD");
        System.out.println(strings); // [ADE, DDD, 1234, 2345, 3456]
        strings.subList(1, 2);
        System.out.println();

        // List is an interface implemented by ArrayList.class
        List<String> strings2 = new ArrayList<>();
        System.out.println(strings2.add("ABC"));
        System.out.println(strings2.remove(0));
        System.out.println(strings2);
        System.out.println();

        // Difference: ArrayList vs List.of
        List<String> arrlist1 = new ArrayList<String>(List.of("John", "Mary", "Peter"));
        List<String> arrlist2 = List.of("John", "Mary", "Peter");

        System.out.println(arrlist1.add("Sally"));// true
        System.out.println(arrlist1.remove("Mary"));// true
        System.out.println(arrlist1.set(1, "Jenny")); // OK
        System.out.println(arrlist1.equals(arrlist2)); // false

        // arrlist2.set(1, "Jenny"); //java.lang.UnsupportedOperationException
        // arrlist2.add("Sally"); //java.lang.UnsupportedOperationException

        // Try it!
        List<Book> books = new ArrayList<>(List.of(new Book("BookA"), new Book("BookB")));
        books.add(new Book("BookC"));
        books.add(new Book("BookD"));
        Book book = new Book("BookE");
        books.add(book);
        System.out.println(books.toString()); //[BookA, BookB, BookC, BookD, BookE]

        // contains BookA?
        System.out.println(books.contains(new Book("BookA"))); // false
        System.out.println(books.contains(book)); // true

        //contains BookE?
        System.out.println(book.equals(new Book("BookE"))); //true

        boolean found = false;
        for(Book b : books){
            if(b.equals(book))
                found = true;
        }
        if(found)
            System.out.println("BookE is available in books.");

        //remove (Object obj)
        System.out.println(books.remove(new Book("BookE"))); //true
        System.out.println(books.remove(new Book("ABC"))); //false
        System.out.println(books.toString()); //[BookA, BookB, BookC, BookD]


    }
}
