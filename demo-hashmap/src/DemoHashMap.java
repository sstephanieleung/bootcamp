import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

    // May: key value pair: <key, value> -> one entry
    public static void main(String[] args) {
        // Map<String, Integer> ageBook = new HashMap<>();
        // ageBook.put("John",20); //create entry
        // ageBook.put("John",13); //Update entry
        // ageBook.put("Mary", 3);

        // System.out.println(ageBook.size()); //2
        // System.out.println(ageBook.get("John")); //13

        // for(Map.Entry<String,Integer> entry: ageBook.entrySet()){
        //     System.out.println(entry.getKey()+" "+ entry.getValue());
        // }

        // Map<String, String> contactBook = new HashMap<>();
        // contactBook.put("91234567", "Vincent Lau");
        // contactBook.put("91937462", "Mary Chan");
        // contactBook.put("91938264", "Peter Cheung");
        
        // System.out.println(contactBook.containsKey("91937462")); //true
        // System.out.println(contactBook.containsValue("Vincent")); //false

        // for(Map.Entry<String, String> entry: contactBook.entrySet()){
        //     if(entry.getKey().contains("9193"))
        //         System.out.println(entry.getKey()+" "+ entry.getValue());
        // }
        // System.out.println(contactBook.get("91938264")); // Peter Cheung
        // System.out.println(contactBook.put("91938264", "Eric Chung")); //Peter Cheung
        // System.out.println(contactBook.put("91938264", "Eric Chung")); //Eric Chung
        // System.out.println(contactBook.replace("91938264","Jamie Cheung")); //Eric Chung

        Map<String, Book> book = new HashMap<>();
        book.put("Vincent Lau",new Book("AAA"));
        System.out.println(book.get("Vincent Lau")); //AAA
        System.out.println(book.get("Vincent Lau").equals(new Book("AAA","1.0")));

        //Map<Author, Book>
        //put() require obj class contain hashCode() and equals() -> update entry
        //      if no, put() will treat(new Obj(), new Obj()) as new obj and create new entry
        //get() require obj class contain hashCode() and equals() -> return toString()
        Map<Author, Book> bookMap = new HashMap<>();
        Author vincent = new Author("Vincent Lau");
        bookMap.put(new Author("Vincent Lau"), new Book("ABC"));
        bookMap.put(new Author("Vincent Lau"), new Book("EEE"));// if no equals() & hashcode() in key object class -> new entry
        bookMap.replace(new Author("Vincent Lau"), new Book("BDC"));
        

        System.out.println(bookMap.putIfAbsent(new Author("Ann"), new Book("IJK"))); //key not found, new entry
        System.out.println(bookMap.putIfAbsent(new Author("Ann"), new Book("CCC"))); //key found, return oldValue, not updating the entry

        for(Map.Entry<Author, Book> entry: bookMap.entrySet()){
            System.out.println(entry.getKey().getName() + " "+ entry.getValue());
        }

        System.out.println(bookMap.get(new Author("Ann")));
        System.out.println(bookMap.remove(new Author("Ann")));
        
    }
}
