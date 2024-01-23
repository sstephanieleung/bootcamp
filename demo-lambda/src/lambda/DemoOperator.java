package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoOperator {
    
    public static void main(String[] args) {
        BinaryOperator<String> concatString = (s1, s2) -> s1.concat(s2);
        System.out.println(concatString.apply("hello", "world"));

        BiFunction<String,String,String> concatStr = (s1, s2) -> s1.concat(s2);
        System.out.println(concatStr.apply("hello","world"));

        UnaryOperator<String> subStr = s -> {
            if(s == null)
                return null;
            if(s.length() <= 4)
                return null;
            return s.substring(4);
        };
        System.out.println(subStr.apply("abcdedf"));
        System.out.println(subStr.apply("abcd"));
    }
}
