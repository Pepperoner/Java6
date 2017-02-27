package module4.homework;

public class EUBank extends Bank {

    private static final Currency currency = Currency.EUR;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalary, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalary, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (Currency.EUR.equals(currency)){
            return 2200;
        }
        return 2000;
    }

    @Override
    public int getLimitOfFunding() {
        if (Currency.EUR.equals(currency)){
            return 20000;
        }
        return 10000;
    }

    @Override
    public int getMonthlyRate() {
        if (Currency.EUR.equals(currency)){
            return 1;
        }
        return 0;
    }

    @Override
    public int getCommission(int sum) {
        if (Currency.EUR.equals(currency)){
            return sum > 1000 ? 4 : 2;
        }
        return sum > 1000 ? 7 : 5;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
