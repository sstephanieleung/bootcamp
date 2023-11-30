
import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here
    int lastIndex = my_array.length - 1; // 9
    if (indexPosition != lastIndex) {
      shiftToRight1(my_array, indexPosition);
      my_array[indexPosition] = newValue;
    }
    System.out.println("New Array: " + Arrays.toString(my_array));
  }

  public static void shiftToRight1(int[] arr, int index) {
    int lastIndex = arr.length - 1;
    for (int i = index; i < arr.length; i++) {
      arr[lastIndex + index - i] = arr[lastIndex + index - i - 1];
    }
  }

  public static void shiftToRight2(int[] arr, int index) {
    int lastIndex = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      if (lastIndex - i >= index) {
        arr[lastIndex - i] = arr[lastIndex - i - 1];
      }
    }
  }
}