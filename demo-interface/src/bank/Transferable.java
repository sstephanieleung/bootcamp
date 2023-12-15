package bank;

public interface Transferable {
    
    //boolean transfer(Account to, double amount);

    boolean transfer(Transferable to, double value);

    public static void xxx(Transferable[] from , Transferable[] to, int value){
        from [0].transfer(null,value);
    }
}
