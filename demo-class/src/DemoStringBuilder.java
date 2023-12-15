public class DemoStringBuilder {

    public static void main(String[] args) {
        // String
        // +=
        // .concat()

        String x = "abc";
        x += "def";
        x = x.concat("def"); // Pass by value: return a new string
        System.out.println(x); // abcdefdef

        // StringBuilder <- Class
        StringBuilder y = new StringBuilder("abc");
        y.append("def").append("def"); // Pass by reference: return
        System.out.println(y.toString());

        // 123 456 789 101112...
        // While loop --> counter
        StringBuilder sbInt = new StringBuilder("");
        int counter = 4;
        int num = 0;

        while (counter-- > 0) {
            // sbInt.append(++num).append(++num).append(++num).append(" ");
            for (int i = 0; i < 3; i++) {
                sbInt.append(++num);
            }
            if (counter > 0) {
                sbInt.append(" ");
            }
        }
        System.out.println(sbInt.toString());

        // aaa bbb ccc ...
        StringBuilder sbChar = new StringBuilder("");
        int count = 4;
        char c = 'a';
        while (count-- > 0) {
            for (int i = 0; i < 3; i++) {
                sbChar.append(c);
            }
            if (count > 0) {
                sbChar.append(" ");
            }
            c++;
        }
        System.out.println(sbChar.toString()); // aaa bbb ccc ddd
        System.out.println(sbChar.reverse().toString()); // ddd ccc bbb aaa
        System.out.println(sbChar.insert(4, "bootcamp").toString()); // ddd bootcampccc bbb aaa
        System.out.println(sbChar.delete(0, 6).toString()); // otcampccc bbb aaa
        sbChar.setCharAt(2, 'J');
        System.out.println(sbChar.toString()); // otJampccc bbb aaa
        sbChar.replace(2, 6, "abc");
        System.out.println(sbChar.toString()); // otabcccc bbb aaa

        System.out.println(sbChar.length()); // 16
        System.out.println(sbChar.isEmpty()); // false
        System.out.println(sbChar.substring(0, 3)); // ota

        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder("abc");

        System.out.println(s1.equals(s2)); // false <- to be explained later
        System.out.println(s1.toString().equals(s2.toString())); // true <- convert to String fist then compare
        System.out.println(s1.compareTo(s2)); // 0

        System.out.println(stringConcat());
        System.out.println(stringBuilderConcat());// <- the runtime of StringBuilder operation is much less than that of string.
        System.out.println(sbChar.indexOf("1"));
        

    }

    public static long stringConcat() {
        //long start = System.currentTimeMillis();
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s = s.concat("a");
        }
        //long end = System.currentTimeMillis();
        long end = System.nanoTime();
        return end - start;
    }

    public static long stringBuilderConcat() {
        // long start = System.currentTimeMillis();
        long start = System.nanoTime();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 1000; i++) {
            s.appe  nd("a");
        }
        //long end = System.currentTimeMillis();
        long end = System.nanoTime();
        return end - start;
    }
}
