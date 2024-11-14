/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package midtermproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author matot
 */
public class MidTermForm extends javax.swing.JFrame {
    
    ImageIcon imageIcon = new ImageIcon("image.jpg");

    /**
     * Creates new form MidTermForm
     */
    public MidTermForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        processingFeesField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amountNeededField = new javax.swing.JTextField();
        registerRecords = new javax.swing.JButton();
        customerNameField = new javax.swing.JTextField();
        customerNIDField = new javax.swing.JTextField();
        bankInterestField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        printForm = new javax.swing.JButton();
        totalAmountField = new javax.swing.JTextField();
        displayData = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        searchFromDb = new javax.swing.JButton();
        paymentPeriodField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updateRecords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        deleteData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        amountPerMonthField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        totalAmountButton = new javax.swing.JButton();
        amountToBePaidPerMonthButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PROCESSING FEES:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CUSTOMER NID:");

        registerRecords.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerRecords.setText("REGISTER RECORDS");
        registerRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerRecordsActionPerformed(evt);
            }
        });

        bankInterestField.setEditable(false);
        bankInterestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankInterestFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("AMOUNT NEEDED:");

        printForm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printForm.setText("PRINT");
        printForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormActionPerformed(evt);
            }
        });

        displayData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayData.setText("DISPLAY");
        displayData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayDataActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PAYMENT PERIOD:");

        searchFromDb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchFromDb.setText("SEARCH FROM DB");
        searchFromDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFromDbActionPerformed(evt);
            }
        });

        paymentPeriodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentPeriodFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("BANK INTEREST IN %:");

        updateRecords.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateRecords.setText("UPDATE RECORDS");
        updateRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CUSTOMER NID", "AMOUNT NEEDED", "PROCESSING FEES", "PAYMENT PERIOD", "BANK INTEREST"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/picture.png"))); // NOI18N

        deleteData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteData.setText("DELETE");
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CUSTOMER NAMES:");

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        totalAmountButton.setText("TOTAL AMOUNT TO BE PAID");
        totalAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAmountButtonActionPerformed(evt);
            }
        });

        amountToBePaidPerMonthButton.setText("AMOUNT TO BE PAID PER MONTH");
        amountToBePaidPerMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountToBePaidPerMonthButtonActionPerformed(evt);
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
                        .addComponent(registerRecords)
                        .addGap(18, 18, 18)
                        .addComponent(searchFromDb)
                        .addGap(29, 29, 29)
                        .addComponent(resetButton)
                        .addGap(18, 18, 18)
                        .addComponent(printForm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(amountNeededField)
                                        .addComponent(customerNIDField)
                                        .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(processingFeesField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(paymentPeriodField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bankInterestField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountToBePaidPerMonthButton)
                                    .addComponent(totalAmountButton))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountPerMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(deleteData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayData)
                                .addGap(50, 50, 50)
                                .addComponent(updateRecords)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountNeededField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(processingFeesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteData)
                            .addComponent(displayData)
                            .addComponent(updateRecords))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentPeriodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankInterestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalAmountButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountPerMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountToBePaidPerMonthButton))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerRecords)
                    .addComponent(searchFromDb)
                    .addComponent(resetButton)
                    .addComponent(printForm))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentPeriodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentPeriodFieldActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_paymentPeriodFieldActionPerformed

    private void bankInterestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankInterestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankInterestFieldActionPerformed
    
    private void totalAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAmountButtonActionPerformed
        // TODO add your handling code here:
        try{
        double amountNeeded = Double.parseDouble(amountNeededField.getText());
        double processingFee = Double.parseDouble(processingFeesField.getText());
        int paymentPeriod = Integer.parseInt(paymentPeriodField.getText());
         double bankInterest;
        
        if(paymentPeriod <= 1) {
            bankInterest = 12.0;
        }else if (paymentPeriod > 1 && paymentPeriod <= 3) {
          bankInterest = 15.0;
        }else if (paymentPeriod > 3 && paymentPeriod <= 5){
            bankInterest = 18.0;
        }else {
            bankInterestField.setText("Not Allowed");
            return;
        }
        
        bankInterestField.setText(String.valueOf(bankInterest));
        
        double principalAmount = amountNeeded + processingFee;
        double totalInterest = principalAmount * (bankInterest / 100);
        double totalAmount = principalAmount + totalInterest;
        
        totalAmountField.setText(String.format("%.2f", totalAmount));
        }catch (NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_totalAmountButtonActionPerformed

    private void amountToBePaidPerMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountToBePaidPerMonthButtonActionPerformed
        // TODO add your handling code here:
          try{
        double amountNeeded = Double.parseDouble(amountNeededField.getText());
        double processingFee = Double.parseDouble(processingFeesField.getText());
        int paymentPeriod = Integer.parseInt(paymentPeriodField.getText());
         double bankInterest ;
        
        if(paymentPeriod <= 1) {
            bankInterest = 12.0;
        }else if (paymentPeriod > 1 && paymentPeriod <= 3) {
          bankInterest = 15.0;
        }else if (paymentPeriod > 3 && paymentPeriod <= 5){
            bankInterest = 18.0;
        }else {
            bankInterestField.setText("Not Allowed");
            return;
        }
        
        bankInterestField.setText(String.valueOf(bankInterest));
        
        double principalAmount = amountNeeded + processingFee;
        double totalInterest = principalAmount * (bankInterest / 100);
        double totalAmount = principalAmount + totalInterest;
        double amountPerMonth = totalAmount / (paymentPeriod * 12);
        
        
        
        amountPerMonthField.setText(String.format("%.2f", amountPerMonth));
        }catch (NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_amountToBePaidPerMonthButtonActionPerformed

    private void registerRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerRecordsActionPerformed
        // TODO add your handling code here:
        Connection record;
        PreparedStatement insert;
        String customerName = customerNameField.getText();
        String customerNID = customerNIDField.getText();
        String amountNeeded = amountNeededField.getText();
        String processingFee = processingFeesField.getText();
        String paymentPeriod = paymentPeriodField.getText();
        String bankInterest = bankInterestField.getText();
        String totalAmount = totalAmountField.getText();
        String amountPerMonth = amountPerMonthField.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            record = DriverManager.getConnection("jdbc:mysql://localhost/group_d2024","root","Matoto@victoire2003");
            insert = record.prepareStatement("INSERT INTO loan(customer_name, customer_nid, amount_needed, processing_fee, payment_period, bank_interest, total_amount, amount_per_month) VALUES (?,?,?,?,?,?,?,?)");
            insert.setString(1, customerName);
            insert.setString(2, customerNID);
            insert.setString(3, amountNeeded);
            insert.setString(4, processingFee);
            insert.setString(5, paymentPeriod);
            insert.setString(6, bankInterest);
            insert.setString(7, totalAmount);
            insert.setString(8, amountPerMonth);
            
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record recodered successfull!!");
            
            
        }catch (ClassNotFoundException ex){
         Logger.getLogger(management.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex) {
                Logger.getLogger(management.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }//GEN-LAST:event_registerRecordsActionPerformed

    private void searchFromDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFromDbActionPerformed
        // TODO add your handling code here:
        String customerNID = JOptionPane.showInputDialog(null, "Enter Customer NID:", "Search Customer", JOptionPane.QUESTION_MESSAGE);
    
        
         if (customerNID == null || customerNID.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "No Customer NID entered. Search canceled.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
         }
         
            customerNID = customerNID.trim();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/group_d2024","root","Matoto@victoire2003");
            String sql = "SELECT * FROM loan WHERE customer_nid= ?";
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, customerNID);
            
            ResultSet rs = statement.executeQuery();
            
            if(rs.next()){
                customerNameField.setText(rs.getString("customer_name"));
                customerNIDField.setText(rs.getString("customer_nid"));
                amountNeededField.setText(rs.getString("amount_needed"));
                processingFeesField.setText(rs.getString("processing_fee"));
                paymentPeriodField.setText(rs.getString("payment_period"));
                bankInterestField.setText(rs.getString("bank_interest"));
                totalAmountField.setText(rs.getString("total_amount"));
                amountPerMonthField.setText(rs.getString("amount_per_month"));
            }else {
                 JOptionPane.showMessageDialog(null, "No record found for Customer NID: " + customerNID, "No Results", JOptionPane.INFORMATION_MESSAGE);
       
            }  
            rs.close();
            statement.close();
            con.close();
     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while searching: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_searchFromDbActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        customerNameField.setText(" ");
        customerNIDField.setText(" ");
        amountNeededField.setText(" ");
        processingFeesField.setText(" ");
        paymentPeriodField.setText(" ");
        bankInterestField.setText(" ");
        totalAmountField.setText(" ");
        amountPerMonthField.setText(" ");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void printFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormActionPerformed
        // TODO add your handling code here:
        
          PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Print Loan Management Form");

    job.setPrintable(new Printable() {
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return NO_SUCH_PAGE;
            }

            // Translate the printout to the top left corner
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            // Scale the printout to fit the page if necessary
            double scaleX = pageFormat.getImageableWidth() / getWidth();
            double scaleY = pageFormat.getImageableHeight() / getHeight();
            double scale = Math.min(scaleX, scaleY);
            g2d.scale(scale, scale);

            // Print the form component
            printAll(g2d);

            return PAGE_EXISTS;
        }
    });

    // Show a print dialog and start printing if confirmed
    boolean doPrint = job.printDialog();
    if (doPrint) {
        try {
            job.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Print failed: " + ex.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_printFormActionPerformed

    private void displayDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayDataActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/group_d2024","root","Matoto@victoire2003");
           Statement st = con.createStatement();
           String sql = "Select * from loan LIMIT 5";
           ResultSet rs = st.executeQuery(sql);
           
           DefaultTableModel loanModel = (DefaultTableModel)jTable1.getModel();
               loanModel.setRowCount(0);
           
           while(rs.next()){
               String customerName = String.valueOf(rs.getString("customer_name"));
               String customerNID = String.valueOf(rs.getString("customer_nid"));
               String amount_needed = String.valueOf(rs.getString("amount_needed"));
               String processingFee = String.valueOf(rs.getString("processing_fee"));
               String payment_period = String.valueOf(rs.getString("payment_period"));
               String bankInterest = String.valueOf(rs.getString("bank_interest"));
               String totalAmount = String.valueOf(rs.getString("total_amount"));
               String amountPerMonth = String.valueOf(rs.getString("amount_per_month"));
               String loanData[] = {customerName,customerNID,amount_needed,processingFee,payment_period,bankInterest,totalAmount,amountPerMonth};
               
               loanModel.addRow(loanData);
           }
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(JTableData.class.getName()).log(Level.SEVERE,null, ex);
            
        }catch (SQLException ex){
            
            Logger.getLogger(JTableData.class.getName()).log(Level.SEVERE,null, ex);

        }
    }//GEN-LAST:event_displayDataActionPerformed

    private void updateRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordsActionPerformed
        // TODO add your handling code here:
        // First prompt for customer NID
//    String customerNID = JOptionPane.showInputDialog(this, 
//        "Enter Customer NID to update:", 
//        "Update Loan Record", 
//        JOptionPane.QUESTION_MESSAGE);
//    
//    if (customerNID == null || customerNID.trim().isEmpty()) {
//        JOptionPane.showMessageDialog(this,
//            "Please enter a valid Customer NID",
//            "Invalid Input",
//            JOptionPane.WARNING_MESSAGE);
//        return;
//    }
//    
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(
//            "jdbc:mysql://localhost/group_d2024",
//            "root",
//            "Matoto@victoire2003"
//        );
//        
//        // First retrieve the existing data
//        String selectSql = "SELECT * FROM loan WHERE customer_nid = ?";
//        PreparedStatement selectPst = con.prepareStatement(selectSql);
//        selectPst.setString(1, customerNID);
//        ResultSet rs = selectPst.executeQuery();
//        
//        if (!rs.next()) {
//            JOptionPane.showMessageDialog(this,
//                "No record found with the provided Customer NID.",
//                "Record Not Found",
//                JOptionPane.ERROR_MESSAGE);
//            rs.close();
//            selectPst.close();
//            con.close();
//            return;
//        }
//        
//        // Populate the fields with existing data
//        customerNIDField.setText(rs.getString("customer_nid"));
//        customerNameField.setText(rs.getString("customer_name"));
//        amountNeededField.setText(rs.getString("amount_needed"));
//        processingFeesField.setText(rs.getString("processing_fee"));
//        paymentPeriodField.setText(rs.getString("payment_period"));
//        bankInterestField.setText(rs.getString("bank_interest"));
//        totalAmountField.setText(rs.getString("total_amount"));
//        amountPerMonthField.setText(rs.getString("amount_per_month"));
//        
//        rs.close();
//        selectPst.close();
//        
//        // Show confirmation dialog
//        int confirm = JOptionPane.showConfirmDialog(this,
//            "Record found! The fields have been populated with current data.\n" +
//            "Please modify the fields as needed and click OK to update.",
//            "Confirm Update",
//            JOptionPane.OK_CANCEL_OPTION,
//            JOptionPane.INFORMATION_MESSAGE);
//            
//        if (confirm != JOptionPane.OK_OPTION) {
//            con.close();
//            return;
//        }
//        
//        // Proceed with update using modified field values
//        String updateSql = "UPDATE loan SET customer_name=?, amount_needed=?, " +
//                          "processing_fee=?, payment_period=?, bank_interest=?, " +
//                          "total_amount=?, amount_per_month=? WHERE customer_nid=?";
//        
//        PreparedStatement updatePst = con.prepareStatement(updateSql);
//        
//        try {
//            // Get values from fields and validate
//            String customerName = customerNameField.getText().trim();
//            double amountNeeded = Double.parseDouble(amountNeededField.getText().trim());
//            double processingFee = Double.parseDouble(processingFeesField.getText().trim());
//            int paymentPeriod = Integer.parseInt(paymentPeriodField.getText().trim());
//            double bankInterest = Double.parseDouble(bankInterestField.getText().trim());
//            double totalAmount = Double.parseDouble(totalAmountField.getText().trim());
//            double amountPerMonth = Double.parseDouble(amountPerMonthField.getText().trim());
//            
//            // Set values in prepared statement
//            updatePst.setString(1, customerName);
//            updatePst.setDouble(2, amountNeeded);
//            updatePst.setDouble(3, processingFee);
//            updatePst.setInt(4, paymentPeriod);
//            updatePst.setDouble(5, bankInterest);
//            updatePst.setDouble(6, totalAmount);
//            updatePst.setDouble(7, amountPerMonth);
//            updatePst.setString(8, customerNID);
//            
//            int rowsUpdated = updatePst.executeUpdate();
//            if (rowsUpdated > 0) {
//                JOptionPane.showMessageDialog(this,
//                    "Record updated successfully!",
//                    "Success",
//                    JOptionPane.INFORMATION_MESSAGE);
//                    
//                // Refresh the table to show updated data
//                displayDataActionPerformed(evt);
//            }
//            
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this,
//                "Please enter valid numeric values in all numeric fields.",
//                "Input Error",
//                JOptionPane.ERROR_MESSAGE);
//        }
//        
//        // Close resources
//        updatePst.close();
//        con.close();
//        
//    } catch (ClassNotFoundException ex) {
//        Logger.getLogger(JTableData.class.getName()).log(Level.SEVERE, null, ex);
//        JOptionPane.showMessageDialog(this,
//            "Database driver not found: " + ex.getMessage(),
//            "Error",
//            JOptionPane.ERROR_MESSAGE);
//    } catch (SQLException ex) {
//        Logger.getLogger(JTableData.class.getName()).log(Level.SEVERE, null, ex);
//        JOptionPane.showMessageDialog(this,
//            "Database error: " + ex.getMessage(),
//            "Error",
//            JOptionPane.ERROR_MESSAGE);
//    }

String customerNID = customerNIDField.getText().trim();

        if(customerNID.isEmpty()){
             JOptionPane.showMessageDialog(null, "Please enter Customer NID to update the record.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/group_d2024", "root", "Matoto@victoire2003");
            String sql = "UPDATE loan SET customer_name=?, amount_needed=?, processing_fee=?, payment_period=?, bank_interest=?, total_amount=?, amount_per_month=? WHERE customer_nid=?";
        PreparedStatement pst = con.prepareStatement(sql);

         String customerName = customerNameField.getText();
        double amountNeeded = Double.parseDouble(amountNeededField.getText());
        double processingFee = Double.parseDouble(processingFeesField.getText());
        int paymentPeriod = Integer.parseInt(paymentPeriodField.getText());
        double bankInterest = Double.parseDouble(bankInterestField.getText());
        double totalAmount = Double.parseDouble(totalAmountField.getText());
        double amountPerMonth = Double.parseDouble(amountPerMonthField.getText());

          pst.setString(1, customerName);
        pst.setDouble(2, amountNeeded);
        pst.setDouble(3, processingFee);
        pst.setInt(4, paymentPeriod);
        pst.setDouble(5, bankInterest);
        pst.setDouble(6, totalAmount);
        pst.setDouble(7, amountPerMonth);
        pst.setString(8, customerNID);

        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Record updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "No record found with the provided Customer NID.", "Update Failed", JOptionPane.ERROR_MESSAGE);
        }
        // Close the statement and connection
        pst.close();
        con.close();

    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(this, "Database driver not found.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error updating data in database.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values in numeric fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_updateRecordsActionPerformed

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        // TODO add your handling code here:
         String customerNID = JOptionPane.showInputDialog(this, 
        "Enter Customer NID to delete:", 
        "Delete Loan Record", 
        JOptionPane.QUESTION_MESSAGE);
    
    // Check if user canceled the input or entered empty string
    if (customerNID == null || customerNID.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Please enter a valid Customer NID",
            "Invalid Input",
            JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Confirm deletion
    int confirm = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to delete the loan record for Customer NID: " + customerNID + "?",
        "Confirm Deletion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE);
        
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/group_d2024",
            "root",
            "Matoto@victoire2003"
        );
        
        // Prepare delete statement
        String sql = "DELETE FROM loan WHERE customer_nid = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, customerNID);
        
        // Execute delete
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this,
                "Record deleted successfully!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
                
            // Refresh the table to show updated data
            displayDataActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this,
                "No record found with the given Customer NID",
                "Record Not Found",
                JOptionPane.ERROR_MESSAGE);
        }
        
        // Close resources
        pst.close();
        con.close();
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(JTableData.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this,
            "Database driver not found: " + ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        Logger.getLogger(JTableData.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this,
            "Database error: " + ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deleteDataActionPerformed


    
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
            java.util.logging.Logger.getLogger(MidTermForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MidTermForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MidTermForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MidTermForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MidTermForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountNeededField;
    private javax.swing.JTextField amountPerMonthField;
    private javax.swing.JButton amountToBePaidPerMonthButton;
    private javax.swing.JTextField bankInterestField;
    private javax.swing.JTextField customerNIDField;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JButton deleteData;
    private javax.swing.JButton displayData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField paymentPeriodField;
    private javax.swing.JButton printForm;
    private javax.swing.JTextField processingFeesField;
    private javax.swing.JButton registerRecords;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchFromDb;
    private javax.swing.JButton totalAmountButton;
    private javax.swing.JTextField totalAmountField;
    private javax.swing.JButton updateRecords;
    // End of variables declaration//GEN-END:variables
}
