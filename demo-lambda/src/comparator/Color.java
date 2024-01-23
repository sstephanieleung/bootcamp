package comparator;

public enum Color {
    RED ("RED"),
    ORANGE("ORANGE"),
    YELLOW("YELLOW"),
    GREEN("GREEN"),
    BLUE ("BLUE"),
    PURPLE("PURPLE"),
    BLACK("BLACK"),
    WHITE("WHITE"),
    ;

    private String desc;

    private Color(String desc){
        this.desc = desc;
    }

    public String value(){
        return this.desc;
    }
}
