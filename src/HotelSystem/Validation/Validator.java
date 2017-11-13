/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Validation;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Owner
 */
public class Validator {
   public boolean isDateAfterToday(String Date){
       if(!isNotNull(Date)){
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate Dt = LocalDate.parse(Date, formatter);
       return Dt.isAfter(LocalDate.now());
       }
       else{
           return false;
       }
} 
   public boolean isNotNull(String string){
       if(string.isEmpty() || string.length() < 0){
           return false;
       }
       else{
           return true;
       }
   }
}
