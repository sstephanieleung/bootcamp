package calculator;

import java.util.Comparator;

public interface Calculator extends Comparator<Double>{
    
    double formula(double x, double y);

}
