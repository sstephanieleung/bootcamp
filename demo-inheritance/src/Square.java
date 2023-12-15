import java.math.BigDecimal;

public class Square extends Shape {
    

    private double length;

    public Square(double length){

    }

    public double area(){
        return BigDecimal.valueOf(length).pow(2).doubleValue();
    }
}
