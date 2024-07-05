package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        lineBorder1 = (javax.swing.border.LineBorder)javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(900, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, -1, -1));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24));   
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, -1, -1));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 18));                  
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/login.png"))); 
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, -1, -1));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); 
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 680, -1, -1));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 331, -1));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, 330, 30));
        jButton3.setFont(new java.awt.Font("Cambria", 1, 18)); 
        jButton3.setText("Create a  new Admin Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 760, -1, -1));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/lb.jpg"))); 
        jLabel4.setText("       ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 900, 650));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/building backgfroung.jpg"))); 
        jLabel3.setText("                 ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -10, 2270, 1090));

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
           String username = jTextField1.getText();
           String password = jPasswordField1.getText();
          try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from register where username='"+username+"';");
            if(rs.next())
            {
        //        jTextField2.setText(rs.getString(2));      
                       //       if(jTextField1.getText().equals("anurag") && jPasswordField1.getText().equals("waris") )  //
                                    if(password.equals(rs.getString(2)))
                                  {
                                   setVisible(false);
                                      new home().setVisible(true);
                                      }
                                 else
                                  JOptionPane.showMessageDialog(null, "Incorrect  Password");
            }
                 else
                JOptionPane.showMessageDialog(null, "Incorrect Username");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          setVisible(false);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            int a=JOptionPane.showConfirmDialog(null, "Do You Really want to Close Application","select",JOptionPane.YES_NO_OPTION) ;
               if(a==0)
                        System.exit(0);                  
           
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                            new register().setVisible(true);        
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.border.LineBorder lineBorder1;
}
