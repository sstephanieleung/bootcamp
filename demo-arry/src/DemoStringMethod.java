public class DemoStringMethod {
    public static void main(String[] args) {
        String str = "  hello world!   ";

        //empty
        // if(!str.isEmpty()){
        //     System.out.println("String =" + str);
        // }
        // System.out.println(str.length());
        // for (int i = 0 ; i < str.length() ; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(str.charAt(i) + " ");
        //     }
        // }
        // System.out.println();

        //Substring
        String s = "hello";
        System.out.println("Length of hello is " + s.length()); // 5

        String newStr = s.substring(2,s.length()-1);   //ll
        System.out.println("Substring is " + newStr);

        //Trim() , remove all spaces in the head and tail of the string
        //str = "  hello world!   ";
        System.out.println(str.trim());
        System.out.println(newStr.trim());

        //Uppercase & Lowercase
        String s2 = "HEllo, woRld!";
        System.out.println(s2.toUpperCase());  //HELLO WORLD!
        System.out.println(s2.toLowerCase());  //hello world!

        //equals()
        //equalsIsIgnoreCase()
        System.out.println("HEllo, woRld!".equals(s2.toUpperCase()));  //false
        System.out.println("Hello, woRld!".equalsIgnoreCase(s2.toLowerCase()));  //true
        System.out.println("HEllo, woRld!".equalsIgnoreCase("hello"));  //false
        System.out.println();

        //startsWith()
        //endsWith()
        System.out.println(s2.startsWith("HEllo"));  //true
        System.out.println(s2.startsWith("Hello"));  //false
        System.out.println(s2.startsWith("H"));  //true
        System.out.println(s2.startsWith(" "));  //false
        System.out.println(s2.startsWith(""));  //true
        System.out.println();

        System.out.println(s2.endsWith("!"));  //true
        System.out.println(s2.endsWith(""));   //true
        System.out.println();

        String s3 = "1234567890";
        String s4 = s3.substring(3);
        System.out.println(s3.substring(3));
        System.out.println(s4);
        System.out.println(s4.equals(s3.substring(3)));
        System.out.println(s3.startsWith("12345"));
        System.out.println(s4.equals(s3.substring(3)) && s3.startsWith("12345"));  //true

        // Can I use == to compare strings in Java?
        // To compare these strings in Java, we need to use the equals() method of the string. 
        // You should not use == (equality operator) to compare these strings because they compare the reference of the string, 
        // i.e. whether they are the same object or not.
        
        System.out.println(s3.substring(3,s3.length()-1) == "456789"); //false
        System.out.println(s4.equals(s3.substring(3))); //true
        

        //Searching index of '7' from string
        //indexOf(), return -1 means not found
        System.out.println(s3.indexOf('7'));  // 6
        System.out.println(s3.indexOf('m'));  // -1 (int)

        //Searching index of '7' starting from index 8
        System.out.println(s3.indexOf('7',8)); //-1 (int)

        //lastIndexOf()
        String s5 = "1234512345";
        System.out.println(s5);
        System.out.println(s5.indexOf('5')); // 4, return the first occurance of '5'
        System.out.println(s5.lastIndexOf('5'));  //9, return the last occurance of '5'

        System.out.println(s5.indexOf("345")); //2
        System.out.println(s5.indexOf("3 45"));  //-1

        //Searching last index of '4' from the beginning to index 7
        System.out.println(s5.lastIndexOf('4',7)); //3
        System.out.println(s5.lastIndexOf('4',2)); //-1

        //Exercise
        String s6 = "";
        s6 = "ABabc abcdef";  //Assign a value to s6 to return all true for below boolean check
        System.out.println(s6);
        System.out.println(s6.lastIndexOf("abc") == 6 );
        System.out.println(s6.endsWith("def"));
        System.out.println(s6.indexOf("abc") ==2);
        System.out.println(s6.startsWith("ABa") && s6.length() > 10);
        System.out.println(s6.lastIndexOf("abc") == 6 && s6.endsWith("def") && s6.indexOf("abc") ==2 && s6.startsWith("ABa") && s6.length() > 10);

        //concat(): String str1 + str2
        System.out.println("abc" + "def");
        System.out.println("abc".concat("def"));
        System.out.println(s6.concat(s6));

        //contains(): boolean
        System.out.println(s6.contains("abc"));  //true
        System.out.println(s6.indexOf("abc") != -1);  //true

        //Combination of methods: return BC from s6 by string methods
        String resultStr = s6.toUpperCase().substring(3,5);
        System.out.println(resultStr);
        resultStr = s6.substring(3,5).toUpperCase();
        System.out.println(resultStr);

        //Exercise
        resultStr = "";
        for (int i = 0 ; i < s6.length() ; i++){
            if (i % 2 == 0) {
                resultStr = resultStr.concat(s6.toUpperCase().substring(i,i+1));
            } else {
                resultStr = resultStr.concat(s6.toLowerCase().substring(i,i+1));
            }
        }
        System.out.println(resultStr);
    }
}
