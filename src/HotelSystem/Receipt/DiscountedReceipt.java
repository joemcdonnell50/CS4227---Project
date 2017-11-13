/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Receipt;

import HotelSystem.Entities.Receipt;
import HotelSystem.Entities.User;
import HotelSystem.Entities.Reservation;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class DiscountedReceipt {

    public void FormatAndAddToReceipt(Reservation reservation) {
        Receipt receipt = Receipt.getCurrentReceiptInstance();
        String Addedtext = "Due to you being a loyal costomer you have recieved a discount of : " + receipt.getDiscount() + "%" + "\n";
        String Receipt = String.format("Hello " + reservation.getUser_name() + "\n"
                + "Receipt for reservation number " + reservation.getReservation_id() + "\n"
                + "Hotel : " + "\t" + reservation.getHotel_name() + "\n"
                + "Roomtype : " + "\t" + reservation.getRoom_type() + "\n"
                + "Number of Guests : " + "\t" + reservation.getNumber_of_guests() + "\n"
                + "Date of Arrival : " + "\t" + reservation.getArrival_date() + "\n"
                + "Check out Date : " + "\t" + reservation.getCheckout_date() + "\n"
                + "Cost of Services :" + "\t" + receipt.getCostOfServices() + "\n"
                + "Your total cost is " + "\t" + receipt.getTotal() + "\n" + Addedtext);
        JOptionPane.showMessageDialog(null, Receipt);

    }
}
