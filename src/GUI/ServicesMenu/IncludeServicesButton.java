/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.ServicesMenu;

import DatabaseManager.DatabaseOperations;
import GUI.Command;
import GUI.ServicesMenu.ServicesMenuUI;
import HotelSystem.Entities.Service;
import HotelSystem.PanelOperations.AddServicesOperation;
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
        
        
        
        /*
        Service servicePackage = new ServicePackageBuilder()
                                                         .setReservationID(reservationID)
                                                         .setHasWifi(hasWifi)
                                                         .setHasSauna(hasSauna)
                                                         .setHasHammam(hasHammam)
                                                         .setHasPool(hasPool)
                                                         .setTotalServicePrice(totalServicePrice)
                                                         .buildService();
        */
        
        
        
        
        
        //this database call should be moved to payment button
        //AddUserServicesOperation.addUserServices(servicePackage);
        System.out.println("Add user services operation");
        PaymentMenuUI.makeVisible();
        
        } catch (Exception ex){
            ex.printStackTrace();
        }
    
    }
}
