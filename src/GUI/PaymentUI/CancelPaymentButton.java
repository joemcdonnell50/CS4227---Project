/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PaymentUI;

import GUI.Command;
import GUI.ReservationMenu.ReservationMenuUI;
import javax.swing.JButton;

/**
 *
 * @author Owner
 */
public class CancelPaymentButton extends JButton implements Command {

    @Override
    public void execute() {
        PaymentMenuUI.makeNonVisible();
        ReservationMenuUI.makeVisible();
    }
    
}
