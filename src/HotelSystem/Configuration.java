
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
        DatabaseConfig.getInstance().setServerName(properties.getProperty("serverName"));
        DatabaseConfig.getInstance().setPortNumber(properties.getProperty("portNumber"));
        DatabaseConfig.getInstance().setDatabaseName(properties.getProperty("databaseName"));
        DatabaseConfig.getInstance().setUserName(properties.getProperty("userName"));
        DatabaseConfig.getInstance().setPassword(properties.getProperty("password"));
        
    }
    
    public Properties readPropertiesFile(){
        Properties p = new Properties();
        InputStream input = null;
        try{
            input = new FileInputStream("config.properties");
            p.load(input);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return p;
    }
}
