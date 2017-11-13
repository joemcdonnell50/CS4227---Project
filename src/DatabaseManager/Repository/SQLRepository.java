
package DatabaseManager.Repository;

import DatabaseManager.DatabaseConfig;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
 
public abstract class SQLRepository implements Repository {
    
    protected Connection connection = null;
    protected Statement statement;
    
    protected String endpoint;
    protected String userName;
    protected String password;
    
    public SQLRepository(DatabaseConfig databaseConnectionDetails){
        this.userName = databaseConnectionDetails.getUserName();
        this.password = databaseConnectionDetails.getPassword();
        endpoint = getURLStub() + getDatabaseURL(databaseConnectionDetails);
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null){
            Class.forName(getDriver());
            int port = 3306;
            connection = DriverManager.getConnection("jdbc:mysql://cs4227db.cdsfnb4onzy8.eu-west-1.rds.amazonaws.com:3306/cs4227_db", userName, password);
        }
       return connection;
    }
    
    public void closeConnection(){
        try{
            if (connection != null){
                connection.close();
            }
            connection = null;
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void closeStatement() throws SQLException{ 
        statement.close();
    }
    
    public void executeStatement(String query){
        try{
            statement = getConnection().createStatement();
            statement.execute(query);
            //connection.commit();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public boolean executeUpdate(String query) {
        try{
            statement = getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            statement.execute(query);
            //connection.commit();
        } catch (SQLException sqlEx){
            sqlEx.printStackTrace();
            return false;
        } catch (Exception ex){
            ex.printStackTrace();
            closeConnection();
        }
        return true;
    }
    
    @Override
    public ResultSet queryStatement(String query){
        return null;
    }

    public ResultSet queryDatabaseStatement(String query){
        ResultSet rs = null;
        try{
            executeStatement(query);
            rs = statement.getResultSet();
            return rs;
        }
        catch (Exception ex){
            closeConnection();
        }  
        return rs;
    }
    
    public ResultSet queryDatabaseUpdate(String query){
        ResultSet rs = null;
        try{
            executeUpdate(query);
            rs = statement.getResultSet();
        } catch (Exception ex){
            ex.printStackTrace();
            closeConnection();
        }
        return rs;
    }
}
