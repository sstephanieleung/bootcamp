public class Demo {
    public static void main(String[] args){
        //Call Person's constuctor
        Person p1 = new Person(); //p1's name ->null; p1's age = 0;
        Person p2 = new Person();
        Person p3 = p1;
        Person p4 = new Person("Vincent","Lau");

        p1.setFirstName("John");
        p1.setLastName("Ho");
        System.out.println(p1.getFullNameUpper());

        p2.setFirstName("Peter");
        p3.setFirstName("Mary");
        System.out.println(p4.getFullName());

        Circle c1 = new Circle(3.4d);
        System.out.println(c1.area());
        System.out.println(c1.diameter());

        Circle c2 = c1;  //Pass by reference, NOT pass by value!!!!!

        //Static vs Instance Method
        Person p6 = new Person();
        p6.swim(); //hello

        c1.area();
        double area = Circle.area(3.0);
        System.out.println("Area = " + area);

        //Call Static Method
        Person.swimming();

        Cat cat = new Cat(); //Empty constructor




        
    }
}
