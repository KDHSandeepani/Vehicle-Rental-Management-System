
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Isurance_details extends javax.swing.JFrame {

    Connection con = new DBConnector().databaseConnection();
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"ID", "Vehicle Number", "Insurance Number", "Insurance Company", "Insuranced Date", "Insurance E.X.P. Date"}, 0);

    public Isurance_details() {
        initComponents();
        jTable_insurance.setModel(model1);
        insurance_refreshActionPerformed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_insurance_Number = new javax.swing.JTextField();
        btn_insurance_search1 = new javax.swing.JButton();
        btn_insurance_back = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_insurance_numberid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_insurance_vehicle_number = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_insurance_company = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_insurance_insert = new javax.swing.JButton();
        btn_insurance_update = new javax.swing.JButton();
        btn_insurance_deleted = new javax.swing.JButton();
        btn_insurance_clear = new javax.swing.JButton();
        txt_insurance_number = new javax.swing.JTextField();
        txt_insurance_expdate = new javax.swing.JTextField();
        txt_insurance_date = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_insurance = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel11.setBackground(new java.awt.Color(51, 153, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Vehicle Rental Management System For AR Enterprises");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Insurance Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Insurance Number");

        btn_insurance_search1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_insurance_search1.setText("SEARCH");
        btn_insurance_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insurance_search1ActionPerformed(evt);
            }
        });

        btn_insurance_back.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_insurance_back.setText("BACK");
        btn_insurance_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insurance_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_insurance_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_insurance_search1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(btn_insurance_back, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_insurance_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insurance_search1)
                    .addComponent(btn_insurance_back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Number ID");

        txt_insurance_numberid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_insurance_numberidActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Vehicle Number");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Insurance Number");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Insurance Company");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Insuranced Date");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Insurance E.X.P. Date");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btn_insurance_insert.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_insurance_insert.setText("INSERT");
        btn_insurance_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insurance_insertActionPerformed(evt);
            }
        });

        btn_insurance_update.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_insurance_update.setText("UPDATE");
        btn_insurance_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insurance_updateActionPerformed(evt);
            }
        });

        btn_insurance_deleted.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_insurance_deleted.setText("DELETED");
        btn_insurance_deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insurance_deletedActionPerformed(evt);
            }
        });

        btn_insurance_clear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_insurance_clear.setText("CLEAR");
        btn_insurance_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insurance_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_insurance_deleted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_insurance_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_insurance_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_insurance_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_insurance_insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insurance_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insurance_deleted)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insurance_clear)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_insurance_numberid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_insurance_date, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_insurance_number, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_insurance_vehicle_number, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txt_insurance_company)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_insurance_expdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_insurance_numberid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_insurance_vehicle_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_insurance_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_insurance_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txt_insurance_expdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_insurance_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_insurance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_insurance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_insuranceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_insurance);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insurance_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insurance_backActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_insurance_backActionPerformed

    private void btn_insurance_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insurance_search1ActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable_insurance.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable_insurance.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txt_insurance_Number.getText()));
        insurance_refreshActionPerformed();
        btn_insurance_clearActionPerformed(null);
    }//GEN-LAST:event_btn_insurance_search1ActionPerformed

    private void btn_insurance_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insurance_clearActionPerformed
        txt_insurance_Number.setText("");
        txt_insurance_numberid.setText("");
        txt_insurance_vehicle_number.setText("");
        txt_insurance_number.setText("");
        txt_insurance_company.setText("");
        txt_insurance_date.setText("");
        txt_insurance_expdate.setText("");
    }//GEN-LAST:event_btn_insurance_clearActionPerformed

    private void jTable_insuranceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_insuranceMouseClicked
        if (jTable_insurance.getSelectedRowCount() == 1) {
            int row = jTable_insurance.getSelectedRow();
            txt_insurance_numberid.setText(jTable_insurance.getValueAt(row, 0).toString());
            txt_insurance_vehicle_number.setText(jTable_insurance.getValueAt(row, 1).toString());
            txt_insurance_number.setText(jTable_insurance.getValueAt(row, 2).toString());
            txt_insurance_company.setText(jTable_insurance.getValueAt(row, 3).toString());
            txt_insurance_date.setText(jTable_insurance.getValueAt(row, 4).toString());
            txt_insurance_expdate.setText(jTable_insurance.getValueAt(row, 5).toString());
        }
    }//GEN-LAST:event_jTable_insuranceMouseClicked

    private void btn_insurance_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insurance_insertActionPerformed
        if (validateData()) {
            try {
                String query = "INSERT INTO insurance VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_insurance_numberid.getText());
                pst.setString(2, txt_insurance_vehicle_number.getText());
                pst.setString(3, txt_insurance_number.getText());
                pst.setString(4, txt_insurance_company.getText());
                pst.setString(5, txt_insurance_date.getText());
                pst.setString(6, txt_insurance_expdate.getText());
                pst.execute();
                JOptionPane.showMessageDialog(Isurance_details.this, "Details Inserted Successfully");
                insurance_refreshActionPerformed();
                btn_insurance_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(Isurance_details.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_insurance_insertActionPerformed

    private void btn_insurance_deletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insurance_deletedActionPerformed
        if (jTable_insurance.getSelectedRowCount() == 1) {
            int row = jTable_insurance.getSelectedRow();
            String data = jTable_insurance.getValueAt(row, 0).toString();
            Statement st;
            try {
                st = con.createStatement();
                st.executeUpdate("DELETE FROM insurance  WHERE insurance_id=" + data);
                JOptionPane.showMessageDialog(Isurance_details.this, "Data Deleted!");
                insurance_refreshActionPerformed();
                btn_insurance_clearActionPerformed(null);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(Isurance_details.this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to select one row to delete data");
        }
    }//GEN-LAST:event_btn_insurance_deletedActionPerformed

    private void btn_insurance_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insurance_updateActionPerformed
               if(!txt_insurance_number.getText().isEmpty()){
        if (validateData()) {
            try {
                 String query = "UPDATE insurance SET insurance_id =?,vehicles_numberplate=?, insurance_company=?,insurance_date=?,insurance_expdate =?WHERE insurance_number =?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_insurance_numberid.getText());    
                pst.setString(2, txt_insurance_vehicle_number.getText());
                pst.setString(3, txt_insurance_company.getText());
                pst.setString(4, txt_insurance_date.getText());
                pst.setString(5, txt_insurance_expdate.getText());
                 pst.setString(6, txt_insurance_number.getText());
                pst.execute();
                JOptionPane.showMessageDialog(Isurance_details.this, "Details Upadted Successfully");
                insurance_refreshActionPerformed();
                btn_insurance_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(Isurance_details.this, e.getMessage());
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "You Can't update a new data set");
        
        }
    }//GEN-LAST:event_btn_insurance_updateActionPerformed

    private void txt_insurance_numberidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_insurance_numberidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_insurance_numberidActionPerformed

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
            java.util.logging.Logger.getLogger(Isurance_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Isurance_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Isurance_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Isurance_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Isurance_details().setVisible(true);
            }
        });
    }

    private ArrayList<AccessInsuranceData> getDataList(String query) {
        ArrayList<AccessInsuranceData> dataList = new ArrayList();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            AccessInsuranceData data;
            while (rs.next()) {
                data = new AccessInsuranceData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                dataList.add(data);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }

    private boolean validateData() {
        if (txt_insurance_numberid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the ID field to continue");
            return false;
        }
        if (txt_insurance_vehicle_number.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Number_Plate field to continue");
            return false;
        }
        if (txt_insurance_number.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Insurance_Number field to continue");
            return false;
        }
        if (txt_insurance_company.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Insurance_Company field to continue");
            return false;
        }
        if (txt_insurance_date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Insurance_Date field to continue");
            return false;
        }
        if (txt_insurance_expdate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Insurance_EXPDate field to continue");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insurance_back;
    private javax.swing.JButton btn_insurance_clear;
    private javax.swing.JButton btn_insurance_deleted;
    private javax.swing.JButton btn_insurance_insert;
    private javax.swing.JButton btn_insurance_search1;
    private javax.swing.JButton btn_insurance_update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_insurance;
    private javax.swing.JTextField txt_insurance_Number;
    private javax.swing.JTextField txt_insurance_company;
    private javax.swing.JTextField txt_insurance_date;
    private javax.swing.JTextField txt_insurance_expdate;
    private javax.swing.JTextField txt_insurance_number;
    private javax.swing.JTextField txt_insurance_numberid;
    private javax.swing.JTextField txt_insurance_vehicle_number;
    // End of variables declaration//GEN-END:variables

    private void insurance_refreshActionPerformed() {
        ArrayList<AccessInsuranceData> data = getDataList("SELECT * FROM  insurance");
        model1.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            String a = data.get(i).getInsurance_id();
            String b = data.get(i).getNumberplate();
            String c = data.get(i).getInsurance_number();
            String d = data.get(i).getInsurance_company();
            String e = data.get(i).getInsurance_date();
            String f = data.get(i).getInsurance_expdate();
            model1.addRow(new String[]{a + "", b, c, d, e, f});
        }

    }

}
