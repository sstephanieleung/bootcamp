package poker;
public enum Rank {
    
    R1("1"),
    R2("2"),
    R3("3"),
    R4("4"),
    R5("5"),
    R6("6"),
    R7("7"),
    R8("8"),
    R9("9"),
    R10("10"),
    J("J"),
    Q("Q"),
    K("K"),
    ;

    private String val;

    private Rank(String val){
        this.val = val;
    }

    public String getVal(){
        return this.val;
    }

    @Override
    public String toString(){
        return this.val;
    }

}
