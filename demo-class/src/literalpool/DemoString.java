package literalpool;

public class DemoString {

    public static void main(String[] args) {
        // Quiz
        String str1 = "hello"; //create a string object "hello"
        String str2 = "hello"; //check if "hello" exist in string literal pool so that JVM can reuse "hello" object by various object reference

        String str3 = "hello!"; //string literal pool not found, create a new string object "hello!"
        String str4 = new String("hello"); //bypass checking process in literal pool, create a new string object "hello"
        String str5 = String.valueOf("hello"); //check if "hello" exist in string literal pool so that JVM can reuse "hello" object by various object reference
        
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //true, literal pool
        System.out.println(str1 == str3); //false
        System.out.println(str1 == str4); //false
        System.out.println(str1 == str5); //true

        String str6 = null; //Java Compiler would NOT at look at the value assigned to object reference during the compile time.
        // if (str6.equals("hello")){ //cant find object -> cant find method -> cant resolve the argument -> error
        //     System.out.println("Always initialize instance methods with an existing object!!!");
        // }

        //Concatentation
        String str7 = "abc";
        String str8 = str7 + "def"; // there will be 2 string object in literal pool
        //obejct "abc" and "abcdef" is created.
 
        //

        String str10 = new String("aaabbb");
        String str11 = "aaabbb";

        String str13 = new String("aaabbb").intern();
        String str14 = "aaabbb";

        String str15 = new String("aaabbb").intern();
        String str16 = "aaabbb";

        System.out.println(str10 == str11); //false
        System.out.println(str10 == str13); //false
        System.out.println(str11 == str13);//true
        System.out.println(str11 == str14);//true
        System.out.println(str13 == str14); //true
        System.out.println(str13 == str15);//true
        System.out.println(str10 == str15); //false

    }
}
