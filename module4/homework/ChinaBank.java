package module4.homework;

public class ChinaBank extends Bank {

    Currency currency = Currency.USD;

    @Override
    int getLimitOfWithdrawal() {
        if (currency.equals(Currency.USD)){
            return 100;
        }
        return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (currency.equals(Currency.USD)){
            return 10000;
        }
        return 5000;
    }

    @Override
    int getMonthlyRate() {
        if (currency.equals(Currency.USD)){
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int sum) {
        if (currency.equals(Currency.USD)){
            return sum > 1000 ? 5 : 3;
        }
        return sum > 1000 ? 11 : 10;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (getLimitOfWithdrawal() > 0 && amount > getLimitOfWithdrawal()){
            System.out.println("Withdraw is unable: requested amount is out of bank limit.");
        }
        System.out.println("Withdraw " + amount + currency.toString());
        System.out.println("Commission is: " + getCommission(amount) + "%");
        amount += (int) (getCommission(amount)*amount/100.0);

        if (user.getBalance() - amount < 0) {
            System.out.println("Withdraw is unable: not enough funds on you balance");
        }
        user.setBalance(user.getBalance() - amount);
        System.out.println("Your balance was changed.\n");
    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.println("Funding " + amount + currency.toString() + " to " + user.getName());
        if (getLimitOfFunding() > 0 && amount > getLimitOfFunding()){
            System.out.println("Funding is unable: you're trying to fund more then bank limit");
        }
        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance was changed.\n");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.equals(toUser)){
            System.out.println("You are trying to transfer money to yourself.\nSuch transfer is impossible");
        }

        double toUserCurrentBalance = toUser.getBalance(), fromUserCurrentBalance = fromUser.getBalance();
        System.out.println("Transferring money...");
        fundUser(toUser,amount);
        withdrawOfUser(fromUser,amount);

        if (toUser.getBalance() == toUserCurrentBalance || fromUser.getBalance() == fromUserCurrentBalance){
            System.out.println("Transferring is impossible");
            toUser.setBalance(toUserCurrentBalance);
            fromUser.setBalance(fromUserCurrentBalance);
        }
        System.out.println("Success. Your transfer is complete\n");
    }

    @Override
    public void paySalary(User user) {
        int amount = user.getSalary();
        System.out.println("Earn " + user.getName() + "salary. Amount :" + amount + currency.toString());
        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance was changed.\n");
    }
}
