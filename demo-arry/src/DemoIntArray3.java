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
        
        String s = "abcabcabcabcabc";
        char[] arr5 = new char[s. length()];
        // Convert string to array of char value 
        for (int i = 0; i < s.length(); i++){
            arr5[i] = s.charAt(i);
        }
        //Alternative
        char[] arr6 = s.toCharArray();
        System.out.println(Arrays.toString(arr6));

        //convert all 'a' to 'c'
        char[] arr7 = new char[s. length()];        
        for (int i = 0; i < s.length() ; i++){
            if(arr7[i]=='a'){
                arr7[i] = 'c';
                continue;
            } else {
                arr7[i] = s.charAt(i);
            }
        }

        //Replace (string method)
        String str4 = "abcabcabcabcabcabc";
        String result4 = str4.replace('a', 'c');  //replace a by c
        System.out.println("str4 = " + str4);
        System.out.println("result4 = " + result4);  //result4 = cbccbccbccbccbccbc

        //Replace a pattern "ab" by "ij"
        System.out.println(str4.replace("ab", "ij")); //ijcijcijcijcijcijc
        
    }
}