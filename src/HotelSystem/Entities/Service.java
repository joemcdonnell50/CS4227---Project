package HotelSystem.Entities;


public class Service implements Entity{
    /*
    private int service_id;
    private String service_name;
    private double price;
    */


    private int reservationID;
    private boolean hasWifi;
    private boolean hasSauna;
    private boolean hasHammam;
    private boolean hasPool;
    private int totalServicePrice;
    
    private static Service serviceInstance;
    
    
    
    
    public Service(int reservationID, boolean hasWifi, boolean hasSauna, boolean hasHammam, boolean hasPool, int totalServicePrice){
        super();
        this.reservationID = reservationID;
        this.hasWifi = hasWifi;
        this.hasSauna = hasSauna;
        this.hasHammam = hasHammam;
        this.hasPool = hasPool; 
        this.totalServicePrice = totalServicePrice;
    }
    
    public void setServiceInstance(Service service){
        serviceInstance = service;
    }
    
    public static Service getServiceInstance(){
        return serviceInstance;
    }
    
    public void setReservationID(int reservationID){
        this.reservationID = reservationID;
    }

    public int getReservationID() {
        return reservationID;
    }

    public boolean getHasWifi() {
        return hasWifi;
    }

    public boolean getHasSauna() {
        return hasSauna;
    }

    public boolean getHasHammam() {
        return hasHammam;
    }

    public boolean getHasPool() {
        return hasPool;
    }
    
    public int getTotalServicePrice() {
        return totalServicePrice;
    }
    
    public String toString(){
        return "Service wifi" + hasWifi + ",sauna" + hasSauna + "hammam" + hasHammam + "Pool" + hasPool;
    }
    
    
}
