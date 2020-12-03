
package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



public class AdminDirectorViewCA extends javax.swing.JFrame {
      DefaultTableModel defaultModel = new DefaultTableModel(){
      
      private Class <?> getcolumnClass(int column){
          switch(column){
              case 0 :
                  return String.class;
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
  private String  getca;

   private  PreparedStatement pst;
private ResultSet rs;
     
  
    public AdminDirectorViewCA() {
        initComponents();
          jTable.setModel(defaultModel);
        TableColumnModel columnModel =jTable.getColumnModel();
        defaultModel.addColumn("ID");
        defaultModel.addColumn("Name");
        defaultModel.addColumn("Institution");
        defaultModel.addColumn("Email");
        defaultModel.addColumn("Phone");
        defaultModel.addColumn("Zone");
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
        addCA_btn = new javax.swing.JLabel();
        modifyCA_btn = new javax.swing.JLabel();
        deleteCA_btn = new javax.swing.JLabel();
        viewCA_btn = new javax.swing.JLabel();
        start_btn = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cabox = new javax.swing.JComboBox();
        ca_search = new javax.swing.JLabel();
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

        deleteCA_btn.setBackground(new java.awt.Color(51, 51, 51));
        deleteCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteCA_btn.setForeground(new java.awt.Color(255, 255, 255));
        deleteCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteCA_btn.setText("DELETE CA");
        deleteCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        deleteCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        deleteCA_btn.setOpaque(true);
        deleteCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));
        deleteCA_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCA_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteCA_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteCA_btnMouseExited(evt);
            }
        });

        viewCA_btn.setBackground(new java.awt.Color(241, 78, 78));
        viewCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCA_btn.setText("VIEW");
        viewCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        viewCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        viewCA_btn.setOpaque(true);
        viewCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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
        jPanel4.setPreferredSize(new java.awt.Dimension(545, 410));

        cabox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cabox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AllZone", "Dhaka", "Chittagong", "Khulna", "Mymensingh", "Rajshahi", "Sylhet", "Rangpur", "Barisal" }));
        cabox.setPreferredSize(new java.awt.Dimension(86, 22));

        ca_search.setBackground(new java.awt.Color(51, 51, 51));
        ca_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ca_search.setForeground(new java.awt.Color(255, 255, 255));
        ca_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ca_search.setText("Search");
        ca_search.setOpaque(true);
        ca_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ca_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ca_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ca_searchMouseExited(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cabox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ca_search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ca_search, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cabox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
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
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void deleteCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCA_btnMouseEntered
          deleteCA_btn.setForeground(Color.black);
        deleteCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_deleteCA_btnMouseEntered

    private void deleteCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCA_btnMouseExited
       deleteCA_btn.setForeground(Color.white);
        deleteCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_deleteCA_btnMouseExited

    private void deleteCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCA_btnMouseClicked
         AdminDirectorDeleteCA admindirectordeleteca = new  AdminDirectorDeleteCA();
        deleteCA_btn.setForeground(Color.black);
        deleteCA_btn.setBackground(new Color (241,78,78));
        admindirectordeleteca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteCA_btnMouseClicked

    private void ca_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_searchMouseEntered
         ca_search.setForeground(Color.black);
        ca_search.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_ca_searchMouseEntered

    private void ca_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_searchMouseExited
         ca_search.setForeground(Color.white);
        ca_search.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ca_searchMouseExited

    private void ca_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_searchMouseClicked
      if(cabox.getSelectedItem().equals("AllZone"))
      {
               try {
                         String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms ";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
      }
      else if(cabox.getSelectedItem().equals("Dhaka"))
      {
          getca="Dhaka";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
         else if(cabox.getSelectedItem().equals("Chittagong"))
      {
          getca="Chittagong";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
         else if(cabox.getSelectedItem().equals("Khulna"))
      {
          getca="Khulna";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
         else if(cabox.getSelectedItem().equals("Mymensingh"))
      {
          getca="Mymensingh";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
            else if(cabox.getSelectedItem().equals("Rajshahi"))
      {
          getca="Rajshahi";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
         else if(cabox.getSelectedItem().equals("Sylhet"))
      {
          getca="Sylhet";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
              else if(cabox.getSelectedItem().equals("Rangpur"))
      {
          getca="Rangpur";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
         else if(cabox.getSelectedItem().equals("Barisal"))
      {
          getca="Barisal";
                 try {
              String sql =" select id,full_name,institution_name, email,phone_number,zone,gender,tshirt FROM ca_dbms WHERE zone='"+getca+"';";

                          rs=DbmsUtil.getConnection().createStatement().executeQuery(sql);
                          defaultModel.setRowCount(0);
                          while(rs.next())
                          {
                           defaultModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                
                         }
                          defaultModel.fireTableDataChanged();
  
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Search Failed");
         }
          
      }
      

       
      
      
      
    }//GEN-LAST:event_ca_searchMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDirectorViewCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorViewCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorViewCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorViewCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminDirectorViewCA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCA_btn;
    private javax.swing.JLabel back;
    private javax.swing.JLabel ca_search;
    private javax.swing.JComboBox cabox;
    private javax.swing.JLabel deleteCA_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel modifyCA_btn;
    private javax.swing.JLabel start_btn;
    private javax.swing.JLabel viewCA_btn;
    // End of variables declaration//GEN-END:variables
}
