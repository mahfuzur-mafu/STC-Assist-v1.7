
package stc.swing.project.version0.pkg1;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;




public class PublicationPage extends javax.swing.JFrame {
   
    
    public PublicationPage() {
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
        stcpdfpanel1 = new javax.swing.JPanel();
        stcpdflabel1 = new javax.swing.JLabel();
        stcpdfpanel2 = new javax.swing.JPanel();
        stcpdflabel2 = new javax.swing.JLabel();
        download_btn1 = new javax.swing.JLabel();
        download_btn2 = new javax.swing.JLabel();

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

        publication_btn.setBackground(new java.awt.Color(241, 78, 78));
        publication_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        publication_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        publication_btn.setText("PUBLICATIONS");
        publication_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        publication_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        publication_btn.setOpaque(true);
        publication_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OURS PUBLICATION");
        jLabel2.setOpaque(true);

        stcpdfpanel1.setBackground(new java.awt.Color(51, 51, 51));
        stcpdfpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stcpdfpanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stcpdfpanel1MouseExited(evt);
            }
        });

        stcpdflabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eye of Creatives (2).jpg"))); // NOI18N
        stcpdflabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stcpdflabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stcpdflabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stcpdflabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout stcpdfpanel1Layout = new javax.swing.GroupLayout(stcpdfpanel1);
        stcpdfpanel1.setLayout(stcpdfpanel1Layout);
        stcpdfpanel1Layout.setHorizontalGroup(
            stcpdfpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stcpdfpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stcpdflabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        stcpdfpanel1Layout.setVerticalGroup(
            stcpdfpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stcpdfpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stcpdflabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stcpdfpanel2.setBackground(new java.awt.Color(51, 51, 51));
        stcpdfpanel2.setMaximumSize(new java.awt.Dimension(170, 186));
        stcpdfpanel2.setMinimumSize(new java.awt.Dimension(170, 186));
        stcpdfpanel2.setPreferredSize(new java.awt.Dimension(170, 186));
        stcpdfpanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stcpdfpanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stcpdfpanel2MouseExited(evt);
            }
        });

        stcpdflabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/STC Awareness pdf.png"))); // NOI18N
        stcpdflabel2.setPreferredSize(new java.awt.Dimension(148, 165));
        stcpdflabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stcpdflabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stcpdflabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stcpdflabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout stcpdfpanel2Layout = new javax.swing.GroupLayout(stcpdfpanel2);
        stcpdfpanel2.setLayout(stcpdfpanel2Layout);
        stcpdfpanel2Layout.setHorizontalGroup(
            stcpdfpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stcpdfpanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stcpdflabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        stcpdfpanel2Layout.setVerticalGroup(
            stcpdfpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stcpdfpanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stcpdflabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        download_btn1.setBackground(new java.awt.Color(51, 51, 51));
        download_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        download_btn1.setForeground(new java.awt.Color(255, 255, 255));
        download_btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        download_btn1.setText("DOWNLOAD");
        download_btn1.setOpaque(true);
        download_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                download_btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                download_btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                download_btn1MouseExited(evt);
            }
        });

        download_btn2.setBackground(new java.awt.Color(51, 51, 51));
        download_btn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        download_btn2.setForeground(new java.awt.Color(255, 255, 255));
        download_btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        download_btn2.setText("DOWNLOAD");
        download_btn2.setOpaque(true);
        download_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                download_btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                download_btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                download_btn2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(stcpdfpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(stcpdfpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(download_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(download_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stcpdfpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stcpdfpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(download_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(download_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void member_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseEntered
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color (241,78,78));
        
    }//GEN-LAST:event_member_btnMouseEntered

    private void member_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseExited
        
        member_btn.setBackground(new Color(51,51,51));
        member_btn.setForeground(Color.white);
        
    }//GEN-LAST:event_member_btnMouseExited

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

    private void member_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseClicked
        MemberPage memberpage = new MemberPage();
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color (241,78,78));
          memberpage.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_member_btnMouseClicked

    private void developer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseClicked
         DeveloperPage developerpage = new DeveloperPage();
        developer_btn.setBackground(Color.black);
         developer_btn.setBackground(new Color (241,78,78));
          developerpage.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_developer_btnMouseClicked

    private void stcpdfpanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdfpanel1MouseEntered
     stcpdfpanel1.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_stcpdfpanel1MouseEntered

    private void stcpdfpanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdfpanel1MouseExited
       stcpdfpanel1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_stcpdfpanel1MouseExited

    private void stcpdfpanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdfpanel2MouseEntered
           stcpdfpanel2.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_stcpdfpanel2MouseEntered

    private void stcpdfpanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdfpanel2MouseExited

       stcpdfpanel2.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_stcpdfpanel2MouseExited

    private void download_btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_download_btn1MouseEntered

                 download_btn1.setForeground(Color.black);
        download_btn1.setBackground(new Color (241,78,78));
             
    }//GEN-LAST:event_download_btn1MouseEntered

    private void download_btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_download_btn2MouseEntered
 
                   download_btn2.setForeground(Color.black);
        download_btn2.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_download_btn2MouseEntered

    private void download_btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_download_btn1MouseExited
          download_btn1.setForeground(Color.white);
          download_btn1.setBackground(new Color(51,51,51));
       
    }//GEN-LAST:event_download_btn1MouseExited

    private void download_btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_download_btn2MouseExited
          download_btn2.setForeground(Color.white);
          download_btn2.setBackground(new Color(51,51,51));
       
    }//GEN-LAST:event_download_btn2MouseExited

    private void stcpdflabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdflabel1MouseEntered
        stcpdfpanel1.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_stcpdflabel1MouseEntered

    private void stcpdflabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdflabel1MouseExited
        stcpdfpanel1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_stcpdflabel1MouseExited

    private void stcpdflabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdflabel1MouseClicked
   
            try {
                String file = null;
              Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\Files\\Eye of Creatives 01.pdf");
            
            } catch (Exception e) {
               e.printStackTrace();
            }
        
    }//GEN-LAST:event_stcpdflabel1MouseClicked

    private void stcpdflabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdflabel2MouseEntered
       stcpdfpanel2.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_stcpdflabel2MouseEntered

    private void stcpdflabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdflabel2MouseExited

          stcpdfpanel2.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_stcpdflabel2MouseExited

    private void stcpdflabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stcpdflabel2MouseClicked
        try {
                String file = null;
              Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\Files\\STC-Profile.pdf");
            
            } catch (Exception e) {
               e.printStackTrace();
            }
    }//GEN-LAST:event_stcpdflabel2MouseClicked

    private void download_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_download_btn1MouseClicked
         try {
         
        Desktop.getDesktop().browse(new URI("https://drive.google.com/u/5/uc?id=1ib7puODxQp8DODcMKhfRbGWVSdykJvx1&export=download"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_download_btn1MouseClicked

    private void download_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_download_btn2MouseClicked
           try {
         
        Desktop.getDesktop().browse(new URI("https://drive.google.com/u/5/uc?id=1vgvfq2tnyDd4mgQD8_qmZT5ivaK8Km24&export=download"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_download_btn2MouseClicked

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
            java.util.logging.Logger.getLogger(PublicationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PublicationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PublicationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublicationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PublicationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data_btn;
    private javax.swing.JLabel developer_btn;
    private javax.swing.JLabel download_btn1;
    private javax.swing.JLabel download_btn2;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel member_btn;
    private javax.swing.JLabel publication_btn;
    private javax.swing.JLabel social_btn;
    private javax.swing.JLabel start_btn;
    private javax.swing.JLabel stcpdflabel1;
    private javax.swing.JLabel stcpdflabel2;
    private javax.swing.JPanel stcpdfpanel1;
    private javax.swing.JPanel stcpdfpanel2;
    // End of variables declaration//GEN-END:variables

   
}
