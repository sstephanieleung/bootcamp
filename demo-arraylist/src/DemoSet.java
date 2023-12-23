import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
    
    public static void main(String[] args) {
        Set<String> ss = new HashdSet<>(); //Set is an interface, HashSet is a class
        List<String> ls = new ArrayList<>();

        ls.add("ABC");
        ls.add("ABC");
        ls.add("ABC");

        for(String s: ls){
            System.out.println(ss.add(s)); //true, false, false
        }

        System.out.println(ss.size()); //1
    }
}
