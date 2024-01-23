import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        String s = "abc abc";
        char c = ' ';

        String[] arr = s.split(String.valueOf(c));
        System.out.println(Arrays.toString(arr));

        // System.out.println(s.indexOf("abc") == 0); // word[0] : "abc"
        // System.out.println(s.indexOf("ab") == 0); // word[1]: "ab"
        // System.out.println(s.indexOf("bc") == 0); // word[2]: "bc"
        // System.out.println();
        // System.out.println(s.startsWith("abc")); // word[0] : "abc"
        // System.out.println(s.startsWith("ab")); // word[1]: "ab"
        // System.out.println(s.startsWith("bc")); // word[2]: "bc"

        // List<Integer> list = new ArrayList<>();
        // Map<Integer, Character> code = new HashMap<>();
        // code.put(null, null)

        StringBuilder sb = new StringBuilder("1.1.1.1");
        sb.ch
    }
}
