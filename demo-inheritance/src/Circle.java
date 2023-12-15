import java.math.BigDecimal;

public class Circle extends Shape{
    
    private double radius;

    public Circle(){

    }

    public Circle (double radius){
        this.radius = radius;
    }
    
    public Circle (double radius, String color){
        super(color);
        this.radius = radius;
    }

    //@Override
    public double area(){
        return BigDecimal.valueOf(this.radius).pow(2).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    }

    public double getRadius(){
        return this.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.4d, "red");
        System.out.println(circle.area());
        circle.getColor();
    }
}
