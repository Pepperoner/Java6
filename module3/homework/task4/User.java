package module3.homework.task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    public static final double LOW_COMMISSION = 0.05;
    public static final double HIGH_COMMISSION = 0.1;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int paidSalary(int balance, int salary){
        balance+=salary;
        return balance;
    }
    public int withdraw (int sum) {
        if (sum <= 1000) {
            return (int) (balance - ((sum * LOW_COMMISSION) + sum));
        }
        return  (int) (balance - ((sum * HIGH_COMMISSION) + sum));
    }
    public int companyNameLength(){
        return companyName.length();
    }
    public int monthIncrease(int addMonth){
        return monthsOfEmployment+=addMonth;
    }
}
