package module5.homework;

import java.util.Arrays;
import java.util.Objects;

public class TripAdvisorAPI implements API {

    private DAO dao = new DAOImpl();
    public Room[] rooms = dao.getAll();

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] lookingForRoomsArray = new Room[5];
        Room lookingForRoom = new Room(0, price, persons, null, hotel, city);

        for (Room room : rooms) {
            if (lookingForRoom.equals(room) && Objects.equals(room.getHotelName(), hotel))
                lookingForRoomsArray = addElementToArray(lookingForRoomsArray, room);
        }
        System.out.println(lookingForRoom);
        return lookingForRoomsArray;
    }

    private Room[] addElementToArray(Room[] roomsArray, Room newRoomsMember) {

        Room[] newRoomsArray = Arrays.copyOf(roomsArray, roomsArray.length + 1);
        newRoomsArray[newRoomsArray.length - 1] = newRoomsMember;
        return newRoomsArray;
    }

}
