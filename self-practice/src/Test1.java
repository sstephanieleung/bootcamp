public class Test1 {

    public static void main(String[] args) {
        String s = "abcabc";

        System.out.println(s.indexOf("abc") == 0); // word[0] : "abc"
        System.out.println(s.indexOf("ab") == 0); // word[1]: "ab"
        System.out.println(s.indexOf("bc") == 0); // word[2]: "bc"
        System.out.println();
        System.out.println(s.startsWith("abc")); // word[0] : "abc"
        System.out.println(s.startsWith("ab")); // word[1]: "ab"
        System.out.println(s.startsWith("bc")); // word[2]: "bc"
    }
}
