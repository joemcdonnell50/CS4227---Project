
package DatabaseManager.Factory.Entity;

import DatabaseManager.Repository.Repository;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.RepositoryFactory;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.Service;
import java.sql.ResultSet;
import java.util.List;

public class ServiceFactory extends EntityFactory{
    
    private Repository repository = null;
    
    public Entity createEntity(String query, String [] parameters) throws Exception{
        ResultSet resultSet = null;
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        resultSet = repository.queryDatabaseStatement(null);
        
        Service service = new Service(); 
        
        return service;
    } 

    @Override
    public List<Entity> createEntityList(String query, String[] parameters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
