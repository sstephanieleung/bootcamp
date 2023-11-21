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
    }
}