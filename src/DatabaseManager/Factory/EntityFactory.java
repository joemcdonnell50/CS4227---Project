package DatabaseManager.Factory;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Repository.Repository;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Factory.Entity.UserFactory;
import DatabaseManager.Factory.Entity.ReservationFactory;
import DatabaseManager.Factory.Entity.ServiceFactory;
import DatabaseManager.Factory.Entity.UserReservationDetailsFactory;
import HotelSystem.Entities.Entity;
import java.util.List;

public abstract class EntityFactory {
    
    public static EntityFactory getEntityFactory(String type){
        if (type.equalsIgnoreCase("user")){
            return new UserFactory();
        }
        else if (type.equalsIgnoreCase("reservation")){
            return new ReservationFactory();
        }
        else if (type.equalsIgnoreCase("service")){
            return new ServiceFactory();
        }
        else if (type.equalsIgnoreCase("userreservationdetails")){
            return new UserReservationDetailsFactory();
        }
        else{
            return null;
        }
    }
    
    public abstract Entity createEntity(String... parameters) throws Exception;
    
    public abstract List<Entity> createEntityList(String query, String [] parameters) throws Exception;
    
}
