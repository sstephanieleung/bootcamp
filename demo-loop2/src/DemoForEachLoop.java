import java.util.Arrays;

public class DemoForEachLoop {
    public static void main(String[] args){
        Integer[] integers = new Integer[]{100, -30, 20};

        for ( Integer i : integers){
            System.out.println("i = " + i); //100,-30,20
            integers[2] = 2;
        }

        for (int i = 0; i < integers.length ; i++){
            System.out.println("i = " + i);  //0,1,2
        }

        String str = "agre*oi.wefe*osidhqawo*el.sdfwsh*epqeefsdgh";
        String[] parts = str.split(".w");

        for (String p : parts){
            System.out.println(p);
        }

    }
}
