package calculator;

import java.util.List;

public class CheckOut {
    
    public static <T extends Adjustment> double calculate(List<T> items, double adjustment){
        double total = 0.0d;
        for(T item: items){
            total += item.adjust(adjustment); // because T is bounded by a contract Adjustment.class
        }
        return total;
    }
}
