/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.PanelOperations;

//import HotelSystem.Entities.Payment;
import HotelSystem.Entities.Reservation;
import HotelSystem.Entities.User;
import HotelSystem.Payment.Context;
import HotelSystem.Payment.Discount10;
import HotelSystem.Payment.Discount20;
import HotelSystem.Payment.Discount30;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author Owner
 */
public class MakePaymentOperation {
    private double total;
    
    public static void makePaymentOperation() throws Exception {
        
       
    }
    public double getTotal() {
        return total;
    }

   
    public void setTotal(double total) {
        this.total = total;
    }

    public double GetPriceOfRoom(String hotel, String Roomtype) {
        double PricePerNight = 30;
        return PricePerNight;
    }
    public void CalculateCost() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate Adate = LocalDate.parse(Reservation.getReservationInstance().getArrival_date(), formatter); 
        LocalDate Cdate = LocalDate.parse(Reservation.getReservationInstance().getCheckout_date(), formatter);
        double PricePerNight = GetPriceOfRoom(Reservation.getReservationInstance().getHotel_name(), Reservation.getReservationInstance().getRoom_type());
        int daysOnWeekend = 0;
        long NumberofNight =  DAYS.between(Adate, Cdate);
        double servicePrice = 0;
        int NumberOfGuests = Reservation.getReservationInstance().getNumber_of_guests();
        for (int k = 0; k <= NumberofNight; k++) {
            String day = Adate.getDayOfWeek().toString();
            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                daysOnWeekend++;
            }
            Adate = Adate.plusDays(1);
        }
        double WeekendCost = ((PricePerNight / 100.0) * 25);
        double Cost = ((NumberofNight * PricePerNight) * NumberOfGuests) + (WeekendCost * daysOnWeekend) + servicePrice;
        int LoyaltyLevel = 1;
        User user = new User();
        LoyaltyLevel =user.getLoyalty_level();
        switch (LoyaltyLevel) {
            case 1:
                Context context = new Context(new Discount10());
                Cost = context.executeStrategy(Cost);
                break;
            case 2:
                Context contextB = new Context(new Discount20());
                Cost =contextB.executeStrategy(Cost);
                break;
            case 3:
                Context contextC = new Context(new Discount30());
                Cost =contextC.executeStrategy(Cost);
                break;
            default:
                break;
        }
        setTotal(Cost);
       System.out.println(Adate +" "+ Cdate+ " " +NumberofNight+ " " +Cost);

    }
    public void addToBill(double addedvalue) {
        this.total += addedvalue;

    }
        
}
