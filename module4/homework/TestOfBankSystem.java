package module4.homework;

public class TestOfBankSystem {

    public static void main(String[] args) {
        BankSystemImpl bankSystem = new BankSystemImpl();
        Bank bank = new USBank(10,"USA",Currency.USD,200,2000.0,20,1000000);
        Bank bank2 = new EUBank(15,"France",Currency.EUR,250,1500.0,15,1500000);
        Bank bank3 = new ChinaBank(20,"Beijing",Currency.USD,300,1000,30,500000);
        User user = new User(1,"Boris",1000,1,"AT&T",3000,bank);
        User user1 = new User(2,"Mark",2000,2,"Google",3500,bank);
        User user2 = new User(3,"Alex",3000,3,"Porshe",4000,bank2);
        User user3 = new User(4,"Tanya",3000,4,"Yahoo",2000,bank2);
        User user4 = new User(5,"Jet Lee",1500,5,"Steam",1000,bank3);
        User user5 = new User(6,"Jacky",1500,6,"Samsung",1500,bank3);

        System.out.println(user);
        bankSystem.withdrawOfUser(user,200);
        System.out.println();
        System.out.println(user1);
        bankSystem.fundUser(user1,2000);
        System.out.println();
        System.out.println(user);
        System.out.println(user1);
        bankSystem.transferMoney(user1,user,1500);
        System.out.println();
        System.out.println(user4);
        bankSystem.paySalary(user4);

    }
}
