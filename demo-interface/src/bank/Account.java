package bank;

import java.math.BigDecimal;
import java.util.Arrays;

public class Account implements Transferable {

    // private int balance; // can be derived by transactions
    
    private Transaction[] transactions;

    private AccountHolder accountHolder; // name, age, occupation, etc.

    public Account(AccountHolder accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.transactions = new Transaction[0];
    }

    public Account(String name, int age) {
        this.accountHolder = new AccountHolder(name, age);
        this.transactions = new Transaction[0];
    }

    public boolean credit(double amount){
        return this.addTransaction(Transaction.ofCredit(amount));
    }

    public boolean debit(double amount){
        return this.addTransaction(Transaction.ofDebit(amount));
    }

    private boolean addTransaction(Transaction t) {
        if (this.balance() + t.getAmount() < 0)
            return false;
        Transaction[] newArr = Arrays.copyOf(this.transactions, this.transactions.length + 1);
        newArr[newArr.length - 1] = t;
        this.transactions = newArr;
        return true;
    }

    public double balance() {
        BigDecimal balance = BigDecimal.valueOf(0);
        for (Transaction element : transactions){
            balance = balance.add(BigDecimal.valueOf(element.getAmount()));
        }
        return balance.doubleValue();
    }

    // @Override
    // public boolean transfer(Account to, double amount){
    //     if(amount <= 0)
    //         return false;
    //     if(amount > this.balance())
    //         return false;
    //     if (!to.credit(amount)){
    //         return false;
    //     }
    //     return this.debit(amount);
    // }

    @Override
    public boolean transfer(Transferable to, double amount){
        if(amount <= 0)
            return false;
        if(amount > this.balance())
            return false;
        Account target = (Account) to;
        if (!target.credit(amount)){
            return false;
        }
        return this.debit(amount);
    }

    @Override
    public String toString(){
        return "Account: "+ accountHolder.getName() //
        + " | Balance: " + this.balance();
    }

    public static void main(String[] args) {
        Account a1 = new Account("Vincent Lau", 18);
        Account a2 = new Account("Oscar Lo",18);

        System.out.println(a1.credit(5000));
        System.out.println(a1.credit(5000));
        System.out.println(a1.debit(2000));
        System.out.println(a1.transfer(a2, 400));
        System.out.println(a1.balance());

        Transferable a3 = new Account("Mary Chan", 18);
        Account a4 = (Account)a3;  //a3, a4 point to same object "Mary Chan"'s account
        System.out.println(a4.credit(20000));
        System.out.println(a3.transfer(a2, 200));
        System.out.println(a4.transfer(a1,300));

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        

    }

}
