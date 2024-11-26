import java.time.LocalDate;

public class Booking {
private static int bookingCounter = 1;

private int bookingId;
private String clientName;
private int roomNumber;
private LocalDate startDate;
private LocalDate endDate;

public Booking(String clientName, int roomNumber, LocalDate startDate, LocalDate endDate){
    this.bookingId = bookingCounter++;
    this.clientName = clientName;
    this.roomNumber = roomNumber;
    this.startDate = startDate;
    this.endDate = endDate;
}

public int getRoomNumber(){
    return roomNumber;
}

@Override
public String toString(){
    return "Booking ID: "+bookingId", Client: "+clientName", Room: "+roomNumber", Dates: "+startDate" to "+endDate
}
}