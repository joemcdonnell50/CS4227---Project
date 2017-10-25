
package DatabaseManager.Factory.Entity;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.Reservation;
import java.sql.ResultSet;
import java.util.List;


public class ReservationFactory extends EntityFactory{

    private   Repository repository = null;
    
    public Entity createEntity(String query, String [] parameters) throws Exception{
        ResultSet resultSet = null;
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        resultSet = repository.queryDatabaseStatement(null);
        
        Reservation reservationEntity = new Reservation();
        reservationEntity.setUser_name(resultSet.getString("user_name"));
        reservationEntity.setHotel_name(resultSet.getString("hotel_name"));
        reservationEntity.setRoom_type(resultSet.getString("room_type"));
        reservationEntity.setNumber_of_guests(Integer.valueOf(resultSet.getString("number_of_guests")));
        reservationEntity.setArrival_date(resultSet.getString("arrival_date"));
        reservationEntity.setCheckout_date(resultSet.getString("checkout_date"));
        
        resultSet.close();
        return reservationEntity;
    }

    @Override
    public List<Entity> createEntityList(String query, String[] parameters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
