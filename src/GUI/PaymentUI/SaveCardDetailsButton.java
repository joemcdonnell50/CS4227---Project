/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PaymentUI;

import GUI.Command;
import HotelSystem.PanelOperations.CreditCardOperations;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Owner
 */
public class SaveCardDetailsButton extends JButton implements Command {

    @Override
    public void execute() {
        try {
            CreditCardOperations.insertCreditCardDetails();
        } catch (Exception ex) {
            Logger.getLogger(SaveCardDetailsButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
