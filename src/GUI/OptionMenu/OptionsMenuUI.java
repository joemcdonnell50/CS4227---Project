/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.OptionMenu;

import GUI.ButtonHandler;

/**
 *
 * @author New User
 */
public class OptionsMenuUI extends javax.swing.JFrame {

    
    


    /**
     * Creates new form OptionsMenuUI
     */
    public OptionsMenuUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    static OptionsMenuUI ui = new OptionsMenuUI();
    
    public static void makeVisible(){
        ui.setVisible(true); 
    }
    
    public static void makeNonVisible(){
        ui.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MakeResButton = new javax.swing.JButton();
        ManageResButton = new javax.swing.JButton();
        ViewMyResButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setText("                    Please select an option: ");
        
        MakeResButton = new OptionsMenuMakeResButton();
        MakeResButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MakeResButton.setText("Make Reservation");
        
        ManageResButton = new OptionsMenuManageResButton();
        ManageResButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ManageResButton.setText("Manage Reservations");
        
        ViewMyResButton = new OptionsMenuViewResButton();
        ViewMyResButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ViewMyResButton.setText("View My Reservations");

        LogoutButton = new OptionsMenuLogoutButton();
        LogoutButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LogoutButton.setText("Logout");
        
        //ButtonHandler for Command DP
        ButtonHandler vf = new ButtonHandler();  
        ManageResButton.addActionListener(vf);
        MakeResButton.addActionListener(vf);
        ViewMyResButton.addActionListener(vf);
        LogoutButton.addActionListener(vf); 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MakeResButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewMyResButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(ManageResButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(MakeResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(ViewMyResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(ManageResButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MakeResButton;
    private javax.swing.JButton ManageResButton;
    private javax.swing.JButton ViewMyResButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}

