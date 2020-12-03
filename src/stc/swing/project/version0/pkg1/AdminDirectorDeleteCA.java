
package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AdminDirectorDeleteCA extends javax.swing.JFrame {
       private String  inputid;

   private  PreparedStatement pst;
     
     
 private ResultSet rs;

    public AdminDirectorDeleteCA() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addCA_btn = new javax.swing.JLabel();
        modifyCA_btn = new javax.swing.JLabel();
        deleteCA_btn = new javax.swing.JLabel();
        viewCA_btn = new javax.swing.JLabel();
        start_btn = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        again_delete = new javax.swing.JLabel();
        delete_btn = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

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

        addCA_btn.setBackground(new java.awt.Color(51, 51, 51));
        addCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addCA_btn.setForeground(new java.awt.Color(255, 255, 255));
        addCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCA_btn.setText("ADD CA");
        addCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        addCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        addCA_btn.setOpaque(true);
        addCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        addCA_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCA_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCA_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCA_btnMouseExited(evt);
            }
        });

        modifyCA_btn.setBackground(new java.awt.Color(51, 51, 51));
        modifyCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modifyCA_btn.setForeground(new java.awt.Color(255, 255, 255));
        modifyCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyCA_btn.setText("MODIFY CA");
        modifyCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        modifyCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        modifyCA_btn.setOpaque(true);
        modifyCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        modifyCA_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyCA_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyCA_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyCA_btnMouseExited(evt);
            }
        });

        deleteCA_btn.setBackground(new java.awt.Color(241, 78, 78));
        deleteCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteCA_btn.setText("DELETE CA");
        deleteCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        deleteCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        deleteCA_btn.setOpaque(true);
        deleteCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));

        viewCA_btn.setBackground(new java.awt.Color(51, 51, 51));
        viewCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewCA_btn.setForeground(new java.awt.Color(255, 255, 255));
        viewCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCA_btn.setText("VIEW");
        viewCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        viewCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        viewCA_btn.setOpaque(true);
        viewCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        viewCA_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCA_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewCA_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewCA_btnMouseExited(evt);
            }
        });

        start_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_menu.png"))); // NOI18N

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_arrow_50px.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
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
                            .addComponent(addCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifyCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(start_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
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
                .addGap(13, 13, 13)
                .addComponent(back)
                .addGap(40, 40, 40)
                .addComponent(addCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(238, 244, 244));
        jPanel4.setMaximumSize(new java.awt.Dimension(545, 410));
        jPanel4.setMinimumSize(new java.awt.Dimension(545, 410));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        again_delete.setBackground(new java.awt.Color(51, 51, 51));
        again_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        again_delete.setForeground(new java.awt.Color(255, 255, 255));
        again_delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        again_delete.setText("Delete Again");
        again_delete.setOpaque(true);
        again_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                again_deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                again_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                again_deleteMouseExited(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(51, 51, 51));
        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_btn.setText("Delete");
        delete_btn.setOpaque(true);
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_btnMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel23.setText("Enter ID");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(again_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(again_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void viewCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseExited
        viewCA_btn.setForeground(Color.white);
        viewCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_viewCA_btnMouseExited

    private void viewCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseEntered
        viewCA_btn.setForeground(Color.black);
        viewCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_viewCA_btnMouseEntered

    private void viewCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseClicked
        AdminDirectorViewCA admindirectorviewca= new AdminDirectorViewCA();
        viewCA_btn.setForeground(Color.black);
        viewCA_btn.setBackground(new Color (241,78,78));
        admindirectorviewca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewCA_btnMouseClicked

    private void addCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCA_btnMouseEntered
           addCA_btn.setForeground(Color.black);
         addCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_addCA_btnMouseEntered

    private void addCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCA_btnMouseExited
           addCA_btn.setForeground(Color.white);
        addCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_addCA_btnMouseExited

    private void addCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCA_btnMouseClicked
         AdminDirectorPage admindirectorpage = new  AdminDirectorPage();
          addCA_btn.setForeground(Color.black);
        addCA_btn.setBackground(new Color (241,78,78));
        admindirectorpage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addCA_btnMouseClicked

    private void modifyCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyCA_btnMouseEntered
         modifyCA_btn.setForeground(Color.black);
        modifyCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_modifyCA_btnMouseEntered

    private void modifyCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyCA_btnMouseExited
         modifyCA_btn.setForeground(Color.white);
        modifyCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_modifyCA_btnMouseExited

    private void modifyCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyCA_btnMouseClicked
         AdminDirectorModifyCA admindirectormodifyca= new  AdminDirectorModifyCA();
        modifyCA_btn.setForeground(Color.black);
        modifyCA_btn.setBackground(new Color (241,78,78));
        admindirectormodifyca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modifyCA_btnMouseClicked

    private void delete_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseEntered
     delete_btn.setForeground(Color.black);
        delete_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_delete_btnMouseEntered

    private void delete_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseExited
           delete_btn.setForeground(Color.white);
         delete_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_delete_btnMouseExited

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        inputid=id.getText().toString().trim();
             if(inputid.equals(""))
              {
         JOptionPane.showMessageDialog(this, "Please Enter ID Number First");
              } 
             
             else{
                 
             
              try {
              String sql =" DELETE FROM ca_dbms WHERE id="+inputid+";";
             pst = DbmsUtil.getConnection().prepareStatement(sql);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Deleted Successfully");
                AdminDirectorDeleteCA directordeleteca = new AdminDirectorDeleteCA();
               directordeleteca.setVisible(true);
                this.dispose();
       

         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Deleted Failed");
         }
             }
    }//GEN-LAST:event_delete_btnMouseClicked

    private void again_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_again_deleteMouseEntered
        again_delete.setForeground(Color.black);
        again_delete.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_again_deleteMouseEntered

    private void again_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_again_deleteMouseExited
          again_delete.setForeground(Color.white);
         again_delete.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_again_deleteMouseExited

    private void again_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_again_deleteMouseClicked
          AdminDirectorDeleteCA directordeleteca = new AdminDirectorDeleteCA();
          again_delete.setForeground(Color.black);
          again_delete.setBackground(new Color (241,78,78));
           directordeleteca.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_again_deleteMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminPage adminpage = new AdminPage();
        adminpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDirectorDeleteCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorDeleteCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorDeleteCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorDeleteCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDirectorDeleteCA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCA_btn;
    private javax.swing.JLabel again_delete;
    private javax.swing.JLabel back;
    private javax.swing.JLabel deleteCA_btn;
    private javax.swing.JLabel delete_btn;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel modifyCA_btn;
    private javax.swing.JLabel start_btn;
    private javax.swing.JLabel viewCA_btn;
    // End of variables declaration//GEN-END:variables
}
