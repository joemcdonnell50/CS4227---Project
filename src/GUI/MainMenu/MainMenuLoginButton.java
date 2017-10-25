/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MainMenu;

import GUI.Command;
import GUI.LoginMenu.LoginUI;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class MainMenuLoginButton extends JButton implements Command {

    @Override
    public void execute() {
        //new MainMenuUI().setVisible(false);
        LoginUI.makeVisible();
    }
    
}
