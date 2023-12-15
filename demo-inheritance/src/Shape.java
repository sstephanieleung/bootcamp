import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Shape {
    //abstract class vs class 
    //Difference:
    //1. Cannot be "new"
    //2. May contain abstract method(s), implicity public
    //
    //Same:
    //1. Still have instance variables (attributes)
    //2. Still have instance methods
    //3. Staill have static methods.
    //4. Still have constructor, for super() usage only, cannot be "new"


    private String color;

    public Shape(){
        
    }
    public Shape(String color){
        this.color = color;
    }

    abstract double area(); //implicity public

    public static double totalArea(Shape[] shapes){
        BigDecimal totalArea = BigDecimal.valueOf(0);
        for(Shape element: shapes){
            totalArea = totalArea.add(BigDecimal.valueOf(element.area()).setScale(2,RoundingMode.HALF_UP));
            //Shape.area() -> runtime -> which object (circle/sqaure) -> different implementation of area
        }
        return totalArea.doubleValue();
    }

    public String getColor(){
        return this.color;
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(3.2d,"Yellow"); //s1 is Polymorhism 多態, it obtain Circle obj in Shape type.
        // Java compile time: s1 has area() method, getColor() method, getRadius
        String s = "hello"; //hello is a string object, s is a String type object reference
        System.out.println(s1.getColor());
        System.out.println(s1.area());
        //System.out.println(s1.getRadius()); //s1 only can behave like Shape

        Circle c2 = (Circle) s1;
        System.out.println(c2.getRadius());

        Circle c3 = (Circle) s1;

        Shape[] shapes = new Shape[]{s1,c2,c3};
        Circle[] circles = new Circle[]{(Circle) s1,c2,c3};
        System.out.println(Shape.totalArea(shapes));
        System.out.println(Shape.totalArea(circles));

        Shape[] shapes2 = new Shape[]{new Circle(3.2d),new Square(3)};
        System.out.println(Shape.totalArea(shapes2));
    }
}
