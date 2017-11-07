
package DatabaseManager;

import DatabaseManager.Factory.RepositoryFactory;
import DatabaseManager.Repository.Repository;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.User;
import HotelSystem.Entities.Reservation;
import HotelSystem.Entities.Service;
import HotelSystem.Entities.UserReservationDetails;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
//import java.lang.AutoCloseable; -- Automatic Resource Management in Java

public class DatabaseOperations implements AutoCloseable{
    
    private Repository repository = null;
    private ResultSet resultSet = null;
    private String query;
    
    public DatabaseOperations() throws Exception{
        repository = RepositoryFactory.getRepository(DatabaseConfig.getDatabaseConfig());
    }
    
    // User
    public int insertUser(User user) throws Exception{
        query = "INSERT INTO User (user_name, password, first_name, last_name, email_address, loyalty_level)" + 
                "VALUES('" + user.getUser_name() + "','" +  user.getPassword() + "','" + user.getFirst_name() + "','" + 
                user.getLast_name() + "','" + user.getEmail_address() + "','0');";
        repository.executeStatement(query);
        
        query = "SELECT user_id FROM User WHERE username = '" + user.getUser_name() + "' and password = '" + user.getPassword() + "';";
        resultSet = repository.queryDatabaseStatement(query);
        int user_id = Integer.valueOf(resultSet.getString("user_id"));
        
        return user_id;
    }
    
    
    // Reservation
    public void insertReservation(Reservation reservation){
        query = "INSERT INTO Reservation (user_name, hotel_name, room_type, number_of_guests, arrival_date, checkout_date) " + 
                "VALUES('" + reservation.getUser_name() + "','" + reservation.getHotel_name() + "','" + reservation.getRoom_type() + 
                "','" + reservation.getNumber_of_guests() + "','" + reservation.getArrival_date() + "','" + reservation.getCheckout_date() + "');";
        repository.executeStatement(query);
    }
    
    // Service
    public List<Entity> getListOfServices() throws Exception{
        List<Entity> listOfServices = new ArrayList<Entity>();
        query = "SELECT service_name, price FROM Services;";
        resultSet = repository.queryDatabaseStatement(query);
        while(resultSet.next()){
            Service service = new Service();
            service.setService_name(resultSet.getString("service_name"));
            service.setPrice(Double.valueOf(resultSet.getString("price")));
            listOfServices.add(service);
        }
        resultSet.close();
        return listOfServices;
    }
    
    public Object[][] getServicesData() throws Exception{
        query = "SELECT service_name, price FROM Services;";
        resultSet = repository.queryDatabaseStatement(query);
        ResultSetMetaData meta = resultSet.getMetaData();
        int rowCount = 0;
        while (resultSet.next()){
            rowCount++;
        }
        Object[][] rowData = new Object[rowCount][2];
        resultSet.first();
        rowCount = 0;
        while (resultSet.next()){
            rowData[rowCount][0] = resultSet.getString("service_name");
            rowData[rowCount][1] = resultSet.getString("price");
            rowCount++;
        }
        
        return rowData;
    }
    
    // UserReservationDetails
    public void insertUserReservationDetails(UserReservationDetails userReservationDetails){
        query = "INSERT INTO UserReservationDetails (user_id, reservation_id, arrival_date, checkout_date, services, tours, price) " + 
                "VALUES('" + userReservationDetails.getUser_id() + "," + userReservationDetails.getReservation_id() + ",'" + userReservationDetails.getArrival_date() + 
                "','" + userReservationDetails.getCheckout_date() + "','" + userReservationDetails.getServices() + 
                "','" + userReservationDetails.getTours() + "'," + userReservationDetails.getPrice() + "');";
        repository.executeStatement(query);
    }

    public void close() throws Exception {
        resultSet.close();
        repository.closeConnection(); 
        repository.closeStatement();
    }
    
}
