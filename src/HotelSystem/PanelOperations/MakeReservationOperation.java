/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.PanelOperations;

import DatabaseManager.DatabaseOperations;
import GUI.RegisterMenu.RegisterMenuUI;
import GUI.ReservationMenu.ReservationMenuUI;
import HotelSystem.Entities.Reservation;
import HotelSystem.Entities.User;

/**
 *
 * @author New User
 */
public class MakeReservationOperation {
    
    public static void makeReservation(ReservationMenuUI reservationUI) throws Exception {
        Reservation reservation = new Reservation();
        
        reservation.setUser_name(reservationUI.getUsername());
        reservation.setHotel_name(reservationUI.getHotelComboBox());
        reservation.setRoom_type(reservationUI.getRoomComboBox());
        reservation.setNumber_of_guests(reservationUI.getNoOfGuestsField());
        reservation.setArrival_date(reservationUI.getjXDatePicker1());
        reservation.setCheckout_date(reservationUI.getjXDatePicker2());
        reservation.setReservationInstance(reservation);


          
//try(DatabaseOperations dbOps = new DatabaseOperations()){
    //        dbOps.insertReservation(reservation);
  //      }
        


    }
    
}
