package HotelSystem.Entities;


public class Service extends Entity{
    
    private int service_id;
    private String service_name;
    private double price;

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }
 
    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getService_id() {
        return service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public double getPrice() {
        return price;
    }
    
    
}
