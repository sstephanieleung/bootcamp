public class DemoOperator {
    public static void main(String[] args) {
        
        int x = 2;
        int y = x; //y = 2
        y = x++; //y = 2, x = 3
        y = ++x; //x = 4, y = 4

        /* Difference between a++ and ++a*/ 
     
        // a is increment by 1 first, and then being assigned to preIncrement
        int a = 5;
        int preIncrement = ++a;
        System.out.println("a = "+a);
        System.out.println("preIncrement = "+preIncrement);
       
        // b is assigned to postIncrement first, and then increment by 1
        int b = 5;
        int postIncrement = b++;
        System.out.println("b = "+b);
        System.out.println("postIncrement = "+postIncrement);

        // Exercise:
        int c = 4;
        //int preDecrement = --c;
        System.out.println("c = "+c);
        System.out.println("preDecrement = "+ --c);

        int d = 4;
        //int postDecrement = d--;
        System.out.println("d = "+d);
        System.out.println("postDecrement = "+ d--);

        /*Conditional Operators */
        // && || !
        //Example 1 - AND
        if (c == 2 && b == 4) { //both two conditions need to be fulfilled in order to return TRUE, true && false -> false
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Example 2 - OR
        if (c == 2 || b == 4) { //either one condition need to be fulfilled in order to return TRUE, true && false -> true
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Example 3 - AND OR
        // Priority of AND gate is higher than OR
        // false || false && true --> false || false --> false
        String h = "hello";
        if (c == 2 && (b == 4 || "hello".equals(h))) { 
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Example 4 - AND
        if (c == 1 && b == 6) {
            // (c == 1) -> false
            // (b == 6) will NOT be executed
            System.out.println("Yes");
        }

        //Example 5 - AND OR without bracket
        if (c == 2 && b == 4 || "hello".equals(h)) { 
            System.out.println("Exmaple 5 = Yes");
        } else {
            System.out.println("Exmaple 5 = No");
        }

        //Example 6 - AND OR
        if (h.charAt(3) == 'e' || b == 6){
            System.out.println("Exmaple 6 = yes");
        } else {
            System.out.println("Exmaple 5 = No");
        }

        // Comparison operators NOT only in IF statements
        // boolean -> && ||
        boolean b1 = true && false;
        System.out.println("b1 = "+ b1);

        boolean b2 = false;
        boolean b3 = true;
        boolean result = b2 || b3;
        System.out.println("result is " + result);

        boolean result2 = b2 || b3 && b1;
        System.out.println("result2 is " + result2);

        if (b1 == false) {
            System.out.println("Example 7 - b1 is false.");
        }

        if (!b1) {
            System.out.println("Example 7b - b1 is false");
        }

        if (b1 == true) {
            System.out.println("Example 8a - b1 is true.");
        }

        if (b1) {
            System.out.println("Example 8b - b1 is true.");
        }

        int g = 0;
        if (b1 == false) {
            g = 10;
        }

        int k = b1 == false ? 10 : 0;  // Direct assign value to k base on condition, an alternative
        // int k = (condition)? (true value) : (false value)

        int k2 = k == 0 || !b1 ? 10 : 0;
        System.out.println("k is "+ k);
        System.out.println("k2 is "+ k2);

        int a1 = 16;
        int a2 = 4;
        int min = a1 <= a2 ? a1: a2;
        String strMin = a1 <= a2 ? "a1" : "a2";
        System.out.println("min is "+ strMin + ". The value is "+ min);

        int number = 13;

        boolean isOdd = number % 2 == 1;
        System.out.println("Is 13 an odd number? " + isOdd);

        int num = 4;
        int checkNum = num == 3? 3 : num == 2 ? 2 : 1;
        System.out.println("checkNum is " + checkNum);

        //Exercise: if itemTotal > 3000, no transportation fee, otherwise 3%
        double totalAmount = 0.0d;
        int itemTotal = 0;
        double r = 0.03;
        
        itemTotal = 2999;

        totalAmount = itemTotal >= 3000 ? itemTotal : itemTotal * (1 + r);
        System.out.println("totalAmount is " + totalAmount);
        
        double transFee = 0.0d;
        if (itemTotal < 3000) {
            transFee = itemTotal * r;
        }
        totalAmount = itemTotal + transFee;
        System.out.println("transFee is " + transFee);
        System.out.println("totalAmount is " + totalAmount);

        // >, <, >=, <=, !
        boolean isPassed = false;
        if (!isPassed) {
            System.out.println("isPassed is false.");
        } 

        isPassed = true; // re-assignment
        System.out.println("isPassed is true.");

        // There are 9 types of data: 8 Premitive + 1 String
        String str = "www.apple.com";
        if (str.length() < 10 || "www.apple.com".equals(str)) {
            System.out.println("length < 10 or www.apple.com");
        }

        String s = ""; //empty string, length = 0;
        String s1 = " "; //this is not an empty string as it contains a space, length = 1

        s += "hello";
        if (!s.isEmpty()) {
            System.out.println("s is not empty.");
        }

        int dayOfWeek = 3;
        String dayName;
        switch (dayOfWeek){
            case 1:
                dayName = "Monday";
                break;
            case 2: 
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;

            default:
                dayName = "Weekend";
                break;
        }
        System.out.println("Day of Week is "+ dayName);
    }
}
