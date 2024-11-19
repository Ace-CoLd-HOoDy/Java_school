import java.util.ArrayList;
import java.util.list;

public class Hotel{
    private String name;
    private String address;
    private List<Room> rooms;

public Hotel(String name, String address){
    this.name = name;
    this.address = address;
    this.rooms = new ArrayList<>();
}

public void addRoom(Room room){
    rooms.add(room);
}

public List<Room> getavaliableRooms(){
    List<Room> avaliableRooms = new ArrayList<>;
    for(Room room : rooms){
        if(room.isAvaliable()){
            avaliableRooms.add(room);
        }
    }
    return avaliableRooms;
}

public boolean bookRoom(Booking booking){
    for(Room room : rooms){
        if(room.getRoomNumber() == booking.getRoomNumber() && room.isAvaliable()){
            room.setAvaliable(false);
            return true;
        }
    }
    return false;
}
}
