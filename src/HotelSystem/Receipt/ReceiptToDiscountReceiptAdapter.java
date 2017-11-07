/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Receipt;

import HotelSystem.Entities.UserReservationDetails;

/**
 *
 * @author Owner
 */
public class ReceiptToDiscountReceiptAdapter extends DiscountedReceipt implements ReceiptInterface{
     private DiscountedReceipt receipt;

    public ReceiptToDiscountReceiptAdapter(DiscountedReceipt receipt) {
        this.receipt = receipt;
    }

    @Override
    public void formatReceipt(UserReservationDetails Details) {
         String Receipt = String.format("Hello " + Details.getUser_id() + "\n"
                + "Receipt for reservation number " + Details.getReservation_id() + "\n"
                + "Hotel : " + "\t" + Details.getHotel() + "\n"
                + "Roomtype : " + "\t" + Details.getRoomType() + "\n"
                + "Number of Guests : " + "\t" + Details.getNumberOfGuests()+ "\n"
                + "Date of Arrival : " + "\t" + Details.getArrival_date() + "\n"
                + "Check out Date : " + "\t" + Details.getCheckout_date() + "\n"
                + "Cost of Services :" + "\t" + Details.getServicePrice() + "\n"
                + "Your total cost is " + "\t" + Details.getPrice()+ AddToReceipt());   }
    }
