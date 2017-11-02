/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.OptionMenu;

import GUI.Command;
import GUI.ReservationMenu.ReservationMenuUI;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class OptionsMenuMakeResButton extends JButton implements Command {

    @Override
    public void execute() {
        OptionsMenuUI.makeNonVisible(); 
        ReservationMenuUI.makeVisible();
    }
    
}
