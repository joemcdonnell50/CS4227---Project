/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Receipt;

import HotelSystem.Entities.Reservation;
import javax.swing.JOptionPane;

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
    public void PrintReceipt(Reservation reservation) {
        receipt.FormatAndAddToReceipt(reservation);
         }

}
    
