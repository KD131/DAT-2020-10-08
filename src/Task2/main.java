package Task2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Room r1 = new Room(4,1, 3 , 2);
        Room r2 = new Room(1, 1, 2, 0);
        Room r3 = new Room(20, 2, 0, 0);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building b1 = new Building(rooms, 6, 4, true);

        System.out.println(countLamps(b1));

        if(b1.getNumberOfFloors() > b1.rooms.size())
        {
            System.out.println("This is an odd building.");
        }
    }

    public static int countLamps(Building b)
    {
        int count = 0;
        for(Room r : b.getRooms())
        {
            count += r.getNumberOfLamps();
        }
        return count;
    }
}
