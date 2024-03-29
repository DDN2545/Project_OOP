/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop;

import java.util.Date;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pakin
 */
public class IncomeAndExpensesForm extends javax.swing.JDialog {

    /**
     * Creates new form Jmodel
     */
    private String pid;
    private String date;
    private String detail;
    private String type;
    private Float money; 
    private String oldpid;
  
    
    //  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 //       try {
 //           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
 //               if ("Nimbus".equals(info.getName())) {
  //                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
  //                 break;
 //               }
 //          }
//       } catch (ClassNotFoundException ex) {
 //          java.util.logging.Logger.getLogger(IncomeAndExpensesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //      } catch (InstantiationException ex) {
 //           java.util.logging.Logger.getLogger(IncomeAndExpensesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //      } catch (IllegalAccessException ex) {
  //          java.util.logging.Logger.getLogger(IncomeAndExpensesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 //           java.util.logging.Logger.getLogger(IncomeAndExpensesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //      }
        //</editor-fold>
        //</editor-fold>

       
        /* Create and display the form */
       /*java.awt.EventQueue.invokeLater(new Runnable() 
       {
           public void run() {
               new IncomeAndExpensesForm().setVisible(true);
            }
        });
       */
  //    } 
      
       
          
  //public IncomeAndExpensesForm() {
    //    initComponents();
   // }    


     // constructure KONG
    public IncomeAndExpensesForm(java.awt.Frame parent,boolean modal) {
        super(parent,modal);
        initComponents();
    }
    
    public void setForm(){
        oldpid = null;
        this.setVisible(true);
    }
      
    public void setForm(String p1) {
        try{
            String query = String.format("SELECT * FROM paymentdetail ",p1);
            DBConnect conn = new DBConnect();
            ResultSet rs = conn.getResult(query);
            rs.next();
            oldpid = rs.getString(pid);
            this.Date.setText("date");
            this.Detail.setText(rs.getString("detail"));
            this.Money.setText(rs.getString("money"));
            conn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error : " + ex);
            oldpid=null;
        }
        this.setVisible(true);
    }
   

   // IncomeAndExpensesForm(TableIncomeAndExpenses aThis, boolean b) {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        Type = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        Detail = new javax.swing.JTextField();
        Money = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jSaveButton = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INPUT"));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setText("Income And Expenses Form");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        Date.setToolTipText("");
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        jLabel5.setText("Date(yyyy-MM-dd)");

        jLabel8.setText("Income-Expenses");

        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Income", "Expenses" }));
        Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Detail");

        Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailActionPerformed(evt);
            }
        });

        Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyActionPerformed(evt);
            }
        });

        jLabel2.setText("Money (Bath)");

        jSaveButton.setText("save");
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });

        jBackButton.setText("back");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Money, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Detail, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                            .addComponent(Date)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(40, 40, 40)
                                        .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jSaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBackButton)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBackButton)
                    .addComponent(jSaveButton))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed

                        // TODO add your handling code here:
        //button save
        String TID = (String)Type.getSelectedItem();
        String date = this.Date.getText();  
        String detail = this.Detail.getText();
        float money = Float.parseFloat(this.Money.getText());
        String query;
        boolean rs;
        
        
       // String x =(String)Type.getSelectedItem();
       // boolean aa=  x.equals("Income");
        /*
        if(aa){
            TID = 1; // income
        }else{
            TID = 2; // expenses
        }
        */
         //if (oldpid == null) {
            query = String.format("INSERT INTO paymentdetail(PID,date,detail,type,money) VALUES (NULL,'%1$s','%2$s','%3$s','%4$f') ",date,detail,TID,money);
        //db is not insert because date are 66/5/5 instead 2023-05-05 
            /*} else {
            query = String.format("UPDATE paymentdetail SET date='%1$s',detail='%2$s',type='%3$s',money='%4$f' WHERE date ='%1$s' ",date,detail,TID,money);
        }*/
        // important
        try {
            DBConnect conn = new DBConnect();
            rs = conn.execute(query);
            if (rs) {
                JOptionPane.showMessageDialog(this, "Complete");
                oldpid = pid;
            } else {
                JOptionPane.showMessageDialog(this, "Fail , Please do it again!");
            }
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error : " + ex);
        }
        
        
        System.out.println(TID +" "+date+" "+ detail+" "+ money);
        /*
        query = String.format("INSERT INTO paydetails (TID,Date,Detail,money) VALUES('%1s','%2s','%3s','%4s') ",date,detail,money);
        dbConnection con = new dbConnection();
            rs = con.execute(query);
            if(rs){
                JOptionPane.showMessageDialog(this,"Complete");
            }else{
                JOptionPane.showMessageDialog(this,"Fail , Please do it agin");                
            }
            con.close();
        */
       //if(date != null){
            //query = String.format("INSERT INTO paydetails inner join type(TID,Date,Detail,money) VALUES('%1s','%2s','%3s','%4s') ",TID,date,detail,money);
       // } 
        //else {
          //  query = String.format("UPDATE INTO paydetails inner join type SET TID='%1s',Date='%2s',Detail='%3s',money='%4s' WHERE TID='%5s'",TID,Date,Detail,money);

        //}
        /*
        try{
            dbConnection con = new dbConnection();
            rs = con.execute(query);
            if(rs){
                JOptionPane.showMessageDialog(this,"Complete");
            }else{
                JOptionPane.showMessageDialog(this,"Fail , Please do it agin");                
            }
            con.close();
        }catch(Exception e){
               JOptionPane.showMessageDialog(this,"Error :" + e);
           
        }
        
        
        /*String name = Name.getText();
        var date = Date.getText();
        int money = Money.getInt();
        if(name.isBlank()||date.isEmpty()||money.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter all feilds","Try again!!",JOptionPane.ERROR_MESSAGE);
        }else{
            if(name.matches("\\d+")&&date.matches("\\d+")){
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            model.addRow(new Object[]{name,date,money});
            name.setText("");
            date.setText("");
            money.setInt("");
            }else{
                 JOptionPane.showMessageDialog(this,"Please enter ONLY Number in Watts and Quantity feilds","Try again!!",JOptionPane.ERROR_MESSAGE);
            }
            
        }*/
        
        
    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TypeActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailActionPerformed

    private void MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyActionPerformed
    
    private void jTextField1(java.awt.event.ActionEvent evt){
    
    }
    
    private void jTextField2(java.awt.event.ActionEvent evt){
    
    }
    /**
     * @param args the command line arguments
     */
   
    
    private void setTable() {
        oldpid = null;
        this.setVisible(true);
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Date;
    private javax.swing.JTextField Detail;
    private javax.swing.JTextField Money;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton jBackButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSaveButton;
    // End of variables declaration//GEN-END:variables


    
}
