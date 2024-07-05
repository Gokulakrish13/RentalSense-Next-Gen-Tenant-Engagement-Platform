package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class fullhistory extends javax.swing.JFrame {
    public fullhistory() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setMinimumSize(new java.awt.Dimension(950, 700));
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
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 1410, 620));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close_1.png"))); 
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 850, -1, -1));
        jButton5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/print.jpg"))); 
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 850, -1, -1));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("FULL HISTORY OF TENENTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 990, 60))
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 132, 1550, 40));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png"))); 
        jLabel2.setText("             ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -4, 1610, 1000));
        pack();
    } 
    private void formComponentShown(java.awt.event.ComponentEvent evt) {
                 try
                                 {
                                     Connection con=ConnectionProvider.getCon();
                                     Statement st=con.createStatement();
                                     JOptionPane.showMessageDialog(null, "!!!  Connection established  !!!");
                                     ResultSet rs=st.executeQuery("select * from tenent;" );
                                   //  jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
                               
                                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
                                 }
                                catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, "!!!  Connection Error ,Please Restart the Application  !!!");
                                        }     
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
    public static void main(String args[]) {   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fullhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fullhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fullhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fullhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fullhistory().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
}
