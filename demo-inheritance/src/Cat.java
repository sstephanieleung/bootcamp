import java.util.Arrays;

public class Cat extends Animal{ //Animal is an abstract class which provide abstract methods for Cat
    

    //Cat Class inherit all public attributes, methods
    //Cat DONT inherit constructor

    public Cat(){
         //implicity call Animal() constructor
    }
    public Cat(int age){
        super(age); //implicity call Animal(int age) constructor
    }

public static void main(String[] args) {
    Cat cat = new Cat(20);
    Cat cat2 = new Cat();
    cat.setAge(2);
    cat.getAge(); // method inheritate from Animal class
    int[] arr2 = new int[]{1,2,3,6,5};
    int[] arr = Arrays.copyOf(arr2, 2);
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr));
}
}
