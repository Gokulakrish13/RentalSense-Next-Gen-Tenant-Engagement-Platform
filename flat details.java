package landlord.tenent.management.system;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
public class flatDetails extends javax.swing.JFrame {
    public flatDetails() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jLabel34.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel38.setVisible(false);
        jLabel39.setVisible(false);
        jLabel40.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 60)); 
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("BOOKED FLATS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 886, 40));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel3.setText("1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel4.setText("2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel5.setText("3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel6.setText("4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel7.setText("5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel8.setText("6");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel9.setText("7");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel10.setText("8");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel11.setText("9");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel12.setText("10");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel13.setText("11");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel14.setText("12");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel15.setText("13");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel16.setText("14");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel17.setText("15");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel18.setText("16");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel19.setText("17");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel20.setText("18");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel21.setText("19");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel22.setText("20");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel23.setText("21");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, -1, -1));

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 48));
        jLabel24.setText("22");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, -1, -1));

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel25.setText("23");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 430, -1, -1));

        jLabel26.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel26.setText("24");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 430, -1, -1));

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel27.setText("25");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        jLabel28.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel28.setText("26");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, -1));

        jLabel29.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel29.setText("27");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, -1, -1));

        jLabel30.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel30.setText("28");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, -1, -1));

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel31.setText("29");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, -1, -1));

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel32.setText("30");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, -1, -1));

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel33.setText("31");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 590, -1, -1));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel34.setText("32");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 590, -1, -1));

        jLabel35.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel35.setText("33");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, -1, -1));

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel36.setText("34");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, -1, -1));

        jLabel37.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel37.setText("35");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, -1, -1));

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel38.setText("36");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 730, -1, -1));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel39.setText("37");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 730, -1, -1));

        jLabel40.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel40.setText("38");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 730, -1, -1));

        jLabel41.setFont(new java.awt.Font("Cambria", 1, 48)); 
        jLabel41.setText("39");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 730, -1, -1));

        jLabel42.setFont(new java.awt.Font("Cambria", 1, 48));
        jLabel42.setText("40");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 730, -1, -1));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/Close_1.png"))); 
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 860, -1, -1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landlord/tenent/management/system/light green bg2.png"))); 
        jLabel1.setText("         ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 1000));
        pack();
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {
           int i=1;
           for(i=1;i<=40;i++)
           {
                try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from tenent where flatno='"+i+"';");
            if(rs.next())
            {    
                if(i==1)
                {
                jLabel3.setVisible(true);
                }
               else if(i==2)
               {
                 jLabel4.setVisible(true);
               }
                else if(i==3)
               {
                 jLabel5.setVisible(true);
               }
                else if(i==4)
               {
                 jLabel6.setVisible(true);
               }
                else if(i==5)
               {
                 jLabel7.setVisible(true);
               }
                else if(i==6)
                {
                jLabel8.setVisible(true);
                }
               else if(i==7)
               {
                 jLabel9.setVisible(true);
               }
                else if(i==8)
               {
                 jLabel10.setVisible(true);
               }
                else if(i==9)
               {
                 jLabel11.setVisible(true);
               }
                else if(i==10)
               {
                 jLabel12.setVisible(true);
               }
                else if(i==11)
                {
                jLabel13.setVisible(true);
                }
               else if(i==12)
               {
                 jLabel14.setVisible(true);
               }
                else if(i==13)
               {
                 jLabel15.setVisible(true);
               }
                else if(i==14)
               {
                 jLabel16.setVisible(true);
               }
                else if(i==15)
               {
                 jLabel17.setVisible(true);
               }
                else if(i==16)
                {
                jLabel18.setVisible(true);
                }
               else if(i==17)
               {
                 jLabel19.setVisible(true);
               }
                else if(i==18)
               {
                 jLabel20.setVisible(true);
               }
                else if(i==19)
               {
                 jLabel21.setVisible(true);
               }
                else if(i==20)
               {
                 jLabel22.setVisible(true);
               }
                else if(i==21)
                {
                jLabel23.setVisible(true);
                }
               else if(i==22)
               {
                 jLabel24.setVisible(true);
               }
                else if(i==23)
               {
                 jLabel25.setVisible(true);
               }
                else if(i==24)
               {
                 jLabel26.setVisible(true);
               }
                else if(i==25)
               {
                 jLabel27.setVisible(true);
               }
               else if(i==26)
                {
                jLabel28.setVisible(true);
                }
               else if(i==27)
               {
                 jLabel29.setVisible(true);
               }
                else if(i==28)
               {
                 jLabel30.setVisible(true);
               }
                else if(i==29)
               {
                 jLabel31.setVisible(true);
               }
                else if(i==30)
               {
                 jLabel32.setVisible(true);
               }
                else if(i==31)
                {
                jLabel33.setVisible(true);
                }
               else if(i==32)
               {
                 jLabel34.setVisible(true);
               }
                else if(i==33)
               {
                 jLabel35.setVisible(true);
               }
                else if(i==34)
               {
                 jLabel36.setVisible(true);
               }
                else if(i==35)
               {
                 jLabel37.setVisible(true);
               }
               else if(i==36)
                {
                jLabel38.setVisible(true);
                }
               else if(i==37)
               {
                 jLabel39.setVisible(true);
               }
                else if(i==38)
               {
                 jLabel40.setVisible(true);
               }
                else if(i==39)
               {
                 jLabel41.setVisible(true);
               }
                else if(i==40)
               {
                 jLabel42.setVisible(true);
               }
                
             }
            }
         catch (SQLException e) {     
        }
           }        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(flatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new flatDetails().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
}
