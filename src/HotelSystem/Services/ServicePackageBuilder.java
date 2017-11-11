/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Services;

import HotelSystem.Entities.Service;

/**
 *
 * @author Liam
 */
public class ServicePackageBuilder {
    private int reservationID;
    private int hasWifi;
    private int hasSauna;
    private int hasHammam;
    private int hasPool;
    private int totalServicePrice;

    public ServicePackageBuilder setReservationID(int reservationID) {
        //need to get the current reservation id here
        this.reservationID = reservationID;
        return this;
    }

    public ServicePackageBuilder setHasWifi(int hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    public ServicePackageBuilder setHasSauna(int hasSauna) {
        this.hasSauna = hasSauna;
        return this;
    }

    public ServicePackageBuilder setHasHammam(int hasHammam) {
        this.hasHammam = hasHammam;
        return this;
    }

    public ServicePackageBuilder setHasPool(int hasPool) {
        this.hasPool = hasPool;
        return this;
    }
    
    public ServicePackageBuilder setTotalServicePrice(int totalServicePrice) {
        this.hasPool = hasPool;
        return this;
    }
    
    
    
    public Service getService(){
       return new Service(reservationID, hasWifi, hasSauna, hasHammam, hasPool, totalServicePrice); 
    }

}
