public class Demo {
    public static void main(String[] args){
        //Call Person's constuctor
        Person p1 = new Person(); //p1's name ->null; p1's age = 0;
        Person p2 = new Person();
        Person p3 = p1;
        Person p4 = new Person("Betty")

        p1.setName("John");
        System.out.println(p1.getName());

        p2.setName("Peter");
        p3.setName("Mary");
        System.out.println(p4.getName());
        
    }
}
