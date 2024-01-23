public enum ExceptionCode {
    TOO_LARGE(100, "AMOUNT_TOO_LARGE"),
    TOO_SMALL(101, "AMOUNT_TOO_SMALL"),
    INVALID_AMOUNT(102,"INVALID_AMOUNT"),
    USER_NOT_FOUND(200,"USER_NOT_FOUND"),
    USERNAME_INVALID(201,"USERNAME_INVALID"),
    ;

    private int code;

    private String message;

    private ExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCodeInt(){
        return this.code;
    }

    public String getMessageStr(){
        return this.message;
    }
}
