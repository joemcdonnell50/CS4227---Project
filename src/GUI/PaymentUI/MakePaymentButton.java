/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PaymentUI;

import GUI.Command;
import HotelSystem.PanelOperations.CreditCardOperations;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Owner
 */
public class MakePaymentButton extends JButton implements Command {
 @Override
    public void execute() {
        try {
            System.out.println("Help");
         CreditCardOperations creditcard = new CreditCardOperations();
         creditcard.CreditCard(PaymentMenuUI.getPaymentMenuUIInstance());
         boolean ValidCard =false;
         ValidCard = creditcard.isCreditCardValid();
         if (!ValidCard){
             JOptionPane.showMessageDialog(
        null, "ErrorMsg", "Credit Card Not Valid!", JOptionPane.ERROR_MESSAGE);
         }
         else{
             
         }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
