/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.LoginMenu.LoginUI;
import GUI.MainMenu.MainMenuUI;
import GUI.OptionMenu.OptionsMenuUI;

/**
 *
 * @author New User
 */
public class UIControl {
    
    LoginUI lui = new LoginUI(); 
    MainMenuUI mui = new MainMenuUI();
    OptionsMenuUI oui = new OptionsMenuUI(); 
    
    public UIControl(LoginUI lui, MainMenuUI mui, OptionsMenuUI oui){
        this.lui = lui; 
        this.mui = mui;
        this.oui = oui; 
    }
    
}
