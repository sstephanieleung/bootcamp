package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class DemoConsumer {

    public static void main(String[] args) {
        Consumer<String> sendEmailFunc = emailAdderss -> sendEmail(emailAdderss);
        List<String> emails = new ArrayList<>();

        // Common way to use:
        emails.forEach(x -> {
            sendEmail(x);
        });

        // Alternative way to use:
        emails.forEach(sendEmailFunc);

        List<Book> books = new ArrayList<>(List.of(new Book(10.3), new Book(3.2)));
        books.add(new Book(30.8));
        books.forEach(e -> {
            System.out.println(e.getPrice());
        });
        Consumer<Book> printBookPrice = e -> e.printPrice();
        books.forEach(printBookPrice);

        BiConsumer<List<Integer>,Integer> addX = (list, x) -> {
            list.add(x);
        };
        
        SuperConsumer<String, Integer, Gender> newPerson = (name, age, gender) -> {
            Person p = new Person(name, age, gender);
            System.out.println(p.toString());
        };
        newPerson.accept("Vincent Lau", 23, Gender.MALE);

        

        
    }

    public static boolean sendEmail(String emailAddress) {
        System.out.println("Email sending...");
        return true;
    }
}
