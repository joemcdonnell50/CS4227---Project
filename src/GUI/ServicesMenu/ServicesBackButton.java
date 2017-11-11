/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.ServicesMenu;

import GUI.Command;
import GUI.ReservationMenu.ReservationMenuUI;
import javax.swing.JButton;

/**
 *
 * @author Liam
 */
public class ServicesBackButton extends JButton implements Command {

    @Override
    public void execute() {
        System.out.println("Back Button Pressed");
        //ServicesMenuUI.makeNonVisible();
        ReservationMenuUI.makeVisible();
    }
    
}
