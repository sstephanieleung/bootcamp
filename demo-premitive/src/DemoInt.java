public class DemoInt {
    public static void main(String[] args)  {
        System.out.println("2 abc");    // " " -> String
        System.out.println(2);          // number
        System.out.println(2.3);        // number

        //monthlySalary and i are both "variable" 變量
        int monthlySalary = 20000;

        //"int age" -> Declaration, int -> "integer"
        //age = 30 -> Assignment, assign the integer value 30 to the variable

        int age = 30;
        System.out.println(age);

        int level; // Declaration
        level = 1; // Assignment
        level = 10; // Re-assignment
        System.out.println(level);

        double pi = 3.14;
        System.out.println(pi);

        System.out.println();

        String sent = "Age is "+age+ " .";
        System.out.println(sent+level);
        
        boolean x = true;
        System.out.println(x);

        // We cannot re-declare the same variable, but we can re-assign a value to a variable!

        // Now, let's do some operations for int variables
        
        /*Addition Operation */
        // we will add 3 to original value of level
        // Step 1: level = 10 + 3; because level = 10 before reasch this line, thus
        // Step 2: level = 13
        // We can write like this:
        level = level + 3;  // 13

        // An alternative to add 3 to level:
        level += 3;  //16

        /*Minus Operation */
        // Similarly, we can also minus 7 from the value of level, i.e.
        level = level -7; //9

        //An alternative to minus 7 from the value of level:
        level -= 7; //2

        /*Multiple Operation */
        level = level * 3;  //6
        level *= 3;  //18

        /*Division Operation */
        level = level / 2;  //9
        level /= 2;  //4
        System.out.println("Value of level is now "+level);  //level = 4
        // You can see that the operator slash (/) return quotient of the operation for int
        // To return a remainder of the division, you can use %
        level = 9;
        level = level % 2;
        System.out.println(level);
        //If you want to get result of 9 divided by 2 to become 4.5, you have to declare a double type for either dividend or divisor 
        level = 9;
        double halfLevel = level / 2.00 ;  // divisor 2.00 is a double type variable

        level = 9;
        halfLevel = (double)level / 2 ;  // dividend (double)level is a double type variable

        System.out.println(halfLevel);

        /*About Integers */
        // byte, short, int, long (primitive data type)
        byte b = -128; // from -128 to 127, 1 byte size value, usually used by very base level program
        byte b2 = 127;
        //byte b3 = 128; // 128 is out of range of integer value that can be stored by a byte type

        short s = -32768;  // from -32768 to 32767, 2 bytes size value
        short s2 = 32767;
        //short s3 = 32768;

        int i = -2147483648;
        int i2 = 2147483647;

        //long l1 = -9223372036854775808; //Java default number to be int if no notation added, so error occur
        long l2 = -9223372036854775808L; //a long type variable must be assigned value with notation "L" after the number
        //If the default type of integer is int, why we can assign 100 to byte or short type variable without any notation?
        //or why we dont need notation for byte, short and int type?
        //Because Java engineers flavour the user by processing the hidden notation
        //Any value of int can be downcase to byte or short type variable
        int i5 = 100;
        byte b4 = 100;
        short s4 = 100;
        // Back to long type variable, 
        //long l0 = -2147483649; //2147483648 is int presentation, but out of int range, so error occur
        long l1 = -2147483649L; //notation L -> long value

        l1 = l1 + 10;
        System.out.println(l1);

        byte b10 = (byte)10;
        System.out.println(b10);

        long l10 = (long)10;
        System.out.println(l10);

        level = 4;  
        level = level + 1;
        level++;
        ++level;

        level = level - 1;
        level --;
        --level;


        int result = (5+3)/2%3;
        System.out.println("result = "+ result); // 1

        result = 5+3/2%3;
        System.out.println("result = "+ result); // 6

        float f3 = 9 / 2;
        System.out.println(f3);  //4.0
        
        float f4 = 9f / 2;
        System.out.println(f4);  //4.5

        double d3 = 9d / 2;
        System.out.println(d3);  //4.5
    }
}
