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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private final List<Observer> observers = new ArrayList<>();
   private LocalDate state;

   public LocalDate getState() {
      return state;
   }

   public void setState(LocalDate state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
       observers.forEach((observer) -> {
           observer.update();
       });
   } 	
}