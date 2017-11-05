/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.ReservationMenu;

import GUI.Command;
import GUI.OptionMenu.OptionsMenuUI;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class HomeButton extends JButton implements Command {

    @Override
    public void execute() {
        OptionsMenuUI.makeVisible();
    }
    
}
