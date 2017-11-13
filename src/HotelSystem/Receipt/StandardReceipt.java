/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Receipt;

import HotelSystem.Entities.Receipt;
import HotelSystem.Entities.Reservation;
import HotelSystem.Entities.UserReservationDetails;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class StandardReceipt implements ReceiptInterface{
    @Override
    public void PrintReceipt(Reservation reservation) {
         Receipt receipt = Receipt.getCurrentReceiptInstance();
    String Receipt = String.format("Hello " + reservation.getUser_name() + "\n"
                + "Receipt for reservation number " + reservation.getReservation_id() + "\n"
                + "Hotel : " + "\t" + reservation.getHotel_name() + "\n"
                + "Roomtype : " + "\t" + reservation.getRoom_type() + "\n"
                + "Number of Guests : " + "\t" + reservation.getNumber_of_guests() + "\n"
                + "Date of Arrival : " + "\t" + reservation.getArrival_date() + "\n"
                + "Check out Date : " + "\t" + reservation.getCheckout_date() + "\n"
                + "Cost of Services :" + "\t" + receipt.getCostOfServices() + "\n"
                + "Your total cost is " + "\t" + receipt.getTotal());  
       JOptionPane.showMessageDialog(null, Receipt);
   }


}