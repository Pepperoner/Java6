package module8.homework;

import java.util.HashMap;
import java.util.Map;
import static module8.homework.Country.*;

public class Main {

    public static void main(String[] args) {
        ManageSystem manageSystem = new ManageSystem();
        manageSystem.save ( new Food ( "Cake", UKRAINE, 5 ), 23.0 );
        manageSystem.save ( new Food ( "Yogurt", UKRAINE, 10 ),20 );
        manageSystem.save ( new Food ( "Wheat bread", UKRAINE, 7 ), 11 );
        Food sausages = manageSystem.save ( new Food ( "Sausages", GERMANY, 30),50);
        Food meat = new Food ( "Boiled frogs", FRANCE, 15 );

        Map <Food, Double> fruitsDatabase = new HashMap <> ( );
        fruitsDatabase.put ( meat, 29.0);
        fruitsDatabase.put ( new Food ( "Fuji", USA, 40 ), 21.0 );
        fruitsDatabase.put ( new Food ( "Gala", NORWAY, 30 ), 14.0 );
        manageSystem.saveAll ( fruitsDatabase );


        System.out.println ( manageSystem.printDatabase ( ) );
        System.out.println ( manageSystem.getProducts ( ) );
        System.out.println();
        System.out.println ( manageSystem.getPrices ( ) );
        System.out.println();
        System.out.println ( manageSystem.getPrice ( sausages ) );
        System.out.println();
        System.out.println ( manageSystem.get ( 4 ) );
        System.out.println();
        manageSystem.delete ( meat );
        manageSystem.deleteById ( 3 );

        System.out.println ( manageSystem.printDatabase ( ) );
        manageSystem.printProductsSortedByName ( );
        manageSystem.printProductsSortedByPrice ( );
    }
}
