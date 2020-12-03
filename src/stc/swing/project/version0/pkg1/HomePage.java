package stc.swing.project.version0.pkg1;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        apply_btn = new javax.swing.JLabel();
        applydir_btn = new javax.swing.JLabel();

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

        home_btn.setBackground(new java.awt.Color(241, 78, 78));
        home_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        home_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_btn.setText("HOME");
        home_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        home_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        home_btn.setOpaque(true);
        home_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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

        member_btn.setBackground(new java.awt.Color(51, 51, 51));
        member_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        member_btn.setForeground(new java.awt.Color(255, 255, 255));
        member_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        member_btn.setText("MEMBERS");
        member_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        member_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        member_btn.setOpaque(true);
        member_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        member_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                member_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                member_btnMouseExited(evt);
            }
        });

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
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(social_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(event_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publication_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(developer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(start_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel4.setMaximumSize(new java.awt.Dimension(545, 410));
        jPanel4.setMinimumSize(new java.awt.Dimension(545, 410));
        jPanel4.setPreferredSize(new java.awt.Dimension(545, 410));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/STC_home3.png"))); // NOI18N

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Show The Creativity (STC) which established in July 29, 2018 with the purpose\n of creating an open platform for everyone where anyone can show his/her creative\nworks to all.An organization which is creating awareness about the alternative \nusages of Internet & social media.\n\nSTC as Online Platform :\n\nUsually we can add highest 5000 friends in our facebook profile, but we can not\nreach our post to everyone or to a large audience of our friend list. Show The\nCreativity has a large number of facebook fan and members which will help you to\nreach your works to a large audience.\n\nSTC as Organization :\n\nMany people are using facebook for no reason, or they don’t know how to use it\n in a effective way. Show The Creativity will help everyone to use their facebook\nmore effectively and in a better way.\nIt’s not only working in online only. it’s also working for many institution’s students\nalso. STC creating awareness in many institutions about Safety uses of internet\nfor students, effective use of social media, future building through social media,\nuseful way of social media.\n\n                     \n                              STC & Sustainable Development Goal (SDG)\n\nTo ensure effective use of social media beside education and to become a well\nbeing, Show The Creativity (STC) is working for the 3rd and 4th goals of United\nNations (UN) Sustainable Development Goal (SDG) which are 'Good health and\nwell being' and 'Quality education'.\nWe gladly want to inform you that, Show The Creativity (STC) is working as an\n UN SDG Action Partner. Our Action Partner ID is - SDGSTC.\n\n\nOur Mission :\n\n To create a platform where every creative person can upload and\nshow their works to everyone and to create awareness about the effective uses of\nsocial media.\n\nOur Vision :\n\n To remove unemployment for creative persons from Bangladesh\nwithin the year 2030.");
        jScrollPane2.setViewportView(jTextArea2);

        apply_btn.setBackground(new java.awt.Color(51, 51, 51));
        apply_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apply_btn.setForeground(new java.awt.Color(255, 255, 255));
        apply_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply_btn.setText("Apply For Campus Ambassador");
        apply_btn.setOpaque(true);
        apply_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apply_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apply_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                apply_btnMouseExited(evt);
            }
        });

        applydir_btn.setBackground(new java.awt.Color(51, 51, 51));
        applydir_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        applydir_btn.setForeground(new java.awt.Color(255, 255, 255));
        applydir_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        applydir_btn.setText("Apply For Director");
        applydir_btn.setOpaque(true);
        applydir_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applydir_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applydir_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applydir_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(applydir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(apply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applydir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(62, 62, 62)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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

    private void social_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseEntered

        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_social_btnMouseEntered

    private void social_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseExited

        social_btn.setForeground(Color.white);
        social_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_social_btnMouseExited

    private void event_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseEntered
        event_btn.setForeground(Color.black);
        event_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_event_btnMouseEntered

    private void event_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseExited
        event_btn.setForeground(Color.white);
        event_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_event_btnMouseExited

    private void data_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseEntered
        data_btn.setForeground(Color.black);
        data_btn.setBackground(new Color(241, 78, 78));
    }//GEN-LAST:event_data_btnMouseEntered

    private void data_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseExited
        data_btn.setForeground(Color.white);
        data_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_data_btnMouseExited

    private void publication_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseEntered
        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color(241, 78, 78));


    }//GEN-LAST:event_publication_btnMouseEntered

    private void publication_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseExited
        publication_btn.setForeground(Color.white);
        publication_btn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_publication_btnMouseExited

    private void member_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseEntered
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_member_btnMouseEntered

    private void member_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseExited
        member_btn.setForeground(Color.white);
        member_btn.setBackground(new Color(51, 51, 51));


    }//GEN-LAST:event_member_btnMouseExited

    private void developer_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseEntered
        developer_btn.setForeground(Color.black);
        developer_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_developer_btnMouseEntered

    private void developer_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseExited
        developer_btn.setForeground(Color.white);
        developer_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_developer_btnMouseExited

    private void social_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseClicked
        SocialPage socialpage = new SocialPage();
        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color(241, 78, 78));
        socialpage.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_social_btnMouseClicked

    private void event_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseClicked
        EventPage eventpage = new EventPage();
        event_btn.setForeground(Color.black);
        event_btn.setBackground(new Color(241, 78, 78));
        eventpage.setVisible(true);
        // EventPage.t.start();
        this.dispose();


    }//GEN-LAST:event_event_btnMouseClicked

    private void start_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseClicked
        LoginPage loginpage = new LoginPage();
        loginpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_start_btnMouseClicked

    private void data_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseClicked
        DataPage datapage = new DataPage();
        data_btn.setForeground(Color.black);
        data_btn.setBackground(new Color(241, 78, 78));

        datapage.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_data_btnMouseClicked

    private void publication_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseClicked
        PublicationPage publicationpage = new PublicationPage();
        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color(241, 78, 78));
        publicationpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_publication_btnMouseClicked

    private void member_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseClicked
        MemberPage memberpage = new MemberPage();
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color(241, 78, 78));
        memberpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_member_btnMouseClicked

    private void developer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseClicked
        DeveloperPage developerpage = new DeveloperPage();
        developer_btn.setBackground(Color.black);
        developer_btn.setBackground(new Color(241, 78, 78));
        developerpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_developer_btnMouseClicked

    private void apply_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apply_btnMouseEntered
        apply_btn.setForeground(Color.black);
        apply_btn.setBackground(new Color(241, 78, 78));
    }//GEN-LAST:event_apply_btnMouseEntered

    private void apply_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apply_btnMouseExited

        apply_btn.setForeground(Color.white);
        apply_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_apply_btnMouseExited

    private void apply_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apply_btnMouseClicked
        apply_btn.setForeground(Color.black);
        apply_btn.setBackground(new Color(241, 78, 78));
        try {

            Desktop.getDesktop().browse(new URI("https://forms.gle/VaGMPkR7r4JF62fP7"));

        } catch (IOException | URISyntaxException e1) {
        }
    }//GEN-LAST:event_apply_btnMouseClicked

    private void applydir_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applydir_btnMouseClicked
       try {

            Desktop.getDesktop().browse(new URI("https://forms.gle/wzM9hFexRmv9L9EK9"));

        } catch (IOException | URISyntaxException e1) {
        }
    }//GEN-LAST:event_applydir_btnMouseClicked

    private void applydir_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applydir_btnMouseEntered
        applydir_btn.setForeground(Color.black);
        applydir_btn.setBackground(new Color(241, 78, 78));
    }//GEN-LAST:event_applydir_btnMouseEntered

    private void applydir_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applydir_btnMouseExited
        applydir_btn.setForeground(Color.white);
        applydir_btn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_applydir_btnMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apply_btn;
    private javax.swing.JLabel applydir_btn;
    private javax.swing.JLabel data_btn;
    private javax.swing.JLabel developer_btn;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel member_btn;
    private javax.swing.JLabel publication_btn;
    private javax.swing.JLabel social_btn;
    private javax.swing.JLabel start_btn;
    // End of variables declaration//GEN-END:variables
}
