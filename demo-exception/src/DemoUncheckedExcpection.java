public class DemoUncheckedExcpection {
    
    public static void main(String[] args) {
        double result;
 
        //Example 1: int divided by int -> 10/0 -> ArithmeticException
        try{
            result = divide(10,0);
        } catch (ArithmeticException e){
            result = 0.0;
        }
        System.out.println("Int divided by int: "+result);
        System.out.println();

        //Example 2: non-zero double divided by double -> 10.0 / 0.0 -> Infinity
        try{
            result = 10.0d/0.0d;
        } catch (ArithmeticException e){
            result = 0.0d;
        }
        System.out.println("double divided by double: "+result); //double can store NaN
        System.out.println("Is result NaN? "+Double.isNaN(result)); //false

        //Example 3: zero double divided by double -> 0.0 / 0.0 -> NaN
        try{
            result = 0.0d/0.0d;
        } catch (ArithmeticException e){
            result = 0.0d;
        }
        System.out.println("double divided by double: "+result); //double can store NaN
        System.out.println("Is result NaN? "+Double.isNaN(result)); //true

        //Example 4: Unchecked exception
        result = divide(10,0);
        System.out.println(result); //java.lang.ArithmeticException: / by zero
    }

    public static int divide(int x , int y){
        return x/y;
    }

    public static double divide(double x , double y){
        return x/y;
    }
}
