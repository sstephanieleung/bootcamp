package poker;

public enum Suit {
    
    HEART("HEART"),
    CLUBS("CLUBS"),
    DIAMONDS("DIAMONDS"),
    SPADES("SPADES"),
    ;

    private String val;

    private Suit(String val){
        this.val = val;
    }

    public String getVal(){
        return this.val;
    }

}
