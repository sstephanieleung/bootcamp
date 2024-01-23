import java.util.HashMap;
import java.util.Map;

public class Octopus {

    public static Map<String, Integer> ac = new HashMap<>();

    public String name;

    public int balance;

    public static void main(String[] args) throws BusinessException {

        String name1 = "Vincent Lau";
        int amount1 = 100;
        Octopus oct1 = new Octopus(name1, amount1);
        Octopus oct2 = new Octopus("Oscar Lo", 200);
        boolean result = false;
        System.out.println(oct1.name + " Current Balance: " + oct1.balance);
        System.out.println(oct2.name + " Current Balance: " + oct2.balance);
        result = Octopus.addValue(oct1, 50);
        System.out.println("Update Vincent's Balance: "+result);
        System.out.println(oct1.name + " Updated Balance: " + oct1.balance);
        System.out.println(oct2.name + " Updated Balance: " + oct2.balance);
        System.out.println(ac.values());
    }

    public Octopus(String name, int amount)throws BusinessException{
        if(name == null)
            throw new BusinessException(ExceptionCode.USERNAME_INVALID);
        ac.put(name, amount);
        this.name = name;
        this.balance = amount;
    }

    public void changeBalance(int amount){
        this.balance += amount;
    }

    public static boolean addValue(Octopus account, int amount) throws BusinessException {
        if(account == null)
            throw new NullPointerException();
        if (!isUserExisted(account))
            throw new BusinessException(ExceptionCode.USER_NOT_FOUND);
        return updateBalance(account, amount);
    }

    public static boolean isUserExisted(Octopus account) throws BusinessException {
        // call methodB
        if (!ac.containsKey(account.name))
            throw new BusinessException(ExceptionCode.USER_NOT_FOUND);
        return true;
    }

    public static boolean updateBalance(Octopus account, int amount) throws BusinessException {
        // what is the difference of throwing checked or unchecked exception in methodC?
        if (amount < 50)
            throw new BusinessException(ExceptionCode.TOO_SMALL);
        if (amount > 500)
            throw new BusinessException(ExceptionCode.TOO_LARGE);
        if(amount %10 !=0)
            throw new BusinessException(ExceptionCode.INVALID_AMOUNT);

        ac.put(account.name, account.balance + amount);
        account.changeBalance(amount);
        return true;
    }
}