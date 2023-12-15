package staticvariable;

public class Librarian {
    
    private String firstName;

    private String lastName;

    private int salary;

    public Librarian(){

    }

    public Librarian(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }


}
