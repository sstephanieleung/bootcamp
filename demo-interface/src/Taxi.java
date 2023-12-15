public class Taxi implements Vehicle {

    private int speed = 0;

    private int capacity = 4; // Default 4 passengers

    private String color = ""; // Blue, Red or Green

    private String owner = "";

    private String plateNumber = "";

    public static final int MAX_SPEED = 100;

    public Taxi(){
        //Empty constructor
    }

    private Taxi(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public static Taxi small(){
        return new Taxi(0,4);
    }

    public static Taxi big(){
        return new Taxi(0,5);
    }

    public Taxi(int capacity) {
        this.capacity = capacity;
    }

    public Taxi(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getColor() {
        return this.color;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setCapactity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPlateNumber(String plateNum) {
        this.plateNumber = plateNum;
    }

    public String getDetails() {
        return this.color + " | Plate Number: " + this.plateNumber + " | Capacity: " + this.capacity + " | Speed: "
                + this.speed;
    }

    public boolean isOn() {
        return this.speed > 0;
    }

    public boolean isStopped() {
        return this.speed <= 0;
    }

    public boolean isOverMaxSpeed() {
        return this.speed > MAX_SPEED;
    }

    @Override  //Let the compiler to validate the relationship of inheritance, once the parent interface / abstract class is amended, it will directly show alerting in code.
    public boolean start() {
        if (isOn())   //Many programmer tend to not use this. for boolean methods but both still fine
            return false;
        this.speed = 10;
        return true;

    }

    @Override
    public boolean stop() {
        if (isStopped())
            return false;
        this.speed = 0;
        return true;
    }

    @Override
    public boolean accelerate() {
        if (isStopped())
            return false;
        if (isOverMaxSpeed())
            this.speed = MAX_SPEED;
        this.speed += 10;
        return true;
    }

    @Override
    public boolean brake() {
        if (isStopped())
            return false;
        this.speed -= 10;
        return true;
    }

    public static void main(String[] args) {
        Taxi t1 = Taxi.small();
        t1.start();
        t1.accelerate();
        t1.accelerate();
        t1.brake();
        t1.stop();
    }
}
