public class DemoStringArray {
    public static void main(String[] args) {
        String[] arrStr = new String[] { "abc", "ijk", "xyz" };
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }

        for (int i = 0; i < arrStr.length; i++) {
            if (i < arrStr.length - 1) {
                arrStr[i] = arrStr[i].concat(arrStr[i + 1]);
                System.out.println(arrStr[i]);
            } else {
                arrStr[i] = arrStr[i].concat("!");
                System.out.println(arrStr[i]); 
            }        
        }

        System.out.println(Arrays.toString(arrStr));
    }
}
