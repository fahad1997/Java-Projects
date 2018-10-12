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
public class ViewImportedProduct extends javax.swing.JFrame {


    /**
     * Creates new form ViewImportedProduct
     */
    public ViewImportedProduct() {
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

        jPanel1 = new javax.swing.JPanel();
        lblViewIPC_Id = new javax.swing.JLabel();
        txtViewIPC_Id = new javax.swing.JTextField();
        btnOkViewIP = new javax.swing.JButton();
        lblViewIPC_Name = new javax.swing.JLabel();
        txtViewIPC_Name = new javax.swing.JTextField();
        lblViewIPC_mobile = new javax.swing.JLabel();
        txtViewIPC_mobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImportedProduct = new javax.swing.JTable();
        btnBackImportedproduct = new javax.swing.JButton();
        lblViewIPC_country = new javax.swing.JLabel();
        txtViewIPC_country = new javax.swing.JTextField();
        btnClearVIproduct = new javax.swing.JButton();
        lblViewIPC_tax = new javax.swing.JLabel();
        txtViewIPC_tax = new javax.swing.JTextField();
        lblViewIPC_total = new javax.swing.JLabel();
        txtViewIPC_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        lblViewIPC_Id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewIPC_Id.setForeground(new java.awt.Color(255, 255, 255));
        lblViewIPC_Id.setText("Company Id:");

        btnOkViewIP.setBackground(new java.awt.Color(102, 102, 255));
        btnOkViewIP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOkViewIP.setForeground(new java.awt.Color(255, 255, 255));
        btnOkViewIP.setText("Ok");
        btnOkViewIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkViewIPActionPerformed(evt);
            }
        });

        lblViewIPC_Name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewIPC_Name.setForeground(new java.awt.Color(255, 255, 255));
        lblViewIPC_Name.setText("Company Name:");

        lblViewIPC_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewIPC_mobile.setForeground(new java.awt.Color(255, 255, 255));
        lblViewIPC_mobile.setText("Contact Number:");

        tblImportedProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manager ID", "Date", "Product  ID", "Product Name", "Price", "Quantity(KG)", "Tax", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(tblImportedProduct);

        btnBackImportedproduct.setBackground(new java.awt.Color(102, 102, 255));
        btnBackImportedproduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBackImportedproduct.setForeground(new java.awt.Color(255, 255, 255));
        btnBackImportedproduct.setText("Back");
        btnBackImportedproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackImportedproductActionPerformed(evt);
            }
        });

        lblViewIPC_country.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewIPC_country.setForeground(new java.awt.Color(255, 255, 255));
        lblViewIPC_country.setText("Country:");

        btnClearVIproduct.setBackground(new java.awt.Color(153, 153, 255));
        btnClearVIproduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearVIproduct.setForeground(new java.awt.Color(0, 0, 0));
        btnClearVIproduct.setText("Clear");
        btnClearVIproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearVIproductActionPerformed(evt);
            }
        });

        lblViewIPC_tax.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewIPC_tax.setForeground(new java.awt.Color(255, 255, 255));
        lblViewIPC_tax.setText("Tax:");

        lblViewIPC_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblViewIPC_total.setForeground(new java.awt.Color(255, 255, 255));
        lblViewIPC_total.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblViewIPC_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblViewIPC_country, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblViewIPC_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtViewIPC_tax, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtViewIPC_Id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtViewIPC_country, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblViewIPC_mobile)
                        .addComponent(lblViewIPC_Name))
                    .addComponent(lblViewIPC_total, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtViewIPC_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(txtViewIPC_mobile)
                    .addComponent(txtViewIPC_total))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOkViewIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackImportedproduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearVIproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBackImportedproduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearVIproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOkViewIP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblViewIPC_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtViewIPC_Id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblViewIPC_Id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtViewIPC_Name))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtViewIPC_country, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblViewIPC_country, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtViewIPC_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblViewIPC_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblViewIPC_tax, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtViewIPC_tax)
                    .addComponent(lblViewIPC_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewIPC_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkViewIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkViewIPActionPerformed
        try{
            float tax=0;
            float total=0;
            DBConnection db=new DBConnection();
            db.dbconnection();
            String sql="select Company.C_name,Company.C_contact_no,Company.C_country,Import.M_id,Import.Date,IP_id,Import.P_name,Import.Price,Import.Quantity_KG,Import.Tax,Import.Sub_Total from Import inner join Company on Import.C_id=Company.C_id where Import.C_id=?";
            db.pst=db.con.prepareStatement(sql);
            db.pst.setString(1,txtViewIPC_Id.getText());
            db.rs=db.pst.executeQuery();
            DefaultTableModel row=(DefaultTableModel) tblImportedProduct.getModel();
            while(db.rs.next()){
            txtViewIPC_country.setText(db.rs.getString("C_country"));
            txtViewIPC_Name.setText(db.rs.getString("C_name"));
            txtViewIPC_mobile.setText(db.rs.getString("C_contact_no"));
            tax+=db.rs.getFloat("Tax");
            total+=db.rs.getFloat("Sub_Total");
                row.addRow(new Object[]{
                    db.rs.getString("M_id"),db.rs.getString("Date"),db.rs.getString("IP_id"),db.rs.getString("P_name"),db.rs.getString("Price"),db.rs.getString("Quantity_KG"),db.rs.getString("Tax"),db.rs.getString("Sub_Total")
                } );
            }
            txtViewIPC_tax.setText(String.valueOf(tax));
            txtViewIPC_total.setText(String.valueOf(total));
            db.con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnOkViewIPActionPerformed

    private void btnBackImportedproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackImportedproductActionPerformed
        setVisible(false);
        new ViewDataAdmin().setVisible(true);
    }//GEN-LAST:event_btnBackImportedproductActionPerformed

    private void btnClearVIproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearVIproductActionPerformed
       txtViewIPC_country.setText("");
       txtViewIPC_Name.setText("");
       txtViewIPC_mobile.setText("");
       txtViewIPC_Id.setText("C");
       setVisible(false);
       new ViewImportedProduct().setVisible(true);
    }//GEN-LAST:event_btnClearVIproductActionPerformed

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
            java.util.logging.Logger.getLogger(ViewImportedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewImportedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewImportedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewImportedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewImportedProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackImportedproduct;
    private javax.swing.JButton btnClearVIproduct;
    private javax.swing.JButton btnOkViewIP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewIPC_Id;
    private javax.swing.JLabel lblViewIPC_Name;
    private javax.swing.JLabel lblViewIPC_country;
    private javax.swing.JLabel lblViewIPC_mobile;
    private javax.swing.JLabel lblViewIPC_tax;
    private javax.swing.JLabel lblViewIPC_total;
    private javax.swing.JTable tblImportedProduct;
    private javax.swing.JTextField txtViewIPC_Id;
    private javax.swing.JTextField txtViewIPC_Name;
    private javax.swing.JTextField txtViewIPC_country;
    private javax.swing.JTextField txtViewIPC_mobile;
    private javax.swing.JTextField txtViewIPC_tax;
    private javax.swing.JTextField txtViewIPC_total;
    // End of variables declaration//GEN-END:variables
}