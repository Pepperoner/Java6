package module7.homework;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.reverseOrder;

public class MainList {

    public static void main ( String[] args ) {

        User user1 = new User (1, "Tanya", "Pleshka", "Kyiv", 20000 );
        User user2 = new User (2, "Alex", "Rak", "Kharkiv", 15000 );
        User user3 = new User (3, "Vladimir", "Ananyev", "Dnepropetrovsk", 2050 );
        User user4 = new User (4, "Andrey", "Ponomarenko", "Kyiv", 3200 );
        User user5 = new User (5, "Sasha", "Lebed", "Lviv", 4500 );
        User user6 = new User (6, "Viktor", "Falchenko", "Lviv", 3200 );
        User user7 = new User (7, "Andrey", "Berezin", "Kharkiv", 20000 );
        User user8 = new User (8, "Alexandr", "Lahutin", "Kyiv", 15000 );
        User user9 = new User (9, "Vlad", "Piskunov", "Rivne", 2050 );
        User user10 = new User (10, "Vitalii", "Proskura", "Rivne", 2050 );

        List <Order> orders = new ArrayList <> ( 10 );

        Order order1 = new Order (1,50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1 );
        Order order2 = new Order (2,1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6 );
        Order order3 = new Order (3,1100, Currency.UAH, "Bag model 45", "Ardo", user3 );
        Order order4 = new Order (4,1850, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order5 = new Order (5,55, Currency.USD, "Dress yellow model 04 S", "Otto", user5 );
        Order order6 = new Order (6,1700, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order7 = new Order (7,48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order8 = new Order (8,48, Currency.USD, "T-shirt model 25 L", "Oggi", user7 );
        Order order9 = new Order (9,48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order10 = new Order (10,100, Currency.UAH, "Pork meet", "Silpo", user10 );

        orders.addAll ( Arrays.asList ( order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 ) );
        System.out.println ( "Collection of orders: " );
        orders.forEach ( System.out::print );
        System.out.println();

        orders.sort ( reverseOrder ( ) );
        System.out.println ( "Collection sorts by Order price in decrease order: " );
        orders.forEach ( System.out::print );
        System.out.println();

        orders.sort ( ( Order o1, Order o2 ) -> {
            int priceIncreaseComparision = ((Integer) (o1.getPrice ( ))).compareTo ( o2.getPrice ( ) );
            if (priceIncreaseComparision != 0) {
                return priceIncreaseComparision;
            }
            return o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) );
        } );
        System.out.println ( "Collection sorts by Order price in increase order and User city: " );
        orders.forEach ( System.out::print );
        System.out.println();

        orders.sort ( ( o1, o2 ) -> {
            int itemNameComparision = o1.getItemName ( ).compareTo ( o2.getItemName ( ) );
            if (itemNameComparision != 0) {
                return itemNameComparision;
            }
            int shopIdentificatorComparision = o1.getShopIdentificator ( ).compareTo ( o2.getShopIdentificator ( ) );
            if (shopIdentificatorComparision != 0) {
                return shopIdentificatorComparision;
            }
            return o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) );
        } );
        System.out.println ( "Collection sorts by Order item name and shop identifier and user city: " );
        orders.forEach ( System.out::print );
        System.out.println();

        List <Order> uniqueOrders = new ArrayList <> ( new HashSet <> ( orders ) );
        System.out.println ( "Collection without duplicates: " );
        uniqueOrders.forEach (System.out::print);
        System.out.println();

        List <Order> ordersWithPriceLessThan1500 = new ArrayList <> ( orders );
        ordersWithPriceLessThan1500.removeIf ( o -> o.getPrice ( ) < 1500 );
        System.out.println ( "Collection without items where price more than 1500: " );
        ordersWithPriceLessThan1500.forEach (System.out::print);
        System.out.println();

        List <Order> ordersUSD = new ArrayList <> ( orders );
        ordersUSD.removeIf ( o -> o.getCurrency ( ) != Currency.USD );
        System.out.println ( "Orders in USD: " );
        ordersUSD.forEach (System.out::print);
        System.out.println();

        List <Order> ordersUAH = new ArrayList <> ( orders );
        ordersUAH.removeAll ( ordersUSD );
        System.out.println ( "Orders in UAH: " );
        ordersUAH.forEach (System.out::print);
        System.out.println();
    }
}
