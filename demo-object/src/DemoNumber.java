import java.math.BigInteger;

public class DemoNumber {

    public static BigInteger add(Number x, Number y) {
        Long l1 = 0L;
        Long l2 = 0L;

        if(x instanceof Long || x instanceof Short || x instanceof Byte || x instanceof Integer)
            l1 = (long)x;

        if(y instanceof Long || y instanceof Short || y instanceof Byte || y instanceof Integer)
            l2 = (long)y;

        return BigInteger.valueOf(l1+l2);
    }

    public static Number add(Integer x, Integer y) {
        
        return 2;
    }

    public static void main(String[] args) {
        Float f1 = Float.valueOf(60000.0f); // double -> float = down cast
        Number n1 = f1; // upcast
        System.out.println(n1.shortValue()); // -5536 <- overflow
        BigInteger bi1 = new BigInteger("1234567890");

        System.out.println(add(1, 2)); // method with 2 int? not found -> method with 2 Integer? not found -> method
                                       // with 2 Number? found -> auto-box the value and execute that method

    }
}
