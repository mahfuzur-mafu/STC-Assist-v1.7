
package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class AdminViewDir extends javax.swing.JFrame {
  DefaultTableModel defaultModel = new DefaultTableModel(){
      
      private Class <?> getcolumnClass(int column){
          switch(column){
              case 0 :
                  return Integer.class;
                     case 1 :
                  return String.class;
                   case 2 :
                  return String.class;
                   case 3 :
                  return String.class;
                     case 4 :
                  return String.class;
                   case 5 :
                  return String.class;
                    case 6 :
                  return String.class;
                  case 7 :
                  return String.class;
        
                   default :
                return String.class;
                  
          }
         
          
      }
      
      
  };
  private  String  getdir;

  private   PreparedStatement pst;
     
     
     
     


    private ResultSet rs;

    public AdminViewDir() {
        initComponents();
        jTable.setModel(defaultModel);
        TableColumnModel columnModel =jTable.getColumnModel();
        defaultModel.addColumn("ID");
        defaultModel.addColumn("Name");
        defaultModel.addColumn("Institution");
        defaultModel.addColumn("Email");
        defaultModel.addColumn("Phone");
        defaultModel.addColumn("Key");
        defaultModel.addColumn("Gender");
        defaultModel.addColumn("T");

         columnModel.getColumn(0).setPreferredWidth(40);
         columnModel.getColumn(1).setPreferredWidth(120);
         columnModel.getColumn(2).setPreferredWidth(85);
         columnModel.getColumn(3).setPreferredWidth(80);     
         columnModel.getColumn(4).setPreferredWidth(70);     
         columnModel.getColumn(5).setPreferredWidth(50);  
         columnModel.getColumn(6).setPreferredWidth(55);     
         columnModel.getColumn(7).setPreferredWidth(40);     

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin_adddirector_btn = new javax.swing.JLabel();
        admin_modifydirector_btn = new javax.swing.JLabel();
        admin_deletedirector_btn = new javax.swing.JLabel();
        admin_viewdirector_btn = new javax.swing.JLabel();
        adminEvent_btn = new javax.swing.JLabel();
        start_btn = new javax.swing.JLabel();
        gotoCA_btn = new javax.swing.JLabel();
        signOut_btn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dirbox = new javax.swing.JComboBox();
        dir_search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

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

        admin_adddirector_btn.setBackground(new java.awt.Color(51, 51, 51));
        admin_adddirector_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin_adddirector_btn.setForeground(new java.awt.Color(255, 255, 255));
        admin_adddirector_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_adddirector_btn.setText("ADD DIRECTOR");
        admin_adddirector_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        admin_adddirector_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        admin_adddirector_btn.setOpaque(true);
        admin_adddirector_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        admin_adddirector_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_adddirector_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_adddirector_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_adddirector_btnMouseExited(evt);
            }
        });

        admin_modifydirector_btn.setBackground(new java.awt.Color(51, 51, 51));
        admin_modifydirector_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin_modifydirector_btn.setForeground(new java.awt.Color(255, 255, 255));
        admin_modifydirector_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_modifydirector_btn.setText("MODIFY ");
        admin_modifydirector_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        admin_modifydirector_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        admin_modifydirector_btn.setOpaque(true);
        admin_modifydirector_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        admin_modifydirector_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_modifydirector_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_modifydirector_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_modifydirector_btnMouseExited(evt);
            }
        });

        admin_deletedirector_btn.setBackground(new java.awt.Color(51, 51, 51));
        admin_deletedirector_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin_deletedirector_btn.setForeground(new java.awt.Color(255, 255, 255));
        admin_deletedirector_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_deletedirector_btn.setText("DELETE ");
        admin_deletedirector_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        admin_deletedirector_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        admin_deletedirector_btn.setOpaque(true);
        admin_deletedirector_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        admin_deletedirector_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_deletedirector_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_deletedirector_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_deletedirector_btnMouseExited(evt);
            }
        });

        admin_viewdirector_btn.setBackground(new java.awt.Color(241, 78, 78));
        admin_viewdirector_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin_viewdirector_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_viewdirector_btn.setText("VIEW");
        admin_viewdirector_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        admin_viewdirector_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        admin_viewdirector_btn.setOpaque(true);
        admin_viewdirector_btn.setPreferredSize(new java.awt.Dimension(150, 80));

        adminEvent_btn.setBackground(new java.awt.Color(51, 51, 51));
        adminEvent_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminEvent_btn.setForeground(new java.awt.Color(255, 255, 255));
        adminEvent_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminEvent_btn.setText("CREATE EVENT");
        adminEvent_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        adminEvent_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        adminEvent_btn.setOpaque(true);
        adminEvent_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        adminEvent_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminEvent_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminEvent_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminEvent_btnMouseExited(evt);
            }
        });

        start_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_menu.png"))); // NOI18N

        gotoCA_btn.setBackground(new java.awt.Color(51, 51, 51));
        gotoCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gotoCA_btn.setForeground(new java.awt.Color(255, 255, 255));
        gotoCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoCA_btn.setText("GOTO CA");
        gotoCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        gotoCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        gotoCA_btn.setOpaque(true);
        gotoCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        gotoCA_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoCA_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoCA_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoCA_btnMouseExited(evt);
            }
        });

        signOut_btn.setBackground(new java.awt.Color(51, 51, 51));
        signOut_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signOut_btn.setForeground(new java.awt.Color(255, 255, 255));
        signOut_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signOut_btn.setText("SIGN OUT");
        signOut_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        signOut_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        signOut_btn.setOpaque(true);
        signOut_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        signOut_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOut_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOut_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signOut_btnMouseExited(evt);
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
                            .addComponent(admin_adddirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_modifydirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_deletedirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_viewdirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminEvent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gotoCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(41, 41, 41)
                .addComponent(admin_adddirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_modifydirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_deletedirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_viewdirector_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminEvent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(238, 244, 244));
        jPanel4.setMaximumSize(new java.awt.Dimension(545, 410));
        jPanel4.setMinimumSize(new java.awt.Dimension(545, 410));
        jPanel4.setPreferredSize(new java.awt.Dimension(545, 410));

        dirbox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dirbox.setMaximumRowCount(4);
        dirbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Director", "Male", "Female", "Others" }));
        dirbox.setToolTipText("");

        dir_search.setBackground(new java.awt.Color(51, 51, 51));
        dir_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dir_search.setForeground(new java.awt.Color(255, 255, 255));
        dir_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dir_search.setText("Search");
        dir_search.setOpaque(true);
        dir_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dir_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dir_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dir_searchMouseExited(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dirbox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dir_search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dir_search, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void adminEvent_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminEvent_btnMouseExited
        adminEvent_btn.setForeground(Color.white);
        adminEvent_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_adminEvent_btnMouseExited

    private void adminEvent_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminEvent_btnMouseEntered
        adminEvent_btn.setForeground(Color.black);
        adminEvent_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_adminEvent_btnMouseEntered

    private void adminEvent_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminEvent_btnMouseClicked
         AdminEvent adminevent = new AdminEvent();
        adminEvent_btn.setForeground(Color.black);
        adminEvent_btn.setBackground(new Color (241,78,78));
        adminevent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminEvent_btnMouseClicked

    private void gotoCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCA_btnMouseClicked
        AdminDirectorPage admindirectorPage = new AdminDirectorPage();
        gotoCA_btn.setForeground(Color.black);
        gotoCA_btn.setBackground(new Color (241,78,78));
        admindirectorPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gotoCA_btnMouseClicked

    private void gotoCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCA_btnMouseEntered
         gotoCA_btn.setForeground(Color.black);
        gotoCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_gotoCA_btnMouseEntered

    private void gotoCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCA_btnMouseExited
        gotoCA_btn.setForeground(Color.white);
        gotoCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_gotoCA_btnMouseExited

    private void signOut_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOut_btnMouseClicked
      DataPage datapage = new DataPage();
        signOut_btn.setForeground(Color.black);
        signOut_btn.setBackground(new Color (241,78,78));
        datapage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signOut_btnMouseClicked

    private void signOut_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOut_btnMouseEntered
           signOut_btn.setForeground(Color.black);
         signOut_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_signOut_btnMouseEntered

    private void signOut_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOut_btnMouseExited
         signOut_btn.setForeground(Color.white);
        signOut_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_signOut_btnMouseExited

    private void admin_adddirector_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_adddirector_btnMouseEntered
        admin_adddirector_btn.setForeground(Color.black);
         admin_adddirector_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_admin_adddirector_btnMouseEntered

    private void admin_adddirector_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_adddirector_btnMouseExited
     admin_adddirector_btn.setForeground(Color.white);
        admin_adddirector_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_admin_adddirector_btnMouseExited

    private void admin_adddirector_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_adddirector_btnMouseClicked
      AdminPage adminpage= new AdminPage();
      admin_adddirector_btn.setForeground(Color.black);
       admin_adddirector_btn.setBackground(new Color (241,78,78));
      adminpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admin_adddirector_btnMouseClicked

    private void admin_modifydirector_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_modifydirector_btnMouseEntered
         admin_modifydirector_btn.setForeground(Color.black);
         admin_modifydirector_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_admin_modifydirector_btnMouseEntered

    private void admin_modifydirector_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_modifydirector_btnMouseExited
       admin_modifydirector_btn.setForeground(Color.white);
        admin_modifydirector_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_admin_modifydirector_btnMouseExited

    private void admin_modifydirector_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_modifydirector_btnMouseClicked
          AdminModifyDir adminmodifydir= new AdminModifyDir();
        admin_modifydirector_btn.setForeground(Color.black);
        admin_modifydirector_btn.setBackground(new Color (241,78,78));
        adminmodifydir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admin_modifydirector_btnMouseClicked

    private void admin_deletedirector_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_deletedirector_btnMouseEntered
          admin_deletedirector_btn.setForeground(Color.black);
        admin_deletedirector_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_admin_deletedirector_btnMouseEntered

    private void admin_deletedirector_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_deletedirector_btnMouseExited
        admin_deletedirector_btn.setForeground(Color.white);
        admin_deletedirector_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_admin_deletedirector_btnMouseExited

    private void admin_deletedirector_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_deletedirector_btnMouseClicked
         AdminDeleteDir admindeletedir = new AdminDeleteDir();
        admin_deletedirector_btn.setForeground(Color.black);
        admin_deletedirector_btn.setBackground(new Color (241,78,78));
        admindeletedir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admin_deletedirector_btnMouseClicked

    private void dir_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dir_searchMouseEntered
         dir_search.setForeground(Color.black);
        dir_search.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_dir_searchMouseEntered

    private void dir_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dir_searchMouseExited
       dir_search.setForeground(Color.white);
        dir_search.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_dir_searchMouseExited

    private void dir_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dir_searchMouseClicked
       if(dirbox.getSelectedItem().equals("All Director"))
       { 
               
                 try {
                       
                             String sql =" select Id,full_name,institution_name, email,phone_number,passcode,gender,tshirt FROM director_dbms ";
                             rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                             defaultModel.setRowCount(0);
                             while(rs.next())
                             {
                                     defaultModel.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                                      System.out.println(rs.getInt(1));
       
                             }
                                   defaultModel.fireTableDataChanged();
                 
  
                } catch (SQLException ex) {
                                       JOptionPane.showMessageDialog(this, "Search Failed");
                  }
         }
            else if(dirbox.getSelectedItem().equals("Male"))
            {
                    getdir = "Male";
                     try { 
                     String sql =" select Id,full_name,institution_name, email,phone_number,passcode,gender,tshirt FROM director_dbms WHERE gender='"+getdir+"';";
                     rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                    defaultModel.setRowCount(0);
                     while(rs.next())
                     {
                   defaultModel.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                     }
                   defaultModel.fireTableDataChanged();
   
                      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
            }
            else if(dirbox.getSelectedItem().equals("Female"))
            {
                getdir = "Female";
                 try {
                       String sql =" select Id,full_name,institution_name, email,phone_number,passcode,gender,tshirt FROM director_dbms WHERE gender='"+getdir+"';";
                       rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                       defaultModel.setRowCount(0);
                       while(rs.next())
                       {
                defaultModel.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                       }
                  defaultModel.fireTableDataChanged();
  
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
            }
              else if(dirbox.getSelectedItem().equals("Others"))
            {
                getdir = "others";
                 try {
                       String sql =" select Id,full_name,institution_name, email,phone_number,passcode,gender,tshirt FROM director_dbms WHERE gender='"+getdir+"';";
                       rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                       defaultModel.setRowCount(0);
                       while(rs.next())
                       {
                defaultModel.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                       }
                  defaultModel.fireTableDataChanged();
  
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
            }  
        
    }//GEN-LAST:event_dir_searchMouseClicked

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
            java.util.logging.Logger.getLogger(AdminViewDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewDir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminViewDir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminEvent_btn;
    private javax.swing.JLabel admin_adddirector_btn;
    private javax.swing.JLabel admin_deletedirector_btn;
    private javax.swing.JLabel admin_modifydirector_btn;
    private javax.swing.JLabel admin_viewdirector_btn;
    private javax.swing.JLabel dir_search;
    private javax.swing.JComboBox dirbox;
    private javax.swing.JLabel gotoCA_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel signOut_btn;
    private javax.swing.JLabel start_btn;
    // End of variables declaration//GEN-END:variables
}
