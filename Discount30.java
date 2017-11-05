/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Payment;

/**
 *
 * @author Owner
 */
public class Discount30 implements Strategy{
   @Override
   public double doOperation(double num1) {
      double Total = (num1-((num1 / 100) *30));
      return Total;
   }
    
}
