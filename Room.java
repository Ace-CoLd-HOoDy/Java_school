public class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean avaliable;

    public Room(int roomNumber, String roomType, double pricePerNight){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.PricePerNight = pricePerNight;
        this.avaliable = true;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public boolean isAvaliable(){
        return avaliable;
    }

    public void setAvaliable(boolean avaliable){
        this.avaliable = avaliable;
    }

    @Override
    public String toString(){
        return "Room"+roomNumber+"("+roomType+"), Price: "+pricePerNight;
    }
}