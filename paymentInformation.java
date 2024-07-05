package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
public class paymentInformation extends javax.swing.JFrame {
        public int flag=0;
    public paymentInformation() {
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 990));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel1.setText("Flat No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 140, 29));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 190, 40));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/search.png"))); 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 50, 40));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1580, 80));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel3.setText("Month");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel4.setText("Rent Amount");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));
        jComboBox1.setFont(new java.awt.Font("Cambria", 1, 24)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 240, 40));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 240, 40));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 30)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/save-icon--1.png"))); 
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 860, 150, -1));
        jButton3.setFont(new java.awt.Font("Cambria", 1, 30)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); 
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 860, -1, -1));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel5.setText("Electricity Bill");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 240, 40));
        jLabel6.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel6.setText("Gas Bill");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 240, 40));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel7.setText("Maintanance ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, 230, -1));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 240, 40));
        jButton4.setFont(new java.awt.Font("Cambria", 1, 24)); 
        jButton4.setText("Total");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 740, 190, 50));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel9.setText("  *  5 % GST INCLUDED WITH TOTAL PAYABLE AMOUNT               ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 810, 490, -1));
        jLabel10.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel10.setText("Reciept no");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 40));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); 
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 260, 440, 530));
        jButton5.setFont(new java.awt.Font("Cambria", 1, 30)); 
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/print.jpg"))); 
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 840, -1, -1));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel2.setText("DATE :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, 30));
        jLabel8.setText("           ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 689, 153, 258));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, 30));
        jLabel12.setFont(new java.awt.Font("Cambria", 0, 36)); 
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 60, 40));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1540, 10));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 50, 750));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("                     ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 740, 240, 50));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png"))); 
        jLabel11.setText("                  ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 1610, 980));
        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                                String flatno=jTextField1.getText(); 
                                try
                                 {
                                     Connection con=ConnectionProvider.getCon();
                                     Statement st=con.createStatement();
                                     ResultSet rs=st.executeQuery("select * from tenent where flatno='" + flatno + "';" );
                               //       JOptionPane.showMessageDialog(null, "!!!   database connected !!!");  
                                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));          
                                 }
                                catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, "!!!  Connection Error  !!!");
                                        }
    }                                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                                setVisible(false);        
    }                                        
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                   try
                   { java.util.Date date=jDateChooser1.getDate();
                       Date sqldate = new java.sql.Date(date.getTime());
                       String rno=jLabel12.getText();
                      String flatno=jTextField1.getText();
                     String month = (String) jComboBox1.getSelectedItem();
                      String electricity_bill=jTextField2.getText();
                      int electricity_bill1=Integer.parseInt(electricity_bill);
                       String gas_bill=jTextField3.getText();
                        int gas_bill1=Integer.parseInt(gas_bill);
                        String rent=jTextField4.getText();
                          int rent1=Integer.parseInt(rent);
                        String maintanance=jTextField5.getText();
                         int maintanance1=Integer.parseInt(maintanance);
                         int payable_amount;
                         payable_amount=(int) ((electricity_bill1+gas_bill1+rent1+maintanance1)+(electricity_bill1+gas_bill1+rent1+maintanance1)*0.05);
                           jLabel13.setText(" "+payable_amount);
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "************************************************* \n");
                                       jTextArea1.setText(jTextArea1.getText()+ "                    RENT RECIEPT SYSTEM             \n");
                                       jTextArea1.setText(jTextArea1.getText()+ "************************************************** \n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "RECIEPT NO                                     "+rno+ "\n");
                                        jTextArea1.setText(jTextArea1.getText()+ "\n");
                                        jTextArea1.setText(jTextArea1.getText()+"                                          DATE  "+sqldate+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "FLAT NO                                          " +flatno+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "MONTHLY RENT                              " +rent1+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "ELECTRICITY BILL                          "+ electricity_bill1+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "GAS BILL                                         " +gas_bill1+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "MAINTANANCE CHARGE                 "+maintanance1+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "TOATAL AMOUNT                           "+payable_amount+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                        jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "**************  THANKING YOU  **************");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                        jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "                                                 signature");
                     if(jButton4.isSelected())
                            {
                                      jLabel13.setVisible(true);
               
                              }    
                   }
                    catch (Exception e) 
                                        {
                                           JOptionPane.showMessageDialog(this," Enter data in correct Format");
                                            }
    }                                        

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
                      java.util.Date date=jDateChooser1.getDate();                  
                       String rno=jLabel12.getText();
                      String flatno=jTextField1.getText();
                     String month = (String) jComboBox1.getSelectedItem();
                      String electricity_bill=jTextField2.getText();
                      int electricity_bill1=Integer.parseInt(electricity_bill);           
                       String gas_bill=jTextField3.getText();
                        int gas_bill1=Integer.parseInt(gas_bill);
                        String rent=jTextField4.getText();
                          int rent1=Integer.parseInt(rent);                     
                        String maintanance=jTextField5.getText();
                         int maintanance1=Integer.parseInt(maintanance);     
                         int payable_amount;
                        payable_amount=(int) ((electricity_bill1+gas_bill1+rent1+maintanance1)+(electricity_bill1+gas_bill1+rent1+maintanance1)*0.05);
                           jLabel13.setText(" "+payable_amount);
                       try {
                                      Connection con = ConnectionProvider.getCon();
                                      Statement st = con.createStatement();
                                       st.executeUpdate("insert into rent values('" +rno+ "','" + month + "','" + electricity_bill + "','" + gas_bill + "','" +rent + "','" + maintanance + "','" + payable_amount + "','" + flatno + "','" + date + "')");
                                        JOptionPane.showMessageDialog(null, "Successfully Inserted");
                                        setVisible(false);
                                           new paymentInformation().setVisible(true);
                                    } 
                                        catch (Exception e) 
                                        {
                                           JOptionPane.showMessageDialog(this,"Either some data is Missing or  Enter data in correct Format");
                                             }
    }                                        
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                           
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            try {
                jTextArea1.print();
            } catch (PrinterException ex) {
                Logger.getLogger(paymentInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                                        
    private void formComponentShown(java.awt.event.ComponentEvent evt) {                                    
               try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select max(rno) from rent;");
            if(rs.next())
            {
                int id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                jLabel12.setText(str);  
            }
            else
                jLabel12.setText("1");
        } catch (Exception e) {
}   
    }                                   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentInformation().setVisible(true);
            }
        });
    }                   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;              
}
