
package DatabaseManager;


public class DatabaseConfig {
    
    private static DatabaseConfig databaseConfigInstance;
    
    private String databaseType;
    private String serverName;
    private String portNumber;
    private String databaseName;
    private String userName;
    private String password;
    
    public DatabaseConfig(){
        
    }
    
    public void setDatabaseConfigInstance(DatabaseConfig config){
        this.databaseConfigInstance = config;
    }
    
    public static DatabaseConfig getDatabaseConfig(){
        return databaseConfigInstance;
    }
    
    public String getDatabaseType(){
        return databaseType;
    }
    
    public void setDatabaseType(String databaseType){
        this.databaseType = databaseType;
    }
    
    public String getServerName() {
        return serverName;
    }
    
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getPortNumber() {
        return portNumber;
    }
    
    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getDatabaseName() {
        return databaseName;
    }
    
    public void setDatabaseName(String databseName) {
        this.databaseName = databseName;
    }

    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

}
