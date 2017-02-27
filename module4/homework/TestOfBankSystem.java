package module4.homework;

public class TestOfBankSystem {

    public static void main(String[] args) {

        Bank bank = new USBank();
        Bank bank2 = new EUBank();
        Bank bank3 = new ChinaBank();
        User user = new User(1,"Boris",1000,1,"AT&T",3000,bank);
        User user1 = new User(2,"Mark",1000,2,"Google",3500,bank);
        User user2 = new User(3,"Alex",3000,3,"Porshe",4000,bank2);
        User user3 = new User(4,"Tanya",3000,4,"Yahoo",2000,bank2);
        User user4 = new User(5,"Jet Lee",1500,5,"Steam",1000,bank3);
        User user5 = new User(6,"Jacky",1500,6,"Samsung",1500,bank3);

        System.out.println(user);
        bank.withdrawOfUser(user,300);
        System.out.println(user);
        bank.paySalary(user);
        System.out.println(user);
        bank.fundUser(user,150);
        System.out.println(user);
        bank.transferMoney(user1,user,750);
        System.out.println(user);
    }
}
