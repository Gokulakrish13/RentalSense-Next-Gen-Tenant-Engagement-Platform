package landlord.tenent.management.system;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class rules extends javax.swing.JFrame {
    public rules() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel1.setText("RULES AND REGULATIONS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 28, -1, -1));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 24));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/print.jpg"))); 
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 830, 149, 54));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 0, 36)); 
        jTextArea1.setRows(5);
        jTextArea1.setText("1. payment for upcoming month to be paid in advanced.\n2.Tenants are not allow to leave flat without payment.\n3.contract will be valid upto 12 months\n4.you have to renew the contract after 12 months.\n\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 1350, 560));
        jButton3.setFont(new java.awt.Font("Cambria", 1, 30)); 
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close.png"))); 
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 830, 150, 50));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png")));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 990));
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            jTextArea1.print();       :
        } catch (PrinterException ex) {
            Logger.getLogger(rules.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {   
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
            java.util.logging.Logger.getLogger(rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rules().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
}
