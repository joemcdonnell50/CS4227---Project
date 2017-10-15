/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.LoginMenu;

import GUI.Command;
import GUI.LoginMenu.LoginUI;
import GUI.MainMenu.MainMenuUI;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class LoginMenuBackButton extends JButton implements Command {

    @Override
    public void execute() {
        MainMenuUI mm = new MainMenuUI();
        LoginUI li = new LoginUI(); 
        li.setVisible(false); 
        mm.setVisible(true);
        
    }
    
}

