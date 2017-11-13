/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Entities;

/**
 *
 * @author Owner
 */
public class Receipt extends Entity{
     private String Name;
     private double Total;
     private double Discount;
     private double CostOfServices;

    public double getCostOfServices() {
        return CostOfServices;
    }

    public void setCostOfServices(double CostOfServices) {
        this.CostOfServices = CostOfServices;
    }

    public static Receipt getCurrentReceipt() {
        return currentReceipt;
    }

    public static void setCurrentReceipt(Receipt currentReceipt) {
        Receipt.currentReceipt = currentReceipt;
    }

    private static Receipt currentReceipt;
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    public static void setCurrentReceiptInstance(Receipt currentReceipt) {
        Receipt.currentReceipt = currentReceipt;
    }
    public static Receipt getCurrentReceiptInstance() {
        return currentReceipt;
    }

    
    
    
      
}
