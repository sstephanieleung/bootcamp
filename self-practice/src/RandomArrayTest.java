import java.util.Arrays;
import java.util.Random;

public class RandomArrayTest {
    public static void main(String[] args) {
        int[] nums = sumToZero(5);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sumToZero(int num) {
    int[] result = new int[num];
    int sum = 0;
    int count = 0;

    do {
      int ran=new Random().nextInt(0-num,num);
      if (!isRepeat(result, ran)) {
        result[count]=ran;
        sum+=ran;
        //System.out.println("result["+count+"] is " + result[count]+ " and sum is "+ sum);
        count++;
      }
    } while (count<num || count == num-1 && sum!=0);
    return result;
  }

  public static boolean isRepeat(int[]num, int num1){
    for (int i : num) {
      if (i==num1) {
        return true;
      }
    }
    return false;
  }
}
