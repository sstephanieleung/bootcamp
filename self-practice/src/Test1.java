import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        String s = "abc-abc";
        char c = ' ';

        // String[] arr = s.split(String.valueOf(c));
        // System.out.println(Arrays.toString(arr));

        // StringBuilder sb = new StringBuilder(s);
        // s = s.replaceAll("-", "").toUpperCase();
        // System.out.println(s);
        // StringBuilder.valueOf(s);
        // System.out.println("qwer".matches("^[qwertyuiop]+"));
        // ArrayList<String> result = new ArrayList<>();
        // result.toArray();
        int[] result = new int[]{4,3,5,1,2};
        Arrays.sort(result, (a,b) -> b > a?1:-1);
        System.out.println(Arrays.toString(result));

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        

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
    }
}
