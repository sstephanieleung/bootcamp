import java.util.Arrays;

public class DemoMethod3 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int total = sum(nums);
        String s = "Happy";
        System.out.println(total);

        addOne(nums);
        System.out.println(Arrays.toString(nums));
        concatHello(s);
        System.out.println(s);

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void addOne(int[] arr) { // Pass by reference: object address
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void concatHello(String s) { // Pass by value: String value
        s = s.concat("Hello");
    } // s is local variable, it wont affect the value in the original

    //Primitive + Wrapper Classes + String (17 types) -> Pass by values
    //Array and Classes -> Pass by reference
}
