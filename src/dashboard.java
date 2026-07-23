
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.management.Query;

public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
        dashboardTotalcar();
        dashboardTotalcustomer();
        dashboardTotalVehicleReturn();
    }

    Statement pst = null;
    ResultSet rs = null;

    public void dashboardTotalcar() {
        String sql = "SELECT COUNT(vehicle_id) FROM vehicles";
        Connection con = new DBConnector().databaseConnection();
        int countTC = 0;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                countTC = rs.getInt("COUNT(vehicle_id)");
            }
            HomeTotalCars.setText("" + countTC);
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    public void dashboardTotalcustomer() {
        String sql = "SELECT COUNT(customer_id) FROM registration";
        Connection con = new DBConnector().databaseConnection();
        int countTC = 0;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                countTC = rs.getInt("COUNT(customer_id)");
            }
            HomeTotalCustomer.setText("" + countTC);
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
        public void dashboardTotalVehicleReturn() {
        String sql = "SELECT COUNT(vehicles_Status) FROM vehicles";
        Connection con = new DBConnector().databaseConnection();
        int countTC = 0;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                countTC = rs.getInt("COUNT(vehicles_Status)");
            }
            HomeTotalReturned.setText("" + countTC);
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        DashboardDisplays = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_vehicles = new javax.swing.JLabel();
        txt_customer = new javax.swing.JLabel();
        txt_payment = new javax.swing.JLabel();
        txt_insurance = new javax.swing.JLabel();
        dashboard_back = new javax.swing.JLabel();
        HomeTotalc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HomeTotalCars = new javax.swing.JLabel();
        HomeTotalc2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        HomeTotalCustomer = new javax.swing.JLabel();
        HomeTotalc3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        HomeTotalReturned = new javax.swing.JLabel();
        HomeTotalc4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        HomeTotalCars4 = new javax.swing.JLabel();
        HomeTotalc5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        HomeTotalCars5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

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
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel2.setText("     DASHBOARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txt_vehicles.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_vehicles.setText("    Vehicles Registration");
        txt_vehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_vehiclesMouseClicked(evt);
            }
        });

        txt_customer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_customer.setText("    Customer Registration");
        txt_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_customerMouseClicked(evt);
            }
        });

        txt_payment.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_payment.setText("    Payment Details");
        txt_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_paymentMouseClicked(evt);
            }
        });

        txt_insurance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_insurance.setText("    Insurance Details");
        txt_insurance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_insuranceMouseClicked(evt);
            }
        });

        dashboard_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout-vector-icon (1) (1).jpg"))); // NOI18N
        dashboard_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_vehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(txt_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_insurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboard_back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txt_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_vehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_insurance, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboard_back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        HomeTotalc.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("All Vehicles");

        HomeTotalCars.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        HomeTotalCars.setForeground(new java.awt.Color(255, 255, 255));
        HomeTotalCars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTotalCars.setText("0");

        javax.swing.GroupLayout HomeTotalcLayout = new javax.swing.GroupLayout(HomeTotalc);
        HomeTotalc.setLayout(HomeTotalcLayout);
        HomeTotalcLayout.setHorizontalGroup(
            HomeTotalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeTotalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(HomeTotalCars, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        HomeTotalcLayout.setVerticalGroup(
            HomeTotalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeTotalCars)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        HomeTotalc2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("All Customers");

        HomeTotalCustomer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        HomeTotalCustomer.setForeground(new java.awt.Color(255, 255, 255));
        HomeTotalCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTotalCustomer.setText("0");

        javax.swing.GroupLayout HomeTotalc2Layout = new javax.swing.GroupLayout(HomeTotalc2);
        HomeTotalc2.setLayout(HomeTotalc2Layout);
        HomeTotalc2Layout.setHorizontalGroup(
            HomeTotalc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeTotalc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(HomeTotalCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        HomeTotalc2Layout.setVerticalGroup(
            HomeTotalc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeTotalCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomeTotalc3.setBackground(new java.awt.Color(102, 51, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vehicles Returned");

        HomeTotalReturned.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        HomeTotalReturned.setForeground(new java.awt.Color(255, 255, 255));
        HomeTotalReturned.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTotalReturned.setText("0");

        javax.swing.GroupLayout HomeTotalc3Layout = new javax.swing.GroupLayout(HomeTotalc3);
        HomeTotalc3.setLayout(HomeTotalc3Layout);
        HomeTotalc3Layout.setHorizontalGroup(
            HomeTotalc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeTotalc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(HomeTotalReturned, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        HomeTotalc3Layout.setVerticalGroup(
            HomeTotalc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeTotalReturned)
                .addGap(18, 18, 18))
        );

        HomeTotalc4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vehicles Availables");

        HomeTotalCars4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        HomeTotalCars4.setForeground(new java.awt.Color(255, 255, 255));
        HomeTotalCars4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTotalCars4.setText("0");

        javax.swing.GroupLayout HomeTotalc4Layout = new javax.swing.GroupLayout(HomeTotalc4);
        HomeTotalc4.setLayout(HomeTotalc4Layout);
        HomeTotalc4Layout.setHorizontalGroup(
            HomeTotalc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeTotalc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(HomeTotalCars4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        HomeTotalc4Layout.setVerticalGroup(
            HomeTotalc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeTotalCars4)
                .addGap(18, 18, 18))
        );

        HomeTotalc5.setBackground(new java.awt.Color(0, 0, 153));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Revenue");

        HomeTotalCars5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        HomeTotalCars5.setForeground(new java.awt.Color(255, 255, 255));
        HomeTotalCars5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTotalCars5.setText("0");

        javax.swing.GroupLayout HomeTotalc5Layout = new javax.swing.GroupLayout(HomeTotalc5);
        HomeTotalc5.setLayout(HomeTotalc5Layout);
        HomeTotalc5Layout.setHorizontalGroup(
            HomeTotalc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeTotalc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeTotalCars5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        HomeTotalc5Layout.setVerticalGroup(
            HomeTotalc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTotalc5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(HomeTotalCars5)
                .addContainerGap())
        );

        javax.swing.GroupLayout DashboardDisplaysLayout = new javax.swing.GroupLayout(DashboardDisplays);
        DashboardDisplays.setLayout(DashboardDisplaysLayout);
        DashboardDisplaysLayout.setHorizontalGroup(
            DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DashboardDisplaysLayout.createSequentialGroup()
                .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardDisplaysLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeTotalc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeTotalc3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeTotalc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeTotalc4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(DashboardDisplaysLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(HomeTotalc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        DashboardDisplaysLayout.setVerticalGroup(
            DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardDisplaysLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DashboardDisplaysLayout.createSequentialGroup()
                        .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HomeTotalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HomeTotalc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(DashboardDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeTotalc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeTotalc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(HomeTotalc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardDisplays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardDisplays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_customerMouseClicked
        new Customer().setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_customerMouseClicked

    private void txt_vehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_vehiclesMouseClicked
        new Vehicle().setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_vehiclesMouseClicked

    private void txt_insuranceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_insuranceMouseClicked
        new Isurance_details().setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_insuranceMouseClicked

    private void txt_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_paymentMouseClicked
        new payment().setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_paymentMouseClicked

    private void dashboard_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_backMouseClicked
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboard_backMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardDisplays;
    private javax.swing.JLabel HomeTotalCars;
    private javax.swing.JLabel HomeTotalCars4;
    private javax.swing.JLabel HomeTotalCars5;
    private javax.swing.JLabel HomeTotalCustomer;
    private javax.swing.JLabel HomeTotalReturned;
    private javax.swing.JPanel HomeTotalc;
    private javax.swing.JPanel HomeTotalc2;
    private javax.swing.JPanel HomeTotalc3;
    private javax.swing.JPanel HomeTotalc4;
    private javax.swing.JPanel HomeTotalc5;
    private javax.swing.JLabel dashboard_back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txt_customer;
    private javax.swing.JLabel txt_insurance;
    private javax.swing.JLabel txt_payment;
    private javax.swing.JLabel txt_vehicles;
    // End of variables declaration//GEN-END:variables
}
