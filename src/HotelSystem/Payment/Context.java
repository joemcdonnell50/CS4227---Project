
package HotelSystem.Payment;


public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public double executeStrategy(double num1){
      return strategy.doOperation(num1);
   }
}
