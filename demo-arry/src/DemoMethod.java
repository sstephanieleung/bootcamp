public class DemoMethod {

    //main -> method name
    //public -> or private
    //static method -> tool
    //void -> no return type
    public static void main(String[] args){
        //javac -> compile command, converting .java to .class
        //java -> run .class file
        // int x = 2;
        // int y = 10;
        // x *= 2; //4
        // x += y;
        // System.out.println("x = " + x);

        // int result = sum(x, y);
        // System.out.println(result);
        // System.out.println(length("aberwsefgrdfedsfgd"));
        // System.out.println(division(2,3));
       
        String [] allName = new String[]{"Chloe", "Stephanie", "Yuki"};
        printName(allName);
    }

    //Method name: sum
    //Return type: int
    //Parameter: can be no parameter, one or more than one parameters
    //sum = f(x1,x2) = x1 + x2
    public static int sum (int x1, int x2){
        int sum = x1 + x2;
        return sum;
    }

    //Method name: 
    //Return type: 
    //Parameter: 
    public static int length (String a){
        int totallength = a.length();
        return totallength;
    }

    public static float division (float x, float y){
        float result = x / y;
        return result;
    }

    public static void printName (String[] allnameStrings){
        for(String name: allnameStrings){
            System.out.println(name);
        }
    }

    //Method signature: same method name and parameter type can not exist in same programming
    public static int length(String b){}

    //Method signature: same method name but differce parameter type
    public static float division (float x , int y){
        float f;
        return f;
    }

    //Method signature: same method name but differce parameter number
    public static float division (float x , int y, char z){
        float f;
        return f;
    }

}
