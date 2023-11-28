import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        int j = 0;
        while (j < 5) {
            sum += j++;
        }
        System.out.println(sum);

        // Continue, break in While loop
        j = 0;
        while (++j > 0) {
            if (j > 10) {
                break;
            }
            if (j % 2 == 0) {
                continue;
            }
            System.err.print(j + " ");
        }
        System.out.println();

        int x = 10;
        int y = 5;
        while (x > 0 && y > 0) {
            System.out.println("x = " + x-- + ", y = " + y--);
        }

        int x1 = 0;
        int x2 = 1;
        int e = 0;
        int[] arr = new int[20];
        int idx = 0;

        while (e < 1000 || idx < 20) {
            arr[idx++] = e;
            System.out.print(e + " ");
            x1 = x2;
            x2 = e;
            e = x1 + x2;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        int[] arrInt = new int[] { 5, 4, 3, 2, 1 };
        int key = 0;
        System.out.println(Arrays.toString(arrInt));
        for (int i = 1; i < arrInt.length; i++) {
            int k = i - 1;
            key = arrInt[i];
            while (k >=0 && arrInt[k] > key) {
                arrInt[k+1] = arrInt[k];
                k--;
            }
            arrInt[++k] = key;
            System.out.println(Arrays.toString(arrInt));
        }

        for (int i = 1 ; i < arrInt.length ; i++){
            for (int j = i-1; j >=0; j--){
                int key = arrint[i];
                if(arrInt[k] > key){
                    arrInt[k+1] = arrInt[k];
                } else {
                    break;
                }
            }
        }
        
    }

}
