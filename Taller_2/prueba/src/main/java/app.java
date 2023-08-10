import java.util.*;

public class HotelReservationSystem {
    public static void main(String[] args) {
        // Create a list of hotels
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Hotel Hilton", "123 Main Street, Anytown, CA 91234", "555-555-5555", Arrays.asList(
                new Room("King", 100.00, true, false),
                new Room("Queen", 75.00, true, true),
                new Room("Twin", 50.00, false, true)
        )));
        hotels.add(new Hotel("Hotel Marriott", "456 Elm Street, Anytown, CA 91234", "555-555-5556", Arrays.asList(
                new Room("King", 125.00, true, false),
                new Room("Queen", 95.00, true, true),
                new Room("Twin", 70.00, false, true)
        )));

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the user's company name
        System.out.println("What is the name of your company?");
        String companyName = scanner.nextLine();

        // Get the user's start date
        System.out.println("What is your start date? (YYYY-MM-DD)");
        String startDate = scanner.nextLine();

        // Get the user's end date
        System.out.println("What is your end date? (YYYY-MM-DD)");
        String endDate = scanner.nextLine();

        // Get the number of rooms the user needs
        System.out.println("How many rooms do you need?");
        int numberOfRooms = scanner.nextInt();

        // Get the names and IDs of the people who will be staying in the rooms
        List<Person> guests = new ArrayList<>();
        for (int i = 0; i < numberOfRooms; i++) {
            System.out.println("What is the name of the person staying in room " + (i + 1) + "?");
            String name = scanner.nextLine();
            System.out.println("What is the ID of the person staying in room " + (i + 1) + "?");
            String id = scanner.nextLine();
            guests.add(new Person(name, id));
        }

        // Search for available rooms at each hotel
        List<Room> availableRooms = new ArrayList<>();
        for (Hotel hotel : hotels) {
            List<Room> hotelRooms = hotel.getRooms();
            for (Room room : hotelRooms) {
                if (room.isAvailable(startDate, endDate)) {
                    availableRooms.add(room);
                }
            }
        }

        // If no rooms are available, print an error message and exit
        if (availableRooms.size() == 0) {
            System.out.println("No rooms are available for the dates you requested.");
            System.exit(0);
        }

        // Assign rooms to guests
        for (int i = 0; i < numberOfRooms; i++) {
            Room room = availableRooms.get(i);
            guests.get(i).setRoom(room);
        }

        // Print a report of the reservations
        System.out.println("Reservation report for " + companyName);
        for (Person guest : guests) {
            System.out.println("Name: " + guest.getName());
            System.out.println("ID: " + guest.getId());
            System.out.println("Room: " + guest.getRoom().getName());
            System.out.println();
        }
    }
}

class Hotel {
    String name;
    String address;
    String phone;
    List<Room> rooms;

    public Hotel(String name, String address, String phone, List<Room> rooms) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
