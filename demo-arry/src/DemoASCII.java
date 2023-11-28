public class DemoASCII {
    public static void main(String[] args) {
        char value = 'C';
        int valueASCII = value;
        System.out.println(valueASCII);  //67
        System.out.println(value == valueASCII); //true

        // '0' = 48
        // 'A' = 65
        // 'a' = 97

        //String and ASCII code
        //compareTo()  -> return int value
        String s1 = "abcdef";
        String s2 = "banana";
        String s3 = "ABCDEF";
        String s4 = "acdef";
        String s5 = "abcd";
        String s6 = "abcA";
        String s1Trim = s1.substring(1);

        System.out.println(s1Trim);
        System.out.println("abcdef".substring(1) == "bcdef");



        //The compareTo() method returns an integer value that represents the comparison result:
            // If the result is negative, it means the first string is lexicographically smaller than the second string.
            // If the result is zero, it means the strings are equal.
            // If the result is positive, it means the first string is lexicographically greater than the second string.

        System.out.println(s2.compareTo(s1)); // 1 ('b' - 'a')
        System.out.println(s1.compareTo(s2)); // -1 ('a' - 'b')
        System.out.println(s3.compareTo(s1)); // -32 ('A' - 'a')
        System.out.println(s4.compareTo(s1)); // This method is to compare the first different character among two strings.
        System.out.println("acdef".compareTo(s4)); // When all characters are identical, it returns 0
        System.out.println(s5.compareTo(s1)); //When the front characters are the same, it compares the length.
        System.out.println(s1.compareTo(s5));
        System.out.println(s6.compareTo(s5));

    }

}
