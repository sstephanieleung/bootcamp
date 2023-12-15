public interface Vehicle {
//Interface is a contract with abstract behaviors (abstract methods)

//if a class implements an interface, it has to implement all its abstract methods
//(all or nothing)

//all methods in a interface are abstract!!!

//interface has no instance variable
int x = 10; //implicity it is a "static final" variables

boolean start(); //implicity "public abstract" method

boolean stop();

boolean accelerate();

boolean brake();

//After Java 8 (2014)
//Default instance method is included - backward compatibility
//Useful when doing re-engineering for the interface
default boolean test(){
    return false;
} //not applicable for all vehicles

public static void main(String[] args) {
    //is x a static?
    System.out.println(Vehicle.x);
    System.out.println();
}

}
