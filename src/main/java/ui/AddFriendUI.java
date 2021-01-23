package ui;

import backend.client.ChatClient;
import controller.AddFriendController;
import controller.LoginController;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Khoa
 */
public class AddFriendUI extends javax.swing.JFrame {

    /**
     * Creates new form ui.AddFriendUI
     */
    final String another_path = "/src/main/java/images/";
    final String path_win = "\\src\\main\\java\\images\\";
    String os = System.getProperty("os.name").toLowerCase();
    final private String dir;

    public AddFriendUI() {
        if (os.equals("windows 10")){
            dir = System.getProperty("user.dir") + path_win;
        }
        else{
            dir = System.getProperty("user.dir") + another_path;
        }
        System.out.println("CREATE ADDFRIEND UI");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator_user_signup = new javax.swing.JSeparator();
        user_signup_input = new javax.swing.JTextField();
        user_label = new javax.swing.JLabel();
        user_logo = new javax.swing.JLabel();
        add_but = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Firend");
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator_user_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, -1));

        user_signup_input.setBackground(new java.awt.Color(0, 51, 51));
        user_signup_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_signup_input.setForeground(new java.awt.Color(255, 255, 255));
        user_signup_input.setBorder(null);
        jPanel1.add(user_signup_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        user_label.setBackground(new java.awt.Color(0, 51, 51));
        user_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user_label.setForeground(new java.awt.Color(153, 204, 255));
        user_label.setText("Username");
        user_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_labelMouseClicked(evt);
            }
        });
        jPanel1.add(user_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 30));
        jPanel1.add(user_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 50));

        add_but.setBackground(new java.awt.Color(0, 51, 51));
        add_but.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add_but.setForeground(new java.awt.Color(255, 255, 255));
        add_but.setIcon(new javax.swing.ImageIcon(dir + "add_user_icon_40.png")); // NOI18N
        add_but.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_but.setBorderPainted(false);

        add_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_butActionPerformed(evt);
            }
        });
        jPanel1.add(add_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, 60));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 420));

        bg.setBackground(new java.awt.Color(0, 51, 51));
        bg.setIcon(new javax.swing.ImageIcon(dir + "addfriend_bg.jpg"));
        jPanel3.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_labelMouseClicked
        
    }//GEN-LAST:event_user_labelMouseClicked

    private void add_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_butActionPerformed
        System.out.println("Add friend User");
    }//GEN-LAST:event_add_butActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFriendUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFriendUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFriendUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFriendUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFriendUI().setVisible(true);
            }
        });
    }

    public String getUserInput() {
        return user_signup_input.getText();
    }

    public JButton getAdd_but() {
        return add_but;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_but;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator_user_signup;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel user_logo;
    private javax.swing.JTextField user_signup_input;
    // End of variables declaration//GEN-END:variables
}