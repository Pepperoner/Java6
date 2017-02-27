package module4.homework;

public class ChinaBank extends Bank {

    Currency currency = Currency.USD;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalary, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalary, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (currency.equals(Currency.USD)){
            return 100;
        }
        return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (currency.equals(Currency.USD)){
            return 10000;
        }
        return 5000;
    }

    @Override
    public int getMonthlyRate() {
        if (currency.equals(Currency.USD)){
            return 1;
        }
        return 0;
    }

    @Override
    public int getCommission(int sum) {
        if (currency.equals(Currency.USD)){
            return sum > 1000 ? 5 : 3;
        }
        return sum > 1000 ? 11 : 10;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
