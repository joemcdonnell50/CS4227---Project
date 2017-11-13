/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.OptionMenu;

import GUI.Command;
import HotelSystem.PanelOperations.ViewReservationsOperation;
import GUI.ManageReservations.ManageReservationsUI;
import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class OptionsMenuManageResButton extends JButton implements Command {

    @Override
    public void execute(){
        try{
            Object[][] data = ViewReservationsOperation.populateTable("1");
            System.out.println("r id " + data[0][0]);
            System.out.println("r id " + data[1][0]);
            ManageReservationsUI manageReservations = new ManageReservationsUI(data);
            manageReservations.makeVisible();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}