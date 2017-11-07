
package DatabaseManager.Factory.Entity;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.UserReservationDetails;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class UserReservationDetailsFactory extends EntityFactory{
    
    private Repository repository;
    static ResultSetMetaData meta;
    
    
    public Entity createEntity(String [] parameters) throws Exception{
        return null;
    }

    @Override
    public List<Entity> createEntityList(String[] parameters) throws Exception {
        ResultSet resultSet = null;
        
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        int userId = 0;
        String query = "SELECT hotel_name, room_type, number_of_guests, arrival_date, checkout_date, services, tours, services_price, price FROM UserReservations " + 
                "WHERE user_id = (SELECT user_id FROM User WHERE user_name = '" + parameters[0] + "');" ;
        resultSet = repository.queryDatabaseStatement(query);
        meta = resultSet.getMetaData();
        
        List<Entity> userReservations = new ArrayList();
        UserReservationDetails details = new UserReservationDetails();
        
        while (resultSet.next()){
            details.setHotel(resultSet.getString("hotel_name"));
            details.setRoomType(resultSet.getString("room_type"));
            details.setNumberofGuests(Integer.valueOf(resultSet.getString("number_of_guests")));
            details.setArrival_date(resultSet.getString("arrival_date"));
            details.setCheckout_date(resultSet.getString("checkout_date"));
            details.setServices(resultSet.getString("services"));
            details.setTours(resultSet.getString("tours"));
            details.setServicePrice(Double.valueOf(resultSet.getString("services_price")));
            details.setPrice(Double.valueOf(resultSet.getString("price")));
            userReservations.add(details);
        }
       
        return userReservations;
    }
    
    
}
