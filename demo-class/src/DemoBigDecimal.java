import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
    public static void main(String[] args) {
        
        //Problem Statement: Addition (0.1 + 0.2)
        double d = 0.1 + 0.2;
        System.out.println("d = " + d); // 0.30000000000000004

        if (d > 0.3)
            System.out.println("d>0.3");

        // How to fix
        BigDecimal bd1 = new BigDecimal("0.2"); //Use String Type in the blanket
        BigDecimal bd2 = new BigDecimal("0.1");
        BigDecimal bd3 = bd1.add(bd2);

        System.out.println("bd3 = " + bd3.doubleValue()); // 0.3

        BigDecimal bd4 = BigDecimal.valueOf(0.2);
        BigDecimal bd5 = BigDecimal.valueOf(0.1);
        BigDecimal result = bd4.add(bd5);

        System.out.println("bd4 + bd5 = " + result); // 0.3

        // Problem statement: Subtraction(0.3-0.1)
        double s2 = 0.3-0.1;
        System.out.println(s2); //0.19999999999999998

        BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
        System.out.println(b1.doubleValue()); //0.2

        // Multiple 0.1 x 0.2

        BigDecimal bd6 = BigDecimal.valueOf(0.1);
        BigDecimal bd7 = BigDecimal.valueOf(0.2);
        System.out.println(bd6.multiply(bd7));  //0.02
        System.out.println(0.2*0.1); //0.020000000000000004

        //Divide 0.3/0.1
        BigDecimal bd8 = BigDecimal.valueOf(0.3);
        BigDecimal bd9 = BigDecimal.valueOf(0.1);
        System.out.println(bd8.divide(bd9)); //3
        System.out.println(0.3/0.1); //2.9999999999999996
        

        //
        System.out.println(sum(0.2,0.1,2,RoundingMode.HALF_DOWN)); //5捨6入

        System.out.println(bd1.compareTo(bd2));

        double result2 = BigDecimal.valueOf(0.1).divide(BigDecimal.valueOf(3),2,RoundingMode.DOWN).doubleValue();
        System.out.println(result2);

        result2 = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(3),2,RoundingMode.DOWN).doubleValue();
        System.out.println(result2);

        System.out.println(sum(0.554,0.111,2,RoundingMode.HALF_UP));  //4捨5入
        System.out.println(sum(0.554,0.111,2,RoundingMode.HALF_DOWN));  //5捨6入

    }

    public static double sum(double d1, double d2, int scale, RoundingMode mode){
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);

        return bd1.add(bd2).setScale(scale,mode).doubleValue();
    }
}
