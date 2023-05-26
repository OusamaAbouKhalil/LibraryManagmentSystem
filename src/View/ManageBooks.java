/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import static Controller.FileAccess.FILEBOOK;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abokh
 */
public class ManageBooks extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooks
     */
    public static AppControl controller;
    public FileAccess fileAccess;

    
    public ManageBooks() {
        fileAccess = new FileAccess();
        initComponents();
        controller = new AppControl();
        String coltitle[] = {"Book ID", "Book Name", "Author", "Quantity"};
        String data[][] = controller.getBooksdata();
        DefaultTableModel model = new DefaultTableModel(data, coltitle);
        booksTable.setModel(model);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBookName = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBookId = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAuthorName = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        butAdd = new necesario.RSMaterialButtonCircle();
        butUpdate = new necesario.RSMaterialButtonCircle();
        butDelete = new necesario.RSMaterialButtonCircle();
        jLabel14 = new javax.swing.JLabel();
        txtQuantity = new app.bolivia.swing.JCTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        booksTable = new rojeru_san.complementos.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1813, 859));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 740, -1, -1));

        jPanel3.setBackground(new java.awt.Color(101, 0, 101));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ManageBooks/icons8_back_to_48px.png"))); // NOI18N
        jLabel1.setText("Back");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        txtBookName.setBackground(new java.awt.Color(101, 0, 101));
        txtBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtBookName.setForeground(new java.awt.Color(255, 255, 255));
        txtBookName.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        txtBookName.setPhColor(new java.awt.Color(204, 204, 204));
        txtBookName.setPlaceholder("Enter Book Name :");

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Enter Book Name :");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ManageBooks/icons8_geography_book_100px.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ManageBooks/icons8_literature_100px.png"))); // NOI18N

        txtBookId.setBackground(new java.awt.Color(101, 0, 101));
        txtBookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtBookId.setForeground(new java.awt.Color(255, 255, 255));
        txtBookId.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        txtBookId.setPhColor(new java.awt.Color(204, 204, 204));
        txtBookId.setPlaceholder("Enter Book Id :");

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Book Id :");

        txtAuthorName.setBackground(new java.awt.Color(101, 0, 101));
        txtAuthorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthorName.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        txtAuthorName.setPhColor(new java.awt.Color(204, 204, 204));
        txtAuthorName.setPlaceholder("Author Name :");
        txtAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Quantity :");

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Author :");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ManageBooks/icons8_account_100px.png"))); // NOI18N

        butAdd.setBackground(new java.awt.Color(102, 153, 255));
        butAdd.setText("Add");
        butAdd.setToolTipText("");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        butUpdate.setBackground(new java.awt.Color(102, 153, 255));
        butUpdate.setText("Update");
        butUpdate.setToolTipText("");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        butDelete.setBackground(new java.awt.Color(102, 153, 255));
        butDelete.setText("Delete");
        butDelete.setToolTipText("");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ManageBooks/icons8_administrator_male_100px.png"))); // NOI18N

        txtQuantity.setBackground(new java.awt.Color(101, 0, 101));
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantity.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        txtQuantity.setPhColor(new java.awt.Color(204, 204, 204));
        txtQuantity.setPlaceholder("Quantity :");
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBookName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(butAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(jLabel9))
                .addGap(84, 84, 84)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, -1, 880));

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author", "Quanitity"
            }
        ));
        booksTable.setColorBackgoundHead(new java.awt.Color(101, 0, 101));
        booksTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        booksTable.setFuenteFilas(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        booksTable.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        booksTable.setFuenteHead(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        booksTable.setRowHeight(40);
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(booksTable);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 1120, 230));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(101, 0, 101));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ManageBooks/icons8_math_book_100px.png"))); // NOI18N
        jLabel2.setText("Manage Books");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 8, 0, new java.awt.Color(101, 0, 101)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Malgun Gothic", 3, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Signup/icons8_multiply_48px.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1820, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
        String bookName = txtBookName.getText();
        String author = txtAuthorName.getText();
        String quantity = txtQuantity.getText();
        String id = txtBookId.getText();
        if (bookName.isEmpty() || author.isEmpty()
                || quantity.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all the informations to add the book");

        } else if (controller.CheckBook(bookName, author)){ 
            JOptionPane.showMessageDialog(this, "Book Already exists");
            // System.out.println(controller.CheckBook(id, author));
        }
        else {
            controller.addBook(id,bookName, author, quantity);
            JOptionPane.showMessageDialog(this, "Book added succesfully");
            txtBookName.setText("");
            txtAuthorName.setText("");
            txtQuantity.setText("");
            txtBookId.setText("");
        String coltitle[] = {"Book ID", "Book Name", "Author", "Quantity"};
        String data[][] = controller.getBooksdata();
        DefaultTableModel model = new DefaultTableModel(data, coltitle);
        booksTable.setModel(model);
        }
    }//GEN-LAST:event_butAddActionPerformed

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        fileAccess.editRecordsBooks ( "Books.txt",  txtBookId.getText(),  1,   txtBookId.getText(),  txtBookName.getText(),  txtAuthorName.getText(),  txtQuantity.getText());
        String coltitle[] = {"Book ID", "Book Name", "Author", "Quantity"};
        String data[][] = controller.getBooksdata();
        DefaultTableModel model = new DefaultTableModel(data, coltitle);
        booksTable.setModel(model);
        JOptionPane.showMessageDialog(this, "Informations Updated . . .");
        
    }//GEN-LAST:event_butUpdateActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        fileAccess.removeRecords("Books.txt", txtBookId.getText() ,1, "\t");
         String coltitle[] = {"Book ID", "Book Name", "Author", "Quantity"};
        String data[][] = controller.getBooksdata();
        DefaultTableModel model = new DefaultTableModel(data, coltitle);
        booksTable.setModel(model);
    }//GEN-LAST:event_butDeleteActionPerformed

    private void txtAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorNameActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
            DefaultTableModel  defaultTableModel = (DefaultTableModel)booksTable.getModel();
        String bookID =  defaultTableModel.getValueAt(booksTable.getSelectedRow(), 0).toString();
        String bookName =  defaultTableModel.getValueAt(booksTable.getSelectedRow(), 1).toString();
        String author  =  defaultTableModel.getValueAt(booksTable.getSelectedRow(), 2).toString();
        String quantity =  defaultTableModel.getValueAt(booksTable.getSelectedRow(), 3).toString();
        // set the data on the lables
        txtBookId.setText(bookID);
        txtBookName.setText(bookName);
        txtAuthorName.setText(author);
        txtQuantity.setText(quantity);
    }//GEN-LAST:event_booksTableMouseClicked

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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro booksTable;
    private necesario.RSMaterialButtonCircle butAdd;
    private necesario.RSMaterialButtonCircle butDelete;
    private necesario.RSMaterialButtonCircle butUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private app.bolivia.swing.JCTextField txtAuthorName;
    private app.bolivia.swing.JCTextField txtBookId;
    private app.bolivia.swing.JCTextField txtBookName;
    private app.bolivia.swing.JCTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}