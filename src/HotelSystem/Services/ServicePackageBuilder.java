/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem.Services;

import HotelSystem.Entities.Service;
import HotelSystem.Entities.Reservation;
/**
 *
 * @author Liam
 */
public class ServicePackageBuilder {
    private int reservationID;
    private boolean hasWifi;
    private boolean hasSauna;
    private boolean hasHammam;
    private boolean hasPool;
    private int totalServicePrice;

    public ServicePackageBuilder setReservationID(int reservationID) {
        this.reservationID = reservationID;
        return this;
    }

    public ServicePackageBuilder setHasWifi(boolean wifi) {
        hasWifi = wifi;
        System.out.println("Wifi " + hasWifi);
        return this;
    }

    public ServicePackageBuilder setHasSauna(boolean sauna) {
        hasSauna = sauna;
        System.out.println("hasSauna " + hasSauna);
        return this;
    }

    public ServicePackageBuilder setHasHammam(boolean hammam) {
        hasHammam = hammam;
         System.out.println("Hammam " + hasHammam);
        return this;
    }

    public ServicePackageBuilder setHasPool(boolean pool) {
        hasPool = pool;
        System.out.println("Pool " + hasPool);
        return this;
    }
    
    public ServicePackageBuilder setTotalServicePrice(int totalServicePrice) {
        totalServicePrice = totalServicePrice;
        System.out.println("totalServicePrice " + totalServicePrice);
        return this;
    }
       
    public Service buildService(){
       return new Service(reservationID, hasWifi, hasSauna, hasHammam, hasPool, totalServicePrice); 
    }

}
