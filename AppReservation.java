package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppReservation {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Room number: ");
            int room = sc.nextInt();
            System.out.print("Check In date: ");
            Date checkin = sdf.parse(sc.next());
            sc.nextLine();
            System.out.print("Check Out date: ");
            Date checkout = sdf.parse(sc.next());

            Reservation reserva = new Reservation(room, checkin, checkout);
            System.out.println(reserva);

            System.out.println();
            System.out.println("Enter date to update Dates");
            System.out.print("Check In date: ");
            checkin = sdf.parse(sc.next());
            sc.nextLine();
            System.out.print("Check Out date: ");
            checkout = sdf.parse(sc.next());
            reserva.updateDates(checkin, checkout);
        } catch (ParseException e) {
            System.out.println("Invalid Date Format!");
        } catch (ReservationException e) {
            System.out.println("Error in Reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected Error!");
        }
    }
}
