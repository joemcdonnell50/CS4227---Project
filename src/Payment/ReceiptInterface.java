/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

/**
 *
 * @author Owner
 */
public interface ReceiptInterface {

    public String FormatReceipt();

    public void setOriginalCost(double OriginalCost);
}
