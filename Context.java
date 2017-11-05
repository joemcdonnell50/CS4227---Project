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
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public double executeStrategy(double num1){
      return strategy.doOperation(num1);
   }
}