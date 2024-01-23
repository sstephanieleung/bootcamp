public class Bag<T> {
    //<T> = <T extends Objects>

    T thing;

    public Bag(){
    }

    public Bag(T thing){
        this.thing = thing;
    }

    public static <T> T get(T t){
        return t;
    }

    public static void main(String[] args) {
        Bag<Integer> = new Bag<>();

    }
}
