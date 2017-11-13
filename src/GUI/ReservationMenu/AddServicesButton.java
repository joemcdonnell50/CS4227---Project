/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.ReservationMenu;

import DatabaseManager.DatabaseOperations;
import GUI.Command;

import GUI.ServicesMenu.ServicesMenuUI;

import GUI.PaymentUI.PaymentMenuUI;
import GUI.ServicesMenu.ServiceUI;



import HotelSystem.PanelOperations.MakePaymentOperation;

import HotelSystem.PanelOperations.MakeReservationOperation;
import HotelSystem.PanelOperations.ViewReservationsOperation;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author New User
 */
public class AddServicesButton extends JButton implements Command {
    
    private Object[][] rowData;

    @Override
    public void execute() {
        
       try(DatabaseOperations dbOps = new DatabaseOperations()){
           
        rowData = dbOps.getServicesData();
        } catch(Exception ex){
            ex.printStackTrace();
        }
       
       ServicesMenuUI ui = new ServicesMenuUI(rowData);
       System.out.println("After UI Creation");
       ui.makeVisible();
    }
    
}

