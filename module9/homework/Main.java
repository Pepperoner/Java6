package module9.homework;

import java.util.*;

import static module9.homework.Currency.*;
import static module9.homework.Sort.*;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Tanya", "Pleshka", "Kyiv", 20000);
        User user2 = new User("Alex", "Rak", "Kharkiv", 15000);
        User user3 = new User("Vladimir", "Ananyev", "Dnepropetrovsk", 2050);
        User user4 = new User("Andrey", "Ponomarenko", "Kyiv", 3200);
        User user5 = new User("Sasha", "Lebed", "Lviv", 4500);
        User user6 = new User("Viktor", "Falchenko", "Lviv", 3200);
        User user7 = new User("Andrey", "Berezin", "Kharkiv", 20000);
        User user8 = new User("Alexandr", "Lahutin", "Kyiv", 15000);
        User user9 = new User("Vlad", "Piskunov", "Rivne", 2050);
        User user10 = new User("Vitalii", "Proskura", "Rivne", 2050);

        List<Order> orders = new ArrayList<>(10);

        Order order1 = new Order(50, USD, "Shoes blue model 345 s.41", "Miraton", user1);
        Order order2 = new Order(1500, UAH, "Shoes blue model 345 s.41", "Miraton", user6);
        Order order3 = new Order(1100, UAH, "Bag model 45", "Ardo", user3);
        Order order4 = new Order(1850, UAH, "Shoes blue model 345 s.41", "Miraton", user2);
        Order order5 = new Order(55, USD, "Dress yellow model 04 S", "Otto", user5);
        Order order6 = new Order(1700, UAH, "Shoes blue model 345 s.41", "Miraton", user2);
        Order order7 = new Order(48, USD, "T-shirt model 25 L", "Oggi", user8);
        Order order8 = new Order(48, USD, "T-shirt model 25 L", "Oggi", user7);
        Order order9 = new Order(48, USD, "T-shirt model 25 L", "Oggi", user8);
        Order order10 = new Order(100, UAH, "Pork meet", "Silpo", user10);

        orders.addAll(Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8, order9, order10));
        System.out.println("Collection of orders: ");
        orders.forEach(System.out::print);
        System.out.println();

        System.out.println("Collection sorts by Order price in decrease order: ");
        sortByPriceInDecreaseOrder(orders);
        orders.forEach(System.out::print);
        System.out.println();

        System.out.println ("Collection sorts by Order price in increase order and User city: " );
        sortByPriceAndUserCity ( orders );
        orders.forEach ( System.out::print );
        System.out.println();

        System.out.println ( "Collection sorts by Order item name and shop identifier and user city: " );
        sortByItemAndShopIdAndUserCity ( orders );
        orders.forEach ( System.out::print );
        System.out.println();

        System.out.println ( "Orders without duplicates (orders are equal when equals all Orders fields except id): " );
        List <Order> uniqueOrders = getUniqueOrders ( orders );
        uniqueOrders.forEach ( System.out::print );
        System.out.println();

        System.out.println ( "Orders with price more than or equal 1500: " );
        List <Order> ordersWithPriceLessThan1500 = getOrdersWithPriceLessThan1500 ( orders );
        ordersWithPriceLessThan1500.forEach ( System.out::print );
        System.out.println();

        System.out.println ( "Orders in USD: " );
        List <Order> ordersUSD = getOrdersWithSomeCurrency ( orders, USD );
        ordersUSD.forEach ( System.out::print );
        System.out.println();

        System.out.println ( "Orders in UAH: " );
        List <Order> ordersUAH = getOrdersWithSomeCurrency ( orders, UAH );
        ordersUAH.forEach ( System.out::print );
        System.out.println();

        Map<String, List <Order>> uniqueCitiesMap = groupingByUniqueCities ( orders );
        uniqueCitiesMap.forEach ( ( key, value ) -> System.out.println ( key + ": " + value ) );
        System.out.println();

        String lastName = "Petrov";
        System.out.println ( "Orders " + (IfContainLastName ( orders, lastName ) ?
                "" : "don't ") + "contain order with last name " + lastName );
        System.out.println();

        System.out.println ( "Delete orders in USD: " );
        deleteOrdersInUSD ( orders );
        orders.forEach ( System.out::print );
    }
}