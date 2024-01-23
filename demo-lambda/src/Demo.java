public class Demo {
    public static void main(String[] args) {
        Walkable person = new Walkable() {
            @Override
            public void walk() {
                System.out.println("Walking...");
            }
        };
        person.walk();

        // Lambda expression
        // 1. We don't need to wrtie down method signature for the walk() method. Why?
        // Because the interface has only one method
        // 2. "()"is the input parameter of the walk method
        // 3. As walk method is void return type, you don't have to return anything
        // inside the code block.
        //4. Limitation: it can only be used when there is ONLY ONE method in interface (must be a Functional Interface)
        //5. If there is only one statement inside the code block
        //6. Don't need to specify the input parameter types
        Walkable person2 = () -> {
            System.out.println("Hello");
            System.out.println("Hello World");
        };
        person2.walk();

        // (a,b), refers to the compute (int x, int y) in the inteface Calculate
        //Approach 1: to handle one code statement
        Calculate addition = (a, b) -> a + b;
        System.out.println(addition.compute(10, 3));// 13
        //Approach 2: to handle one code statement
        Calculate muitiply = (c, d) -> {
            return c*d;
        };
        System.out.println(muitiply.compute(1000, 3)); //3000
    }
}
