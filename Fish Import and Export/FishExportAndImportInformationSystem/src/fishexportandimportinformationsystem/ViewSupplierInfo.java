/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fishexportandimportinformationsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewSupplierInfo extends javax.swing.JFrame {


    /** Creates new form ViewSupplierInfo */
    public ViewSupplierInfo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblViewSupplierManagerId = new javax.swing.JLabel();
        txtViewSupplierManagerId = new javax.swing.JTextField();
        btnOkViewSupplierInfo = new javax.swing.JButton();
        lblViewSupplierManagerName = new javax.swing.JLabel();
        txtViewSupplierManagerName = new javax.swing.JTextField();
        lblViewSupplierManagerMobile = new javax.swing.JLabel();
        txtViewSupplierManagerMobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleSupplierInfo = new javax.swing.JTable();
        btnBackISupplierInfo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        lblViewSupplierManagerId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewSupplierManagerId.setForeground(new java.awt.Color(255, 255, 255));
        lblViewSupplierManagerId.setText("Manager ID:");

        txtViewSupplierManagerId.setText("M");

        btnOkViewSupplierInfo.setText("Ok");
        btnOkViewSupplierInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkViewSupplierInfoActionPerformed(evt);
            }
        });

        lblViewSupplierManagerName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewSupplierManagerName.setForeground(new java.awt.Color(255, 255, 255));
        lblViewSupplierManagerName.setText("Name:");

        lblViewSupplierManagerMobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewSupplierManagerMobile.setForeground(new java.awt.Color(255, 255, 255));
        lblViewSupplierManagerMobile.setText("Mobile:");

        tbleSupplierInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Name", "Age", "Mobile", "Gender", "Address"
            }
        ));
        jScrollPane1.setViewportView(tbleSupplierInfo);

        btnBackISupplierInfo.setBackground(new java.awt.Color(0, 102, 255));
        btnBackISupplierInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBackISupplierInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnBackISupplierInfo.setText("Back");
        btnBackISupplierInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackISupplierInfoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblViewSupplierManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtViewSupplierManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOkViewSupplierInfo)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblViewSupplierManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblViewSupplierManagerMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtViewSupplierManagerName)
                    .addComponent(txtViewSupplierManagerMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackISupplierInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblViewSupplierManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblViewSupplierManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtViewSupplierManagerId, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(txtViewSupplierManagerName)
                    .addComponent(btnBackISupplierInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOkViewSupplierInfo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtViewSupplierManagerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblViewSupplierManagerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackISupplierInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackISupplierInfoActionPerformed
        setVisible(false);
        new ViewDataAdmin().setVisible(true);
    }//GEN-LAST:event_btnBackISupplierInfoActionPerformed

    private void btnOkViewSupplierInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkViewSupplierInfoActionPerformed
        try{
            DBConnection db=new DBConnection();
            db.dbconnection();
            String sql="select S_id,S_name,Age,S_mobile,Gender,S_address,M_name,M_Mobile from Supplier inner join Manager on Supplier.M_id=Manager.M_id where Supplier.M_id=?";
            db.pst=db.con.prepareStatement(sql);
            db.pst.setString(1,txtViewSupplierManagerId.getText());
            db.rs=db.pst.executeQuery();
            DefaultTableModel row=(DefaultTableModel) tbleSupplierInfo.getModel();
            while(db.rs.next()){
            txtViewSupplierManagerName.setText(db.rs.getString("M_name"));
            txtViewSupplierManagerMobile.setText(db.rs.getString("M_Mobile"));
                row.addRow(new Object[]{
                    db.rs.getString("S_id"),db.rs.getString("S_name"),db.rs.getString("Age"),db.rs.getString("S_mobile"),db.rs.getString("Gender"),db.rs.getString("S_address")
                } );
            }
            db.con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnOkViewSupplierInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       new ViewSupplierInfo().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSupplierInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSupplierInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSupplierInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSupplierInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSupplierInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackISupplierInfo;
    private javax.swing.JButton btnOkViewSupplierInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewSupplierManagerId;
    private javax.swing.JLabel lblViewSupplierManagerMobile;
    private javax.swing.JLabel lblViewSupplierManagerName;
    private javax.swing.JTable tbleSupplierInfo;
    private javax.swing.JTextField txtViewSupplierManagerId;
    private javax.swing.JTextField txtViewSupplierManagerMobile;
    private javax.swing.JTextField txtViewSupplierManagerName;
    // End of variables declaration//GEN-END:variables

}
