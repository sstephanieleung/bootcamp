package lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {

    public static void main(String[] args) {
        // f(x) = x +3
        // y = x + 3

        //R apply (T t)
        Function<String,Integer> stringLength = (str) -> {
            return str.length(); //return Integer Object
        };
        System.out.println(stringLength.apply("hello")); //5
        System.out.println(stringLength.apply("abc")); //3

        Function<String,String> encoder = (input) -> {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < input.length(); i++){
                sb.append((char)(input.charAt(i)+1));
            }
            return sb.toString();
        };
        System.out.println(encoder.apply("12345")); //23456

        BiFunction<List<String>, Integer, String> getByIndex = (strings, index) -> strings.get(index); //runtime 

        //Example for Function
        Map<String, String> dicMap = new HashMap<>();
        dicMap.put("John", "ABC");
        dicMap.put("Mary", "IJK");

        BiFunction<String, String, String> remapFunc = (key, oldValue) ->{
            if(oldValue == null)
                return "Hello";
            return oldValue.concat("end");
        };
        dicMap.compute("Mary", remapFunc);
        System.out.println(dicMap.get("Mary")); //IJKend
        dicMap.compute("Peter", remapFunc);
        System.out.println(dicMap.get("Peter")); //Hello
        dicMap.compute("Peter", remapFunc);
        System.out.println(dicMap.get("Peter")); //Helloend



    }
}
