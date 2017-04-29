package module9.homework;


import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static module9.homework.Currency.*;

class Sort {
    private Sort() {
    }

    public static void sortByPriceInDecreaseOrder(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getPrice, reverseOrder()));
    }

    public static void sortByPriceAndUserCity(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getPrice)
                .thenComparing(o -> o.getUser().getCity()));
    }

    public static void sortByItemAndShopIdAndUserCity(List<Order> orders) {
        orders.sort(Comparator
                .comparing(Order::getItemName)
                .thenComparing(Order::getShopIdentificator)
                .thenComparing(o -> o.getUser().getCity()));
    }

    public static List<Order> getUniqueOrders(List<Order> orders) {
        return orders.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Order> getOrdersWithPriceLessThan1500(List<Order> orders) {
        return orders.stream()
                .filter((Order o) -> o.getPrice() >= 1500)
                .collect(Collectors.toList());
    }

    public static List <Order> getOrdersWithSomeCurrency ( List <Order> orders, Currency currency ) {
        return orders.stream()
                .filter(o -> o.getCurrency() == currency)
                .collect(Collectors.toList());
    }
    public static Map<String, List <Order>> groupingByUniqueCities (List <Order> orders ) {
        return orders.stream()
                .collect( Collectors.groupingBy(order -> order.getUser ().getCity ()));
    }

    public static boolean IfContainLastName ( List <Order> orders, String lastName ) {
        return (orders.stream ( ).anyMatch ( order -> Objects.equals(order.getUser().getLastName(), lastName)));
    }

    public static void deleteOrdersInUSD ( List <Order> orders ) {
        orders.removeIf ( order -> order.getCurrency ( ) == USD );
    }
}
