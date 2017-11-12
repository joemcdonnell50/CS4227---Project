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
public abstract class paymentDecorator implements BillInterface{
    protected Bill decoratedBill;

   public paymentDecorator(Bill decoratedBill){
      this.decoratedBill = decoratedBill;
   }

    @Override
   public double getTotal(){
       double newTotal=0;
     newTotal= decoratedBill.getTotal();
      return newTotal;
   }	
}
