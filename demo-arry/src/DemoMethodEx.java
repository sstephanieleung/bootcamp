import java.util.Arrays;

public class DemoMethodEx {
    public static void main(String[] args) {
        String[] names = new String[] { "Abby", "Mary", "Ian" };
        String[] label = new String[names.length];
        label = nameFirstCharLength(names);
        System.out.println(Arrays.toString(label));
    }

    public static String[] nameFirstCharLength(String[] name) {

        String[] result = new String[name.length];
        int idx = 0;
        for(String s : name){
            result[idx++] = String.valueOf(s.charAt(0)).concat(String.valueOf(s.length()));
        }
        return result;
    }

}
