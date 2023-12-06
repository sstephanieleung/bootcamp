import java.math.BigDecimal;

public class Calculator {
    
    private BigDecimal x;

    private BigDecimal y;

    public Calculator(BigDecimal x, BigDecimal y){
        this.x = x;
        this.y = y;
    }

    public double add(){
        return x.add(y).doubleValue();  //will value of x be changed? Look at BigDecimal Class
    }

    public double subtract(){
        return x.subtract(y).doubleValue();
    }

    public static Calculator of(double x, double y){
        
        return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    public static void main(String[] args){
        double d1 = 0.2;
        double d2 = 0.1;
        Calculator c1 = new Calculator(BigDecimal.valueOf(d1), BigDecimal.valueOf(d2));
        Calculator c2 = Calculator.of(0.2,0.1);

        System.out.println(c1.add());

        
    }
}
