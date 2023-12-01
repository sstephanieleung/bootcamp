public class Circle {
    private double radius; //Default = 0.0d

    //Constructor
    public Circle(){  //Empty constructor

    }
    public Circle(double r){
        this.radius = r;
    }

    //Setter
    public void setRadius(double r){
        this.radius = r;
    }

    //Getter
    public double getRadius(){
        return this.radius;
    }

    //Other methods
    public double diameter(){
        return 2*this.radius;
    }
    public double area(){
        double pi = Math.PI;
        return pi*this.radius*this.radius;
    }
    public double sq(){
        return this.radius * this.radius;
    }
    public double cube(){
        return this.radius * this.radius * this.radius;
    }

    //main
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.setRadius(4.2);
        System.out.println(c1.getRadius());
        System.out.println("Diameter is "+ c1.diameter());
        System.out.println("Area is "+ c1.area());
    }
}
