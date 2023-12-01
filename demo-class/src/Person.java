//Blueprint to produce an object called Person
//All Person have name and age
public class Person {
    
    private String name; //Default: ""

    private int age; //Default: 0


    //Constructor - produce Object in Heap memory
    public Person(){

    }

    public Person(String x, int age){
        this.name = x;
        this.age = age;
    }

    //Instance Method / Object Method

    //Setter: need input, output not necessary
    public void setName (String name){
        this.name = name;
    }

    //Getter: input not necessary, need output
    public String getName (){
        return this.name;
    }

}
