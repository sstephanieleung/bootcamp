import java.util.Arrays;

public class DemoForEachLoop {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] { 100, -30, 20 };

        for (Integer i : integers) {
            System.out.println("i = " + i); // 100,-30,20
            integers[2] = 2;
        }

        for (int i = 0; i < integers.length; i++) {
            System.out.println("i = " + i); // 0,1,2
        }

        String str = "agre*oi.wefe*osidhqawo*el.sdfwsh*epqeefsdgh";
        String[] parts = str.split(".w");

        for (String p : parts) {
            System.out.println(p);
        }

        //Example 1:
        String str2 = "abcdefghijk";
        System.out.println(String.valueOf(evenIdx(str2)));

        //Example 2:
        //Given String "abcdefg"
        //finalString = "gfedcba"
        String str3 = "abcdefg";
        //String finalString = reverseString(str3);
        String finalString = reverseString2(str3);
        System.out.println("Reversed string is "+reverseString2(str3));
        System.out.println("Reversed string is "+reverseString2("sddofiew" ));
        System.out.println("Reversed string is "+reverseString2(""));
        

        //Example 3:
        //Given String "abcdefg"

    }

    public static String evenIdx(String s) {
        char[] arr = s.toCharArray();
        int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        char[] result = new char[arrLength];
        int idx = 0;
        // Reorganize to final string: "acegik"
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[idx++] = arr[i];
            }
        }
        return String.valueOf(result);
    }
    public static String reverseString(String s){
        char[] arr = s.toCharArray();
        char[] result = new char[s.length()];
        for (int i = 0; i< s.length(); i++){
            result[i] = arr[s.length()-1-i];
        }
        return String.valueOf(result);
    }

    public static String reverseString2(String s){
        char[] arr = s.toCharArray();
        int last = s.length() % 2 == 0? s.length() /2: s. length() /2 +1;
        for (int i = 0; i< last; i++){
            char temp = arr[i];
            arr[i] = arr[s.length()-1-i];
            arr[s.length()-1-i] = temp;
        }
        return String.valueOf(arr);
    }
}
