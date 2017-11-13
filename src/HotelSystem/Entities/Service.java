package HotelSystem.Entities;


public class Service implements Entity{
    /*
    private int service_id;
    private String service_name;
    private double price;
    */


    private int reservationID;
    private int hasWifi;
    private int hasSauna;
    private int hasHammam;
    private int hasPool;
    private int totalServicePrice;
    
    
    public Service(int reservationID, int hasWifi, int hasSauna, int hasHammam, int hasPool, int totalServicePrice){
        super();
        this.reservationID = reservationID;
        this.hasWifi = hasWifi;
        this.hasSauna = hasSauna;
        this.hasHammam = hasHammam;
        this.hasPool = hasPool; 
        this.totalServicePrice = totalServicePrice;
    }

    public int getReservationID() {
        return reservationID;
    }

    public int getHasWifi() {
        return hasWifi;
    }

    public int getHasSauna() {
        return hasSauna;
    }

    public int getHasHammam() {
        return hasHammam;
    }

    public int getHasPool() {
        return hasPool;
    }
    
    public int getTotalServicePrice() {
        return hasPool;
    }
    
    
}
