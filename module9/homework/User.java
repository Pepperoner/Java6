package module9.homework;


public class User {

    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User ( String firstName, String lastName, String city, int balance ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getCity () {
        return city;
    }

    public void setCity ( String city ) {
        this.city = city;
    }

    public int getBalance () {
        return balance;
    }

    public void setBalance ( int balance ) {
        this.balance = balance;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (getBalance() != user.getBalance()) return false;
        return (getFirstName() != null ? getFirstName().equals(user.getFirstName()) : user.getFirstName() == null)
                && (getLastName() != null ? getLastName().equals(user.getLastName()) : user.getLastName() == null)
                && (getCity() != null ? getCity().equals(user.getCity()) : user.getCity() == null);
    }

    @Override
    public int hashCode () {
        int result = getFirstName ( ) != null ? getFirstName ( ).hashCode ( ) : 0;
        result = 31 * result + (getLastName ( ) != null ? getLastName ( ).hashCode ( ) : 0);
        result = 31 * result + (getCity ( ) != null ? getCity ( ).hashCode ( ) : 0);
        result = 31 * result + getBalance ( );
        return result;
    }
}
