/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Receipt;

import HotelSystem.Entities.User;

/**
 *
 * @author Owner
 */
public class DiscountedReceipt {
public String AddToReceipt(){
    double Discount = 0;
    double OrignalCost =0; 
    User user = new User();
    //Discount =user.getDiscount();
    Discount = 10;
    String Addedtext = "Due to you being a loyal costomer you have recieved a discount of : " + Discount + "\n";
    return Addedtext;
}
}
