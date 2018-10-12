/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishexportandimportinformationsystem;

/**
 *
 * @author user
 */
public class AdminAfterLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminAfterLogin
     */
    public AdminAfterLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdminAfLogUpdateCompanyInfo = new javax.swing.JButton();
        btnAdminSignOut = new javax.swing.JButton();
        btnAdminAftLoginViewData = new javax.swing.JButton();
        btnAdminAftLoginCreateAccountManager = new javax.swing.JButton();
        lblPicAdminAfterLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information");
        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(786, 440));
        getContentPane().setLayout(null);

        btnAdminAfLogUpdateCompanyInfo.setBackground(new java.awt.Color(0, 51, 204));
        btnAdminAfLogUpdateCompanyInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdminAfLogUpdateCompanyInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminAfLogUpdateCompanyInfo.setText("Update Company Information");
        btnAdminAfLogUpdateCompanyInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAfLogUpdateCompanyInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminAfLogUpdateCompanyInfo);
        btnAdminAfLogUpdateCompanyInfo.setBounds(60, 110, 240, 50);

        btnAdminSignOut.setBackground(new java.awt.Color(0, 153, 255));
        btnAdminSignOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdminSignOut.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminSignOut.setText("Sign Out");
        btnAdminSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminSignOut);
        btnAdminSignOut.setBounds(110, 290, 140, 40);

        btnAdminAftLoginViewData.setBackground(new java.awt.Color(0, 51, 204));
        btnAdminAftLoginViewData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdminAftLoginViewData.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminAftLoginViewData.setText("View Data");
        btnAdminAftLoginViewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAftLoginViewDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminAftLoginViewData);
        btnAdminAftLoginViewData.setBounds(60, 180, 240, 50);

        btnAdminAftLoginCreateAccountManager.setBackground(new java.awt.Color(0, 51, 204));
        btnAdminAftLoginCreateAccountManager.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdminAftLoginCreateAccountManager.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminAftLoginCreateAccountManager.setText("Create Account For Manager");
        btnAdminAftLoginCreateAccountManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAftLoginCreateAccountManagerActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminAftLoginCreateAccountManager);
        btnAdminAftLoginCreateAccountManager.setBounds(60, 40, 240, 50);

        lblPicAdminAfterLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminlogin.jpeg"))); // NOI18N
        lblPicAdminAfterLogin.setText("sadsa");
        lblPicAdminAfterLogin.setMinimumSize(new java.awt.Dimension(750, 450));
        getContentPane().add(lblPicAdminAfterLogin);
        lblPicAdminAfterLogin.setBounds(0, 0, 780, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminAftLoginCreateAccountManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAftLoginCreateAccountManagerActionPerformed
        setVisible(false);
        new ManagerInfo().setVisible(true);     
    }//GEN-LAST:event_btnAdminAftLoginCreateAccountManagerActionPerformed

    private void btnAdminSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSignOutActionPerformed
        setVisible(false);
        new AdminSignIn().setVisible(true);
    }//GEN-LAST:event_btnAdminSignOutActionPerformed

    private void btnAdminAftLoginViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAftLoginViewDataActionPerformed
       setVisible(false);
       new ViewDataAdmin().setVisible(true);
    }//GEN-LAST:event_btnAdminAftLoginViewDataActionPerformed

    private void btnAdminAfLogUpdateCompanyInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAfLogUpdateCompanyInfoActionPerformed
       setVisible(false);
       new CompanyInformation().setVisible(true);
    }//GEN-LAST:event_btnAdminAfLogUpdateCompanyInfoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAfterLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAfLogUpdateCompanyInfo;
    private javax.swing.JButton btnAdminAftLoginCreateAccountManager;
    private javax.swing.JButton btnAdminAftLoginViewData;
    private javax.swing.JButton btnAdminSignOut;
    private javax.swing.JLabel lblPicAdminAfterLogin;
    // End of variables declaration//GEN-END:variables
}
