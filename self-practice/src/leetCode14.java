public class leetCode14 {

    public static int mySqrt(int x) {
            for (int i = 1; i <= x; i++) {
                System.out.println(x / i);
                System.out.println(x % i);
                if (x / i == i && x % i == 0) {
                    return i;
            }
            if (x / i < i && x % i != 0) {
                return i - 1;
            }
        }
        if (x == 0 || x == 1) {
            return x;
        } else {
            return -1;
        }
    }

    public static String addBinary(String a, String b) {
        long result = 0;
        String s = "";
        //long maxLength = Math.max(a.length(),b.length());
        for(int i = 0; i< a.length(); i++){
            result += (a.charAt(i)-'0')*Math.pow(2,a.length()-1-i);
        }
        for(int i = 0; i< b.length(); i++){
            result += (b.charAt(i)-'0')*Math.pow(2,b.length()-1-i);
        }
        System.out.println(result);
        do{
            s = String.valueOf(result%2)+s;
            result = result/2;
        }while(result !=0);
        return s;
    }

    public String reformat(String s) {
        StringBuilder sNum = new StringBuilder();
        StringBuilder sChar = new StringBuilder();
        for(int i = 0 ; i < s.length()-1; i++){
            if(s.charAt(i) >= '0' & s.charAt(i) <= 9){
                sNum.append(String.valueOf(s.charAt(i)));
            } else{
                sChar.append(String.valueOf(s.charAt(i)));
            }
                
        }
        if(sNum.length() != sChar.length())
            return "";
        StringBuilder sAdd = new StringBuilder();
        for(int i = 0 ; i< sNum.length(); i++){
            sAdd.append(String.valueOf(sNum.charAt(i))).append(String.valueOf(sChar.charAt(i)));
        }
        return sAdd.toString();
    }

    public static void main(String[] args) {
        // System.out.println(mySqrt(1));
        // StringBuilder s = new StringBuilder("owernqpwr, qwogevbq, eo, wihvdq, pzihd, ");
        System.gc();
        //System.out.println(String.valueOf(3));
        //addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101")

        reformat("a0b1c2");
    }
}
