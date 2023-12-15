package internalcache;

public class DemoInteger {
    
    public static void main(String[] args) {
        Integer i1 = 10; //10 is an int value , auto-box -> Integer;
        System.out.println("i1 = "+i1);

        Integer i2 = new Integer(10);
        System.out.println("i2 = "+i2);

        System.out.println(i1 == i2); //false, because of "new"
        System.out.println(i1.compareTo(i2)); //0
        System.out.println(i1.equals(i2));//true

        Integer i3 = 10;
        System.out.println(i1 == i3); //true, Integer cache, similar to string literal pool

        Integer i4 = 127;
        Integer i5 = 127;
        System.out.println(i4 == i5); //true, Integer cache

        Integer i6 = 128;
        Integer i7 = 128;
        System.out.println(i6 == i7); //false, out of Integer cache supporting range (-128 to 127)

    }
}
