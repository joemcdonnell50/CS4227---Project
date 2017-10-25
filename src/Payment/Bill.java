package Payment;

import Services.Hotel;

import Reservation.ReservationSystem;
import Services.Room;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

/**
 *
 * @author Owner
 */
public class Bill implements BillInterface {

    //Factory method for Bill
    public static Bill create() {
        return new Bill();
    }

    //ReservationSystem rs= new ReservationSystem();
    public double total;

    private Bill() {

    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public void setTotal(double total) {
        this.total = total;
    }

    public double GetPriceOfRoom(String hotel, String Roomtype) {
        int i = 0;
        int indexHotel = 0;
        for (Hotel h : ReservationSystem.getInstance().getHotels()) {
            if (h.getLocation().equals(hotel)) {
                indexHotel = i;
            }
            i++;
        }
        int j = 0;
        int indexRoom = 0;
        for (Room r : ReservationSystem.getInstance().getHotels().get(indexHotel).getRooms()) {
            if (r.getType().equals(Roomtype)) {
                indexRoom = j;
            }
            j++;
        }
        double PricePerNight = ReservationSystem.getInstance().getHotels().get(indexHotel).getRooms().get(indexRoom).getPricePerNight();
        return PricePerNight;
    }

    public void CalculateCost(String hotel, String Roomtype, String NbOfGuests, String DateofArrival, int NbOfNights, int UReservation, double servicePrice) {
        double PricePerNight = GetPriceOfRoom(hotel, Roomtype);
        int daysOnWeekend = 0;
        int NumberofNight = NbOfNights;
        int NumberOfGuests = Integer.parseInt(NbOfGuests);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate date = LocalDate.parse(DateofArrival, formatter);
        for (int k = 0; k <= NumberofNight; k++) {
            String day = date.getDayOfWeek().toString();
            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                daysOnWeekend++;
            }
            date = date.plusDays(1);
        }
        double WeekendCost = ((PricePerNight / 100.0) * 25);
        double Cost = ((NumberofNight * PricePerNight) * NumberOfGuests) + (WeekendCost * daysOnWeekend) + servicePrice;
        setTotal(Cost);

    }
    public void addToBill(double addedvalue) {
        this.total += addedvalue;

    }
}
