
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Customer extends javax.swing.JFrame {

    Connection con = new DBConnector().databaseConnection();
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"ID", "NIC", "Name", "Address", "Phone Number"}, 0);

    public Customer() {
        initComponents();
        jTable_registration.setModel(model1);
        registration_refreshActionPerformed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_registration_NIC = new javax.swing.JTextField();
        btn_registration_search = new javax.swing.JButton();
        btn_registration_back = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_registration_nic = new javax.swing.JTextField();
        txt_registration_address = new javax.swing.JTextField();
        txt_registration_phonenumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_registration_id = new javax.swing.JTextField();
        txt_registration_name = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_registration_insert = new javax.swing.JButton();
        btn_registration_update = new javax.swing.JButton();
        btn_registration_delete = new javax.swing.JButton();
        btn_registration_clear = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_registration = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vehicle Rental Management System For AR Enterprises");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Register");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("NIC");

        txt_registration_NIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_registration_NICKeyPressed(evt);
            }
        });

        btn_registration_search.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_registration_search.setText("SEARCH");
        btn_registration_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registration_searchActionPerformed(evt);
            }
        });

        btn_registration_back.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_registration_back.setText("BACK");
        btn_registration_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registration_backMouseClicked(evt);
            }
        });
        btn_registration_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registration_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_registration_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registration_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registration_back, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_registration_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registration_search)
                    .addComponent(btn_registration_back))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("NIC");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_registration_address)
                    .addComponent(txt_registration_phonenumber)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_registration_id, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_registration_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_registration_name)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(txt_registration_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_registration_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_registration_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_registration_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_registration_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_registration_insert.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_registration_insert.setText("INSERT");
        btn_registration_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registration_insertActionPerformed(evt);
            }
        });

        btn_registration_update.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_registration_update.setText("UPDATE");
        btn_registration_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registration_updateActionPerformed(evt);
            }
        });

        btn_registration_delete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_registration_delete.setText("DELETED");
        btn_registration_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registration_deleteActionPerformed(evt);
            }
        });

        btn_registration_clear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_registration_clear.setText("CLEAR");
        btn_registration_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registration_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registration_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registration_update, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registration_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registration_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_registration_insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registration_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registration_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btn_registration_clear)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable_registration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_registrationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_registration);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registration_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registration_backMouseClicked
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_registration_backMouseClicked

    private void txt_registration_NICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_registration_NICKeyPressed

    }//GEN-LAST:event_txt_registration_NICKeyPressed

    private void btn_registration_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registration_searchActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable_registration.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable_registration.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txt_registration_NIC.getText()));
        registration_refreshActionPerformed();
        btn_registration_clearActionPerformed(null);
    }//GEN-LAST:event_btn_registration_searchActionPerformed

    private void btn_registration_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registration_clearActionPerformed
        txt_registration_NIC.setText("");
        txt_registration_id.setText("");
        txt_registration_nic.setText("");
        txt_registration_name.setText("");
        txt_registration_address.setText("");
        txt_registration_phonenumber.setText("");
    }//GEN-LAST:event_btn_registration_clearActionPerformed

    private void btn_registration_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registration_deleteActionPerformed
        if (jTable_registration.getSelectedRowCount() == 1) {
            int row = jTable_registration.getSelectedRow();
            String data = jTable_registration.getValueAt(row, 0).toString();
            Statement st;
            try {
                st = con.createStatement();
                st.executeUpdate("DELETE FROM registration WHERE Customer_id=" + data);
                JOptionPane.showMessageDialog(Customer.this, "Data Deleted!");
                registration_refreshActionPerformed();
                btn_registration_clearActionPerformed(null);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(Customer.this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to select one row to delete data");
        }
    }//GEN-LAST:event_btn_registration_deleteActionPerformed

    private void btn_registration_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registration_insertActionPerformed
        //if(txt_registration_id.getText().isEmpty()){
        if (validateData()) {
            try {
                String query = "INSERT INTO registration VALUES (?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_registration_id.getText());
                pst.setString(2, txt_registration_nic.getText());
                pst.setString(3, txt_registration_name.getText());
                pst.setString(4, txt_registration_address.getText());
                pst.setString(5, txt_registration_phonenumber.getText());
                pst.execute();
                JOptionPane.showMessageDialog(Customer.this, "Details Inserted Successfully");
                registration_refreshActionPerformed();
                btn_registration_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(Customer.this, e.getMessage());
            }
        }
        //}
        //else{
            //JOptionPane.showMessageDialog(this, "You Can't insert a previous data set");
        
        //}
    }//GEN-LAST:event_btn_registration_insertActionPerformed

    private void btn_registration_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registration_updateActionPerformed
        if(!txt_registration_nic.getText().isEmpty()){
        if (validateData()) {
            try {
                 String query = "UPDATE registration SET customer_id =?,customer_name=?,"
                         + "customer_address =?,customer_phonenumber=?WHERE customer_nic=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_registration_id.getText());    
                pst.setString(2, txt_registration_name.getText());
                pst.setString(3, txt_registration_address.getText());
                pst.setString(4, txt_registration_phonenumber.getText());
                pst.setString(5, txt_registration_nic.getText());
                pst.execute();
                JOptionPane.showMessageDialog(Customer.this, "Details Upadted Successfully");
                registration_refreshActionPerformed();
                btn_registration_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(Customer.this, e.getMessage());
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "You Can't update a new data set");
        
        }
    }   

    private boolean validateData() {
        if (txt_registration_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the ID field to continue");
            return false;
        }

        if (txt_registration_nic.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the NIC field to continue");
            return false;
        }
        if (txt_registration_nic.getText().length() > 12) {
            JOptionPane.showMessageDialog(this, "NIC field must have 12 charcters");
            return false;
        }
        if (!Pattern.matches("^([0-9]{9}[xXvV]|[0-9]{12})$", txt_registration_nic.getText())) {
            JOptionPane.showMessageDialog(this, "NIC field invalid");
            return false;
        }

        if (txt_registration_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Name field to continue");
            return false;
        }
        if (txt_registration_name.getText().length() > 200) {
            JOptionPane.showMessageDialog(this, "Name field must have only 1-200 charcters");
            //txt_registration_name.requestFocus();
            return false;
        }
        if (!Pattern.matches("[A-Z a-z]+", txt_registration_name.getText())) {
            JOptionPane.showMessageDialog(this, "Name field must have only 'A-Z' 'a-z' 'space' charcters");
            return false;
        }
        if (txt_registration_address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Address field to continue");
            return false;
        }
        if (txt_registration_address.getText().length() > 200) {
            JOptionPane.showMessageDialog(this, "Address field must have only 1-200 charcters");
            return false;
        }
        if (!Pattern.matches("^[a-z A-Z 0-9,/._]+$", txt_registration_address.getText())) {
            JOptionPane.showMessageDialog(this, "Address field invalid");
            return false;
        }
        if (txt_registration_phonenumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Mobile no field to continue");
            return false;
        }
        if (txt_registration_phonenumber.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Mobile no field must have 10 charcters");
            return false;
        }
        if (!Pattern.matches("[0-9]+", txt_registration_phonenumber.getText())) {
            JOptionPane.showMessageDialog(this, "Mobile no field must have only number");
            return false;
        }

        return true;

    }//GEN-LAST:event_btn_registration_updateActionPerformed

    private void btn_registration_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registration_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registration_backActionPerformed

    private void jTable_registrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_registrationMouseClicked
        if (jTable_registration.getSelectedRowCount() == 1) {
            int row = jTable_registration.getSelectedRow();
            txt_registration_id.setText(jTable_registration.getValueAt(row, 0).toString());
            txt_registration_nic.setText(jTable_registration.getValueAt(row, 1).toString());
            txt_registration_name.setText(jTable_registration.getValueAt(row, 2).toString());
            txt_registration_address.setText(jTable_registration.getValueAt(row, 3).toString());
            txt_registration_phonenumber.setText(jTable_registration.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_jTable_registrationMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    private ArrayList<AccessRegistrationData> getDataList(String query) {
        ArrayList<AccessRegistrationData> dataList = new ArrayList();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            AccessRegistrationData data;
            while (rs.next()) {
                data = new AccessRegistrationData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                dataList.add(data);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registration_back;
    private javax.swing.JButton btn_registration_clear;
    private javax.swing.JButton btn_registration_delete;
    private javax.swing.JButton btn_registration_insert;
    private javax.swing.JButton btn_registration_search;
    private javax.swing.JButton btn_registration_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable_registration;
    private javax.swing.JTextField txt_registration_NIC;
    private javax.swing.JTextField txt_registration_address;
    private javax.swing.JTextField txt_registration_id;
    private javax.swing.JTextField txt_registration_name;
    private javax.swing.JTextField txt_registration_nic;
    private javax.swing.JTextField txt_registration_phonenumber;
    // End of variables declaration//GEN-END:variables

    private void registration_refreshActionPerformed() {
        ArrayList<AccessRegistrationData> data = getDataList("SELECT * FROM registration");
        model1.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            String a = data.get(i).getId();
            String b = data.get(i).getNic();
            String c = data.get(i).getName();
            String d = data.get(i).getAddress();
            String e = data.get(i).getPhonenumber();;
            model1.addRow(new String[]{a + "", b, c, d, e});
        }

    }
}
