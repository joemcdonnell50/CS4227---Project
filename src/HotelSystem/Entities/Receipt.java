package Payment;

/**
 *
 * @author Owner
 */
public class Receipt {

    private String UserName, hotel, roomType, NbOfGuests, dateArrival;
    private int NbOfNights, uniqueNumber;
    private double Total, servicePrice;
    //private LocalDate ye;

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getUsername() {
        return UserName;
    }

    public void setUsername(String UserName) {
        this.UserName = UserName;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getNbOfGuests() {
        return NbOfGuests;
    }

    public void setNbOfGuests(String NbOfGuests) {
        this.NbOfGuests = NbOfGuests;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public int getNbOfNights() {
        return NbOfNights;
    }

    public void setNbOfNights(int NbOfNights) {
        this.NbOfNights = NbOfNights;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public String FormatReceipt() {

        String Receipt = String.format("Hello " + getUsername() + "\n"
                + "Receipt for reservation number " + getUniqueNumber() + "\n"
                + "Hotel : " + "\t" + getHotel() + "\n"
                + "Roomtype : " + "\t" + getRoomType() + "\n"
                + "Number of Guests : " + "\t" + getNbOfGuests() + "\n"
                + "Date of Arrival : " + "\t" + getDateArrival() + "\n"
                + "Number of Nights : " + "\t" + getNbOfNights() + "\n"
                + "Cost of Services :" + "\t" + getServicePrice() + "\n"
                + "Your total cost is " + "\t" + Total
        );

        return Receipt;
    }

}
