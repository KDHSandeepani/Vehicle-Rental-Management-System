
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

public class Vehicle extends javax.swing.JFrame {

    Connection con = new DBConnector().databaseConnection();
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"ID", "Nmber Plate", "Brand", "Vehicle Name", "Year", "Colour", "Fual Type", "Transmission", "Daily Hire Price", "Status"}, 0);
            

    public Vehicle() {
        initComponents();
        jTable_vehicles.setModel(model1);
        vehicle_refreshActionPerformed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_vehicles_NumberPlate = new javax.swing.JTextField();
        btn_vehicles_search = new javax.swing.JButton();
        btn_vehicles_back = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_vehicles_numberplate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_vehicles_brand = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_vehicles_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_vehicles_year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_vehicles_colour = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcb_vehicles_fualtype = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcb_vehicles_transmission = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txt_vehicles_dhprice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcb_vehicles_status = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btn_vehicles_insert = new javax.swing.JButton();
        btn_vehicles_update = new javax.swing.JButton();
        btn_vehicles_deleted = new javax.swing.JButton();
        btn_vehicles_clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_vehicles_id = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_vehicles = new javax.swing.JTable();

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vehicles Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Number Plate");

        btn_vehicles_search.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_vehicles_search.setText("SEARCH");
        btn_vehicles_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicles_searchActionPerformed(evt);
            }
        });

        btn_vehicles_back.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_vehicles_back.setText("BACK");
        btn_vehicles_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicles_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_vehicles_NumberPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_vehicles_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_vehicles_back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_vehicles_NumberPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vehicles_search)
                    .addComponent(btn_vehicles_back))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Number Plate");

        txt_vehicles_numberplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vehicles_numberplateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Brand");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Vehicle Name");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Year");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Colour");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Fual Type");

        jcb_vehicles_fualtype.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcb_vehicles_fualtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fual Type", "petrol", "Diesal", "Hybrid" }));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Transmission");

        jcb_vehicles_transmission.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcb_vehicles_transmission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transmission", "Manual", "Auto", " " }));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Daily Hire Price");

        txt_vehicles_dhprice.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Status");

        jcb_vehicles_status.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcb_vehicles_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Available", "Returaned" }));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btn_vehicles_insert.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_vehicles_insert.setText("INSERT");
        btn_vehicles_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicles_insertActionPerformed(evt);
            }
        });

        btn_vehicles_update.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_vehicles_update.setText("UPDATE");
        btn_vehicles_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicles_updateActionPerformed(evt);
            }
        });

        btn_vehicles_deleted.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_vehicles_deleted.setText("DELETED");
        btn_vehicles_deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicles_deletedActionPerformed(evt);
            }
        });

        btn_vehicles_clear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_vehicles_clear.setText("CLEAR");
        btn_vehicles_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicles_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_vehicles_deleted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_vehicles_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_vehicles_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_vehicles_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vehicles_insert)
                .addGap(18, 18, 18)
                .addComponent(btn_vehicles_update)
                .addGap(18, 18, 18)
                .addComponent(btn_vehicles_deleted)
                .addGap(18, 18, 18)
                .addComponent(btn_vehicles_clear)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("Vehicle ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_vehicles_dhprice, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcb_vehicles_fualtype, 0, 155, Short.MAX_VALUE)
                                    .addComponent(txt_vehicles_year))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_vehicles_transmission, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_vehicles_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_vehicles_colour)))
                    .addComponent(txt_vehicles_name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_vehicles_id, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_vehicles_numberplate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_vehicles_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_vehicles_numberplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_vehicles_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_vehicles_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_vehicles_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_vehicles_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_vehicles_colour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcb_vehicles_fualtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcb_vehicles_transmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_vehicles_dhprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jcb_vehicles_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTable_vehicles.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTable_vehicles.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_vehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_vehiclesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_vehicles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_vehicles_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicles_clearActionPerformed
        txt_vehicles_id.setText("");
        txt_vehicles_NumberPlate.setText("");
        txt_vehicles_numberplate.setText("");
        txt_vehicles_brand.setText("");
        txt_vehicles_name.setText("");
        txt_vehicles_year.setText("");
        txt_vehicles_colour.setText("");
        jcb_vehicles_fualtype.setSelectedIndex(0);
        jcb_vehicles_transmission.setSelectedIndex(0);
        txt_vehicles_dhprice.setText("");
        jcb_vehicles_status.setSelectedIndex(0);
    }//GEN-LAST:event_btn_vehicles_clearActionPerformed

    private void btn_vehicles_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicles_backActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_vehicles_backActionPerformed

    private void btn_vehicles_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicles_searchActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable_vehicles.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable_vehicles.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txt_vehicles_NumberPlate.getText()));
        vehicle_refreshActionPerformed();
        btn_vehicles_clearActionPerformed(null);
    }//GEN-LAST:event_btn_vehicles_searchActionPerformed

    private void btn_vehicles_deletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicles_deletedActionPerformed
         if (jTable_vehicles.getSelectedRowCount() == 1) {
            int row = jTable_vehicles.getSelectedRow();
            String data = jTable_vehicles.getValueAt(row, 0).toString();
            Statement st;
            try {
                st = con.createStatement();
                st.executeUpdate("DELETE FROM  vehicles  WHERE  vehicle_id =" + data);
                JOptionPane.showMessageDialog(Vehicle.this, "Data deleted!");
                vehicle_refreshActionPerformed();
                btn_vehicles_clearActionPerformed(null);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(Vehicle.this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to select one row to delete data");
        }
    }//GEN-LAST:event_btn_vehicles_deletedActionPerformed

    private void btn_vehicles_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicles_insertActionPerformed
//if(txt_vehicles_numberplate.getText().isEmpty()){
        if (validateData()) {
            try {
                String query = "INSERT INTO vehicles  VALUES (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_vehicles_id.getText());
                pst.setString(2, txt_vehicles_numberplate.getText());
                pst.setString(3, txt_vehicles_brand.getText());
                pst.setString(4, txt_vehicles_name.getText());
                pst.setString(5, txt_vehicles_year.getText());
                pst.setString(6, txt_vehicles_colour.getText());
                pst.setString(7, jcb_vehicles_fualtype.getSelectedItem().toString());
                pst.setString(8, jcb_vehicles_transmission.getSelectedItem().toString());
                pst.setString(9, txt_vehicles_dhprice.getText());
                pst.setString(10,jcb_vehicles_status.getSelectedItem().toString());
                pst.execute();
                JOptionPane.showMessageDialog(Vehicle.this, "Details Inserted Successfully");
                vehicle_refreshActionPerformed();
                btn_vehicles_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(Vehicle.this, e.getMessage());
            }
        }
        //}
       // else{
           // JOptionPane.showMessageDialog(this, "You Can't insert a previous data set");
        
        //}  
    }//GEN-LAST:event_btn_vehicles_insertActionPerformed

    private void txt_vehicles_numberplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vehicles_numberplateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehicles_numberplateActionPerformed

    private void jTable_vehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_vehiclesMouseClicked
       if (jTable_vehicles.getSelectedRowCount() == 1) {
            int row = jTable_vehicles.getSelectedRow();
            txt_vehicles_id.setText(jTable_vehicles.getValueAt(row, 0).toString());
            txt_vehicles_numberplate.setText(jTable_vehicles.getValueAt(row, 1).toString());
            txt_vehicles_brand.setText(jTable_vehicles.getValueAt(row, 2).toString());
            txt_vehicles_name.setText(jTable_vehicles.getValueAt(row, 3).toString());
            txt_vehicles_year.setText(jTable_vehicles.getValueAt(row, 4).toString());
            txt_vehicles_colour.setText(jTable_vehicles.getValueAt(row, 5).toString());
            jcb_vehicles_fualtype.setSelectedItem(jTable_vehicles.getValueAt(row, 6).toString());
            jcb_vehicles_transmission.setSelectedItem(jTable_vehicles.getValueAt(row, 7).toString());
            txt_vehicles_dhprice.setText(jTable_vehicles.getValueAt(row, 8).toString());
            jcb_vehicles_status.setSelectedItem(jTable_vehicles.getValueAt(row, 9).toString());
       }     
    }//GEN-LAST:event_jTable_vehiclesMouseClicked

    private void btn_vehicles_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicles_updateActionPerformed
                if(!txt_vehicles_numberplate.getText().isEmpty()){
        if (validateData()) {
            try {
                 String query = "UPDATE vehicles SET vehicle_id =?,vehicles_brand=?,vehicles_name=?,vehicles_year=?,vehicles_colour=?,vehicles_fualtype=?,vehicles_transmission=?,vehicles_dhprice=?,vehicles_Status=?WHERE vehicles_numberplate=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_vehicles_id.getText());    
                pst.setString(2, txt_vehicles_brand.getText());
                pst.setString(3, txt_vehicles_name.getText());
                pst.setString(4, txt_vehicles_year.getText());
                pst.setString(5, txt_vehicles_colour.getText());
                pst.setString(6, jcb_vehicles_fualtype.getSelectedItem().toString());
                pst.setString(7, jcb_vehicles_transmission.getSelectedItem().toString());
                pst.setString(8, txt_vehicles_dhprice.getText());
                pst.setString(9, jcb_vehicles_status.getSelectedItem().toString());
                pst.setString(10, txt_vehicles_numberplate.getText());
                pst.execute();
                JOptionPane.showMessageDialog(Vehicle.this, "Details Upadted Successfully");
                vehicle_refreshActionPerformed();
                btn_vehicles_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(Vehicle.this, e.getMessage());
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "You Can't update a new data set");
        
        }
    }//GEN-LAST:event_btn_vehicles_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicle().setVisible(true);
            }
        });
    }

    private ArrayList<AccessVehicleData> getDataList(String query) {
        ArrayList<AccessVehicleData> dataList = new ArrayList();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            AccessVehicleData data;
            while (rs.next()) {
                data = new AccessVehicleData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10));
                dataList.add(data);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }
    
    private boolean validateData() {
         if (txt_vehicles_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the ID field to continue");
            return false;
        }
        if (txt_vehicles_numberplate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Number_Plate field to continue");
            return false;
        }
        if (txt_vehicles_brand.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Vehicles_Brand field to continue");
            return false;
        }
        if (txt_vehicles_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Vehicles_name field to continue");
            return false;
        }
        if (txt_vehicles_year.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Vehicles_Year field to continue");
            return false;
        }
        if (txt_vehicles_colour.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Vehicles_Colour field to continue");
            return false;
        }
        if (txt_vehicles_dhprice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Daily Hire Price field to continue");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_vehicles_back;
    private javax.swing.JButton btn_vehicles_clear;
    private javax.swing.JButton btn_vehicles_deleted;
    private javax.swing.JButton btn_vehicles_insert;
    private javax.swing.JButton btn_vehicles_search;
    private javax.swing.JButton btn_vehicles_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_vehicles;
    private javax.swing.JComboBox<String> jcb_vehicles_fualtype;
    private javax.swing.JComboBox<String> jcb_vehicles_status;
    private javax.swing.JComboBox<String> jcb_vehicles_transmission;
    private javax.swing.JTextField txt_vehicles_NumberPlate;
    private javax.swing.JTextField txt_vehicles_brand;
    private javax.swing.JTextField txt_vehicles_colour;
    private javax.swing.JTextField txt_vehicles_dhprice;
    private javax.swing.JTextField txt_vehicles_id;
    private javax.swing.JTextField txt_vehicles_name;
    private javax.swing.JTextField txt_vehicles_numberplate;
    private javax.swing.JTextField txt_vehicles_year;
    // End of variables declaration//GEN-END:variables

    private void vehicle_refreshActionPerformed() {
        ArrayList<AccessVehicleData> data = getDataList("SELECT * FROM  vehicles");
        model1.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            String a = data.get(i).getId() ;
            String b = data.get(i).getNumberplate();
            String c = data.get(i).getBrand();
            String d = data.get(i).getName();
            String e= data.get(i).getYear();
            String f = data.get(i).getColour();
            String g = data.get(i).getFualtype();
            String h = data.get(i).getTransmission();
            String j = data.get(i).getDhprice();
            String k = data.get(i).getStatus();
            model1.addRow(new String[]{a + "", b, c, d, e, f, g, h, j, k});
        }

    }



}

