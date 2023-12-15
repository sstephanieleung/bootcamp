import java.math.BigDecimal;

//BigDecimal has NO "final" keyword, so SuperDecimal can inherit it.
public class SuperDecimal extends BigDecimal {

    //Attributes
    //

    //Constructor
    //
    public SuperDecimal(){
        super("0");
    }
    
    public SuperDecimal(double value) {
        super(String.valueOf(value)); //new BigDecimal(String.valueOf(value))
    }

    public static SuperDecimal valueOf(double value){
        return new SuperDecimal(value); //method call own constructor
    }

    public SuperDecimal multiply(SuperDecimal value){
        BigDecimal bd = this; //Upcast
        BigDecimal bdValue = value;
        return (SuperDecimal) bd.multiply(bdValue);
    }
    
    //Method
    //Now, we inherit ALL BigDecimal public instance methods
   
    

    public static void main(String[] args) {
        SuperDecimal sd1 = new SuperDecimal(3.0); // calling BigDecimal()
        SuperDecimal sd2 = SuperDecimal.valueOf(4.0); //calling BigDicmal()
        SuperDecimal sd3 = sd1.multiply(sd2);//new SuperDecimal();

        

        System.out.println(sd3.doubleValue());

        //SuperDecimal sd4 = sd1.multiply(sd2);

        
    }
}
