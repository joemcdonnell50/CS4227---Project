/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import java.time.LocalDate;
import java.time.format.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class DateDiscountObserver extends Observer {

    public DateDiscountObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String DiscountDate = "19/04/2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate discountDate = LocalDate.parse(DiscountDate, formatter);
        if (subject.getState().isEqual(discountDate)) {
            JOptionPane.showMessageDialog(null, "Today is Mothers Day! To Celebrate we are having a 20% off all bookings! Get Booking!! ");
        }

    }

}
