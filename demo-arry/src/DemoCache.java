public class DemoCache {
    public static void main(String[] args) {
        String s1 = "John";
        String s2 = "John";

        System.out.println(s1.equals(s2));  //checking if s1 and s2 are same value
        System.out.println(s1 == s2);  //checking if they are same object

        String s3 = new String("John");
        System.out.println(s1.equals(s3));  //true: same value
        System.out.println(s1 == s3); //false: different object

        String s4 = String.valueOf("John");
        System.out.println(s1.equals(s4));  //true: same value
        System.out.println(s1 == s4); //true: 

        s1 = "John2";
        s2 = s2.concat("2");
        System.out.println(s1.equals(s2)); //true:
        System.out.println(s1 == s2); //false
    }
}
