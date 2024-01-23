import java.math.BigDecimal;

public class Account {
    
    private double balance;
    
    private int accountNo;

    //Important Note;
    //Optional<T> is not suitable for Class attribute
    //Optional<T> does not support Serialization / deSerialization naturally
    //private Optional<String> currency:

    public Account(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountNo(){
        return this.accountNo;
    }

    public void credit(double amount){
        this.balance = BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue();
    }

    public boolean debit(double amount){
        if(amount > this.balance)
            return false;
        this.balance = BigDecimal.valueOf(this.balance).subtract(BigDecimal.valueOf(amount)).doubleValue(); //BigDecimal
        return true;
    }
}
