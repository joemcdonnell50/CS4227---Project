package DatabaseManager.Factory;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.Entity.CreditCardFactory;
import DatabaseManager.Repository.Repository;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Factory.Entity.UserFactory;
import DatabaseManager.Factory.Entity.ReservationFactory;
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
        else if (type.equalsIgnoreCase("userreservationdetails")){
            return new UserReservationDetailsFactory();
        }
        else if (type.equalsIgnoreCase("creditcard")){
            return new CreditCardFactory();
        }
        else{
            return null;
        }
    }
    
    public abstract Entity createEntity(String... parameters) throws Exception;
    
    public abstract List<Entity> createEntityList(String... parameters) throws Exception;
    
}
