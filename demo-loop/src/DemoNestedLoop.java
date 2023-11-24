public class DemoNestedLoop {
    public static void main(String[] args) {
        // for (int i = 0; i < 10 ; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(j + " "); // 0,1,2,3,4
        // }
        // System.out.println("*");
        // }

        // for (int i = 0 ; i < 5 ; i++){
        // for (int j = 0 ; j < 4 ; j++) {
        // System.out.println("Print " + j);
        // }
        // System.out.println("Println " + i);
        // }

        // for (int i = 0 ; i < 5 ; i++) {
        // System.out.print("Row " + i + " ");
        // for (int j = 4 ; j > i ; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0 ; i < 5 ; i++) {
        // System.out.print("Ans " + i + " ");
        // for (int j = 0 ; j < 4 - i ; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        String str = "abcdefghijk";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i));
            if (++count % 4 == 0 || i == str.length() - 1) {
                System.out.println();
            }

        }
        System.out.println();

        int noOfGroup = 4;
        for (int i = 0; i < noOfGroup; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");

            }
            if (i == noOfGroup - 1) {
                break;
            }
            System.out.print(" ");
        }

        System.out.println();

        int cnt = 0;
        for (int i = 0; i < 12; i++) {
            System.out.print("*");
            if (++cnt % 3 == 0)
                System.out.print(" ");

        }
    }
}