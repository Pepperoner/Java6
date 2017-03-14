package module5.homework;

import java.time.LocalDate;
import java.time.Month;

import static module5.homework.Controller.apis;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        DAO[] dao = new DAO[]{new BookingComDAO(), new GoogleDAO(), new TripAdvisorDAO()};

        System.out.println("\tDB before changes: ");
        printAllDAO(dao);

        System.out.println("\tRequest rooms: ");
        printRoomArray(controller.requestRooms(500, 3, "Madrid", "Four Seasons"));
        printRoomArray(controller.requestRooms(300, 2, "Hilton", "New York"));
        printRoomArray(controller.requestRooms(200, 1, "Hyatt", "Kiev"));

        System.out.println("\tCheck DB BookingComDAO and GoogleDAO ");
        printRoomArray(controller.check(dao[0], dao[1]));
        System.out.println("\tCheck DB BookingComDAO and TripAdvisorDAO");
        printRoomArray(controller.check(dao[0], dao[2]));
        System.out.println("\tCheck DB GoogleDAO and TripAdvisorDAO");
        printRoomArray( controller.check(dao[1], dao[2]));


        Room roomForDelete = new Room(1, 100, 2, LocalDate.of(2017, Month.MARCH, 12), "Halchion", "London");
        System.out.println("\tDB after delete room: ");
        Controller.deleteFromAllDAO(roomForDelete, dao);
        printAllDAO(dao);

        Room roomForSave = new Room(23, 400, 3, LocalDate.of(2017, Month.APRIL, 15), "Hyatt", "Kiev");
        System.out.println("\tDB after save room: ");
        Controller.saveToAllDAO(roomForSave, dao);
        printAllDAO(dao);

        long id = 2;
        System.out.println("\tFind rooms by id = ");
        Controller.findByIdInAllDAO(id, dao);

        Room roomForUpdate = new Room(2, 350, 1, LocalDate.of(2017, Month.MAY, 1), "Ritz", "Toronto");
        Controller.updateToAllDAO(roomForUpdate, dao);
        System.out.println("\tDB after update room: ");
        printAllDAO(dao);


        System.out.println("Find rooms:");
        printRoomArray(apis[0].findRooms(500, 3, "Madrid", "Four Seasons"));
        printRoomArray(apis[0].findRooms(100, 2, "London", "Marriott"));

    }

    private static void printAllDAO(DAO[] dao) {
        for (DAO aDao : dao) {
            System.out.println("\t" + aDao.getClass().getSimpleName());
            printRoomArray(aDao.getAll());
        }
    }

    private static void printRoomArray(Room[] rooms) {
        for (Room room : rooms) {
            if (room != null)
                System.out.println(room);
        }
    }

}
