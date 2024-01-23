import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "hello";
        var s2 = "hello"; // after compile var -> String
        var a = null;
        String s3 = (var) s2;

        Double d = OptionalDouble.of(0.0d).getAsDouble();
        Integer i = OptionalInt.of(0).getAsInt();

        // s = 123; // Error
        // s2 = 123; // Error, s2 is declared before and pointing to a String Object

        List<Dog> dogs = new ArrayList<>(List.of(new Dog("ABC"), new Dog("DEF")));
        for (Dog dog : dogs)
            System.out.println(dog.getName());
        for (var dog : dogs)
            System.out.println(dog.getName());

        Map<Integer,String> map = new HashMap<>();
        map.putIfAbsent(i, s3);
    }
}
