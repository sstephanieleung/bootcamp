import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.azul.tooling.ConsumerManager.Consumer;

public class Demo {
    
    //Instance Method

    //Static Method

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("abc","ijk","def"));

        strings.stream().forEach(e -> System.out.println(e));

        //Method-reference

        //Instance Methods
        List<Integer> l1 = strings.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(l1);
        l1 = strings.stream().map(String::length).collect(Collectors.toList()); //1 input, which is method caller
        System.out.println(l2);

        List<String> sortedStrings = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        sortedStrings = strings.stream().sorted(String::compareTo).collect(Collectors.toList()); //2 inputs, first is caller second is method parameter


        //Static Methods
        strings.stream().forEach(System.out::println); //ClassName::method -> When there is a single input, and there is only one input parameter of the method
    }
}
