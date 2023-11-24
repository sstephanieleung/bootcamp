public class DemoIntArray {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 7;
        int x3 = 12;
        // Define an arry (container) to store a list of int number
        int[] arrayInt = new int[9];

        arrayInt[1] = 20;
        arrayInt[4] = 12;
        arrayInt[8] = 89;

        System.out.println(arrayInt[2]); // the default value of unassigned integer is 0

        int a; // local variable, only can be used after assignment
        a = 1; // explicitly assignment

        System.out.println(a); // In Java, You have to explicitly assign its value before using

        int[] arrayInt2 = new int[5];
        System.out.println(arrayInt2[1]); // 0

        // Array support For-loop application
        // array.length -> count storage space of array

        char[] x = new char[9]; // [length of array] <-- this array can store 9 char value, from x[0] to x[8]
        String xStr = "Stephanie";

        System.out.println(x.length);

        // is it possible to change the length of array? YES!!!
        x = new char[10]; // the original array is disappeared and replaced by this new array. the array
                         // is blank now!

        for (int i = 0; i < x.length; i++) {
            if (i < xStr.length()) {
                x[i] = xStr.charAt(i);
                
            }
            System.out.println(x[i] + " ");
        }

        System.out.println();

        int[] arr1 = new int[] { 10, 20, 11, 65, 22, 14 };
        int[] arr2 = arr1;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("arr1[" + i + "] is " + arr1[i] + " ");
            System.out.println("arr2[" + i + "] is " + arr2[i]);
        }
    }

}