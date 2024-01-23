import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoOptional {
    public static void main(String[] args) {
        // Cat: age, name
        // Cat.class, Cat is the name of a class only. You can name it anything, such as
        // box
        // Or you can simply treat it as AgeAndNameHolder.class

        Account account = DemoOptional.setup(1, 0.0d);
        account.credit(10.0d);

        Account account2 = DemoOptional.setup(0, 0.0d);
        // account2.credit(200.0d); // NPE happen

        // As a caller, we can generally handle the null value in this way
        // Approach 1: to handle Optional return value
        DemoOptional.setup2(0, 0.0d).ifPresent(e -> e.credit(1000.d));

        // Approach 2: to handle Optional return value
        Optional<Account> oa = DemoOptional.setup2(3, 0.0d);
        if (oa.isPresent())
            oa.get().credit(1000.0d);
        else
            System.out.println("I decided to do nothing when Account Object is null.");

        List<Account> accounts = new ArrayList<>(List.of(new Account(1, 120.0d), new Account(2, 50.0d)));
        Optional<Account> optaccount = accounts.stream()
                .filter(e -> e.getBalance() > 30.0d)
                .findFirst();
        optaccount.ifPresent(e -> e.debit(30.d)); // getBalance() = 90.0d

        if (optaccount.isPresent())
            optaccount.get().credit(30.0d); // getBalance() = 120.0d

        System.out.println(optaccount.get().getBalance()); // getBalance() = 120.0d

        Optional<Account> optaccount2 = accounts.stream().filter(e -> e.getBalance() > 150.d).findAny();
        Account ac2 = optaccount2.orElse(new Account(99, 0.1d));
        optaccount2 = Optional.empty();
        Account ac3 = optaccount2.orElseGet(() -> new Account(99, 0.0d));
        Account ac4 = optaccount2.orElseThrow(() -> new NoSuchElementException());
        Account ac5 = optaccount2.orElseThrow();

        System.out.println(ac2.getBalance());
        System.out.println(ac3.getBalance());
        System.out.println(ac4.getBalance());
        System.out.println(ac5.getBalance());

        OptionalDouble maxBalance = accounts.stream().mapToDouble(e -> e.getBalance()).ma;
        

        double max = 0.0d;
        if(maxBalance.isPresent()){
            max = maxBalance.getAsDouble();
        }
        max = maxBalance.orElse(-1.0d);
    }

    public static Account setup(int accountNo, double balance) {
        Objects.requireNonNull(accountNo); // throw NPE
        Objects.requireNonNull(balance); // throw NPE
        if (accountNo <= 0 || balance < 0)
            return null;
        return new Account(accountNo, balance);
    }

    public static Optional<Account> setup2(int accountNo, double balance) {
        Objects.requireNonNull(accountNo); // throw NPE
        Objects.requireNonNull(balance); // throw NPE
        if (accountNo <= 0 || balance < 0)
            return Optional.empty();
        return Optional.of(new Account(accountNo, balance));
    }

    public static Optional<Account> setup3(Optional<Integer> accountNo, Optional<Double> balance) {
        // It is meaningless to use Optional<> type in input parameter
        // Error still happen when use Optional.class methods, e.g. .ifPresent()
        // No matter Optional<> or not, we have to validate if the input is non-null
        // value before operate it.
        return Optional.empty();
    }
}
