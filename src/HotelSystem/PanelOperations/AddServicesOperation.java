/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.PanelOperations;

import DatabaseManager.DatabaseOperations;
import HotelSystem.Entities.Service;
import HotelSystem.Services.ServicePackageBuilder;


/**
 *
 * @author Liam
 */
public class AddServicesOperation {
    //return object [][] rowData
    private static Object[][] rowData;
    
    public static Object[][] getServiceRowData() throws Exception{
        try (DatabaseOperations op = new DatabaseOperations()){
            rowData = op.getServicesData();
        }
        
        return rowData;
    }
    
    public static void addUserServices(Service servicePackage) throws Exception{

        System.out.println("Made it to addUserServicesOPERATION");
        
        try (DatabaseOperations dbOps = new DatabaseOperations()){

            dbOps.insertUserServices(servicePackage);
            System.out.println("in the try");
        }   
        System.out.println("past the db instert UserServices");
    }
    
    public static void createServicesPackage(boolean hasSauna, boolean hasHammam, boolean hasPool, double totalServicePrice){
        System.out.println("Variables in operations");
        System.out.println(hasSauna);
        System.out.println(hasHammam);
        System.out.println(hasPool);
        System.out.println(totalServicePrice);
        System.out.println("End Operations Variable");
        
        Service servicePackage = new ServicePackageBuilder().setHasSauna(hasSauna)
                                                            .setHasHammam(hasHammam)
                                                            .setHasPool(hasPool)
                                                            .setTotalServicePrice((int) totalServicePrice)
                                                            .buildService();
    }
    
}
