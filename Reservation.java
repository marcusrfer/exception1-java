package excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    public Reservation(int roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public int getDuration(){
        long difms = checkOut.getTime() - checkIn.getTime();
        return (int) TimeUnit.DAYS.convert(difms, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkin, Date checkout){
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Room: " + roomNumber +
                ", CheckIn: " + sdf.format(checkIn) +
                ", CheckOut: " + sdf.format(checkOut) +
                ", "+getDuration() + " nights.";
    }
}
