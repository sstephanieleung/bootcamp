package bank;

import java.time.LocalDateTime;

public class Transaction {

    private String desc;

    private boolean isCredit; //enum
    
    private double amount;

    private LocalDateTime transDateTime;

    private Transaction(Boolean isCredit, double amount, LocalDateTime transDateTime){
        this.isCredit = isCredit;
        this.amount = isCredit? Math.abs(amount): -Math.abs(amount);
        this.transDateTime = transDateTime;
        this.desc = "";
    }

    public Transaction (Boolean isCredit, double amount){
        this(isCredit, amount, LocalDateTime.now());
    }

    public static Transaction ofCredit(double amount) {
        return new Transaction(true, Math.abs(amount));
    }

    public static Transaction ofDebit(double amount) {
        return new Transaction(false, -Math.abs(amount));
    }

    public double getAmount(){
        return this.amount;
    }

    @Override
    public String toString(){
        return (isCredit? "Credit: ": "Debit: ") + amount + " | Remark: "+ desc;
    }

}
