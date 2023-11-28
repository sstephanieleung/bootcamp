public class DemoConversion {
    public static void main(String[] args) {
        //byte -> short -> int -> long : UpCast
        byte b = 2;
        short s = b;  //OK, because it is upcast, no precision loss
        int i = s;
        long l = i;

        //long -> int -> short -> byte : DownCast
        long l2 = 4L;
        //short s2 = l2;  //NOT OK, potentially precision loss detected by Java compiler.
        short s2 = (short) l2; //force to convert long value to be stored in short value, programmer should bare the precision lossing risk.

        l2 = 40000;  // 40000 -> int value
        s2 = (short) l2;  //Overflow

        System.out.println(s2);  // -25536

        short s3 = 130;
        byte b2 = (byte) s3;  //byte range: -128 to 127, precision loss happens

        System.out.println(b2);  //-126

        int i2 = 130;
        short s4 = (short) i2;

        //byte b3 = 128; // 128 is int value which is out of byte range, overflow detected by Java compiler.

        //Float >> Double
        float f1 = (float) 1.3d; //downcast
        double d1 = 5.2f; //upcast

        //Float >> long
        float f2 = 3.5f;
        long l3 = (long) f2; //downcast
        float f3 = 10L; //upcast

        //Char vs int
        int i3 = 'a'; //97, upcast
        int i4 = 65610;
        char c = (char) i4; //downcast

        System.out.println(c); //J
        System.out.println((int) c); //74


    }
}
