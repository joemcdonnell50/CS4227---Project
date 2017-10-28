/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.RegisterMenu;

import GUI.Command;
import HotelSystem.PanelOperations.RegisterMenuOperations;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class RegisterMenuRegisterButton extends JButton implements Command {

    @Override
    public void execute() {
        try{
            RegisterMenuOperations.register(RegisterMenuUI.registerUI);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
    
}
