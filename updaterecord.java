package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
public class updateRecord extends javax.swing.JFrame {
    public updateRecord() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() 
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel1.setText("Flat No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, 40));
        jTextField1.setFont(new java.awt.Font("Cambria", 1, 36));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 80, -1));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        jTextField2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 290, -1));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel4.setText("No of members");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, 50));
        jTextField3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 290, -1));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));
        jTextField4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 290, -1));
        jLabel6.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel6.setText("Address");
        getcontentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));
        jTextField5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 290, -1));
        jLabel7.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel7.setText("Aadhar No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, -1, -1));
        jTextField6.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 290, -1));
        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel8.setText("Pan No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 700, -1, -1));
        jTextField7.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 700, 290, -1));
        jLabel9.setFont(new java.awt.Font("Cambria", 1, 36));
        jLabel9.setText("Months Started");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 780, -1, -1));
        jTextField8.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 770, 290, -1));
        jLabel10.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel10.setText("Security Amount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 860, -1, -1));
        jTextField9.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 850, 290, -1));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/save-icon--1.png"))); 
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 770, 180, -1));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); 
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 850, 180, -1));

        jButton3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/search.png"))); 
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        jTextField10.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 290, -1));
        jLabel11.setFont(new java.awt.Font("Cambria", 1, 70)); 
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Update Records");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 570, 60));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 710, 20));
        jLabel12.setText("             ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 46, -1, 320));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png")));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 990));
        pack();
    }
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {   
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
       String flatno = jTextField1.getText();
        String name = jTextField2.getText();
        String gender = jTextField10.getText() ;
        String no_of_family = jTextField3.getText();
        String contact_no = jTextField4.getText();
        String address = jTextField5.getText();
        String aadhar_no = jTextField6.getText();
        String pan_no = jTextField7.getText();
        String months_started = jTextField8.getText();
        String security_amount = jTextField9.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update tenent set name='" + name + "',gender='" + gender + "',no_of_members='" + no_of_family + "',contact_no='" + contact_no + "',address='" + address + "',aadhar_no='" + aadhar_no + "',pan_no='" + pan_no + "',months_started='" + months_started + "',security_amount='" + security_amount + "' where flatno='"+flatno+"';");
            JOptionPane.showMessageDialog(null, "!!!    Successfully Updated   !!! ");
            setVisible(false);
            new updateRecord().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
   }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
      String flatno = jTextField1.getText();
          try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from tenent where flatno='"+flatno+"';");
            if(rs.next())
            {
                jTextField2.setText(rs.getString(2));
                 jTextField10.setText(rs.getString(3));
                 jTextField3.setText(rs.getString(4));
                 jTextField4.setText(rs.getString(5));
                 jTextField5.setText(rs.getString(6));
                 jTextField6.setText(rs.getString(7));
                 jTextField7.setText(rs.getString(8));
                 jTextField8.setText(rs.getString(9));
                 jTextField9.setText(rs.getString(10));
                 jTextField1.setEditable(false); 
            }
            else
                JOptionPane.showMessageDialog(null, "Data is Not Found in Our DataBase");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
        
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
            java.util.logging.Logger.getLogger(updateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateRecord().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;

}
