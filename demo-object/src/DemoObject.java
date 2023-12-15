public class DemoObject { //extend Object implicity

    public void run(){

    }
    public static void main(String[] args) {
        
        //Example 1: new Object ()
        Object o1 = new Object();
        //DemoObject do1 = (DemoObject) o1; //down cast -> runtime error
        //System.out.println(o1.toString()); //java.lang.Object@36baf30c
        //compile time -> do1
        //compile time can only judge whether your type can use the method
        //do1 is a object ref with the type of DemoObject, compiler believes it is able to call run()
        //do1.run();


        //Example 2: new DemoObject (smarter)
        DemoObject do2 = new DemoObject();
        Object o2 = do2;  //Up cast -> 
        //compile time -> o2 is a object ref with the type of Object, Able to itself method

        System.out.println(o2.toString());

        //getClass()
        DemoObject do3 = new DemoObject();
        if(do3.getClass() == DemoObject.class){ //equivalent to "instanceof"
            System.out.println("It is DemoObject class");
        }
        Class<?> clas = do3.getClass();
        System.out.println(clas.getName());

        //equals() hashcode()
        String s1 = "hello";
        String s2 = "abc";
        System.out.println(s1 == s2);  //check if they are the same object
        System.out.println(s1.equals(s2)); // check if they or the same value <- String class override the .equals method of Object class


    }
}
