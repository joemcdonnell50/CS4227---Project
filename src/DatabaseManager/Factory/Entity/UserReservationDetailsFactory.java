
package DatabaseManager.Factory.Entity;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.Entity;
import java.sql.ResultSet;
import java.util.List;

public class UserReservationDetailsFactory extends EntityFactory{
    
    private Repository repository;
    
    
    public Entity createEntity(String [] parameters) throws Exception{
        ResultSet resultSet = null;
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        resultSet = repository.queryDatabaseStatement(null);
        
        
        return null;
    }

    @Override
    public List<Entity> createEntityList(String query, String[] parameters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
