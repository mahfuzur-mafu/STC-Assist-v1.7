
package stc.swing.project.version0.pkg1;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MemberPage extends javax.swing.JFrame {

    public MemberPage() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home_btn = new javax.swing.JLabel();
        social_btn = new javax.swing.JLabel();
        event_btn = new javax.swing.JLabel();
        data_btn = new javax.swing.JLabel();
        publication_btn = new javax.swing.JLabel();
        member_btn = new javax.swing.JLabel();
        developer_btn = new javax.swing.JLabel();
        start_btn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        member_linked = new javax.swing.JLabel();
        member2_linked = new javax.swing.JLabel();
        member3_linked = new javax.swing.JLabel();
        member4_linked = new javax.swing.JLabel();
        member5_linked = new javax.swing.JLabel();
        member_facebook = new javax.swing.JLabel();
        member2_facebook = new javax.swing.JLabel();
        member3_facebook = new javax.swing.JLabel();
        member4_facebook = new javax.swing.JLabel();
        member5_facebook = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STC Assist");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("STC Assist");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        home_btn.setBackground(new java.awt.Color(51, 51, 51));
        home_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(255, 255, 255));
        home_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_btn.setText("HOME");
        home_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        home_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        home_btn.setOpaque(true);
        home_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_btnMouseExited(evt);
            }
        });

        social_btn.setBackground(new java.awt.Color(51, 51, 51));
        social_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        social_btn.setForeground(new java.awt.Color(255, 255, 255));
        social_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        social_btn.setText("SOCIAL");
        social_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        social_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        social_btn.setOpaque(true);
        social_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        social_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                social_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                social_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                social_btnMouseExited(evt);
            }
        });

        event_btn.setBackground(new java.awt.Color(51, 51, 51));
        event_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        event_btn.setForeground(new java.awt.Color(255, 255, 255));
        event_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        event_btn.setText("EVENTS");
        event_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        event_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        event_btn.setOpaque(true);
        event_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        event_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                event_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                event_btnMouseExited(evt);
            }
        });

        data_btn.setBackground(new java.awt.Color(51, 51, 51));
        data_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        data_btn.setForeground(new java.awt.Color(255, 255, 255));
        data_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data_btn.setText("DATA");
        data_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        data_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        data_btn.setOpaque(true);
        data_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        data_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                data_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                data_btnMouseExited(evt);
            }
        });

        publication_btn.setBackground(new java.awt.Color(51, 51, 51));
        publication_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        publication_btn.setForeground(new java.awt.Color(255, 255, 255));
        publication_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        publication_btn.setText("PUBLICATIONS");
        publication_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        publication_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        publication_btn.setOpaque(true);
        publication_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        publication_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                publication_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                publication_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                publication_btnMouseExited(evt);
            }
        });

        member_btn.setBackground(new java.awt.Color(241, 78, 78));
        member_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        member_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        member_btn.setText("MEMBERS");
        member_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        member_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        member_btn.setOpaque(true);
        member_btn.setPreferredSize(new java.awt.Dimension(150, 80));

        developer_btn.setBackground(new java.awt.Color(51, 51, 51));
        developer_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        developer_btn.setForeground(new java.awt.Color(255, 255, 255));
        developer_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        developer_btn.setText("DEVELOPERS");
        developer_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        developer_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        developer_btn.setOpaque(true);
        developer_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        developer_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                developer_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                developer_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                developer_btnMouseExited(evt);
            }
        });

        start_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_menu.png"))); // NOI18N
        start_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(social_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(event_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publication_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(member_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(developer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(start_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start_btn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(social_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(event_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publication_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(member_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(developer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(241, 78, 78));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEET OUR MEMBERS");
        jLabel2.setOpaque(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/men.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/men.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/men.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/female.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/female.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Media Head");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Event Head");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(" CA Directror");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CA Director");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Name");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Name");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Name");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("C E O");

        member_linked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/linkedin1_20px.png"))); // NOI18N
        member_linked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_linkedMouseClicked(evt);
            }
        });

        member2_linked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/linkedin1_20px.png"))); // NOI18N
        member2_linked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member2_linkedMouseClicked(evt);
            }
        });

        member3_linked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/linkedin1_20px.png"))); // NOI18N
        member3_linked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member3_linkedMouseClicked(evt);
            }
        });

        member4_linked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/linkedin1_20px.png"))); // NOI18N
        member4_linked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member4_linkedMouseClicked(evt);
            }
        });

        member5_linked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/linkedin1_20px.png"))); // NOI18N
        member5_linked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member5_linkedMouseClicked(evt);
            }
        });

        member_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/facebook1_20px.png"))); // NOI18N
        member_facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_facebookMouseClicked(evt);
            }
        });

        member2_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/facebook1_20px.png"))); // NOI18N
        member2_facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member2_facebookMouseClicked(evt);
            }
        });

        member3_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/facebook1_20px.png"))); // NOI18N
        member3_facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member3_facebookMouseClicked(evt);
            }
        });

        member4_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/facebook1_20px.png"))); // NOI18N
        member4_facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member4_facebookMouseClicked(evt);
            }
        });

        member5_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/facebook1_20px.png"))); // NOI18N
        member5_facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member5_facebookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(member_linked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member_facebook)
                        .addGap(104, 104, 104)
                        .addComponent(member2_linked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member2_facebook)
                        .addGap(102, 102, 102)
                        .addComponent(member3_linked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member3_facebook))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(member4_linked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member4_facebook)
                        .addGap(99, 99, 99)
                        .addComponent(member5_linked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member5_facebook)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel24))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(member_linked)
                            .addComponent(member2_linked, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(member3_linked)
                            .addComponent(member2_facebook)
                            .addComponent(member3_facebook))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(member4_linked)
                            .addComponent(member5_linked)
                            .addComponent(member4_facebook)
                            .addComponent(member5_facebook)))
                    .addComponent(member_facebook))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseEntered
               home_btn.setForeground(Color.black);
        home_btn.setBackground(new Color (241,78,78));

    }//GEN-LAST:event_home_btnMouseEntered

    private void home_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseExited
       home_btn.setForeground(Color.white);
          home_btn.setBackground(new Color(51,51,51));
        
    }//GEN-LAST:event_home_btnMouseExited

    private void event_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseEntered
  event_btn.setForeground(Color.black);
          event_btn.setBackground(new Color (241,78,78));
        
    }//GEN-LAST:event_event_btnMouseEntered

    private void event_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseExited
        event_btn.setForeground(Color.white);
          event_btn.setBackground(new Color(51,51,51));
       
    }//GEN-LAST:event_event_btnMouseExited

    private void data_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseEntered
      data_btn.setForeground(Color.black);
            data_btn.setBackground(new Color (241,78,78));
        
        
    }//GEN-LAST:event_data_btnMouseEntered

    private void data_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseExited
       data_btn.setForeground(Color.white);
          data_btn.setBackground(new Color(51,51,51));
       
    }//GEN-LAST:event_data_btnMouseExited

    private void publication_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseEntered
         publication_btn.setForeground(Color.black);
          publication_btn.setBackground(new Color (241,78,78));
      
        
    }//GEN-LAST:event_publication_btnMouseEntered

    private void publication_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseExited
         publication_btn.setForeground(Color.white);
          publication_btn.setBackground(new Color(51,51,51));
     
    }//GEN-LAST:event_publication_btnMouseExited

    private void developer_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseEntered
        developer_btn.setForeground(Color.black);
          developer_btn.setBackground(new Color (241,78,78));
        
    }//GEN-LAST:event_developer_btnMouseEntered

    private void developer_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseExited
            developer_btn.setForeground(Color.white);
        developer_btn.setBackground(new Color(51,51,51));
   
    }//GEN-LAST:event_developer_btnMouseExited

    private void event_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseClicked
       EventPage eventpage= new EventPage();
         event_btn.setForeground(Color.black);
        event_btn.setBackground(new Color (241,78,78));
         eventpage.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_event_btnMouseClicked

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
          HomePage homepage = new HomePage();
        home_btn.setForeground(Color.black);
        home_btn.setBackground(new Color (241,78,78));
        homepage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_home_btnMouseClicked

    private void start_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseClicked
      LoginPage loginpage = new LoginPage();
        loginpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_start_btnMouseClicked

    private void data_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseClicked
             DataPage datapage = new DataPage();
             data_btn.setForeground(Color.black);
              data_btn.setBackground(new Color (241,78,78));
              datapage.setVisible(true);
             this.dispose();
        
    }//GEN-LAST:event_data_btnMouseClicked

    private void social_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseEntered
          social_btn.setForeground(Color.black);
          social_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_social_btnMouseEntered

    private void social_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseExited
          social_btn.setForeground(Color.white);
        social_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_social_btnMouseExited

    private void social_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseClicked
       SocialPage socialpage = new SocialPage();
        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color (241,78,78));
          socialpage.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_social_btnMouseClicked

    private void publication_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseClicked
         PublicationPage publicationpage = new PublicationPage();
        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color (241,78,78));
          publicationpage.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_publication_btnMouseClicked

    private void developer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseClicked
        DeveloperPage developerpage = new DeveloperPage();
        developer_btn.setBackground(Color.black);
         developer_btn.setBackground(new Color (241,78,78));
          developerpage.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_developer_btnMouseClicked

    private void member_linkedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_linkedMouseClicked
                  try {
         
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member_linkedMouseClicked

    private void member_facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_facebookMouseClicked
                       try {
         
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member_facebookMouseClicked

    private void member2_linkedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member2_linkedMouseClicked
                      try {
         
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com"));
         
             } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member2_linkedMouseClicked

    private void member2_facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member2_facebookMouseClicked
                         try {
         
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member2_facebookMouseClicked

    private void member3_linkedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member3_linkedMouseClicked
                         try {
         
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com"));
         
             } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member3_linkedMouseClicked

    private void member3_facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member3_facebookMouseClicked
                          try {
         
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member3_facebookMouseClicked

    private void member4_linkedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member4_linkedMouseClicked
                         try {
         
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com"));
         
             } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member4_linkedMouseClicked

    private void member4_facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member4_facebookMouseClicked
                           try {
         
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member4_facebookMouseClicked

    private void member5_linkedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member5_linkedMouseClicked
                       try {
         
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com"));
         
             } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member5_linkedMouseClicked

    private void member5_facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member5_facebookMouseClicked
                         try {
         
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_member5_facebookMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data_btn;
    private javax.swing.JLabel developer_btn;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel member2_facebook;
    private javax.swing.JLabel member2_linked;
    private javax.swing.JLabel member3_facebook;
    private javax.swing.JLabel member3_linked;
    private javax.swing.JLabel member4_facebook;
    private javax.swing.JLabel member4_linked;
    private javax.swing.JLabel member5_facebook;
    private javax.swing.JLabel member5_linked;
    private javax.swing.JLabel member_btn;
    private javax.swing.JLabel member_facebook;
    private javax.swing.JLabel member_linked;
    private javax.swing.JLabel publication_btn;
    private javax.swing.JLabel social_btn;
    private javax.swing.JLabel start_btn;
    // End of variables declaration//GEN-END:variables
}
