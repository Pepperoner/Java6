package module9.homework;

public class Order {

    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    Order(int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }

    public Currency getCurrency () { return currency; }

    public void setCurrency ( Currency currency ) {
        this.currency = currency;
    }

    public String getItemName () {
        return itemName;
    }

    public void setItemName ( String itemName ) {
        this.itemName = itemName;
    }

    public String getShopIdentificator () {
        return shopIdentificator;
    }

    public void setShopIdentificator ( String shopIdentificator ) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return getPrice() == order.getPrice() && getCurrency() == order.getCurrency()
                && (getItemName() != null ? getItemName().equals(order.getItemName()) : order.getItemName() == null)
                && (getShopIdentificator() != null ? getShopIdentificator().equals(order.getShopIdentificator()) : order.getShopIdentificator() == null)
                && (getUser() != null ? getUser().equals(order.getUser()) : order.getUser() == null);
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
                " price=" + price +
                " currency=" + currency +
                " itemName='" + itemName + '\'' +
                " shopIdentificator='" + shopIdentificator + '\'' +
                " user=" + user.getLastName ( ) + ", " + user.getCity ( ) +
                '}' + "\n";
    }
}
