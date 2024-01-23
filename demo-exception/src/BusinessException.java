public class BusinessException extends Exception {
    

    public BusinessException (ExceptionCode code){
        super(code.getMessageStr()); //Pass the String to Exception.class constructor
    }
}
