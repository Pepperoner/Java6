package module8.homework;

import java.util.*;

public final class ManageSystem implements IManageSystem <Food> {

    private static Map <Food, Double> database = new HashMap <> ( );

    @Override
    public Food save ( Food food, double price ) {
        database.put ( food, price );
        return food;
    }

    @Override
    public Food save ( Food food ) {
        database.put ( food, 0.0 );
        return food;
    }

    public void saveAll ( Map <? extends Food, Double> newDatabase ) {
        database.putAll ( newDatabase );
    }

    @Override
    public void delete ( Food food ) {
        database.remove ( food );
    }

    @Override
    public void deleteById ( int id ) {
        Set <Food> setOfFoods = database.keySet ( );
        setOfFoods.removeIf ( t -> t.getId() == id );
    }

    @Override
    public Food get ( int id ) {
        Set <Food> setOfFoods = database.keySet ( );
        for ( Food food : setOfFoods ) {
            if (food.getId ( ) == id)
                return food;
        }
        return null;
    }

    @Override
    public Double getPrice ( Food food ) {
        return (food == null)? null : database.get ( food );
    }

    @Override
    public Set <Food> getProducts () {
        return database.keySet ( );
    }

    @Override
    public List <Double> getPrices () {
        return new ArrayList <> ( database.values ( ) );
    }

    @Override
    public void printProductsSortedByName () {
        Map <Food, Double> sortedByNameDatabase = new TreeMap <> (Comparator.comparing(Food::getName));
        sortedByNameDatabase.putAll ( database );
        System.out.println ( "Product sorted by name: \n" + sortedByNameDatabase );
        System.out.println();
    }

    @Override
    public void printProductsSortedByPrice () {
        List <Map.Entry <Food, Double>> sortedByPriceDatabase = new ArrayList <> ( database.entrySet ( ) );
        sortedByPriceDatabase.sort (Comparator.comparing(Map.Entry::getValue));
        System.out.println ( "Product sorted by price:" );
        for ( Map.Entry <Food, Double> entry : sortedByPriceDatabase )
            System.out.println ( entry.getKey ( ).toString ( ) + " Price: " + entry.getValue ( ) );
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( "database:\n" );
        for ( Map.Entry <Food, Double> database : database.entrySet ( ) )
            sb.append ( database.getKey ( ) ).append ( " Price: " ).
                    append ( database.getValue ( ) ).append ( "\n" );
        return sb.toString ( );
    }

    public String printDatabase () {
        return toString ( );
    }
}
