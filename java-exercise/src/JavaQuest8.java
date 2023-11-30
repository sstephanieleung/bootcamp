import java.util.Arrays;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;

    // code here

    

    // First Method: no sorting, direct extract value and store in firstMax
    
    secondMax = noSortSecondMax(nums);

    // Second Method: Sorting first, look for the second last element of sorted array
    sortAscending(nums);
    secondMax = nums[nums.length - 2];

    System.out.println("Second Max = " + secondMax);
  }

  public static int noSortSecondMax(int[] arr) {
    int max1; // for the max value
    int max2; // for the second max value
    if (arr[0] < arr[1]) {
      max2 = arr[0];
      max1 = arr[1];
    } else {
      max2 = arr[1];
      max1 = arr[0];
    }

    if (arr.length > 2) {
      for (int i = 2; i < arr.length; i++) {

        if (arr[i] > max2) {
          if (arr[i] > max1) {
            max2 = max1;
            max1 = arr[i];
          } else {
            max2 = arr[i];
          }
        }
      }
    }
    return max2;
  }

  public static void sortAscending(int[] arr) { // Bubble Sort
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return;
  }
}