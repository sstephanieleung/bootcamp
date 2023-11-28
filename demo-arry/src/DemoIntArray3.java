import java.util.Arrays;

public class DemoIntArray3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, -100, 34, -98, 0 };

        // for loop
        // for (int i = 0 ; i < arr.length ; i++){
        // for (int j = 0 ; j < i ; j++){
        // if (arr[j]> arr[j+1]){
        // int temp = arr[j];
        // arr[j] = arr[j+1];
        // arr[j+1] = temp;
        // }
        // }
        // }

        // Swapping
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // Exercise: mpve target index value to the tail of the array
        int[] arr2 = new int[] { 100, -2, 4, 100, 500 };
        int targetIndex = 1;

        for (int i = targetIndex; i < arr2.length - 1; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[i + 1];
            arr2[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr2));

        // Exercise: Find max value, and move to the tail

        int[] arr3 = new int[] { 100, 4, 1050, 500, -20 };
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                int temp = arr3[i];
                arr3[i] = arr3[i + 1];
                arr3[i + 1] = temp;
            }
        }
        System.out.println(arr3[arr3.length - 1]);
        System.out.println(Arrays.toString(arr3));

        // Exercise Bubble Sort
        int[] arr4 = new int[] { 100, 4, 1050, 500, -20 };
        for (int i = 0; i < arr4.length - 1; i++) {
            for (int j = 0; j < arr4.length - i - 1; j++) {
                if (arr4[j] > arr4[j + 1]) {
                    int temp = arr4[j];
                    arr4[j] = arr4[j + 1];
                    arr4[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));

        //Try: Insertion Sort
         int[] arr5 = new int[] { 100, 4, 1050, 500, -20 };
         int pointer = 0;
         int lookingValue;
         for (int i = 1; i < arr5.length ; i++){
            pointer = i-1;
            lookingValue = arr[i];
            while (pointer >=0 && arr5[pointer] > lookingValue){
                arr5
            }

         }
    }
}