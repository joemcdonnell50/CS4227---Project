
package DatabaseManager.Repository;

import DatabaseManager.DatabaseConfig;
import java.sql.ResultSet;


public class MySQLRepository extends SQLRepository {
    
    public MySQLRepository(DatabaseConfig databaseConnectionDetails){
        super(databaseConnectionDetails);
    }
    
    private final String selectMethod = "cursor";
    
    @Override
    public String getDriver(){
        return "com.mysql.jdbc.Driver";
    }
    
    @Override
    public String getURLStub(){
        return "jdbc:mysql://";
    }
    
    @Override
    public String getDatabaseURL(DatabaseConfig databaseConnectionDetails){
        // endpoint = jdbc:mysql://cs4227db.cdsfnb4onzy8.eu-west-1.rds.amazonaws.com:3306;databaseName=cs4227_db;selectMethod=cursor;
        return databaseConnectionDetails.getServerName() + ":" + databaseConnectionDetails.getPortNumber() +
          ";databaseName=" + databaseConnectionDetails.getDatabaseName() + ";selectMethod=" + selectMethod + ";"; 
    }
    
}
