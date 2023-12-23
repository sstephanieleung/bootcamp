public class Ball {
    

    private Color color; //relatively finite numbers

    public Ball(Color color){
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public static void main(String[] args) {
        //Before the main() starts, class load (JVM put all the class into a class space) -> new Color("Red")
        //Color.RED (something like static final)
        //You cannot "new" the Color object by yourself

        Ball b1 = new Ball(Color.RED);
        Ball b2 = new Ball(Color.BLACK);
        Ball b3 = new Ball(Color.BLACK);
        Ball b4 = new Ball(Color.YELLOW);

        System.out.println(b1.getColor() == b2.getColor()); //false
        System.out.println(b2.getColor() == b3.getColor()); //true: Every enum value are unique in the memory, so only one address for the enum values
        System.out.println(b3.getColor() == b4.getColor()); //false
    }
}
