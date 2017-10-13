
package DatabaseManager;


public class RepositoryFactory {
    
    public static Repository getRepository(DatabaseConfig databaseConfig, String type) throws Exception{
        if (type.equalsIgnoreCase("mysql")){
            return new MySQLRepository(databaseConfig);
        }
        else{
            return null;
        }
    }
}
