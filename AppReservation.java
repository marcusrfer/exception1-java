package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppReservation {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Room number: ");
        int room = sc.nextInt();
        System.out.print("Check In date: ");
        Date checkin = sdf.parse(sc.next());
        sc.nextLine();
        System.out.print("Check Out date: ");
        Date checkout = sdf.parse(sc.next());

        Date now = new Date();

        //check if checkout date is after check in date
        if (checkout.before(checkin)) {
            System.out.println("Error in Reservation: Checkout date can't be earlier than checkin date!");
        } else if (checkin.before(now) || checkout.before(now)) {
            System.out.println("Error in Reservation: Dates must be in the future!");
        } else {
            Reservation reserva = new Reservation(room, checkin, checkout);
            System.out.println(reserva);
            System.out.println();
            System.out.println("Enter date to update Dates");
            System.out.print("Check In date: ");
            checkin = sdf.parse(sc.next());
            sc.nextLine();
            System.out.print("Check Out date: ");
            checkout = sdf.parse(sc.next());
            String error = reserva.updateDates(checkin, checkout);
            if (error == null) {
                System.out.println(reserva);
            } else {
                System.out.println("Error in Reservation: " + error);
            }
        }
        sc.close();
    }
}
