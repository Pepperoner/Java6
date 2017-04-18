package module7.homework;


public class Order implements Comparable <Order> {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int compareTo ( Order o ) {
        int priceComparision = ((Integer) (getPrice ( ))).compareTo ( o.getPrice ( ) );
        if (priceComparision != 0) return priceComparision;

        int itemNameComparision = getItemName ().compareTo ( o.getItemName () );
        if(itemNameComparision != 0) return itemNameComparision;

        int shopIdentificatorComparision = getShopIdentificator ().compareTo ( o.getShopIdentificator () );
        if(shopIdentificatorComparision != 0) return shopIdentificatorComparision;

        int userComparision = getUser ().compareTo ( o.getUser () );
        if (userComparision != 0) return userComparision;

        return getCurrency ().compareTo ( o.getCurrency () );
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (getPrice() != order.getPrice()) return false;
        if (getCurrency() != order.getCurrency()) return false;
        return (getItemName() != null ? getItemName().equals(order.getItemName()) : order.getItemName() == null) && (getShopIdentificator() != null ? getShopIdentificator().equals(order.getShopIdentificator()) : order.getShopIdentificator() == null) && (getUser() != null ? getUser().equals(order.getUser()) : order.getUser() == null);
    }

    @Override
    public int hashCode () {
        int result = getPrice ( );
        result = 31 * result + (getCurrency ( ) != null ? getCurrency ( ).hashCode ( ) : 0);
        result = 31 * result + (getItemName ( ) != null ? getItemName ( ).hashCode ( ) : 0);
        result = 31 * result + (getShopIdentificator ( ) != null ? getShopIdentificator ( ).hashCode ( ) : 0);
        result = 31 * result + (getUser ( ) != null ? getUser ( ).hashCode ( ) : 0);
        return result;
    }

    @Override
    public String toString () {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user.getLastName ( ) + ", " + user.getCity ( ) +
                '}' + "\n";
    }
}
