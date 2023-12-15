import java.math.BigDecimal;

public class Deal implements CurrencyExchange {

    private static double sellProfit = 0.1;

    private static double buyProfit = 0.05;

    private static double CNY_rate = 1.02;

    private static double JPY_rate = 0.0543;



    public Deal() {

    }

    @Override
    public  buy(double HKD) {
        return BigDecimal.valueOf(HKD).multiply(BigDecimal.valueOf(CNY_rate).subtract(BigDecimal.valueOf(buyProfit)))
                .doubleValue();
    }

    @Override
    public double sell(double HKD) {
        return BigDecimal.valueOf(HKD).multiply(BigDecimal.valueOf(CNY_rate).add(BigDecimal.valueOf(sellProfit)))
                .doubleValue();
    }



}
