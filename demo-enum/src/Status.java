public enum Status {

    //implicity public
    ORDERED('O'),
    SHIPPED('S'),
    COMPLETED('C'),
    ;

    private char val;

    private Status(char val) { // Someone may call Status('O') -> enum will directly assign the associated
                               // value Status.ORDER to the reference object
        this.val = val;
    }

    public char getVal(){
        return this.val;
    }
}
