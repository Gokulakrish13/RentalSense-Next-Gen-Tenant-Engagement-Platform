package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
public class addNewTenentRecord extends javax.swing.JFrame {
    public addNewTenentRecord() {
        initComponents();
        jLabel14.setVisible(false);
    }
    @SuppressWarnings("unchecked")                         
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 990));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); 
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 850, 150, -1));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel1.setText("Flat No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel4.setText("No of members");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, 30));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));
        jLabel6.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, -1));
        jLabel7.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel7.setText("Aadhar No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, -1, -1));
        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel8.setText("Pan No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, -1, -1));
        jLabel9.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel9.setText("Months Started");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 790, -1, -1));
        jLabel10.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel10.setText("Security Amount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 870, 320, -1));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 80, -1));
        jTextField2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 250, -1));
        jTextField4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 250, -1));
        jTextField6.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 250, -1));

        jTextField7.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, 250, -1));
        jComboBox1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 250, -1));
        jTextField5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 250, -1));
        jTextField3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 250, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/save-icon--1.png"))); 
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 760, 150, -1));
        jLabel12.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("ADD NEW TENENT DETAILS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 820, 60));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 1170, 20));
        jComboBox2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 780, 250, 50));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jLabel13.setText("10,000");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 880, 130, 30));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*FLAT IS ALREADY BOOKED");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 510, 40));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/search.png"))); 
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 70, 50));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png"))); 
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 1000));
        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setVisible(false);
    }                                        
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String flatno = jTextField1.getText();
        String name = jTextField2.getText();
        String gender = (String) jComboBox1.getSelectedItem();
        String no_of_family = jTextField3.getText();
        String contact_no = jTextField4.getText();
        String address = jTextField5.getText();
        String aadhar_no = jTextField6.getText();
        String pan_no = jTextField7.getText();
        String months_started = (String) jComboBox2.getSelectedItem();
        String security_amount ="10000";
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into tenent values('" + flatno + "','" + name + "','" + gender + "','" + no_of_family + "','" + contact_no + "','" + address + "','" + aadhar_no + "','" + pan_no + "','" + months_started + "','" + security_amount + "');");
            JOptionPane.showMessageDialog(null, "Successfully Inserted");
            setVisible(false);
            new uploadDoc().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "!!! Enter the detail Correct Format  !!!");
        }
    }                                        

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String flatno = jTextField1.getText();
          try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from tenent where flatno='"+flatno+"';");
            if(rs.next())
            {
                jLabel14.setVisible(true);
             }
            else
            {
                jLabel14.setVisible(false);
                jTextField1.setEditable(false);
            }
          
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
            java.util.logging.Logger.getLogger(addNewTenentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewTenentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewTenentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewTenentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewTenentRecord().setVisible(true);
            }
        });
    }                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;             
}
