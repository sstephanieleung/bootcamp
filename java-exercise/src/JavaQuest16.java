//package day10;
/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]


import java.util.Arrays;
import java.util.Random;

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1

  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  public static int[] sumToZero(int num) {
    int[] arr = new int[num];
    int idx = 0;

    //For num = 1
    if (num == 1) {
      arr[idx] = 0;
      System.out.println(Arrays.toString(arr));
      return arr;
    }
    
    //For num > 1, 
    //generate unique random numbers for first num-1 integer, add up all the random numbers
    //assign the 0-sum value to last integer
    int randNum;
    do {
      randNum = new Random().nextInt(-num, num);
    } while (randNum == 0);

    arr[idx] = randNum; // idx = 0
    int total = 0;
    int numToZero = total - arr[idx];
    boolean isDuplicated = false;
    // System.out.println("arr[" + idx + "] is " + arr[idx]);
    idx++;
    while (idx < num - 1) {
      isDuplicated = false;
      randNum = new Random().nextInt(-num, num);
      for (int i = 0; i < idx; i++) {
        if (arr[i] == randNum) {
          isDuplicated = true;
          // System.out.println("arr[" + idx + "] = " + arr[idx] + " is duplicated with
          // arr[" + i + "]");
        }
      }
      if (!isDuplicated) {
        arr[idx] = randNum;
        // System.out.println("arr[" + idx + "] is " + arr[idx]);
        numToZero -= randNum;
        // System.out.println("numToZero = " + numToZero);
        idx++;
        if (idx == num - 1) {
          for (int i = 0; i <= idx; i++) {
            if (numToZero == arr[i]) {
              idx--;
              numToZero += randNum;
              break;
            }
          }
        }

      }
    }
    arr[arr.length - 1] = numToZero; //the last integer is balancing the sum of previous integers
    System.out.println(Arrays.toString(arr));
    return arr;
  }

  public static boolean isDuplicated(int[] arr, int idx) {
    for (int i = 0; i < idx; i++) {
      if (arr[i] == arr[idx]) {
        return false;
      }
    }
    return true;
  }

}
