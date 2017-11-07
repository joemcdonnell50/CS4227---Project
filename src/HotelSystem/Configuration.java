
package HotelSystem;

import DatabaseManager.DatabaseConfig;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;

public class Configuration {
    
    public Configuration(){
        
    }
    
    public void initializeDatabaseConfig(){
        Properties properties = readPropertiesFile();
        DatabaseConfig dbConfig = new DatabaseConfig();
        dbConfig.setDatabaseType(properties.getProperty("databaseType"));
        dbConfig.setServerName(properties.getProperty("serverName"));
        dbConfig.setPortNumber(properties.getProperty("portNumber"));
        dbConfig.setDatabaseName(properties.getProperty("databaseName"));
        dbConfig.setUserName(properties.getProperty("userName"));
        dbConfig.setPassword(properties.getProperty("password"));
        dbConfig.setDatabaseConfigInstance(dbConfig);
    }
    
    public Properties readPropertiesFile(){
        Properties p = new Properties();
        InputStream input = null;
        try{

            input = new FileInputStream("C:\\Users\\Jamees\\Documents\\GitHub\\CS4227---Project\\src\\HotelSystem\\config.properties");

            

            p.load(input);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return p;
    }
}
