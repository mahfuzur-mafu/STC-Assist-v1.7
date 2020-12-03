
package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DataPage extends javax.swing.JFrame {
  
    private  String  inputid;
    private String inputpassword;
     private int dbmsid;
   private  String dbmspassword;
  private  ResultSet rs;
    private   boolean loginFlag=false;
          
    
    
    
    public DataPage() {
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
        jPanel1 = new javax.swing.JPanel();
        login_btn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_btn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

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

        data_btn.setBackground(new java.awt.Color(241, 78, 78));
        data_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        data_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data_btn.setText("DATA");
        data_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        data_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        data_btn.setOpaque(true);
        data_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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

        jPanel4.setBackground(new java.awt.Color(238, 244, 244));
        jPanel4.setMaximumSize(new java.awt.Dimension(545, 410));
        jPanel4.setMinimumSize(new java.awt.Dimension(545, 410));
        jPanel4.setPreferredSize(new java.awt.Dimension(545, 410));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        login_btn.setBackground(new java.awt.Color(51, 51, 51));
        login_btn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_btn.setText("Log In");
        login_btn.setOpaque(true);
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_btnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("If you are an admin.");

        admin_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        admin_btn.setText("Log In here");
        admin_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_btnMouseExited(evt);
            }
        });

        jLabel4.setText("____________________________");

        userid.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("UserID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(admin_btn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userid)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(password))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(admin_btn))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void start_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseClicked
        LoginPage loginpage = new LoginPage();
        loginpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_start_btnMouseClicked

    private void developer_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseExited
        developer_btn.setForeground(Color.white);
        developer_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_developer_btnMouseExited

    private void developer_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseEntered
        developer_btn.setForeground(Color.black);
        developer_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_developer_btnMouseEntered

    private void developer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseClicked
        DeveloperPage developerpage = new DeveloperPage();
        developer_btn.setBackground(Color.black);
        developer_btn.setBackground(new Color (241,78,78));
        developerpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_developer_btnMouseClicked

    private void member_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseExited
        member_btn.setForeground(Color.white);
        member_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_member_btnMouseExited

    private void member_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseEntered
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_member_btnMouseEntered

    private void member_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseClicked
        MemberPage memberpage = new MemberPage();
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color (241,78,78));
        memberpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_member_btnMouseClicked

    private void publication_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseExited
        publication_btn.setForeground(Color.white);
        publication_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_publication_btnMouseExited

    private void publication_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseEntered
        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_publication_btnMouseEntered

    private void publication_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseClicked
        PublicationPage publicationpage = new PublicationPage();
        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color (241,78,78));
        publicationpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_publication_btnMouseClicked

    private void event_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseExited
        event_btn.setForeground(Color.white);
        event_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_event_btnMouseExited

    private void event_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseEntered
        event_btn.setForeground(Color.black);
        event_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_event_btnMouseEntered

    private void event_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_btnMouseClicked
        EventPage eventpage= new EventPage();
        event_btn.setForeground(Color.black);
        event_btn.setBackground(new Color (241,78,78));
        eventpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_event_btnMouseClicked

    private void social_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseExited
        social_btn.setForeground(Color.white);
        social_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_social_btnMouseExited

    private void social_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseEntered
        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_social_btnMouseEntered

    private void social_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseClicked
        SocialPage socialpage = new SocialPage();
        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color (241,78,78));
        socialpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_social_btnMouseClicked

    private void home_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseExited
        home_btn.setForeground(Color.white);
        home_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_home_btnMouseExited

    private void home_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseEntered
        home_btn.setForeground(Color.black);
        home_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_home_btnMouseEntered

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
        HomePage homepage = new HomePage();
        home_btn.setForeground(Color.black);
        home_btn.setBackground(new Color (241,78,78));
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_btnMouseClicked

    private void login_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseEntered
         login_btn.setForeground(Color.black);
        login_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_login_btnMouseEntered

    private void login_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseExited
        login_btn.setForeground(Color.white);
        login_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_login_btnMouseExited

    private void admin_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_btnMouseEntered

              admin_btn.setForeground(new Color(241,78,78));
    }//GEN-LAST:event_admin_btnMouseEntered

    private void admin_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_btnMouseExited
         admin_btn.setForeground(Color.black);
    }//GEN-LAST:event_admin_btnMouseExited

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
     
        DirectorPage directorpage = new DirectorPage();
          login_btn.setForeground(Color.black);
        login_btn.setBackground(new Color (241,78,78));
        inputid=userid.getText().toString().trim();
        inputpassword=password.getText().toString().trim();
      
        String sql = "SELECT Id, passcode FROM director_dbms";
        try {
            rs=  DbmsUtil.getConnection().createStatement().executeQuery(sql);
            
            while(rs.next())
            {
//                System.out.println("UserId: "+rs.getString(1));
//                 System.out.println("Password: "+rs.getString(2));
                if(rs.getString(1).equals(inputid) && rs.getString(2).equals(inputpassword))
                {
                    loginFlag=true;
                    
                }
                if(loginFlag)
                {
                   
                     directorpage.setVisible(true);
                     this.dispose();
                }
               
         
             
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataPage.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(loginFlag)
                {
                       JOptionPane.showMessageDialog(this, "Log in Success");
                }
                     else 
                {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                }
    }//GEN-LAST:event_login_btnMouseClicked

    private void admin_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_btnMouseClicked

      admin_btn.setForeground(Color.black);
       admin_btn.setBackground(new Color (241,78,78));
         String  admin = JOptionPane.showInputDialog("Enter Admin Key");
        if("iamadmin".equals(admin))
        {
             AdminPage adminpage= new AdminPage();
               adminpage.setVisible(true);
             this.dispose();
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Invalid Adminkey");
        }

    }//GEN-LAST:event_admin_btnMouseClicked

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
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DataPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_btn;
    private javax.swing.JLabel data_btn;
    private javax.swing.JLabel developer_btn;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel login_btn;
    private javax.swing.JLabel member_btn;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel publication_btn;
    private javax.swing.JLabel social_btn;
    private javax.swing.JLabel start_btn;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
