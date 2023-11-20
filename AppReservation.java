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
        Date chkin = sdf.parse(sc.next());
        sc.nextLine();
        System.out.print("Check Out date: ");
        Date chkout = sdf.parse(sc.next());

        Date now = new Date();

        //check if checkou date is after check in date
        if (chkout.before(chkin)) {
            System.out.println("Error Reservation: checkout date can't be earlier than checkin date!");
        } else if (chkin.before(now) || chkout.before(now)) {
            System.out.println("Error Reservation: Dates must be in the future!");
        } else {
            Reservation reserva = new Reservation(room, chkin, chkout);
            System.out.println(reserva);

            System.out.println();
            System.out.println("Enter date to update Dates");
            System.out.print("Check In date: ");
            chkin = sdf.parse(sc.next());
            sc.nextLine();
            System.out.print("Check Out date: ");
            chkout = sdf.parse(sc.next());


            if (chkout.before(chkin)) {
                System.out.println("Error Reservation: checkout date can't be earlier than checkin date!");
            } else if (chkin.before(now) || chkout.before(now)) {
                System.out.println("Error Reservation: Dates must be in the future!");
            } else {
                reserva.updateDates(chkin, chkout);
                System.out.println(reserva);
            }
        }
        sc.close();
    }

}
