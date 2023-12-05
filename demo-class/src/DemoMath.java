import java.util.Random;

public class DemoMath {
    public static void main(String[] args){
        //pow(a, b) <-- Power, double double
        System.out.println(Math.pow(2L,0));
        System.out.println(Math.pow(2,-1));
        System.out.println(Math.pow(2,-2));

        //abs(), Absolute value
        System.out.println(Math.abs(-134));

        //ceil(), floor() <-Rounding
        System.out.println(Math.ceil(3.1)); //4.0
        System.out.println(Math.ceil(3.9));  // 4.0
        System.out.println(Math.floor(3.1)); //3.0
        System.out.println(Math.floor(3.9)); //3.0

        //round
        System.out.println(Math.round(14.44));
        System.out.println(Math.round(14.5));

        int[] arr = new int[]{-2,20,100,-40};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< arr.length; i ++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println("Max is " + max + ", Min is "+min);
        System.out.println(Math.sqrt(81)); //sqrt --> double
        double d1 = Math.sqrt(-81);
        System.out.println(d1);
        System.out.println(Double.isNaN(d1));

        int random = new Random().nextInt(3);  //Integer 0,1,2....
        int random2 = (int) Math.random()*100+1; //Math.random() - 0.0-1.0 inclusively, double type
        System.out.println(random2);

        

    }
}
