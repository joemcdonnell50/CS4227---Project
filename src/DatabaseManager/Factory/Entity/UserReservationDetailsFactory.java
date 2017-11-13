
package DatabaseManager.Factory.Entity;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.UserReservationDetails;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserReservationDetailsFactory extends EntityFactory{
    
    private Repository repository;
    static ResultSetMetaData meta;
    
    
    public Entity createEntity(String [] parameters) throws Exception{
        return null;
    }

    @Override
    public List<Entity> createEntityList(String... parameters) throws Exception {
        ResultSet resultSet = null;
        String query = "";
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        switch(Integer.valueOf(parameters[0])){
            case 0:
                query = "SELECT reservation_id, hotel_name, room_type, number_of_guests, arrival_date, checkout_date, services, services_price, price FROM UserReservations " + 
                        "WHERE user_id = " + parameters[1] + ";" ;
                break;
            case 1:
                System.out.println("User id " + parameters[1]);
                query = "SELECT reservation_id, hotel_name, room_type, number_of_guests, arrival_date, checkout_date, services, services_price, price FROM UserReservations " + 
                        "WHERE user_id = " + parameters[1] + " and arrival_date > " + "20/11/2017" + ";";
                break;
            default:
        }
        resultSet = repository.queryDatabaseStatement(query);
        meta = resultSet.getMetaData();
        
        List<Entity> userReservations = new ArrayList();
        
        
        while (resultSet.next()){
            UserReservationDetails details = new UserReservationDetails();
            details.setReservation_id(Integer.valueOf(resultSet.getString("reservation_id")));
            details.setHotel(resultSet.getString("hotel_name"));
            details.setRoomType(resultSet.getString("room_type"));
            details.setNumberofGuests(Integer.valueOf(resultSet.getString("number_of_guests")));
            details.setArrival_date(resultSet.getString("arrival_date"));
            details.setCheckout_date(resultSet.getString("checkout_date"));
            details.setServices(resultSet.getString("services"));
            details.setServicePrice(Double.valueOf(resultSet.getString("services_price")));
            details.setPrice(Double.valueOf(resultSet.getString("price")));
            userReservations.add(details);
            System.out.println("Reservation id " + Integer.valueOf(resultSet.getString("reservation_id")));
        }
        
        System.out.println("res id " + ((UserReservationDetails)userReservations.get(0)).getReservation_id());
        System.out.println("res id " + ((UserReservationDetails)userReservations.get(1)).getReservation_id());
       
        return userReservations;
    }
    
    
}
