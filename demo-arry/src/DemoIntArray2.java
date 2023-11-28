import java.util.Arrays;

public class DemoIntArray2 {
    public static void main(String[] args) {
        // int array 10, 8, 6, 4, 2
        int[] arrInt = new int[] { 10, 8, 6, 40, 200 };
        // for loop -> sum
        int sumInt = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sumInt += arrInt[i];
        }
        System.out.println("Sum is " + sumInt);

        // for loop -> max. value
        int maxInt = Integer.MIN_VALUE; // initialize the maxInt to the minimum value first before comparison
        for (int i = 0; i < arrInt.length; i++) {
            if (maxInt >= arrInt[i]) {
                continue;
            }
            maxInt = arrInt[i];
        }
        System.out.println("Max is " + maxInt);

        // for loop -> min. value
        int minInt = Integer.MAX_VALUE; // initialize the minInt to the maximum value first before comparison
        for (int i = 0; i < arrInt.length; i++) {
            if (minInt <= arrInt[i]) {
                continue;
            }
            minInt = arrInt[i];
        }

        System.out.println("Min is " + minInt);

        // for loop - average
        int avgInt = 0;
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
            System.out.println(sum);
            if (i == arrInt.length - 1) {
                avgInt = sum / arrInt.length;
            }
        }
        System.out.println("Average is " + avgInt);

        // for loop -> second max value
        maxInt = Integer.MIN_VALUE;
        int max2Int = maxInt;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > maxInt) {
                max2Int = maxInt;
                maxInt = arrInt[i];
            } else if (arrInt[i] > max2Int) {
                max2Int = arrInt[i];
            }
            System.out.println("Max is " + maxInt + " and Max2 is " + max2Int);
        }

        int[] arrMaxInt = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > arrMaxInt[0]) {
                arrMaxInt = new int[] { arrInt[i], arrMaxInt[0] };
            } else if (arrInt[i] > arrMaxInt[1]) {
                arrMaxInt = new int[] { arrMaxInt[0], arrInt[i] };
            }
        }
        System.out.println("Max Array are " + arrMaxInt[0] + " and " + arrMaxInt[1]);

    }
}
