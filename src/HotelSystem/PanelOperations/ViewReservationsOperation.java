
package HotelSystem.PanelOperations;
import DatabaseManager.Factory.EntityFactory;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.User;
import HotelSystem.Entities.UserReservationDetails;
import java.util.List;

public class ViewReservationsOperation {
    public static Object[][] populateTable() throws Exception{
        EntityFactory reservationDetails = EntityFactory.getEntityFactory("userreservationdetails");
        List<Entity> userReservations = reservationDetails.createEntityList(User.getLoggedUser().getUser_name());
        
        Object[][] data = new Object[userReservations.size()][9];
        int rCount = 0;
        for (Entity e : userReservations){
            data[rCount][0] = ((UserReservationDetails) e).getHotel();
            data[rCount][1] = ((UserReservationDetails) e).getRoomType();
            data[rCount][2] = ((UserReservationDetails) e).getNumberOfGuests();
            data[rCount][3] = ((UserReservationDetails) e).getArrival_date();
            data[rCount][4] = ((UserReservationDetails) e).getCheckout_date();
            data[rCount][5] = ((UserReservationDetails) e).getServices();
            data[rCount][6] = ((UserReservationDetails) e).getTours();
            data[rCount][7] = ((UserReservationDetails) e).getServicePrice();
            data[rCount][8] = ((UserReservationDetails) e).getPrice();
            rCount++;
        }
        
        return data;
        
    }
}
