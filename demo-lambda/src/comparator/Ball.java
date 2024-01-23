package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Ball {

    private Color color;

    private double price;

    public Ball() {
        this.price = 0;
        this.color = Color.BLACK;
    }

    public Ball(Color color, double price) {
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Ball(" + this.color.value() + ", " + this.price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Ball))
            return false;
        Ball newObj = (Ball) obj;
        return Objects.equals(this.color, newObj.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color, this.price);
    }

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>(List.of(new Ball(Color.BLUE, 10.3), new Ball(Color.RED, 3.0),
                new Ball(Color.GREEN, 10.0), new Ball(Color.ORANGE, 4.0), new Ball(Color.ORANGE, 3.0)));
        Collections.sort(balls, new SortBallByColor());
        System.out.println(balls);
        Collections.sort(balls, new SortballByPrice());
        System.out.println(balls);

        Comparator<Ball> sortByColor = (b1, b2) -> {
            return b2.getColor().value().compareTo(b1.getColor().value()) >0?-1:1;
        };

        Comparator<Ball> sortByPrice = (b1, b2) -> {
            return b2.getPrice() > b1.getPrice()?-1:1;
        };

        Comparator<Ball> sortByColorAndThenPrice = sortByColor.thenComparing(sortByPrice);
        Collections.sort(balls,sortByColorAndThenPrice);
        System.out.println(balls);

        Comparator<Ball> sortByPriceAndThenColor = sortByPrice.thenComparing(sortByColor);
        Collections.sort(balls,sortByPriceAndThenColor);
        System.out.println(balls);

        
        
    }
}
