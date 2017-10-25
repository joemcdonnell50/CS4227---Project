
package DatabaseManager.Factory;

import DatabaseManager.DatabaseConfig;
import DatabaseManager.Repository.MySQLRepository;
import DatabaseManager.Repository.Repository;


public class RepositoryFactory {
    
    public static Repository getRepository(DatabaseConfig databaseConfig) throws Exception{
        if (databaseConfig.getDatabaseType().equalsIgnoreCase("mysql")){
            return new MySQLRepository(databaseConfig);
        }
        else{
            return null;
        }
    }
}
