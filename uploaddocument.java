package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.awt.Image;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class uploadDoc extends javax.swing.JFrame {
    public uploadDoc() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel1.setText("Flat No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));
        jTextField1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 80, -1));
        jButton3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/search.png"))); 
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, -1, -1));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));
        jTextField2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 290, -1));
        jLabel11.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("UPLOAD DOCUMENT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 610, 60));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/save-icon--1.png"))); 
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 800, 180, -1));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 800, 180, -1));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel3.setText("Aadhar Card");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 250, -1));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel4.setText("Pan Card");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jLabel5.setText("Police Verification");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, -1, -1));
        jTextField3.setFont(new java.awt.Font("Cambria", 1, 36)); 
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 300, -1));
        jTextField4.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField4.setText(" ");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 300, -1));
        jTextField5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jTextField5.setText("                                                  ");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 300, -1));
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Cambria", 1, 36));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/select.jpeg"))); 
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 60, -1));
        jButton5.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/select.jpeg"))); 
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, 50, 50));
        jButton6.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/select.jpeg"))); 
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 650, 50, 50));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 720, 50));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png"))); 
        jLabel6.setText(" ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 990));
        pack();
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
                jTextField1.setEditable(false);
            }
            else
            JOptionPane.showMessageDialog(null, "Data is Not Found in Our DataBase");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String flatno = jTextField1.getText();
        String name = jTextField2.getText();
        String image=jTextField3.getText();       
        String image1=jTextField4.getText();
        String image2=jTextField5.getText();
        int dno=1;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
        st.executeUpdate("insert into document(aadhar,pan_card,police_verification,flatno) values('" + image + "','" + image1 + "','" + image2 + "','" +flatno+ "');");
            JOptionPane.showMessageDialog(null, "!!!    Successfully Inserted  !!! ");
            setVisible(false);
            new addNewTenentRecord().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setVisible(false);
    }                                        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
              JFileChooser chooser=new JFileChooser();
              chooser.showOpenDialog(null);
              File f=chooser.getSelectedFile();
              String filename1=f.getAbsolutePath();
              jTextField3.setText(filename1);
              Image getAbsolutePath=null;
              ImageIcon icon=new ImageIcon(filename1);
    }                                        
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
              JFileChooser chooser=new JFileChooser();
              chooser.showOpenDialog(null);
              File f=chooser.getSelectedFile();
              String filename2=f.getAbsolutePath();
              jTextField4.setText(filename2);
              Image getAbsolutePath=null;
              ImageIcon icon=new ImageIcon(filename2);       
    }                                        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            JFileChooser chooser=new JFileChooser();
              chooser.showOpenDialog(null);
              File f=chooser.getSelectedFile();
              String filename3=f.getAbsolutePath();
              jTextField5.setText(filename3);
              Image getAbsolutePath=null;
              ImageIcon icon=new ImageIcon(filename3);        
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
            java.util.logging.Logger.getLogger(uploadDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uploadDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uploadDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uploadDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uploadDoc().setVisible(true);
            }
        });
    }                   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;                
}
