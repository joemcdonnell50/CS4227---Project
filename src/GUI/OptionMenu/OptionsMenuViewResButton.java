/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.OptionMenu;

import GUI.Command;
import javax.swing.JButton;
import GUI.UserReservations.UserReservationsUI;
import HotelSystem.PanelOperations.ViewReservationsOperation;
/**
 *
 * @author New User
 */
public class OptionsMenuViewResButton extends JButton implements Command {

    @Override
    public void execute() {
        try{
            UserReservationsUI ui = new UserReservationsUI(ViewReservationsOperation.populateTable("0"));
            ui.makeVisible();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}