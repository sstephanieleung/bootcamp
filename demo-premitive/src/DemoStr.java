public class DemoStr {
    public static void main(String[] args){
        String emailAddress = "gdsstephanie@gmail.com";
        //String s = 3; // s is declared by String, so you cannot assign int value
        //int i = "Hello"; // i is declared by int, so you cannot assign String value

        System.out.println(emailAddress);  //gdsstephanie@gmail.com
        System.out.println();

        //Operation, append / concatenate 附加
        String str = "hello" + " " + "world";
        System.out.println(str);                        // hellow world

        //Always look at the codes inside bracket first, followed by outside codes
        // Step 1: "hello" + " " + "world" -> "hello world"
        // Step 2: System.out.println() -> print out
        System.out.println("hello" + " " + "world");    //hellow world

        //In Java, there is no minus or multiple sign for operation for string
        //String is non-primitive value, it carries functions
        String str2 = "hello";
        System.out.println(str2.length());
        str2 = str2 + "world";
        System.out.println(str2);
        str2 += "!!!";
        System.out.println(str2);

        //No "-", "*", "/" in String
        //String support "+", "+=" for concatenate

        // equals()
        // if, =, ==
        int x = 0;  //= menas assignment
        int x2 = 3;
        if (x == x2){   // == means asking if they are equal
            //do something
            //"x==x2" returns false, so the flow will not fall into this block
            System.out.println("x is equals to x2.");
        } else {
            System.out.println("x is not equals to x2.");
        }
        // Only primitive value can use == to compare their value in Java
        // String is not a primitive, so you cannot use == to compare their value
        String s1 = "hello";
        String s2 = "hello";
        if (s1.equals(s2)) {  //comparing two string variables
            System.out.println("s1 is equlas to s2.");
        }
        if("hello".equals(s1)) {    // when string value is comparing to a variable, ALWAYS .equals(<Variable>) instead of .equals(<String Value>)
            // if (s1.equals("hello"))  // DO NOT code in this way!!!
            System.out.println("s1 is hello");
        }
        if ("hello".equals("hello")) {  // always true validation, wasting time
            //
        }
        
        //chaAt()
        //4 is an index of String. Index always start with 0
        // "hello": index of "h" = 0
        // character at index 4 is "o"
        char c = s1.charAt(4) ;  //this statement assigned char "o" to variable char c

        //length() charAt()
        s1 = "Vincent";
        int lastCharIndex = s1.length()-1;  //Good practice: always store the return value to a variables
        c = s1.charAt(lastCharIndex);  // Alternative: c = s1.charAt(s1.length()-1);
        System.out.println(lastCharIndex);
        System.out.println(c);
    }
}