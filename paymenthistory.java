package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class paymentHistory extends javax.swing.JFrame {
    public paymentHistory() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 1460, 550));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 36));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close_1.png"))); 
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 840, -1, -1));
        jButton5.setFont(new java.awt.Font("Cambria", 1, 36));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/print.jpg"))); 
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 840, -1, -1));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PAYMENT HISTORY OF TENENTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 990, 60));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 132, 1550, 20));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 190, 40));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36));
        jLabel3.setText("Flat No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 140, 29));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/search.png")));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 50, 40));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png"))); 
        jLabel2.setText("                  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, 1000));
        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        try {

            jTable1.print();

        } catch (PrinterException ex) {
            Logger.getLogger(fullhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
  try
                                 {
                                     Connection con=ConnectionProvider.getCon();
                                     Statement st=con.createStatement();
                                     ResultSet rs=st.executeQuery("select tenent.flatno,rno,name,contact_no,months_started,security_amount,month,electricity_bill,gas_bill,rent_amount,maintanance_charge,date,payable_amount from tenent,rent where tenent.flatno=rent.flatno;" );
                                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
                                 }
                                catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, "!!!  Connection Error ,Please Restart the Application  !!!");
                                        }
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) { 
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String flatno=jTextField1.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select tenent.flatno,rno,name,contact_no,months_started,security_amount,month,electricity_bill,gas_bill,rent_amount,maintanance_charge,date,payable_amount from tenent,rent where tenent.flatno='" + flatno + "' and tenent.flatno=rent.flatno;" );
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
                   if(!rs.first())
            jLabel2.setVisible(true);
            else
            {
                jLabel2.setVisible(false);
                jTextField1.setEditable(false);
                flag=1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "!!!  DATA IS NOT FOUND  !!!");
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
            java.util.logging.Logger.getLogger(paymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentHistory().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}
