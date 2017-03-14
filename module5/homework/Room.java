package module5.homework;

import java.time.LocalDate;
import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private LocalDate dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, LocalDate dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
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

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public LocalDate getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(LocalDate dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", available from=" + dateAvailableFrom +
                ", hotel='" + hotelName + '\'' +
                ", city='" + cityName + '\'' +
                '}';
    }

    public boolean equalsForAllFields(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (price != room.price) return false;
        if (persons != room.persons) return false;
        if (dateAvailableFrom != null ? !dateAvailableFrom.equals(room.dateAvailableFrom) : room.dateAvailableFrom != null)
            return false;
        if (hotelName != null ? !hotelName.equals(room.hotelName) : room.hotelName != null) return false;
        return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;
    }
}
