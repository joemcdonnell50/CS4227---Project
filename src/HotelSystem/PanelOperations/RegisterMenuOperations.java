
package HotelSystem.PanelOperations;

import GUI.RegisterMenu.RegisterMenuUI;
import DatabaseManager.DatabaseOperations;
import HotelSystem.Entities.User;

public class RegisterMenuOperations {
    public static void register(RegisterMenuUI registerUI) throws Exception{
        User user = new User();
        user.setUser_name(registerUI.getUsername());
        user.setPassword("pass");
        user.setFirst_name(registerUI.getFirstname());
        user.setLast_name(registerUI.getLastName());
        user.setEmail_address(registerUI.getEmailAddress());
        int userId = 0;
        try (DatabaseOperations dbOps = new DatabaseOperations()){
            dbOps.insertUser(user);
        }   
        user.setUser_id(userId);
        user.setLoggerUser(user);
    }
}
  