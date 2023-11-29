import javax.sound.sampled.BooleanControl;

public class DemoWrapper {
    public static void main(String[] args)  {
        //int -> Integer class
        int i1 = 3;
        Integer i2 = 3; //3 is int value -> auto-boxing a primitive to object
        int i3 = i2; //auto-unbox an object to primitive

        Integer i4 = new Integer(5);  //this is an example of not auto-boxing
        Integer i5 = Integer.valueOf(3);
        //primitive do not have methods, but object does

        int result = i4.compareTo(i2); //1
        System.out.println(result);

        int result2 = i2.compareTo(i4); //-1
        System.out.println(result2);

        //i2, i4, i5 are class, DO NOT use operators < > = ! to do comparison yet it is logically correct in Java
        //Always good practice with method .compareTo() for the comparison

        if(i2.compareTo(i4) == 0) { // asking if i2 == i4

        }

        if (i2 == i4){  //Compiler force to unboxing the class to primitive

        }

        boolean isOkay = true;
        Boolean isPassed = true;  //auto-boxing
        Boolean isPassed2 = Boolean.valueOf(true); // manual boxing
        Boolean isPassed3 = new Boolean(true);  //Compiler dont recommend this way to assign boolean class variable
        
        //double -> Double class

        Double d1 = 0.0d; // auto boxing a primitve double value to Double class
        Double d2 = Double.valueOf(0.0); // manual boxing
        
        if (d1.compareTo(d2)==0){

        }

        //char -> Character class

        Character c1 = 'a';
        Character c2 = Character.valueOf('b');
        System.out.println(c1.compareTo(c2));  //-1

        //boolean -> Boolean class
        Boolean b1 = false;
        Boolean b2 = Boolean.valueOf(true);

        System.out.println(b1.compareTo(b2)); //-1

        Byte by1 = (byte) 128;
        System.out.println(by1);

        Long l1 = 10L;
        Integer i6 = (int)(long)l1; // Long class -> long -> int -> Integer (autobox)
        Long l2 = (long)(int)i6;    // Integer class-> int -> long -> Long (autobox)
        System.out.println(i6);

        Long l3 = 1234L;
        Integer i7 = l3.intValue();
    }
}