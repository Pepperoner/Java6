package module6.homework;

import java.util.Scanner;

public class UseOfCitizen {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CitizenFactory citizenFactory = new CitizenFactory();
        instruction("Enter name of country in lower case");
        String nationality = in.nextLine();

        while (!nationality.equals("exit")) {
            Citizen newCitizen = citizenFactory.getCitizen(nationality);
            if (newCitizen != null){
                newCitizen.sayHello();
            } else {
                instruction("Wrong nationality. Check your input and try again or input 'exit'");
            }
            nationality = in.nextLine();
        }
    }

    private static void instruction(String message){
        System.out.println(message);
    }
}
