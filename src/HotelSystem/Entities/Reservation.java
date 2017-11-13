package HotelSystem.Entities;

import java.util.Date;

public class Reservation implements Entity{
    
    private int reservation_id;
    private String user_name;
    private String hotel_name;
    private String room_type;
    private int number_of_guests;
    private String arrival_date;
    private String checkout_date;

    private String services;


    
   private static Reservation currentReservation;
    
    
 

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public void setNumber_of_guests(int number_of_guests) {
        this.number_of_guests = number_of_guests;
    }

    public void setArrival_date(String arrive_date) {
        this.arrival_date = arrive_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }
    
    public void setServices(String services){
        
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public int getNumber_of_guests() {
        return number_of_guests;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public String getCheckout_date() {
        return checkout_date;
    } 
    
    public static void setReservationInstance(Reservation currentReservation){
        Reservation.currentReservation = currentReservation;
    }
    
    public static Reservation getReservationInstance(){
        return currentReservation;
    }
}
