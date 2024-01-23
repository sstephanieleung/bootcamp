import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestIntegerClass {
    
    public static void main(String[] args) {
        Integer ia = Integer.parseInt("11",2);
        Integer ib = Integer.parseInt("1",2);
        Integer is = Integer.sum(ia,ib);
        // String s = Integer.toBinaryString(is)

        
        System.out.println(Integer.parseInt(String.valueOf(111111),2)); //10
        int[] nums = new int[]{4,7,6,5,7,8};
        
        Map<Integer, String> m = new HashMap<>();
        m.put(1,"ONE");
        m.put(2,"TWO");
        m.remove(1);
        m.replace(2, "TWOO");
        System.out.println(m.get(2));

        Set<Integer> s = new HashSet<>();
        s.clear();

        BigDecimal bd = new BigDecimal(1);
        bd.sqrt(null);

        String str = "hello";
        char[] arr = str.toCharArray();
        System.out.println(String.valueOf(arr));
        System.out.println(str.equals("hello"));

    }
}
