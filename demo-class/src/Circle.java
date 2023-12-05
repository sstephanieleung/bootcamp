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

    //Other instance methods
    public double diameter(){
        return 2*this.radius;
    }
    public double area(){
        return this.sq() * Math.PI;
    }
    public double sq(){
        return Math.pow(this.radius, 2);
    }
    public double cube(){
        return Math.pow(this.radius,3);
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
