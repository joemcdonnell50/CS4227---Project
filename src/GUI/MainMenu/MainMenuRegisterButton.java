/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MainMenu;

import GUI.Command;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author New User
 */
public class MainMenuRegisterButton extends JButton implements Command {

    @Override
    public void execute() {
        LoginUI.makeNonVisible();
        RegisterMenuUI.makeVisible();
    }
}
