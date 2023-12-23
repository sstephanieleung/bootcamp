import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Printer<T extends Number> { // T could be any type / object class

    public List<T> values;

    public T[] arrT;

    // public Printer(T t) {
    //     this.values = new ArrayList<>();
    //     this.values.add(t);
    // }

    @SuppressWarnings("unchecked")
    public Printer(T t) {
        this.arrT = (T[]) new Number[]{t};
    }

    // public Printer(List<T> list) {
    //     this.values = new ArrayList<>(list);
    // }

    public void sum(T value) {
        double sum = 0;
        for (T t : this.values) {
            sum += (double) t;
        }
    }

    public static <U extends Number> Double calculate(U u1, U u2){
        //Byte, Short, Integer, Long, Float, Double
        double result = 0.0;
        if(u1 instanceof Byte)
            result += (Byte) u1;
        else if (u1 instanceof Short)
            result += (Short) u1;
        else if (u1 instanceof Integer)
            result += (Integer) u1;
        else if (u1 instanceof Long)
            result += (Long) u1;
        else if (u1 instanceof Float)
            result += (Float) u1;
        else if (u1 instanceof Double)
            result += (Double) u1;

        if(u2 instanceof Byte)
            result += (Byte) u2;
        else if (u2 instanceof Short)
            result += (Short) u2;
        else if (u2 instanceof Integer)
            result += (Integer) u2;
        else if (u2 instanceof Long)
            result += (Long) u2;
        else if (u2 instanceof Float)
            result += (Float) u2;
        else if (u2 instanceof Double)
            result += (Double) u2;
            
        return result;
    }

    public static <U extends Double> Double calculate(U u1, U u2){
        //Byte, Short, Integer, Long, Float, Double
        double result = u1 + u2;  
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof Printer))
            return false;
        Printer<?> newObj = (Printer<?>) obj;
        return Objects.equals(this.values, newObj.values);
    }

    public static void main(String[] args) {
        // Printer<Integer> intPrinter = new Printer<>();
        // Printer<String> strPrinter = new Printer<>("abc");

        // List<Double> list = new ArrayList(List.of(1.0, 2.0));
        Printer<Double> doublePrinter = new Printer<>(4.0);
        System.out.println(Arrays.toString(doublePrinter.arrT));

        Printer.calculate(1,2);
        System.out.println(Printer.calculate(1,2));

    }

}
