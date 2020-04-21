package cars;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Start extends javax.swing.JFrame {

    public Start() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        jLabel80.setVisible(false); jLabel79.setVisible(false);logined.setVisible(false);jLabel74.setVisible(false);
        jLabel81.setVisible(false); jLabel89.setVisible(false);jLabel90.setVisible(false);jLabel92.setVisible(false);
        jLabel75.setVisible(false);jLabel76.setVisible(false);jLabel93.setVisible(false); Start.jLabel82.setVisible(false);
        
        
        
        setBackground(new Color(0,0,0,0));
        setBackground(new Color(0,0,0,0));
        
    // jLabel77.setBackground(new Color(0,0,0,100));
        
        jLabel66.setBackground(new Color(0,0,0,200));
        jLabel67.setBackground(new Color(40,43,6,200));
        jLabel68.setBackground(new Color(6,19,43,200));
        jLabel69.setBackground(new Color(43,6,6,200));
        
        jLabel74.setBackground(new Color(102,102,102,100));
        jLabel75.setBackground(new Color(0,153,204,100));
        jLabel76.setBackground(new Color(0,153,204,100));
        
        jPanel1.setBackground(new Color(0,0,0,50));
        jPanel2.setBackground(new Color(0,0,0,150));
       
        
        Cars.setLocationRelativeTo(null);
        Cars2.setLocationRelativeTo(null);
        Pick_A_Car.setLocationRelativeTo(null);
        Cars3.setLocationRelativeTo(null);
    }

    Start(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public class progreso implements ActionListener{
 public void actionPerformed(ActionEvent e) {
   
  int n =jProgressBar1.getValue();
if (n<100){
  n++;    jProgressBar1.setValue(n);  }
else{
    timer.stop(); 
Load.setVisible(false);
Cars.setVisible(true);
}
 }
 }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame3 = new javax.swing.JFrame();
        jLabel83 = new javax.swing.JLabel();
        Cars = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        Cars2 = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        Cars3 = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        Pick_A_Car = new javax.swing.JFrame();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cdState = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Load = new javax.swing.JDialog();
        jButton9 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel38 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jLabel46 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton10 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jLabel51 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton14 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDialog2 = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        Load1 = new javax.swing.JDialog();
        jButton15 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        Load2 = new javax.swing.JDialog();
        jButton20 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        Load3 = new javax.swing.JDialog();
        jButton21 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        Load4 = new javax.swing.JDialog();
        jButton22 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        Load5 = new javax.swing.JDialog();
        jButton23 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        Load6 = new javax.swing.JDialog();
        jButton24 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        Load7 = new javax.swing.JDialog();
        jButton25 = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        Load8 = new javax.swing.JDialog();
        jButton26 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        Load10 = new javax.swing.JDialog();
        jButton28 = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        Load11 = new javax.swing.JDialog();
        jButton29 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        logined = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();

        jFrame3.setLocationByPlatform(true);
        jFrame3.setMinimumSize(new java.awt.Dimension(558, 494));
        jFrame3.setUndecorated(true);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8-lamborghini-528.png"))); // NOI18N

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
        );

        Cars.setTitle("Lamborghini Cars");
        Cars.setBackground(new java.awt.Color(51, 51, 51));
        Cars.setMinimumSize(new java.awt.Dimension(490, 491));
        Cars.setUndecorated(true);
        Cars.setSize(new java.awt.Dimension(592, 511));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lamborghini cars");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);

        jScrollPane4.setBackground(new java.awt.Color(102, 204, 255));
        jScrollPane4.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(java.awt.SystemColor.activeCaptionText);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("1) Murcielago LP750  Edo");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/lamborghini-murcielago.jpg"))); // NOI18N
        jLabel4.setToolTipText("Click on car for more Details.");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("2) Veneno Roadster");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini-Veneno.jpg"))); // NOI18N
        jLabel6.setToolTipText("Click on car for more Details.");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("3) Centenario Coupe");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/lamborghini-centenario-price-in-india-p.jpg"))); // NOI18N
        jLabel8.setToolTipText("Click on car for more Details.");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/7012038-lamborghini-gallardo-white.jpg"))); // NOI18N
        jLabel11.setToolTipText("Click on car for more Details.");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("4) Gallardo Dallas");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Shutdown_32px.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton16.setText("A Short Video");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("A Short Video");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("A Short Video");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("A Short Video");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton19))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton16)))
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton17)))
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton18)))
                .addGap(55, 55, 55)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        jLabel4.getAccessibleContext().setAccessibleDescription("Click on car for Details.");

        jScrollPane4.setViewportView(jPanel3);

        javax.swing.GroupLayout CarsLayout = new javax.swing.GroupLayout(Cars.getContentPane());
        Cars.getContentPane().setLayout(CarsLayout);
        CarsLayout.setHorizontalGroup(
            CarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
        );
        CarsLayout.setVerticalGroup(
            CarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarsLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Cars2.setTitle("Lamborghini Cars");
        Cars2.setMinimumSize(new java.awt.Dimension(480, 491));
        Cars2.setUndecorated(true);
        Cars2.setSize(new java.awt.Dimension(592, 511));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lamborghini cars");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setPreferredSize(new java.awt.Dimension(480, 1222));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("5) Huracan Mansory Torofeo");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/lamborghini-huracan-0.jpg"))); // NOI18N
        jLabel13.setToolTipText("Click on car for more Details.");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("6)  Aventador LP700-4 Roadster");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/soCUIu.jpg"))); // NOI18N
        jLabel15.setToolTipText("Click on car for more Details.");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jButton2.setText("Previous");
        jButton2.setMinimumSize(new java.awt.Dimension(55, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(55, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Next");
        jButton3.setMaximumSize(new java.awt.Dimension(55, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("7) Sesto Elemento");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/546b72e554ede_-_2013-lamborghini-sesto-elemento-lg.jpg"))); // NOI18N
        jLabel18.setToolTipText("Click on car for more Details.");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("8) Reventon Roadster");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/4x17j15.jpg"))); // NOI18N
        jLabel20.setToolTipText("Click on car for more Details.");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jButton31.setText("A Short Video");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("A Short Video");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("A Short Video");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("A Short Video");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31)
                    .addComponent(jButton32)
                    .addComponent(jButton33)
                    .addComponent(jButton34))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton31)))
                .addGap(54, 54, 54)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton33)))
                .addGap(56, 56, 56)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton34)
                        .addGap(141, 141, 141)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jScrollPane5.setViewportView(jPanel4);

        javax.swing.GroupLayout Cars2Layout = new javax.swing.GroupLayout(Cars2.getContentPane());
        Cars2.getContentPane().setLayout(Cars2Layout);
        Cars2Layout.setHorizontalGroup(
            Cars2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        Cars2Layout.setVerticalGroup(
            Cars2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cars2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cars3.setTitle("Lamborghini Cars");
        Cars3.setMinimumSize(new java.awt.Dimension(480, 491));
        Cars3.setUndecorated(true);
        Cars3.setSize(new java.awt.Dimension(600, 511));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Lamborghini cars");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton5.setText("Previous");
        jButton5.setMaximumSize(new java.awt.Dimension(55, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(55, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(55, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/2014_lamborghini_asterion_lpi_910-4_concept_4_1280x960.jpg"))); // NOI18N
        jLabel25.setToolTipText("Click on car for more Details.");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("10) Asterion LPI910-4");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/The-Lamborghini-5-95-Zagato-Concept-Front.jpg"))); // NOI18N
        jLabel23.setToolTipText("Click on car for more Details.");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("9) 5-95 Zagato");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton27.setText("A Short Video");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton30.setText("A Short Video");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27)
                    .addComponent(jButton30))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton27)))
                .addGap(39, 39, 39)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton30)
                        .addGap(83, 83, 83)))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane11.setViewportView(jPanel5);

        javax.swing.GroupLayout Cars3Layout = new javax.swing.GroupLayout(Cars3.getContentPane());
        Cars3.getContentPane().setLayout(Cars3Layout);
        Cars3Layout.setHorizontalGroup(
            Cars3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cars3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Cars3Layout.setVerticalGroup(
            Cars3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cars3Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pick_A_Car.setTitle("Customer Details");
        Pick_A_Car.setBackground(java.awt.SystemColor.activeCaption);
        Pick_A_Car.setMinimumSize(new java.awt.Dimension(750, 500));
        Pick_A_Car.setUndecorated(true);
        Pick_A_Car.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Pick_A_CarWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        Pick_A_Car.getContentPane().setLayout(null);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Maiandra GD", 1, 26)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CUSTOMER DETAILS ");
        Pick_A_Car.getContentPane().add(jLabel26);
        jLabel26.setBounds(170, 20, 410, 35);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Customer Name");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pick_A_Car.getContentPane().add(jLabel27);
        jLabel27.setBounds(10, 130, 230, 19);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Pick_A_Car.getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 130, 450, 22);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Address");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pick_A_Car.getContentPane().add(jLabel28);
        jLabel28.setBounds(10, 160, 230, 22);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Pick_A_Car.getContentPane().add(jTextField2);
        jTextField2.setBounds(270, 160, 450, 22);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("City");
        Pick_A_Car.getContentPane().add(jLabel29);
        jLabel29.setBounds(270, 190, 230, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Pick_A_Car.getContentPane().add(jTextField3);
        jTextField3.setBounds(270, 220, 230, 27);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("State");
        Pick_A_Car.getContentPane().add(jLabel30);
        jLabel30.setBounds(523, 190, 190, 22);

        cdState.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cdState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "west Bengal\t" }));
        Pick_A_Car.getContentPane().add(cdState);
        cdState.setBounds(520, 220, 200, 27);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButton2.setText("Female");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Pick_A_Car.getContentPane().add(jPanel7);
        jPanel7.setBounds(520, 260, 200, 90);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Phone No.");
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pick_A_Car.getContentPane().add(jLabel32);
        jLabel32.setBounds(10, 260, 230, 25);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Pick_A_Car.getContentPane().add(jTextField4);
        jTextField4.setBounds(270, 260, 230, 25);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Pick_A_Car.getContentPane().add(jTextField5);
        jTextField5.setBounds(270, 300, 230, 28);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("E-Mail ");
        jLabel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pick_A_Car.getContentPane().add(jLabel33);
        jLabel33.setBounds(10, 300, 230, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Car that you purchase");
        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pick_A_Car.getContentPane().add(jLabel34);
        jLabel34.setBounds(10, 360, 230, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Date  -");
        Pick_A_Car.getContentPane().add(jLabel36);
        jLabel36.setBounds(540, 80, 50, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        Pick_A_Car.getContentPane().add(jLabel37);
        jLabel37.setBounds(600, 80, 130, 20);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Murcielago LP750 Edo", "Veneno Roadster ", "Centenario Coupe", "Gallardo Dallas", "Huracan Mansory Torofeo", "Aventador LP700-4 Roadster", "Sesto Elemento", "Reventon Roadster", "5-95 Zagato", "Asterion LPI910-4" }));
        Pick_A_Car.getContentPane().add(jComboBox2);
        jComboBox2.setBounds(270, 360, 230, 30);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Details.png"))); // NOI18N
        Pick_A_Car.getContentPane().add(jLabel35);
        jLabel35.setBounds(0, 0, 740, 112);

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("SAVE Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Pick_A_Car.getContentPane().add(jButton7);
        jButton7.setBounds(520, 400, 200, 40);

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Pick_A_Car.getContentPane().add(jButton8);
        jButton8.setBounds(380, 400, 120, 40);

        Load.setTitle("Loading.....");
        Load.setLocation(new java.awt.Point(200, 200));
        Load.setMinimumSize(new java.awt.Dimension(600, 354));
        Load.setUndecorated(true);
        Load.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                LoadWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                LoadWindowLostFocus(evt);
            }
        });
        Load.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                LoadWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                LoadWindowOpened(evt);
            }
        });
        Load.getContentPane().setLayout(null);

        jButton9.setBackground(java.awt.Color.black);
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Skip Video >>");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Load.getContentPane().add(jButton9);
        jButton9.setBounds(480, 330, 120, 30);

        jProgressBar1.setBackground(new java.awt.Color(102, 102, 102));
        jProgressBar1.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBar1.setMaximumSize(new java.awt.Dimension(32767, 5));
        jProgressBar1.setMinimumSize(new java.awt.Dimension(10, 5));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 5));
        Load.getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 320, 600, 5);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/ezgif.gif"))); // NOI18N
        Load.getContentPane().add(jLabel38);
        jLabel38.setBounds(0, 20, 602, 340);

        jLabel65.setBackground(new java.awt.Color(0, 204, 204));
        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("Loading.......");
        jLabel65.setOpaque(true);
        Load.getContentPane().add(jLabel65);
        jLabel65.setBounds(0, 0, 600, 20);

        jFrame1.setTitle("Car Details");
        jFrame1.setBackground(new java.awt.Color(0, 0, 153));
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrame1.setLocation(new java.awt.Point(425, 150));
        jFrame1.setMinimumSize(new java.awt.Dimension(514, 438));
        jFrame1.setUndecorated(true);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/theme.jpg"))); // NOI18N
        jLabel46.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Name Of Car");

        jLabel39.setBackground(new java.awt.Color(51, 51, 51));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Top Speed");

        jLabel40.setBackground(new java.awt.Color(51, 51, 51));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("0-100 kph");

        jLabel41.setBackground(new java.awt.Color(51, 51, 51));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Power");

        jLabel42.setBackground(new java.awt.Color(51, 51, 51));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("bhp/weight");

        jLabel43.setBackground(new java.awt.Color(51, 51, 51));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Displacement");

        jLabel44.setBackground(new java.awt.Color(51, 51, 51));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Weight");

        jLabel45.setBackground(new java.awt.Color(51, 51, 51));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Price");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 51, 51));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(51, 51, 51));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(51, 51, 51));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(51, 51, 51));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(51, 51, 51));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame2.setTitle("Login");
        jFrame2.setLocation(new java.awt.Point(450, 200));
        jFrame2.setMinimumSize(new java.awt.Dimension(500, 275));
        jFrame2.setUndecorated(true);
        jFrame2.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                jFrame2WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame2WindowOpened(evt);
            }
        });
        jFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jFrame2.getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Login");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 90, 30));

        jLabel49.setText("Password");
        jFrame2.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 20));

        jButton11.setBackground(new java.awt.Color(204, 204, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("Create Account");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, 30));

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 120, 30));

        jTextField14.setBorder(null);
        jFrame2.getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 20));

        jLabel48.setText("Enter Unique ID");
        jFrame2.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 20));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lam.jpg"))); // NOI18N
        jFrame2.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 260));

        jLabel64.setBackground(new java.awt.Color(153, 153, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Login Page..");
        jLabel64.setOpaque(true);
        jFrame2.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 20));

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("New Account");
        jDialog1.setLocation(new java.awt.Point(450, 25));
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(505, 689));
        jDialog1.getContentPane().setLayout(null);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Creating New Account");
        jDialog1.getContentPane().add(jLabel51);
        jLabel51.setBounds(50, 80, 390, 40);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/we.jpg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel50);
        jLabel50.setBounds(0, 0, 505, 124);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Name");
        jLabel52.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("Address");
        jLabel53.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Gender");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setText("Male");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton4.setText("Female");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("Date of Birth");
        jLabel55.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Day");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("Month");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("Year");

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setText("Enter User_ID");
        jLabel59.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Enter Password");
        jLabel60.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("Confirm Password");
        jLabel61.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("( Enter upto 8 digit value)");

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("( Enter upto 10 digit value)");

        jButton14.setText("CREATE ACCOUNT");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16)
                            .addComponent(jTextField15)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField18)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField2)
                            .addComponent(jPasswordField3)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 44, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jButton14)
                .addGap(26, 26, 26))
        );

        jDialog1.getContentPane().add(jPanel8);
        jPanel8.setBounds(10, 130, 470, 560);

        jDialog2.setMinimumSize(new java.awt.Dimension(1102, 591));
        jDialog2.setUndecorated(true);
        jDialog2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jDialog2WindowOpened(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(204, 204, 0));
        jTextField19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jTextField19.setOpaque(false);
        jPanel10.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 350, 60));

        jLabel78.setFont(new java.awt.Font("Bickham Script Pro Regular", 1, 100)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(228, 209, 27));
        jLabel78.setText("Login");
        jPanel10.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, 130));

        jTextField20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(204, 204, 0));
        jTextField20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jTextField20.setOpaque(false);
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField20KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField20KeyTyped(evt);
            }
        });
        jPanel10.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 350, 60));

        jLabel84.setFont(new java.awt.Font("Bickham Script Pro Semibold", 1, 36)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(230, 208, 0));
        jLabel84.setText("Password");
        jPanel10.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 110, 30));

        jLabel85.setFont(new java.awt.Font("Bickham Script Pro Semibold", 1, 36)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(230, 208, 0));
        jLabel85.setText("Username");
        jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 110, 30));

        jLabel86.setForeground(new java.awt.Color(255, 255, 51));
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/11.png"))); // NOI18N
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 120));

        jLabel87.setForeground(new java.awt.Color(230, 208, 0));
        jLabel87.setText(" ");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 150, 20));

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/logo11.jpg"))); // NOI18N
        jLabel77.setOpaque(true);
        jPanel10.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1070, 550));

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        jLabel91.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 102));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Workspace_50px.png"))); // NOI18N
        jLabel91.setText("CARS 1");
        jLabel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
        });

        Load1.setTitle("Loading.....");
        Load1.setLocation(new java.awt.Point(200, 200));
        Load1.setMinimumSize(new java.awt.Dimension(600, 354));
        Load1.setUndecorated(true);
        Load1.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load1WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load1WindowLostFocus(evt);
            }
        });
        Load1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load1WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load1WindowOpened(evt);
            }
        });

        jButton15.setBackground(java.awt.Color.black);
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Back");
        jButton15.setOpaque(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/2011 Edo Competition Lamborghini Murcielago LP750.gif"))); // NOI18N

        jLabel95.setBackground(new java.awt.Color(0, 204, 204));
        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel95.setText("Loading.......");
        jLabel95.setOpaque(true);

        javax.swing.GroupLayout Load1Layout = new javax.swing.GroupLayout(Load1.getContentPane());
        Load1.getContentPane().setLayout(Load1Layout);
        Load1Layout.setHorizontalGroup(
            Load1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load1Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load1Layout.setVerticalGroup(
            Load1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load1Layout.createSequentialGroup()
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load2.setTitle("Loading.....");
        Load2.setLocation(new java.awt.Point(200, 200));
        Load2.setMinimumSize(new java.awt.Dimension(600, 354));
        Load2.setUndecorated(true);
        Load2.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load2WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load2WindowLostFocus(evt);
            }
        });
        Load2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load2WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load2WindowOpened(evt);
            }
        });

        jButton20.setBackground(java.awt.Color.black);
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Back");
        jButton20.setOpaque(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini Veneno Roadster U.S. Debut Trailer.gif"))); // NOI18N

        jLabel97.setBackground(new java.awt.Color(0, 204, 204));
        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setText("Loading.......");
        jLabel97.setOpaque(true);

        javax.swing.GroupLayout Load2Layout = new javax.swing.GroupLayout(Load2.getContentPane());
        Load2.getContentPane().setLayout(Load2Layout);
        Load2Layout.setHorizontalGroup(
            Load2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load2Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load2Layout.setVerticalGroup(
            Load2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load2Layout.createSequentialGroup()
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load2Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load3.setTitle("Loading.....");
        Load3.setLocation(new java.awt.Point(200, 200));
        Load3.setMinimumSize(new java.awt.Dimension(600, 354));
        Load3.setUndecorated(true);
        Load3.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load3WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load3WindowLostFocus(evt);
            }
        });
        Load3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load3WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load3WindowOpened(evt);
            }
        });

        jButton21.setBackground(java.awt.Color.black);
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Back");
        jButton21.setOpaque(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini Centenario LP 770-4- Perfection Forged.gif"))); // NOI18N

        jLabel99.setBackground(new java.awt.Color(0, 204, 204));
        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel99.setText("Loading.......");
        jLabel99.setOpaque(true);

        javax.swing.GroupLayout Load3Layout = new javax.swing.GroupLayout(Load3.getContentPane());
        Load3.getContentPane().setLayout(Load3Layout);
        Load3Layout.setHorizontalGroup(
            Load3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load3Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load3Layout.setVerticalGroup(
            Load3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load3Layout.createSequentialGroup()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load3Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load4.setTitle("Loading.....");
        Load4.setLocation(new java.awt.Point(200, 200));
        Load4.setMinimumSize(new java.awt.Dimension(600, 354));
        Load4.setUndecorated(true);
        Load4.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load4WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load4WindowLostFocus(evt);
            }
        });
        Load4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load4WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load4WindowOpened(evt);
            }
        });

        jButton22.setBackground(java.awt.Color.black);
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Back");
        jButton22.setOpaque(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/TEASER- LAMBORGHINI GALLARDO LP 570-4 SUPERLEGGERA. THE PACEMAKER..gif"))); // NOI18N

        jLabel101.setBackground(new java.awt.Color(0, 204, 204));
        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("Loading.......");
        jLabel101.setOpaque(true);

        javax.swing.GroupLayout Load4Layout = new javax.swing.GroupLayout(Load4.getContentPane());
        Load4.getContentPane().setLayout(Load4Layout);
        Load4Layout.setHorizontalGroup(
            Load4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load4Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load4Layout.setVerticalGroup(
            Load4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load4Layout.createSequentialGroup()
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load4Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load5.setTitle("Loading.....");
        Load5.setLocation(new java.awt.Point(200, 200));
        Load5.setMinimumSize(new java.awt.Dimension(600, 354));
        Load5.setUndecorated(true);
        Load5.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load5WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load5WindowLostFocus(evt);
            }
        });
        Load5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load5WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load5WindowOpened(evt);
            }
        });

        jButton23.setBackground(java.awt.Color.black);
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Back");
        jButton23.setOpaque(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini Huracán Super Trofeo EVO- Official Video.gif"))); // NOI18N

        jLabel103.setBackground(new java.awt.Color(0, 204, 204));
        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel103.setText("Loading.......");
        jLabel103.setOpaque(true);

        javax.swing.GroupLayout Load5Layout = new javax.swing.GroupLayout(Load5.getContentPane());
        Load5.getContentPane().setLayout(Load5Layout);
        Load5Layout.setHorizontalGroup(
            Load5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load5Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load5Layout.setVerticalGroup(
            Load5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load5Layout.createSequentialGroup()
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load5Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load6.setTitle("Loading.....");
        Load6.setLocation(new java.awt.Point(200, 200));
        Load6.setMinimumSize(new java.awt.Dimension(600, 354));
        Load6.setUndecorated(true);
        Load6.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load6WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load6WindowLostFocus(evt);
            }
        });
        Load6.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load6WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load6WindowOpened(evt);
            }
        });

        jButton24.setBackground(java.awt.Color.black);
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Back");
        jButton24.setOpaque(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/LAMBORGHINI AVENTADOR LP 700-4. A RELENTLESS FORCE.gif"))); // NOI18N

        jLabel105.setBackground(new java.awt.Color(0, 204, 204));
        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel105.setText("Loading.......");
        jLabel105.setOpaque(true);

        javax.swing.GroupLayout Load6Layout = new javax.swing.GroupLayout(Load6.getContentPane());
        Load6.getContentPane().setLayout(Load6Layout);
        Load6Layout.setHorizontalGroup(
            Load6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load6Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load6Layout.setVerticalGroup(
            Load6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load6Layout.createSequentialGroup()
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load6Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load7.setTitle("Loading.....");
        Load7.setLocation(new java.awt.Point(200, 200));
        Load7.setMinimumSize(new java.awt.Dimension(600, 354));
        Load7.setUndecorated(true);
        Load7.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load7WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load7WindowLostFocus(evt);
            }
        });
        Load7.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load7WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load7WindowOpened(evt);
            }
        });

        jButton25.setBackground(java.awt.Color.black);
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Back");
        jButton25.setOpaque(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini Sesto Elemento - Reveal.gif"))); // NOI18N

        jLabel107.setBackground(new java.awt.Color(0, 204, 204));
        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel107.setText("Loading.......");
        jLabel107.setOpaque(true);

        javax.swing.GroupLayout Load7Layout = new javax.swing.GroupLayout(Load7.getContentPane());
        Load7.getContentPane().setLayout(Load7Layout);
        Load7Layout.setHorizontalGroup(
            Load7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load7Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load7Layout.setVerticalGroup(
            Load7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load7Layout.createSequentialGroup()
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load7Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load8.setTitle("Loading.....");
        Load8.setLocation(new java.awt.Point(200, 200));
        Load8.setMinimumSize(new java.awt.Dimension(600, 354));
        Load8.setUndecorated(true);
        Load8.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load8WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load8WindowLostFocus(evt);
            }
        });
        Load8.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load8WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load8WindowOpened(evt);
            }
        });

        jButton26.setBackground(java.awt.Color.black);
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Back");
        jButton26.setOpaque(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini Reventón Roadster Official Video.gif"))); // NOI18N

        jLabel109.setBackground(new java.awt.Color(0, 204, 204));
        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel109.setText("Loading.......");
        jLabel109.setOpaque(true);

        javax.swing.GroupLayout Load8Layout = new javax.swing.GroupLayout(Load8.getContentPane());
        Load8.getContentPane().setLayout(Load8Layout);
        Load8Layout.setHorizontalGroup(
            Load8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load8Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load8Layout.setVerticalGroup(
            Load8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load8Layout.createSequentialGroup()
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load8Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load10.setTitle("Loading.....");
        Load10.setLocation(new java.awt.Point(200, 200));
        Load10.setMinimumSize(new java.awt.Dimension(600, 354));
        Load10.setUndecorated(true);
        Load10.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load10WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load10WindowLostFocus(evt);
            }
        });
        Load10.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load10WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load10WindowOpened(evt);
            }
        });

        jButton28.setBackground(java.awt.Color.black);
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Back");
        jButton28.setOpaque(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/lam1.gif"))); // NOI18N

        jLabel113.setBackground(new java.awt.Color(0, 204, 204));
        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel113.setText("Loading.......");
        jLabel113.setOpaque(true);

        javax.swing.GroupLayout Load10Layout = new javax.swing.GroupLayout(Load10.getContentPane());
        Load10.getContentPane().setLayout(Load10Layout);
        Load10Layout.setHorizontalGroup(
            Load10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load10Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load10Layout.setVerticalGroup(
            Load10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load10Layout.createSequentialGroup()
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load10Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Load11.setTitle("Loading.....");
        Load11.setLocation(new java.awt.Point(200, 200));
        Load11.setMinimumSize(new java.awt.Dimension(600, 354));
        Load11.setUndecorated(true);
        Load11.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                Load11WindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                Load11WindowLostFocus(evt);
            }
        });
        Load11.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Load11WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load11WindowOpened(evt);
            }
        });

        jButton29.setBackground(java.awt.Color.black);
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Back");
        jButton29.setOpaque(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/Lamborghini Asterion LPI 910-4 - DESIGN & SPECS.gif"))); // NOI18N

        jLabel115.setBackground(new java.awt.Color(0, 204, 204));
        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel115.setText("Loading.......");
        jLabel115.setOpaque(true);

        javax.swing.GroupLayout Load11Layout = new javax.swing.GroupLayout(Load11.getContentPane());
        Load11.getContentPane().setLayout(Load11Layout);
        Load11Layout.setHorizontalGroup(
            Load11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Load11Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Load11Layout.setVerticalGroup(
            Load11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Load11Layout.createSequentialGroup()
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Load11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Load11Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Lamborghini");
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(1309, 558));
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Top_Menu_96px_7.png"))); // NOI18N
        jLabel70.setText(" ");
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel70);
        jLabel70.setBounds(50, 70, 100, 80);

        jLabel66.setBackground(new java.awt.Color(0, 0, 0));
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel66.setOpaque(true);
        jLabel66.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel66MouseMoved(evt);
            }
        });
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel66MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel66MouseExited(evt);
            }
        });
        jPanel2.add(jLabel66);
        jLabel66.setBounds(20, 20, 170, 180);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Tesla_Model_X_64px.png"))); // NOI18N
        jLabel71.setText(" ");
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel71);
        jLabel71.setBounds(70, 240, 70, 70);

        jLabel68.setBackground(new java.awt.Color(6, 19, 43));
        jLabel68.setText(" ");
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel68.setOpaque(true);
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel68MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel68MouseExited(evt);
            }
        });
        jPanel2.add(jLabel68);
        jLabel68.setBounds(20, 200, 170, 160);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 204, 204));
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Shutdown_32px_1.png"))); // NOI18N
        jLabel73.setText("Power");
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel73);
        jLabel73.setBounds(20, 480, 100, 40);

        jLabel67.setBackground(new java.awt.Color(40, 43, 6));
        jLabel67.setText(" ");
        jLabel67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel67.setOpaque(true);
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel67);
        jLabel67.setBounds(20, 480, 170, 40);

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Car_Service_64px_2.png"))); // NOI18N
        jLabel72.setText(" ");
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel72);
        jLabel72.setBounds(70, 390, 60, 60);

        jLabel69.setBackground(new java.awt.Color(43, 6, 6));
        jLabel69.setText("  ");
        jLabel69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel69MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel69MouseExited(evt);
            }
        });
        jPanel2.add(jLabel69);
        jLabel69.setBounds(20, 360, 170, 120);

        jLabel81.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 102));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Car_Insurance_32px_1.png"))); // NOI18N
        jLabel81.setText("CARS 1");
        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel81MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel81);
        jLabel81.setBounds(220, 230, 160, 100);

        jLabel79.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 102));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Add_Administrator_50px.png"))); // NOI18N
        jLabel79.setText("Add account");
        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel79MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel79);
        jLabel79.setBounds(440, 60, 180, 100);

        jLabel82.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 102));
        jLabel82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel82MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel82);
        jLabel82.setBounds(690, 80, 170, 60);

        logined.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        logined.setForeground(new java.awt.Color(0, 0, 102));
        logined.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logined.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        logined.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logined.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginedMouseEntered(evt);
            }
        });
        jPanel2.add(logined);
        logined.setBounds(670, 60, 210, 100);

        jLabel80.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 102));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Microsoft_Admin_50px_1.png"))); // NOI18N
        jLabel80.setText("Admin Saksham");
        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel80MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel80);
        jLabel80.setBounds(230, 60, 170, 100);

        jLabel93.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 102));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Workspace_50px.png"))); // NOI18N
        jLabel93.setText("Change account");
        jLabel93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel93.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel93MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel93);
        jLabel93.setBounds(920, 60, 180, 100);

        jLabel74.setBackground(new java.awt.Color(0, 153, 204));
        jLabel74.setText(" ");
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel74.setOpaque(true);
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel74MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel74MouseExited(evt);
            }
        });
        jPanel2.add(jLabel74);
        jLabel74.setBounds(190, 30, 950, 160);

        jLabel89.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 102));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Car_Insurance_32px_1.png"))); // NOI18N
        jLabel89.setText("CARS 2");
        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel89MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel89);
        jLabel89.setBounds(420, 230, 160, 100);

        jLabel90.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 102));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Car_Insurance_32px_1.png"))); // NOI18N
        jLabel90.setText("CARS 3");
        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel90MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel90);
        jLabel90.setBounds(620, 230, 160, 100);

        jLabel92.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 102));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/icons8_Workspace_50px.png"))); // NOI18N
        jLabel92.setText("PICK UP A CAR");
        jLabel92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel92MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel92);
        jLabel92.setBounds(230, 390, 200, 70);

        jLabel75.setBackground(new java.awt.Color(0, 153, 204));
        jLabel75.setText(" ");
        jLabel75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel75.setOpaque(true);
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel75MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel75MouseExited(evt);
            }
        });
        jPanel2.add(jLabel75);
        jLabel75.setBounds(190, 220, 620, 130);

        jLabel76.setBackground(new java.awt.Color(0, 153, 204));
        jLabel76.setText(" ");
        jLabel76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel76.setOpaque(true);
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel76MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel76MouseExited(evt);
            }
        });
        jPanel2.add(jLabel76);
        jLabel76.setBounds(190, 370, 310, 100);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Images/sta.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 1190, 500);

        jLabel88.setBackground(new java.awt.Color(51, 0, 51));
        jLabel88.setText("jLabel88");
        jPanel2.add(jLabel88);
        jLabel88.setBounds(270, 270, 90, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 0, 1230, 540);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1320, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Cars2.setVisible(true);  
Cars.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Cars2.setVisible(true);
Cars3.setVisible(false);     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
Pick_A_Car.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
try{
    String Name=jTextField1.getText();
String add=jTextField2.getText();
String phone = jTextField4.getText();
String date=jLabel37.getText();
String op=null;
String email=jTextField5.getText();
String city=jTextField3.getText();
String car= (String) jComboBox2.getSelectedItem();
String n= Name.substring(0,2);
String w=city.toLowerCase();
String j=w.substring(0,2);
Object St = cdState.getSelectedItem();
String st=St.toString();
String lk=st.toLowerCase();
String gh=lk.substring(0,3);
String ge=null;
if (jRadioButton1.isSelected())
{
    ge="M";
}
else {
    ge="F";
}

String i=JOptionPane.showInputDialog(null,"Type here five Digit Numerical code");
if (i.length()==5)
{ op=n+j+gh+i;}
else {String o=JOptionPane.showInputDialog(null,"Enter only 5 Digit code");
if(o.length()==5){op=n+j+gh+o;}
else {JOptionPane.showMessageDialog(null,"Try after few seconds Back");}}
JOptionPane.showMessageDialog(null,"Please Note down your Customer_ID and keep it safe -"+op);
 Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement stmt = con.createStatement();
String q = "Insert into customer values('"+op+"','"+Name+"','"+add+"',"+phone+",'"+date+"','"+car+"','"+city+"','"+St+"','"+ge+"','"+email+"');";
    int lpk=stmt.executeUpdate(q);
JOptionPane.showMessageDialog(null,"Record insert Successfully and have a nice day");
    }//GEN-LAST:event_jButton7ActionPerformed
    catch (Exception ex)
    {    JOptionPane.showMessageDialog(null,ex.getMessage());    }
         }
      
    private void Pick_A_CarWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Pick_A_CarWindowGainedFocus
Date d=Date.valueOf(LocalDate.now());
jLabel37.setText(""+d);
    }//GEN-LAST:event_Pick_A_CarWindowGainedFocus

    private void LoadWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadWindowOpened

    }//GEN-LAST:event_LoadWindowOpened

    private void LoadWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadWindowClosed
 
    }//GEN-LAST:event_LoadWindowClosed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
Load.setVisible(false);
 Cars.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void LoadWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadWindowGainedFocus

    }//GEN-LAST:event_LoadWindowGainedFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jFrame2.setVisible(false);

    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
jFrame1.setVisible(true);
        try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
      String q="select * from cars where name_of_car like  '%Murcielago%';";
 ResultSet r=st.executeQuery(q);
  if (r.next())
 {
     String na=r.getString("name_of_car");
     String m=r.getString("Top_speed");
     String em =r.getString("0_100kph");
String e =r.getString("power");
String  bhp=r.getString("bhp_weight");
String dis =r.getString("Displacement");
String w =r.getString("weight");
String price =r.getString("price");
     jTextField6.setText(na);
jTextField7.setText(m);
jTextField8.setText(em);
jTextField9.setText(e);
jTextField10.setText(bhp);
jTextField11.setText(dis);
jTextField12.setText(w);
jTextField13.setText(price);
 }  }
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
jFrame1.setVisible(true);
        try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
      String q="select * from cars where name_of_car like  '%veneno%';";
 ResultSet r=st.executeQuery(q);
  if (r.next())
 {
     String na=r.getString("name_of_car");
     String m=r.getString("Top_speed");
     String em =r.getString("0_100kph");
String e =r.getString("power");
String  bhp=r.getString("bhp_weight");
String dis =r.getString("Displacement");
String w =r.getString("weight");
String price =r.getString("price");
     jTextField6.setText(na);
jTextField7.setText(m);
jTextField8.setText(em);
jTextField9.setText(e);
jTextField10.setText(bhp);
jTextField11.setText(dis);
jTextField12.setText(w);
jTextField13.setText(price);
 }  }
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
jFrame1.setVisible(true);
        try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
      String q="select * from cars where name_of_car like  '%centenario%';";
 ResultSet r=st.executeQuery(q);
  if (r.next())
 {
     String na=r.getString("name_of_car");
     String m=r.getString("Top_speed");
     String em =r.getString("0_100kph");
String e =r.getString("power");
String  bhp=r.getString("bhp_weight");
String dis =r.getString("Displacement");
String w =r.getString("weight");
String price =r.getString("price");
     jTextField6.setText(na);
jTextField7.setText(m);
jTextField8.setText(em);
jTextField9.setText(e);
jTextField10.setText(bhp);
jTextField11.setText(dis);
jTextField12.setText(w);
jTextField13.setText(price);
 }}
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
jFrame1.setVisible(true);
        try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
      String q="select * from cars where name_of_car like  '%gallardo%';";
 ResultSet r=st.executeQuery(q);
  if (r.next())
 {
     String na=r.getString("name_of_car");
     String m=r.getString("Top_speed");
     String em =r.getString("0_100kph");
String e =r.getString("power");
String  bhp=r.getString("bhp_weight");
String dis =r.getString("Displacement");
String w =r.getString("weight");
String price =r.getString("price");
     jTextField6.setText(na);
jTextField7.setText(m);
jTextField8.setText(em);
jTextField9.setText(e);
jTextField10.setText(bhp);
jTextField11.setText(dis);
jTextField12.setText(w);
jTextField13.setText(price);
 }  }
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }       
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
jFrame1.setVisible(true);
        try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
      String q="select * from cars where name_of_car like  '%5-95%';";
 ResultSet r=st.executeQuery(q);
  if (r.next())
 {
     String na=r.getString("name_of_car");
     String m=r.getString("Top_speed");
     String em =r.getString("0_100kph");
String e =r.getString("power");
String  bhp=r.getString("bhp_weight");
String dis =r.getString("Displacement");
String w =r.getString("weight");
String price =r.getString("price");
     jTextField6.setText(na);
jTextField7.setText(m);
jTextField8.setText(em);
jTextField9.setText(e);
jTextField10.setText(bhp);
jTextField11.setText(dis);
jTextField12.setText(w);
jTextField13.setText(price);
 }  }
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
jFrame1.setVisible(true);
        try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
      String q="select * from cars where name_of_car like  '%asterion%';";
 ResultSet r=st.executeQuery(q);
  if (r.next())
 {
     String na=r.getString("name_of_car");
     String m=r.getString("Top_speed");
     String em =r.getString("0_100kph");
String e =r.getString("power");
String  bhp=r.getString("bhp_weight");
String dis =r.getString("Displacement");
String w =r.getString("weight");
String price =r.getString("price");
     jTextField6.setText(na);
jTextField7.setText(m);
jTextField8.setText(em);
jTextField9.setText(e);
jTextField10.setText(bhp);
jTextField11.setText(dis);
jTextField12.setText(w);
jTextField13.setText(price);
 }  }
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }      
    }//GEN-LAST:event_jLabel25MouseClicked

    private void LoadWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadWindowLostFocus
        timer.stop();
jProgressBar1.setValue(0);        
    }//GEN-LAST:event_LoadWindowLostFocus

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jFrame1.setVisible(false);    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
String user,pass,i = null,pa=null;
user=jTextField14.getText();
pass=jPasswordField1.getText();
try {
    Class.forName("java.sql.DriverManager");
    Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
Statement st=con.createStatement();
String q="select * from login where user_ID ='"+user+"';";
ResultSet rs=st.executeQuery(q);
if (rs.next())
{i=rs.getString("user_id");
 pa=rs.getString("password");}
if (user.equals(i)&&pass.equals(pa))
{   jFrame2.setVisible(false);
Start nf1=new Start();
jLabel82.setText("Hi,"+user);
nf1.setVisible(true);
this.dispose();
}
else{
    JOptionPane.showMessageDialog(null,"Your User_ID or your password may be incorrect or may be it is blank");}
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame2WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowGainedFocus

    }//GEN-LAST:event_jFrame2WindowGainedFocus

    private void jFrame2WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowOpened

    }//GEN-LAST:event_jFrame2WindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jFrame2.setVisible(false); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     Cars.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jLabel66MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel66MouseMoved

    private void jLabel66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseEntered
jLabel74.setVisible(true);    
jLabel80.setVisible(true);
jLabel79.setVisible(true);
jLabel93.setVisible(true);
logined.setVisible(true);
jLabel82.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel66MouseEntered

    private void jLabel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseExited
jLabel93.setVisible(false);
        jLabel74.setVisible(false); 
jLabel80.setVisible(false);
jLabel79.setVisible(false);
logined.setVisible(false);
jLabel82.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel66MouseExited

    private void jLabel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseEntered
jLabel93.setVisible(true);
        jLabel74.setVisible(true);
jLabel80.setVisible(true);
jLabel79.setVisible(true);
logined.setVisible(true);
jLabel82.setVisible(true);
    }//GEN-LAST:event_jLabel74MouseEntered

    private void jLabel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseExited
jLabel93.setVisible(false);
        jLabel74.setVisible(false); 
jLabel80.setVisible(false); 
jLabel79.setVisible(false);
logined.setVisible(false);
jLabel82.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel74MouseExited

    private void jLabel75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseEntered
jLabel75.setVisible(true);      
jLabel81.setVisible(true);
jLabel89.setVisible(true);
jLabel90.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel75MouseEntered

    private void jLabel75MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseExited
jLabel75.setVisible(false);      
jLabel81.setVisible(false);
jLabel89.setVisible(false);
jLabel90.setVisible(false);
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel75MouseExited

    private void jLabel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseEntered
        jLabel76.setVisible(true);
jLabel92.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel76MouseEntered

    private void jLabel76MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseExited
      jLabel76.setVisible(false);
      jLabel92.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel76MouseExited

    private void jLabel68MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseEntered
jLabel75.setVisible(true);
jLabel81.setVisible(true);
jLabel89.setVisible(true);
jLabel90.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel68MouseEntered

    private void jLabel68MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseExited
jLabel75.setVisible(false);
jLabel81.setVisible(false);
jLabel89.setVisible(false);
jLabel90.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel68MouseExited

    private void jLabel69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseEntered
jLabel76.setVisible(true);
jLabel92.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel69MouseEntered

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
jLabel76.setVisible(false);
jLabel92.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel69MouseExited

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jDialog2WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog2WindowOpened
 jDialog2.setBackground(new Color(0,0,0,0));
jPanel10.setBackground(new Color(0,0,0,100));        // TODO add your handling code here:
    }//GEN-LAST:event_jDialog2WindowOpened

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseEntered
jLabel74.setVisible(true);
jLabel80.setVisible(true);
jLabel79.setVisible(true);
logined.setVisible(true);
jLabel93.setVisible(true);
jLabel82.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel80MouseEntered

    private void jTextField20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyTyped
String un=jTextField19.getText();
String p=jTextField20.getText();
String str1="Quadeer";
String str2="Rehman";
if (un.equals(str1)&&p.equals(str2))
{
   jLabel87.setText("correct");
   jDialog2.setVisible(false);
}
else
{
 jLabel87.setText("Incorrect");
}
    }//GEN-LAST:event_jTextField20KeyTyped

    private void jTextField20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyPressed
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20KeyPressed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    String un=jTextField19.getText();
String p=jTextField20.getText();
String str1="Quadeer";
String str2="Rehman";
if (un==str1)
{
        if (p==str2)
        {
           JOptionPane.showMessageDialog(this,"Correct");
        }
       else
        {
          jLabel87.setText("Incorrect");
        }
    }
else
{
 jLabel87.setText("Incorrect");
}    // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked

Load.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jLabel81MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseEntered
jLabel75.setVisible(true);
jLabel81.setVisible(true);
jLabel89.setVisible(true);
jLabel90.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel81MouseEntered

    private void jLabel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseClicked
Cars2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel89MouseClicked

    private void jLabel89MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseEntered
jLabel75.setVisible(true);
jLabel81.setVisible(true);
jLabel89.setVisible(true);
jLabel90.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel89MouseEntered

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
Cars3.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel90MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseEntered
jLabel75.setVisible(true);
jLabel81.setVisible(true);
jLabel89.setVisible(true);
jLabel90.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel90MouseEntered

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
jDialog1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
Pick_A_Car.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jLabel92MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseEntered
jLabel76.setVisible(true);
jLabel92.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel92MouseEntered

    private void jLabel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseEntered
jLabel93.setVisible(true);
        jLabel74.setVisible(true);
jLabel80.setVisible(true);
jLabel79.setVisible(true);
logined.setVisible(true); 
jLabel82.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel79MouseEntered

    private void loginedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginedMouseEntered
jLabel82.setVisible(true);
        jLabel93.setVisible(true);
jLabel74.setVisible(true);
jLabel80.setVisible(true);
jLabel79.setVisible(true);
logined.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_loginedMouseEntered

    private void loginedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginedMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_loginedMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try{
            String Name=jTextField15.getText();
            String add=jTextField16.getText();

            String userid=jTextField18.getText();
            String pass=jPasswordField2.getText();
            String Cpass=jPasswordField3.getText();
            String date= Integer.parseInt(jTextField17.getText())+"-"+jComboBox3.getSelectedItem()+"-"+ jComboBox1.getSelectedItem();

            String ge=null;
            if (jRadioButton3.isSelected())
            {
                ge="M";
            }
            else {
                ge="F";
            }

            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
            Statement stmt = con.createStatement();
            String q = "Insert into login values('"+userid+"','"+pass+"','"+Name+"','"+ge+"','"+date+"','"+add+"','"+Cpass+"');";
            int lpk=stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Record insert Successfully and have a nice day");
        }
        catch (Exception ex)
        {    JOptionPane.showMessageDialog(null,ex.getMessage());    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
jFrame2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel93MouseClicked

    private void jLabel93MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseEntered
jLabel74.setVisible(true);
jLabel80.setVisible(true);
jLabel79.setVisible(true);
logined.setVisible(true);
jLabel93.setVisible(true);
jLabel82.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel93MouseEntered

    private void jLabel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseEntered
jLabel82.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel82MouseEntered

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
Load1.setVisible(false);
Cars.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void Load1WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load1WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load1WindowGainedFocus

    private void Load1WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load1WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load1WindowLostFocus

    private void Load1WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load1WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load1WindowClosed

    private void Load1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load1WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load1WindowOpened

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
Load2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
Load3.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
Load4.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
Load2.setVisible(false);
Cars.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void Load2WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load2WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load2WindowGainedFocus

    private void Load2WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load2WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load2WindowLostFocus

    private void Load2WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load2WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load2WindowClosed

    private void Load2WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load2WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load2WindowOpened

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
Load3.setVisible(false);
Cars.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void Load3WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load3WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load3WindowGainedFocus

    private void Load3WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load3WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load3WindowLostFocus

    private void Load3WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load3WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load3WindowClosed

    private void Load3WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load3WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load3WindowOpened

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
Load4.setVisible(false);
Cars.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void Load4WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load4WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load4WindowGainedFocus

    private void Load4WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load4WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load4WindowLostFocus

    private void Load4WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load4WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load4WindowClosed

    private void Load4WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load4WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load4WindowOpened

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
Load5.setVisible(false);
Cars2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void Load5WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load5WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load5WindowGainedFocus

    private void Load5WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load5WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load5WindowLostFocus

    private void Load5WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load5WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load5WindowClosed

    private void Load5WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load5WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load5WindowOpened

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
Load6.setVisible(false);
Cars2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void Load6WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load6WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load6WindowGainedFocus

    private void Load6WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load6WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load6WindowLostFocus

    private void Load6WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load6WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load6WindowClosed

    private void Load6WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load6WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load6WindowOpened

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
Load7.setVisible(false);
Cars2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void Load7WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load7WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load7WindowGainedFocus

    private void Load7WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load7WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load7WindowLostFocus

    private void Load7WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load7WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load7WindowClosed

    private void Load7WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load7WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load7WindowOpened

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
Load8.setVisible(false);
Cars2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void Load8WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load8WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load8WindowGainedFocus

    private void Load8WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load8WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load8WindowLostFocus

    private void Load8WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load8WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load8WindowClosed

    private void Load8WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load8WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load8WindowOpened

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
Load10.setVisible(false);
Cars3.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void Load10WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load10WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load10WindowGainedFocus

    private void Load10WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load10WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load10WindowLostFocus

    private void Load10WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load10WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load10WindowClosed

    private void Load10WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load10WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load10WindowOpened

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
Load11.setVisible(false);
Cars3.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void Load11WindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load11WindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load11WindowGainedFocus

    private void Load11WindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load11WindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_Load11WindowLostFocus

    private void Load11WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load11WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load11WindowClosed

    private void Load11WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load11WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_Load11WindowOpened

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
Load1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
Load10.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
Load11.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jFrame1.setVisible(true);
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
            Statement st = con.createStatement();
            String q="select * from cars where name_of_car like  '%huracan%';";
            ResultSet r=st.executeQuery(q);
            if (r.next())
            {
                String na=r.getString("name_of_car");
                String m=r.getString("Top_speed");
                String em =r.getString("0_100kph");
                String e =r.getString("power");
                String  bhp=r.getString("bhp_weight");
                String dis =r.getString("Displacement");
                String w =r.getString("weight");
                String price =r.getString("price");
                jTextField6.setText(na);
                jTextField7.setText(m);
                jTextField8.setText(em);
                jTextField9.setText(e);
                jTextField10.setText(bhp);
                jTextField11.setText(dis);
                jTextField12.setText(w);
                jTextField13.setText(price);
            }  }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jFrame1.setVisible(true);
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
            Statement st = con.createStatement();
            String q="select * from cars where name_of_car like  '%Aventador%';";
            ResultSet r=st.executeQuery(q);
            if (r.next())
            {
                String na=r.getString("name_of_car");
                String m=r.getString("Top_speed");
                String em =r.getString("0_100kph");
                String e =r.getString("power");
                String  bhp=r.getString("bhp_weight");
                String dis =r.getString("Displacement");
                String w =r.getString("weight");
                String price =r.getString("price");
                jTextField6.setText(na);
                jTextField7.setText(m);
                jTextField8.setText(em);
                jTextField9.setText(e);
                jTextField10.setText(bhp);
                jTextField11.setText(dis);
                jTextField12.setText(w);
                jTextField13.setText(price);
            }  }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cars.setVisible(true);
        Cars2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cars3.setVisible(true);
        Cars2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jFrame1.setVisible(true);
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
            Statement st = con.createStatement();
            String q="select * from cars where name_of_car like  '%sesto%';";
            ResultSet r=st.executeQuery(q);
            if (r.next())
            {
                String na=r.getString("name_of_car");
                String m=r.getString("Top_speed");
                String em =r.getString("0_100kph");
                String e =r.getString("power");
                String  bhp=r.getString("bhp_weight");
                String dis =r.getString("Displacement");
                String w =r.getString("weight");
                String price =r.getString("price");
                jTextField6.setText(na);
                jTextField7.setText(m);
                jTextField8.setText(em);
                jTextField9.setText(e);
                jTextField10.setText(bhp);
                jTextField11.setText(dis);
                jTextField12.setText(w);
                jTextField13.setText(price);
            }  }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jFrame1.setVisible(true);
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
            Statement st = con.createStatement();
            String q="select * from cars where name_of_car like  '%reventon%';";
            ResultSet r=st.executeQuery(q);
            if (r.next())
            {
                String na=r.getString("name_of_car");
                String m=r.getString("Top_speed");
                String em =r.getString("0_100kph");
                String e =r.getString("power");
                String  bhp=r.getString("bhp_weight");
                String dis =r.getString("Displacement");
                String w =r.getString("weight");
                String price =r.getString("price");
                jTextField6.setText(na);
                jTextField7.setText(m);
                jTextField8.setText(em);
                jTextField9.setText(e);
                jTextField10.setText(bhp);
                jTextField11.setText(dis);
                jTextField12.setText(w);
                jTextField13.setText(price);
            }  }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
Load8.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
Load7.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
Load6.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
Load5.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    
      public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Start().setVisible(true);
  try {
      Class.forName("java.sql.DriverManager");
      Connection con=(Connection)
              DriverManager.getConnection("jdbc:mysql://localhost:3306/lamborghini","root","saksham");
      Statement st = con.createStatement();
  }
  catch (Exception e)
  {
      JOptionPane.showMessageDialog(null,e.getMessage());
  }
            }
        });
    }
      private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Cars;
    private javax.swing.JFrame Cars2;
    private javax.swing.JFrame Cars3;
    private javax.swing.JDialog Load;
    private javax.swing.JDialog Load1;
    private javax.swing.JDialog Load10;
    private javax.swing.JDialog Load11;
    private javax.swing.JDialog Load2;
    private javax.swing.JDialog Load3;
    private javax.swing.JDialog Load4;
    private javax.swing.JDialog Load5;
    private javax.swing.JDialog Load6;
    private javax.swing.JDialog Load7;
    private javax.swing.JDialog Load8;
    private javax.swing.JFrame Pick_A_Car;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cdState;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    public static javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JLabel logined;
    // End of variables declaration//GEN-END:variables
}
