
package DatabaseManager.Factory.Entity;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.User;
import java.sql.ResultSet;
import java.util.List;


public class UserFactory extends EntityFactory{
    
    private Repository repository;
    private ResultSet resultSet;
    private String query;
    
    // parameters = user_name, password
    public Entity createEntity(String... parameters) throws Exception{
        ResultSet resultSet = null;
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        query = "SELECT user_name, password, first_name, last_name, email_address, loyalty_level FROM User " + 
                "WHERE user_name = '" + parameters[0] + "' AND password = '" + parameters[1] + "';";
        try{
            resultSet = repository.queryDatabaseStatement(query);
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
        User user = new User();
        while (resultSet.next()){
            user.setUser_name(parameters[0]); 
            user.setPassword(parameters[1]);
            user.setFirst_name(resultSet.getString("first_name"));
            user.setLast_name(resultSet.getString("last_name"));
            user.setEmail_address(resultSet.getString("email_address"));
            user.setLoyalty_level(Integer.valueOf(resultSet.getString("loyalty_level")));
            System.out.println(user.getUser_name());
            System.out.println(user.getPassword());
            System.out.println(user.getFirst_name());
            System.out.println(user.getLast_name());
            System.out.println(user.getEmail_address());
            System.out.println(user.getLoyalty_level());
        }
        
        return user;
    }

    @Override
    public List<Entity> createEntityList(String... parameters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
