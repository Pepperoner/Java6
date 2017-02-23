package module3.homework.task4;

public class MainUser {
    public static void main(String[] args) {
        User user = new User("Boris",3000,12,"Jahoo",2500,"dollar");
        System.out.println(user.paidSalary(1000,2500));
        System.out.println(user.withdraw(1500));
        System.out.println(user.companyNameLength());
        System.out.println(user.monthIncrease(3));
    }
}
