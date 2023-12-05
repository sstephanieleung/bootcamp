//Blueprint to produce an object called Person
//All Person have name and age
public class Person {

    private String firstName; // Default: ""
    private String lastName;
    private int age; // Default: 0

    // Constructor - produce Object in Heap memory
    public Person() {

    }

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
    }

    public Person(String lastName) {
        this.firstName = "";
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Instance Method / Object Method

    // Setter: need input, output not necessary
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter: input not necessary, need output

    public String getFullName() {
        String firstName = this.firstName.substring(0, 1).toUpperCase()
                .concat(this.firstName.substring(1).toLowerCase());
        String lastName = this.lastName.substring(0, 1).toUpperCase() //
                .concat(this.lastName.substring(1).toLowerCase());
        return firstName.isEmpty() ? lastName : lastName.isEmpty() ? firstName : firstName.concat(" ").concat(lastName);

    }

    public String getFullName2() {
        String firstName = String.valueOf(this.firstName.charAt(0)).toUpperCase()
                .concat(this.firstName.substring(1).toLowerCase());
        String lastName = String.valueOf(this.lastName.charAt(0)).toUpperCase()
                .concat(this.lastName.substring(1).toLowerCase());
        return firstName.concat(" ").concat(lastName);
    }

    public String getFullName(boolean isCapLetter) {
        return isCapLetter ? this.firstName.concat(" ").concat(this.lastName).toUpperCase()
                : this.firstName.concat(" ").concat(this.lastName).toLowerCase();
    }

    public String getFullNameUpper() {
        return this.firstName.concat(" ").concat(this.lastName).toUpperCase();
    }

    public String getFullNameLower() {
        return this.firstName.concat(" ").concat(this.lastName).toLowerCase();
    }

}
