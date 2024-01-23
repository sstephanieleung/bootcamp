import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class DemoSet {
    
    public static void main(String[] args) {
        Set<String> ss = new HashSet<>(); //Set is an interface, HashSet is a class
        List<String> ls = new ArrayList<>();
        Map<String, Integer> ms = new HashMap<>();


        ls.add("ABC");
        ls.add("ABC");
        ls.add("ABC");
        ss.add("");

        ms.put("A", 1234);
        ms.

        for(String s: ls){
            System.out.println(ss.add(s)); //true, false, false
        }

        System.out.println(ss.size()); //1
    }
}
