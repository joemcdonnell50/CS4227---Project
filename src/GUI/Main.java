/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.MainMenu.MainMenuUI;

/**
 *
 * @author New User
 */
public class Main {
    
    public static void main(String [] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }
    
}
