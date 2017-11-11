/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.PanelOperations;

import DatabaseManager.DatabaseOperations;
import GUI.ServicesMenu.ServicesMenuUI;
import HotelSystem.Entities.Service;
import HotelSystem.Services.ServicePackageBuilder;

/**
 *
 * @author Liam
 */
public class AddUserServicesOperation {

    public static void addUserServices(Service servicePackage) throws Exception{

        System.out.println("Made it to addUserServicesOPERATION");
        
        try (DatabaseOperations dbOps = new DatabaseOperations()){
            System.out.println("");
            dbOps.insertUserServices(servicePackage);
            System.out.println("past the db instert UserServices");
        }   
    }
    

    }
