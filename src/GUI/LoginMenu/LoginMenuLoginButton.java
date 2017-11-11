/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.LoginMenu;

import GUI.Command;
import GUI.OptionMenu.OptionsMenuUI;
import HotelSystem.PanelOperations.LoginMenuOperations;
import Interceptor.ConnectionReplyContext;
import Interceptor.ConnectionReplyInterceptor;
import Interceptor.LoggingDispatcher;
import Interceptor.LoggingInterceptor;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class LoginMenuLoginButton extends JButton implements Command {

    @Override
    public void execute() {
        try{
            if (LoginMenuOperations.login(LoginUI.lui.getUsername(), LoginUI.lui.getPassword())){
                OptionsMenuUI.makeVisible();
            }
        } catch(Exception ex){
            ex.printStackTrace();
        } 

       LoginUI.makeNonVisible();
       
        
       LoggingDispatcher dis = null;
       
       dis = dis.getDispatcher();
        
       ConnectionReplyContext context = new ConnectionReplyContext(new Date());  

       dis.preRemoteReply(context);


    }
    
}

