
package HotelSystem.Entities;


public class UserReservationDetails extends Entity{
    
    private int user_id;
    private int reservation_id;
    private String arrival_date;
    private String checkout_date;
    private String services;
    private String tours;
    private String hotel;
    private String NumberofGuests;
    private double ServicePrice;

    public double getServicePrice() {
        return ServicePrice;
    }

    public void setServicePrice(double ServicePrice) {
        this.ServicePrice = ServicePrice;
    }

    public String getNumberofGuests() {
        return NumberofGuests;
    }

    public void setNumberofGuests(String getNumberofGuests) {
        this.NumberofGuests = getNumberofGuests;
    }
    
    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public String getNumberOfGuests() {
        return NumberOfGuests;
    }

    public void setNumberOfGuests(String NumberOfGuests) {
        this.NumberOfGuests = NumberOfGuests;
    }
    private String RoomType;
    private String NumberOfGuests;
    private double price;

    

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
