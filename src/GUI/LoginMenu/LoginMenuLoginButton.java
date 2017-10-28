/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.LoginMenu;

import GUI.Command;
import GUI.OptionMenu.OptionsMenuUI;
import HotelSystem.PanelOperations.LoginMenuOperations;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
    }
    
}

