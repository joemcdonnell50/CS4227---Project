
package DatabaseManager.Repository;

import DatabaseManager.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public interface Repository {
    
    public abstract Connection getConnection() throws Exception;
    
    public abstract void closeConnection();
    
    public abstract void closeStatement() throws SQLException;
    
    public abstract ResultSet queryDatabaseStatement(String query);
    
    //public abstract ResultSet queryDatabaseUpdate(String query);
    
    public abstract void executeStatement(String query);
    
    public abstract boolean executeUpdate(String query);
    
    public abstract String getDriver();
    
    public abstract String getURLStub();
	
    public abstract String getDatabaseURL(DatabaseConfig databaseConnectionDetails);
    
}
