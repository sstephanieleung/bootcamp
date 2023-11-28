
public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int x1 = 0;
    int x2 = 1;
    int f = x2;
    for (int i = 0 ; i < 15 ; i++){
      System.out.print(f + " ");
      f = x1 + x2;
      x1 = x2;
      x2 = f;
    }
    System.out.println("\n");
  }
}