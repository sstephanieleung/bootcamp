package poker;

public enum Direction {

    //enum has built-in methods: 
    //values() -> return all enum values in this class
    //name() -> return the enum value of the instance
    //toString() -> return String value of the enum instance (Enum.class override Object.class)
    //equals() -> 
    //hashcode() -> 

    
    NORTH(1),
    EAST(2),
    SOUTH(-1),
    WEST(-2),
    ;

    private int val;

    private Direction(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }

    private static Direction fromVal (int val){
        for(Direction d: values()){
            if(d.getVal() == val){
                return d;
            }
        }
        return null;
    }

    public static Direction opposite(Direction direction){
        return Direction.fromVal(direction.getVal() *-1);
    }

    public Direction opposite(){
        return Direction.fromVal(this.getVal() *-1); //call method -> Direction.opposite()
    }

    public boolean isOpposite(Direction direction){
        return this == Direction.fromVal(direction.getVal()*-1);
    }

    

    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        String s1 = Direction.EAST.name();
        String s2 = Direction.EAST.toString();
        System.out.println(Direction.opposite(d1));
        System.out.println(Direction.EAST.opposite());
        System.out.println(s1);
        System.out.println(s2);
    }
}
