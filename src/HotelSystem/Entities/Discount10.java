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
public class Discount10 implements Strategy{
   @Override
   public int doOperation(int num1) {
      int Total = (num1-((num1 / 100) *10));
      return Total;
   }
    
}

