package module4.homework;


public class USBank extends Bank {

    Currency currency = Currency.USD;

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalary, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalary, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (currency.equals(Currency.USD)) {
            return 1000;
        }
        return 1200;
    }

    @Override
    public int getLimitOfFunding() {
        if (currency.equals(Currency.USD)){
            return Integer.MAX_VALUE;
        }
        return 10000;
    }

    @Override
    public int getMonthlyRate() {
        if (currency.equals(Currency.USD)){
            return 1;
        }
        return 2;
    }

    @Override
    public int getCommission(int sum) {
        if(currency.equals(Currency.USD)){
            return sum > 1000 ? 7 : 5;
        }
        return sum > 1000 ? 8 : 6;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
