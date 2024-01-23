package comparator;

import java.util.Comparator;

public class SortBallByColor implements Comparator<Ball> {

    @Override
    public int compare(Ball b1, Ball b2) {
        return b2.getColor().value().compareTo(b1.getColor().value()) > 0 ? -1 : 1;
    }
}
