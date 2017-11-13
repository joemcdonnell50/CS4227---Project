/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author New User
 */
public class ButtonHandler implements ActionListener {
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
            Command CommandObj = (Command) e.getSource();
            CommandObj.execute();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    
}
