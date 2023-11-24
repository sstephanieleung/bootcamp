import java.lang.annotation.Target;

public class DemoForLoop {
    public static void main(String[] args) {

        int x = 2;

        // For-Loop
        // for ( ; ; ) {}
        // Step 1: int i = 0;
        // Step 2: i < 4 ??
        // Step 3: Yes -> x *=2
        // Step 4: sysout
        // Step 5: i++ -> i = 1
        // Step 6: i < 4 ??
        // Step 7: Yes -> x *=2
        // ...
        // Step n-2: i++ -> i = 4
        // Step n-1: i < 4 ??
        // Step n: No -> exit loop
        for (int i = 0; i < 4; i++) { // (int) counter initialization ; (boolean) counter's continue condition ;
                                      // counter's movement
            x *= 2;
            System.out.println("x is " + x);
            System.out.println("i is " + i);
        }

        // Exercise: 0 + 1 + 2 + ...+ 9 + 10 --> total
        int total = 0;
        for (int k = 0; k < 11; k++) {
            total += k;
        }
        System.out.println("Total is " + total);

        // Exercise: 0 + 2 + 4 + ...+ 10 --> total
        total = 0;
        for (int k = 0; k < 11; k++) {
            if (k % 2 == 0) {
                total += k;
            }
        }
        System.out.println("Total is " + total);

        // Exercise: 0 - 100
        // 0 - 50, odd --> sum1
        // 51 - 100, even --> sum2
        // total = sum1 x sum2
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 101; i++) {
            if (i <= 50 && i % 2 == 1) {
                sum1 += i;
            }
            if (i > 50 && i % 2 == 0) {
                sum2 += i;
            }
        }
        
        //  for (int i = 0 ; i < 101 ; i++) {
        //  if (i < 51){
        //  if (i % 2 == 1) {
        //  sum1 += i;
        //  }
        //  } else {
        //  if (i % 2 == 0){
        //  sum2 += i;
        //  }
        //  }
         
        //  }
         

        total = sum1 * sum2;
        System.out.println("Sum1 x sum2 is " + total);

        // Continue
        // Sum up all odd number
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0 || (i % 2 == 1 && i < 50))
                continue; // Go to the next iteration, skip the rest of codes

            // For the even number, the following code will be skipped.
            sum += i;
            System.out.println("sum = " + sum + " after continue.");
        }

        // Break
        // Sum up all odd number (0-100)
        // Sum <= 200
        // The loop should be ended at which number of i?
        sum = 0;
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                continue;      
  
            if (sum >= 200) {
                j -= i;
                break;
            } 
            j = i;              
            sum += i;
            System.out.println("i is " + i + " and sum is " + sum);
        }
        System.out.println(j + " sum is " + sum);

        //Chanllenge Exercise:
        String searchMe = "peter piper picked a peck of pickled";
        int num = 0;
        for (int i = 0; i < searchMe.length(); i++) {
            if (searchMe.charAt(i) != 'p')
                continue;
            num++;
        }
        System.out.println("Found " + num + "p's in the string.");

        //Exercise: find the position of target character in a string.
        String str = "abc pol ijk def xyz";
        char target = 'f';
        int n = 0;
        boolean isFound = false;
        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) != target)
                continue;
            n = i+1;
            isFound = true;
            break;
        }
        if (isFound) {
            System.out.println("Found" + target + " at the " + n + "th character");
        } else {
            System.out.println("Not Found");
        }



        // Scenario: Count how many female and male toilet in a 100-floor building
        // Female toilet only in even number floor, male toilet only in odd number floor
        // this building dont have 4/F, 14/F,... 94/F
        int fToilet = 0;
        int mToilet = 0;
        int totalFloor = 100;
        for (j = 0; j < totalFloor; j++) {
            int currentFloor = j + 1;
            if (currentFloor % 10 != 4) {
                if (currentFloor % 2 == 1) {
                    mToilet++;
                } else {
                    fToilet++;
                }
            }
        }
        System.out.println("There are " + mToilet + "Male toilets and " + fToilet + "Female toilets.");

    }
}
