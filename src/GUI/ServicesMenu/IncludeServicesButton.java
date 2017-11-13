/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.ServicesMenu;

import DatabaseManager.DatabaseOperations;
import GUI.Command;
import GUI.PaymentUI.PaymentMenuUI;
import GUI.ServicesMenu.ServicesMenuUI;
import HotelSystem.Entities.CreditCard;
import HotelSystem.Entities.Service;
import HotelSystem.PanelOperations.AddServicesOperation;
import HotelSystem.PanelOperations.AddUserServicesOperation;
import HotelSystem.PanelOperations.CreditCardOperations;
import HotelSystem.Services.ServicePackageBuilder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import HotelSystem.Services.ServicePackageBuilder;
import javax.swing.JButton;
import GUI.PaymentUI.PaymentMenuUI;

/**
 *
 * @author Liam
 */
public class IncludeServicesButton extends JButton implements Command {
       
    
    @Override
    public void execute() {
    
        
    try{
        
        
        
        
//        Service servicePackage = new ServicePackageBuilder()
//                                                         .setReservationID(reservationID)
//                                                         .setHasWifi(hasWifi)
//                                                         .setHasSauna(hasSauna)
//                                                         .setHasHammam(hasHammam)
//                                                         .setHasPool(hasPool)
//                                                         .setTotalServicePrice(totalServicePrice)
//                                                         .buildService();
        
        
        
     
        
        
        //servicePackage.setServiceInstance(servicePackage);
        //AddUserServicesOperation.addUserServices(Service.getServiceInstance());
        PaymentMenuUI.makeVisible();
        
        String dialogTitle = "Saved Details";
        String message = "Use saved credit card details";
        System.out.println(message);
        int reply = JOptionPane.showConfirmDialog(null, message, dialogTitle, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION){
            CreditCardOperations.getCreditCardDetails();
            PaymentMenuUI.setNameField(CreditCard.getCurrentCreditCard().getNameOnCard());
            PaymentMenuUI.setCardNumberField(CreditCard.getCurrentCreditCard().getCreditCardNum());
            PaymentMenuUI.setCVVNumberField(CreditCard.getCurrentCreditCard().getCVNum());
            PaymentMenuUI.setExpDateField(CreditCard.getCurrentCreditCard().getExpiryDate());
        }
        
        //this database call should be moved to payment button
        //AddUserServicesOperation.addUserServices(servicePackage);
        System.out.println("Add user services operation");
        PaymentMenuUI.makeVisible();
        
        } catch (Exception ex){
            ex.printStackTrace();
        }
    
    }
}
