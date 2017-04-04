package module6.homework;

import java.util.Arrays;
import java.util.Random;

public class CheckUsers {
    private static final int NUMBER_OF_USER = 5;

    public static void main(String[] args) {

        User[] users = initUsers();
        printArrays(users,"Starting an array");

        printArrays(UserUtils.uniqueUsers(users),"Unique Users");
        printArrays(UserUtils.usersWithConditionalBalance(users,2000),"Users With Conditional Balance");
        printArrays(UserUtils.paySalaryToUsers(users),"Pay Salary To Users");
        printArrays(UserUtils.getUsersId(users),"Get Users Id");

        User[] usersForTestDeleteMethod = Arrays.copyOf(users,users.length+2);
        printArrays(usersForTestDeleteMethod,"Array users for test delete method");
        printArrays(UserUtils.deleteEmptyUsers(usersForTestDeleteMethod),"deleteEmptyUsers");
    }

    private static User[] initUsers(){
        User[] returnUsers = new User[NUMBER_OF_USER];
        final Random rand = new Random();

        int randIndex;

        for (int i = 0; i < NUMBER_OF_USER; i++) {
            randIndex = rand.nextInt(100) /10;

            returnUsers[i] = new User(i,"Name"+randIndex,"Surname"+randIndex,1000+randIndex,2000+randIndex);

        }

        return returnUsers;
    }

    private static void printArrays(long[] arrays, String utilMethod){

        System.out.println(String.format("====%s====",utilMethod));
        for (long element : arrays) {
            System.out.println(String.format("id:%d",element));
            System.out.println("-----");
        }

    }

    private static void printArrays(User[] arrays, String utilMethod){

        System.out.println(String.format("====%s====",utilMethod));
        for (User element : arrays) {
            if(element == null){
                System.out.println("null");
            }else{
                System.out.println(element.toString());
            }
            System.out.println("-----");
        }
    }
}
