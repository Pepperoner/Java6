package module4.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double userBalance = user.getBalance();
        Bank userBank = user.getBank();
        int limitWithdrawal = userBank.getLimitOfWithdrawal();
        if (limitWithdrawal > 0 && amount > limitWithdrawal) {
            System.out.println("Withdraw is unable: requested amount is out of bank limit.");
        }
        int commissionPercent = userBank.getCommission(amount);
        user.setBalance(userBalance - amount -(amount * ((double) commissionPercent/100)));
        System.out.println("Your balance " + user.getName() + " is:" + user.getBalance() + " with commission " + commissionPercent + "%");

        if (user.getBalance() - amount < 0) {
            System.out.println("Withdraw is unable: not enough funds on you balance");
        }
        System.out.println("Your balance was changed");
    }

    @Override
    public void fundUser(User user, int amount){
        double userBalance = user.getBalance();
        Bank userBank = user.getBank();
        int limitOfFunding = userBank.getLimitOfFunding();
        if (limitOfFunding > 0 && amount > limitOfFunding){
            System.out.println("Funding is unable: you're trying to fund more then bank limit");
        }
        user.setBalance(userBalance + amount);
        System.out.println("New balance of user "+user.getName()+" is: "+user.getBalance());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount){
        double fromUserBalance = fromUser.getBalance();
        double toUserBalance = toUser.getBalance();
        if (amount>fromUserBalance){
            System.out.println(fromUser.getName()+" your balance in not enough for this transaction");
        }
        if (fromUser.equals(toUser)){
            System.out.println("You are trying to transfer money to yourself.\nSuch transfer is impossible");
        }
        System.out.println("Transferring money...");
        fundUser(toUser,amount);
        System.out.println(fromUser.getName()+" sent "+amount+" to "+toUser.getName()+". "+fromUser.getName()+" your balance was: "+ fromUserBalance);
        System.out.println(fromUser.getName()+" balance after transfer is: "+(fromUserBalance-amount)+". "+toUser.getName()+" now your balance is: "+ (toUserBalance + amount));
        System.out.println("Success. Your transfer is complete\n");
    }

    @Override
    public void paySalary(User user){
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println(user.getName() + "Your balance with salary is: " + user.getBalance());
    }
}
