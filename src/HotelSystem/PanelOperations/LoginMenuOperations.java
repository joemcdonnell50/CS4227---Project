
package HotelSystem.PanelOperations;

import GUI.LoginMenu.LoginUI;
import DatabaseManager.Factory.EntityFactory;
import HotelSystem.Entities.Entity;
import HotelSystem.Entities.User;

public class LoginMenuOperations {
    public static boolean login(String userName, String password) throws Exception{
        boolean valid = false;
        EntityFactory userFactory = EntityFactory.getEntityFactory("user");
        User user = (User) userFactory.createEntity(userName, password);
        if (!user.equals(null)){
            valid = true;
            user.setLoggerUser(user);
        }
          
        return valid;
    }
}
