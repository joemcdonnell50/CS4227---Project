
package DatabaseManager.Repository;

import DatabaseManager.DatabaseConfig;


public class MySQLRepository extends SQLRepository {
    
    public MySQLRepository(DatabaseConfig databaseConnectionDetails){
        super(databaseConnectionDetails);
    }
    
    private final String selectMethod = "cursor";
    
    public String getDriver(){
        return "com.mysql.jdbc.Driver";
    }
    
    public String getURLStub(){
        return "jdbc:mysql://";
    }
    
    public String getDatabaseURL(DatabaseConfig databaseConnectionDetails){
        return databaseConnectionDetails.getServerName() + ":" + databaseConnectionDetails.getPortNumber() +
          ";databaseName=" + databaseConnectionDetails.getDatabaseName() + ";selectMethod=" + selectMethod + ";"; 
    }
    
}
