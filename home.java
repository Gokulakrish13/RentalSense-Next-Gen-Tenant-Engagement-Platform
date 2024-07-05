package landlord.tenent.management.system;
import javax.swing.JOptionPane;
public class home extends javax.swing.JFrame {
            public int i=0;
    public home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")   
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));
        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/add new patient.png"))); 
        jButton2.setText("ADD  TENENT            ");
        jButton2.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 320, 70));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/rsz_history1.png"))); 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 70));
        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/payment-background-design_1212-566.jpg")));
        jButton3.setText("PAYMENT                  ");
        jButton3.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 320, 70));
        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/flat details.jpeg")));
        jButton9.setText("BOOKED FLAT         ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 320, 70));
        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/rsz_history1.png"))); 
        jButton4.setText(" TENANT HISTORY       ");
        jButton4.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 320, 70));
        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Cambria", 1, 18));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/rsz_update_details.png")));
        jButton5.setText("UPDATE RECORD  ");
        jButton5.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 320, 70));
        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/delete.jpeg"))); 
        jButton7.setText("DEACTIVATE TENENT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 320, 70));
        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/rules (2).jpeg"))); 
        jButton8.setText(" RULES                           ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 320, 70));
        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/exit.png"))); 
        jButton6.setText("LOGOUT                    ");
        jButton6.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 870, 320, 70));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USE ME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setFont(new java.awt.Font("Cambria", 1, 36));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("DASHBOARD");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, -1));
        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText(" PAYMENT HISTORY       ");
        jButton11.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 320, 70));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));
        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LANDLORD TENENT MANAGEMENT SYSTEM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 1330, 70));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1600, 90));
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/1.JPEG"))); 
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 830, 750));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/white bg 2.jpg"))); 
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1600, 1000));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 1600, 1000));
        pack();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                new paymentInformation().setVisible(true);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                    new fullhistory().setVisible(true);  
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
                        int a=JOptionPane.showConfirmDialog(null, "Do You Really Want to Logout","Select",JOptionPane.YES_NO_OPTION);
                        if(a==0)
                        {
                            setVisible(false);
                            new login().setVisible(true);
                        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                                            new addNewTenentRecord().setVisible(true);      
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) 
          new updateRecord().setVisible(true); 
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
                  new deleteTenent().setVisible(true);              
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
          new uploadDoc().setVisible(true);        
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
            new rules().setVisible(true);  
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    new flatDetails().setVisible(true);        
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        new home().setVisible(true);        
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        new paymentHistory().setVisible(true);        
    }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
}
