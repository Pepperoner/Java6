package module7.homework;

import java.util.*;

public class MainTreeSet {

    public static void main(String[] args) {

        User user1 = new User(1, "Tanya", "Pleshka", "Kyiv", 20000);
        User user2 = new User(2, "Alex", "Rak", "Kharkiv", 15000);
        User user3 = new User(3, "Vladimir", "Ananyev", "Dnepropetrovsk", 2050);
        User user4 = new User(4, "Andrey", "Ponomarenko", "Kyiv", 3200);
        User user5 = new User(5, "Sasha", "Lebed", "Lviv", 4500);
        User user6 = new User(6, "Viktor", "Falchenko", "Lviv", 3200);
        User user7 = new User(7, "Andrey", "Berezin", "Kharkiv", 20000);
        User user8 = new User(8, "Alexandr", "Lahutin", "Kyiv", 15000);
        User user9 = new User(9, "Vlad", "Piskunov", "Rivne", 2050);
        User user10 = new User(10, "Vitalii", "Proskura", "Rivne", 2050);

        TreeSet<Order> orders = new TreeSet<>();

        orders.add ( new Order(1, 50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1));
        orders.add ( new Order(2, 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6));
        orders.add ( new Order(3, 1100, Currency.UAH, "Bag model 45", "Ardo", user3));
        orders.add ( new Order(4, 1850, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2));
        orders.add ( new Order(5, 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5));
        orders.add ( new Order(6, 1700, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2));
        orders.add ( new Order(7, 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8));
        orders.add ( new Order(8, 48, Currency.USD, "T-shirt model 25 L", "Oggi", user7));
        orders.add ( new Order(9, 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8));
        orders.add ( new Order(10, 100, Currency.UAH, "Pork meet", "Silpo", user10));


        System.out.println ( "Orders: " + orders );
        System.out.println();
        System.out.print("Do orders contain 'Petrov?':");
        System.out.println ( ifContainOrderWithLastName ( orders) );
        System.out.println();

    Order maxPrice = orderWithMaxPrice ( orders );
        System.out.println ("Order with max price: \n" +  maxPrice);
        System.out.println();

    removeOrdersWithCurrencyInUSD ( orders );
        System.out.println ( "Orders without currency in USD: \n" + orders );
        System.out.println();
    }

    private static void removeOrdersWithCurrencyInUSD ( TreeSet <Order> orders ) {
        Iterator <Order> iterator = orders.iterator ( );
        Order order;
        while (iterator.hasNext ( )) {
            order = iterator.next ( );
            if (order.getCurrency ( ) == Currency.USD)
                iterator.remove ( );
        }
    }

    private static Order orderWithMaxPrice ( TreeSet <Order> orders ) {
        //return (orders.isEmpty ()) ? null : orders.last ();
        return (orders.isEmpty ()) ? null : orders.descendingSet().first ();
    }

    private static boolean ifContainOrderWithLastName(TreeSet<Order> orders) {
        if (orders.isEmpty ()) return false;
        for ( Order order : orders ) {
            if (order.getUser ( ).getLastName ( ).equals ("Petrov")) {
                return true;
            }
        }
        return false;
    }
}
