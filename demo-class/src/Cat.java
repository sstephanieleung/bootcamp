public class Cat {

    private String name;
    //If there is no constructor explicitly in a class,
    //Empty constructor is provided by default
    //Once developer initiate one or more constructor, the default empty constructor will not be provided.
    //then the empty constructor will need to be initiated by developer
    
    public Cat(){
    }
    
    public Cat(String name){
        this.name = name;
    }
}
