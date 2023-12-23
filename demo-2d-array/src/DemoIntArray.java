public class DemoIntArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 7, 4 };
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println(sum);

        // 2D array
        int[][] array = new int[][] { { 1, 3, 4 }, { 9, 2, 1000 } };
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                // System.out.print(array[row][col] + " ");

            }
        }

        int[][] array3 = new int[][] { { 1, 3, 4 }, { 9, 2, 1000 }, { 90, 2, 10 }, { 9, 100, 1000 } };
        int sumArr3 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 1)
                for (int j = 0; j < array3[i].length; j++) {
                    if (j % 2 == 0)
                        sumArr3 += array3[i][j];
                }
        }
        System.out.println("sumArr3 = " + sumArr3);

    }
}
