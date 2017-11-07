
package HotelSystem.Entities;


public class UserReservationDetails extends Entity{
    
    private int user_id;
    private int reservation_id;
    private String hotel;
    private String room_type;
    private int number_of_guests;
    private String arrival_date;
    private String checkout_date;
    private String services;
    private String tours;
    private Double services_price;
    private Double price;
    

    public double getServicePrice() {
        return services_price;
    }

    public void setServicePrice(double ServicePrice) {
        this.services_price = ServicePrice;
    }

    public void setNumberofGuests(int number_of_guests) {
        this.number_of_guests = number_of_guests;
    }
    
    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRoomType() {
        return room_type;
    }

    public void setRoomType(String RoomType) {
        this.room_type = RoomType;
    }

    public int getNumberOfGuests() {
        return number_of_guests;
    }

    public void setUser_id(int user_id){
        this.user_id = user_id;
    }
    
    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setTours(String tours) {
        this.tours = tours;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getUser_id() {
        return user_id;
    }
    
    public int getReservation_id() {
        return reservation_id;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public String getServices() {
        return services;
    }

    public String getTours() {
        return tours;
    }

    public double getPrice() {
        return price;
    }
     
}
