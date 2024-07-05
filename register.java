package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class register extends javax.swing.JFrame {
    public register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 24)); 
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 407, -1));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 407, -1));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 24)); 
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, -1));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Already have an Account?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 50, 40));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/cyber-unlock-security-concept.-lock-symbol-form-lines.jpg"))); // NOI18N
        jLabel5.setText("                ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));
        setSize(new java.awt.Dimension(950, 700));
        setLocationRelativeTo(null);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                   setVisible(false);
        new login().setVisible(true);        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into register values('" +username+ "','" + password + "' );");
            JOptionPane.showMessageDialog(null, " ACCOUNT SUCCESSFULLY CREATED ");
            new login().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "!!!   Username Already Exist   !!!");
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
            setVisible(false);
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
}
