public class DemoCounting {
    public static void main(String[] args) {
        int[] numbers = new int[] { 10, 2, 200, 2000, 2000, 2, 2 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int maxCount = 0;
        int theNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        int[] count = new int[max - min + 1];
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i] - min]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0 && count[i] > maxCount) {
                maxCount = count[i];
                theNumber = i + min;
            }
        }
        System.out.println("The most occuring number is " + theNumber + " and the frequency is " + maxCount);

        String str = "abcabcpplxyzaa";
        char maxChar = ' ';
        maxCount = 0;

        char[] arrCharCount = new char[26]; // a - z, no symbol or uppercases
        for (int i = 0; i < str.length(); i++) {
            arrCharCount[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arrCharCount.length; i++) {
            if (arrCharCount[i] > maxCount) {
                maxCount = arrCharCount[i];
                maxChar = (char) (i + 'a'); // i -> int value, which is higher level than char, cannot be direct conver to char by marChar = i;
            }
        }
        System.out.println("MaxChar = " + maxChar + " and MaxCount = " + maxCount);
    }
}
