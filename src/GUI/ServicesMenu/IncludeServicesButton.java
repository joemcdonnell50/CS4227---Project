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
import HotelSystem.PanelOperations.AddUserServicesOperation;
import HotelSystem.Services.ServicePackageBuilder;
import javax.swing.JButton;

/**
 *
 * @author Liam
 */
public class IncludeServicesButton extends JButton implements Command {
    
    private int reservationID;
    private int hasWifi;
    private int hasSauna;
    private int hasHammam;
    private int hasPool;
    private int totalServicePrice;
    
    
    //get values from ui here
    
    
    
    @Override
    public void execute() {
    
        
    try{
        
        Service servicePackage = new ServicePackageBuilder()
                                                         .setReservationID(reservationID)
                                                         .setHasWifi(hasWifi)
                                                         .setHasSauna(hasSauna)
                                                         .setHasHammam(hasHammam)
                                                         .setHasPool(hasPool)
                                                         .setTotalServicePrice(totalServicePrice)
                                                         .getService();
        
        
        AddUserServicesOperation.addUserServices(servicePackage);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    
    }
}
