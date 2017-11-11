/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.PanelOperations;

import DatabaseManager.DatabaseOperations;

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
}
