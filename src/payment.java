
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class payment extends javax.swing.JFrame {

    Connection con = new DBConnector().databaseConnection();
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"Payment ID", "Recite Number", "Number plate", "Vehicle Name", "Customer Name", "Customer NIC", "Rent Date", "Returned Date", "Payment Fee"}, 0);

    public payment() {
        initComponents();
        jTable_payment.setModel(model1);
        payment_refreshActionPerformed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_payment_recitnumber = new javax.swing.JTextField();
        btn_payment_search = new javax.swing.JButton();
        btn_payment_back = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_payment_pid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_payment_recitenum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_payment_numberplate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_payment_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_payment_cname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_payment_nic = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_payment_free = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btn_payment_insert = new javax.swing.JButton();
        btn_payment_update = new javax.swing.JButton();
        btn_payment_deleted = new javax.swing.JButton();
        btn_payment_clear = new javax.swing.JButton();
        txt_payment_rentdate = new javax.swing.JTextField();
        txt_payment_retureddate = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_payment = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        print = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Payment Details");

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
        jLabel3.setText("Recite Number");

        btn_payment_search.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_payment_search.setText("SEARCH");
        btn_payment_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_searchActionPerformed(evt);
            }
        });

        btn_payment_back.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_payment_back.setText("BACK");
        btn_payment_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_payment_recitnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_payment_search, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_payment_back, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_payment_recitnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_payment_search)
                    .addComponent(btn_payment_back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Payment ID");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Recite Number");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Number Plate");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Vehicle Name");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Customer Name");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Customer NIC");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Rent Date");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Returned Date");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText(" Payment Fee");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btn_payment_insert.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_payment_insert.setText("INSERT");
        btn_payment_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_insertActionPerformed(evt);
            }
        });

        btn_payment_update.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_payment_update.setText("UPDATE");
        btn_payment_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_payment_updateMouseClicked(evt);
            }
        });
        btn_payment_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_updateActionPerformed(evt);
            }
        });

        btn_payment_deleted.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_payment_deleted.setText("DELETED");
        btn_payment_deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_deletedActionPerformed(evt);
            }
        });

        btn_payment_clear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_payment_clear.setText("CLEAR");
        btn_payment_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_payment_deleted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_payment_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_payment_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_payment_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_payment_insert)
                .addGap(18, 18, 18)
                .addComponent(btn_payment_update)
                .addGap(18, 18, 18)
                .addComponent(btn_payment_deleted)
                .addGap(18, 18, 18)
                .addComponent(btn_payment_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_payment_free, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_payment_rentdate)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txt_payment_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)))))
                        .addGap(198, 198, 198)
                        .addComponent(txt_payment_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_payment_numberplate, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txt_payment_pid))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_payment_retureddate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_payment_recitenum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_payment_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_payment_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_payment_recitenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_payment_numberplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txt_payment_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_payment_cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_payment_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(txt_payment_rentdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_payment_retureddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_payment_free, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTable_payment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_paymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_payment);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        print.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_payment_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_searchActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable_payment.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable_payment.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txt_payment_recitnumber.getText()));
        payment_refreshActionPerformed();
        btn_payment_clearActionPerformed(null);
    }//GEN-LAST:event_btn_payment_searchActionPerformed

    private void btn_payment_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_insertActionPerformed
        if (validateData()) {
            try {
                String query = "INSERT INTO payment VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, txt_payment_pid.getText());
                pst.setString(2, txt_payment_recitenum.getText());
                pst.setString(3, txt_payment_numberplate.getText());
                pst.setString(4, txt_payment_name.getText());
                pst.setString(5, txt_payment_cname.getText());
                pst.setString(6, txt_payment_nic.getText());
                pst.setString(7, txt_payment_rentdate.getText());
                pst.setString(8, txt_payment_retureddate.getText());
                pst.setString(9, txt_payment_free.getText());
                pst.execute();
                JOptionPane.showMessageDialog(payment.this, "Details Inserted Successfully");
                payment_refreshActionPerformed();
                btn_payment_clearActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(payment.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_payment_insertActionPerformed

    private void btn_payment_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_updateActionPerformed
        if (!txt_payment_recitenum.getText().isEmpty()) {
            if (validateData()) {
                try {
                    String query = "UPDATE payment SET payment_id =?,number_plate=?,"
                            + "vehicle_Name=?,customer_name =?,customer_nic=?,vehicle_rent_date=?,"
                            + "vehicle_retured_date=?,payment=? WHERE recite_number=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, txt_payment_pid.getText());
                    pst.setString(2, txt_payment_numberplate.getText());
                    pst.setString(3, txt_payment_name.getText());
                    pst.setString(4, txt_payment_cname.getText());
                    pst.setString(5, txt_payment_nic.getText());
                    pst.setString(6, txt_payment_rentdate.getText());
                    pst.setString(7, txt_payment_retureddate.getText());
                    pst.setString(8, txt_payment_free.getText());
                    pst.setString(9, txt_payment_recitenum.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(payment.this, "Details Upadted Successfully");
                    payment_refreshActionPerformed();
                    btn_payment_clearActionPerformed(null);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(payment.this, e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "You Can't update a new data set");}
    }//GEN-LAST:event_btn_payment_updateActionPerformed

    private boolean validateData() {
        if (txt_payment_pid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Payment ID field to continue");
            return false;
        }

        if (txt_payment_recitenum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Recit Number field to continue");
            return false;
        }

        if (txt_payment_numberplate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Number Plate field to continue");
            return false;
        }

        if (txt_payment_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Vehicle Name field to continue");
            return false;
        }

        if (txt_payment_cname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Customer Name field to continue");
            return false;
        }
        if (txt_payment_cname.getText().length() > 200) {
            JOptionPane.showMessageDialog(this, "Name field must have only 1-200 charcters");
            //txt_registration_name.requestFocus();
            return false;
        }
        if (!Pattern.matches("[A-Z a-z]+", txt_payment_cname.getText())) {
            JOptionPane.showMessageDialog(this, "Name field must have only 'A-Z' 'a-z' 'space' charcters");
            return false;
        }
/*
        if (txt_payment_nic.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the NIC field to continue");
            return false;
        }
        
        if (txt_payment_nic.getText().length() > 12) {
            JOptionPane.showMessageDialog(this, "NIC field must have 12 charcters");
            return false;
        }
        if (!Pattern.matches("^([0-9]{9}[xXvV]|[0-9]{12})$", txt_payment_nic.getText())) {
            JOptionPane.showMessageDialog(this, "NIC field invalid");
            return false;
        }*/

        if (txt_payment_rentdate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Rent Date field to continue");
            return false;
        }

        if (txt_payment_retureddate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Returned Date field to continue");
            return false;
        }

        if (txt_payment_free.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to fill the Payment Fee field to continue");
            return false;
        }

        return true;

    }

    private void btn_payment_deletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_deletedActionPerformed
        if (jTable_payment.getSelectedRowCount() == 1) {
            int row = jTable_payment.getSelectedRow();
            String data = jTable_payment.getValueAt(row, 0).toString();
            Statement st;
            try {
                st = con.createStatement();
                st.executeUpdate("DELETE FROM  payment WHERE payment_id =" + data);
                JOptionPane.showMessageDialog(payment.this, "Data Deleted!");
                payment_refreshActionPerformed();
                btn_payment_clearActionPerformed(null);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(payment.this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to select one row to delete data");
        }
    }//GEN-LAST:event_btn_payment_deletedActionPerformed

    private void btn_payment_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_clearActionPerformed
        txt_payment_pid.setText("");
        txt_payment_recitenum.setText("");
        txt_payment_numberplate.setText("");
        txt_payment_name.setText("");
        txt_payment_cname.setText("");
        txt_payment_nic.setText("");
        txt_payment_rentdate.setText("");
        txt_payment_retureddate.setText("");
        txt_payment_free.setText("");
    }//GEN-LAST:event_btn_payment_clearActionPerformed

    private void btn_payment_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_backActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_payment_backActionPerformed

    private void btn_payment_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payment_updateMouseClicked

    }//GEN-LAST:event_btn_payment_updateMouseClicked

    private void jTable_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_paymentMouseClicked
                if (jTable_payment.getSelectedRowCount() == 1) {
            int row = jTable_payment.getSelectedRow();
            txt_payment_pid.setText(jTable_payment.getValueAt(row, 0).toString());
            txt_payment_recitenum.setText(jTable_payment.getValueAt(row, 1).toString());
            txt_payment_numberplate.setText(jTable_payment.getValueAt(row, 2).toString());
            txt_payment_name.setText(jTable_payment.getValueAt(row, 3).toString());
            txt_payment_cname.setText(jTable_payment.getValueAt(row, 4).toString());
            txt_payment_nic.setText(jTable_payment.getValueAt(row, 5).toString());
            txt_payment_rentdate.setText(jTable_payment.getValueAt(row, 6).toString());
            txt_payment_retureddate.setText(jTable_payment.getValueAt(row, 7).toString());
            txt_payment_free.setText(jTable_payment.getValueAt(row, 8).toString());
        }
    }//GEN-LAST:event_jTable_paymentMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            boolean print = jTable_payment.print();
            if(!print){
                JOptionPane.showMessageDialog(null, "Unable to print!!!...");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    private ArrayList<AccessPaymentData> getDataList(String query) {
        ArrayList<AccessPaymentData> dataList = new ArrayList();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            AccessPaymentData data;
            while (rs.next()) {
                data = new AccessPaymentData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                dataList.add(data);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_payment_back;
    private javax.swing.JButton btn_payment_clear;
    private javax.swing.JButton btn_payment_deleted;
    private javax.swing.JButton btn_payment_insert;
    private javax.swing.JButton btn_payment_search;
    private javax.swing.JButton btn_payment_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_payment;
    private javax.swing.JButton print;
    private javax.swing.JTextField txt_payment_cname;
    private javax.swing.JTextField txt_payment_free;
    private javax.swing.JTextField txt_payment_name;
    private javax.swing.JTextField txt_payment_nic;
    private javax.swing.JTextField txt_payment_numberplate;
    private javax.swing.JTextField txt_payment_pid;
    private javax.swing.JTextField txt_payment_recitenum;
    private javax.swing.JTextField txt_payment_recitnumber;
    private javax.swing.JTextField txt_payment_rentdate;
    private javax.swing.JTextField txt_payment_retureddate;
    // End of variables declaration//GEN-END:variables

    private void payment_refreshActionPerformed() {
        ArrayList<AccessPaymentData> data = getDataList("SELECT * FROM  payment");
        model1.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            String a = data.get(i).getPayment_id();
            String b = data.get(i).getRecite_number();
            String c = data.get(i).getNumber_plate();
            String d = data.get(i).getVehicle_name();
            String e = data.get(i).getCustomer_name();
            String f = data.get(i).getCugstomer_nic();
            String g = data.get(i).getVehicle_rent_date();
            String h = data.get(i).getVehicle_retured_date();
            String j = data.get(i).getPayment();
            model1.addRow(new String[]{a + "", b, c, d, e, f, g, h, j});
        }

    }

}
