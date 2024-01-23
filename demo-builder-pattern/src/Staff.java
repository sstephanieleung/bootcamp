public class Staff {
    
    private String name;

    private int yearOfExp;

    public Staff(){

    }

    private Staff(String name, int yearOfExp){
        this.name = name;
        this.yearOfExp = yearOfExp;
    }

    public static Staff builder(){
        return new Staff();
    }

    public Staff name(String name){
        this.name = name;
        return this;
    }

    public Staff yearOfExp(int yearOfExp){
        this.yearOfExp = yearOfExp;
        return this;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYearOfExp(int yearOfExp){
        this.yearOfExp = yearOfExp;
    }

    public static void main(String[] args) {
        Staff staff = new Staff();
        Staff staff2 = Staff.builder().name(null).yearOfExp(0);
        staff2.name("Happy");
        System.out.println(staff2.name); //name
    }
}
