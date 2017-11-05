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
public interface Strategy {
 
    /**
     *
     * @param num1
     * @return
     */
    public double doOperation(double num1); 
}
