
package DatabaseManager.Factory.Entity;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Factory.EntityFactory;
import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.CreditCard;
import HotelSystem.Entities.Entity;
import java.sql.ResultSet;
import java.util.List;


public class CreditCardFactory extends EntityFactory{

    private   Repository repository = null;
    
    @Override
    public Entity createEntity(String... parameters) throws Exception {
        ResultSet resultSet = null;
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
        String query = "SELECT name_on_card, credit_card_number, cvv, expiry FROM User " +
                "WHERE user_id =" + parameters[0] + ";";
        resultSet = repository.queryDatabaseStatement(query);
        CreditCard creditCard = new CreditCard();
        while (resultSet.next()){
            creditCard.setNameOnCard(resultSet.getString("name_on_card"));
            creditCard.setCreditCardNum(resultSet.getString("credit_card_number"));
            creditCard.setCVNum(resultSet.getString("cvv"));
            creditCard.setExpiryDate(resultSet.getString("expiry"));
        }  
        
        return creditCard;
    }

    @Override
    public List<Entity> createEntityList(String... parameters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
