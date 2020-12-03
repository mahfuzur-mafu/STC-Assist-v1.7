
package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AdminDirectorPage extends javax.swing.JFrame {
   private  String  inputid;
   private  String inputFName;
  private   String inputInstitution;
   private  String inputemail;
  private   String inputphone_number;
 private    String inputzone;
 private    String inputgender;
private     String input_tshirt;
 private    PreparedStatement pst;
     
     
     
     

  private  int dbmsid;
  private  String dbmspassword;
  private  ResultSet rs;
  private  boolean loginFlag=false;
    
    public AdminDirectorPage() {
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
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        full_name = new javax.swing.JTextField();
        institution_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone_number = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        tshirt = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        zone = new javax.swing.JComboBox();
        ca_newform = new javax.swing.JLabel();
        add_ca_submit = new javax.swing.JLabel();
        responses = new javax.swing.JLabel();

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

        addCA_btn.setBackground(new java.awt.Color(241, 78, 78));
        addCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCA_btn.setText("ADD CA");
        addCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        addCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        addCA_btn.setOpaque(true);
        addCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(start_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(485, 355));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));

        tshirt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S", "M", "L", "XL", "XXL" }));

        jLabel2.setText("ID");

        jLabel3.setText("Full Name");
        jLabel3.setToolTipText("");

        jLabel4.setText("Institution Name");

        jLabel5.setText("Email");

        jLabel6.setText("Phone Number");
        jLabel6.setToolTipText("");

        jLabel8.setText("Zone");

        jLabel9.setText("Gender");

        jLabel10.setText("T Shirt Size");

        zone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhaka", "Chittagong", "Khulna", "Mymensingh", "Rajshahi", "Sylhet", "Rangpur", "Barisal" }));

        ca_newform.setBackground(new java.awt.Color(51, 51, 51));
        ca_newform.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ca_newform.setForeground(new java.awt.Color(255, 255, 255));
        ca_newform.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ca_newform.setText("New Form");
        ca_newform.setOpaque(true);
        ca_newform.setPreferredSize(new java.awt.Dimension(40, 15));
        ca_newform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ca_newformMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ca_newformMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ca_newformMouseExited(evt);
            }
        });

        add_ca_submit.setBackground(new java.awt.Color(51, 51, 51));
        add_ca_submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_ca_submit.setForeground(new java.awt.Color(255, 255, 255));
        add_ca_submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_ca_submit.setText("Submit");
        add_ca_submit.setOpaque(true);
        add_ca_submit.setPreferredSize(new java.awt.Dimension(40, 15));
        add_ca_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_ca_submitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_ca_submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_ca_submitMouseExited(evt);
            }
        });

        responses.setBackground(new java.awt.Color(51, 51, 51));
        responses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        responses.setForeground(new java.awt.Color(255, 255, 255));
        responses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        responses.setText("Responses");
        responses.setMinimumSize(new java.awt.Dimension(40, 15));
        responses.setOpaque(true);
        responses.setPreferredSize(new java.awt.Dimension(40, 15));
        responses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                responsesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                responsesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                responsesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(institution_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gender, 0, 202, Short.MAX_VALUE)
                            .addComponent(tshirt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(responses, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ca_newform, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(add_ca_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(full_name, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(zone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(institution_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tshirt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(responses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_ca_submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ca_newform, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void viewCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseExited
        viewCA_btn.setForeground(Color.white);
        viewCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_viewCA_btnMouseExited

    private void viewCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseEntered
        viewCA_btn.setForeground(Color.black);
        viewCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_viewCA_btnMouseEntered

    private void viewCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseClicked
         AdminDirectorViewCA admindirectorviewca= new  AdminDirectorViewCA();
        viewCA_btn.setForeground(Color.black);
        viewCA_btn.setBackground(new Color (241,78,78));
        admindirectorviewca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewCA_btnMouseClicked

    private void modifyCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyCA_btnMouseExited
        modifyCA_btn.setForeground(Color.white);
        modifyCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_modifyCA_btnMouseExited

    private void modifyCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyCA_btnMouseEntered
        modifyCA_btn.setForeground(Color.black);
        modifyCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_modifyCA_btnMouseEntered

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
       AdminDirectorDeleteCA admindirectordeleteca = new AdminDirectorDeleteCA();
        deleteCA_btn.setForeground(Color.black);
        deleteCA_btn.setBackground(new Color (241,78,78));
        admindirectordeleteca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteCA_btnMouseClicked

    private void add_ca_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ca_submitMouseEntered
       add_ca_submit.setForeground(Color.black);
        add_ca_submit.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_add_ca_submitMouseEntered

    private void add_ca_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ca_submitMouseExited

           add_ca_submit.setForeground(Color.white);
        add_ca_submit.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_add_ca_submitMouseExited

    private void add_ca_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ca_submitMouseClicked
           inputid=id.getText().toString().trim();
          inputFName= full_name.getText().toString().trim();
          inputInstitution=institution_name.getText().toString().trim();
          inputemail=email.getText().toString().trim();
          inputphone_number=phone_number.getText().toString().trim();
         inputzone=zone.getSelectedItem().toString().trim();
         inputgender=gender.getSelectedItem().toString().trim();
         input_tshirt=tshirt.getSelectedItem().toString().trim();
               if(inputid.equals(""))
              {
         JOptionPane.showMessageDialog(this, "Please Enter ID Number First");
              }
           else
         {

                try {
              String sql =" INSERT INTO ca_dbms (Id,full_name,institution_name,email,phone_number,zone,gender,tshirt) VALUES (?,?,?,?,?,?,?,?)";
             pst = DbmsUtil.getConnection().prepareStatement(sql);
   
               pst.setString(1, inputid);
               pst.setString(2, inputFName);
               pst.setString(3, inputInstitution);
               pst.setString(4, inputemail);
               pst.setString(5, inputphone_number);
               pst.setString(6, inputzone);
               pst.setString(7, inputgender);
               pst.setString(8, input_tshirt);
     
               pst.executeUpdate();
           
               JOptionPane.showMessageDialog(this, "Submited");
               AdminDirectorPage directorpage  = new AdminDirectorPage();
               directorpage.setVisible(true);
               this.dispose();


              } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed");
          }
        }
            
    }//GEN-LAST:event_add_ca_submitMouseClicked

    private void ca_newformMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_newformMouseEntered
     ca_newform.setForeground(Color.black);
        ca_newform.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_ca_newformMouseEntered

    private void ca_newformMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_newformMouseExited
           ca_newform.setForeground(Color.white);
        ca_newform.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ca_newformMouseExited

    private void ca_newformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_newformMouseClicked
        AdminDirectorPage directorpage  = new AdminDirectorPage();
               directorpage.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_ca_newformMouseClicked

    private void responsesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_responsesMouseClicked
           try {
         
        Desktop.getDesktop().browse(new URI("https://docs.google.com/forms/d/1wK5CAjybdfWpbd3g42FpJ6oAqw43HgSJsp9VAl26jAg/edit#responses"));
         
    } catch (IOException | URISyntaxException e1) {
    }
    }//GEN-LAST:event_responsesMouseClicked

    private void responsesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_responsesMouseEntered
        responses.setForeground(Color.black);
        responses.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_responsesMouseEntered

    private void responsesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_responsesMouseExited
        responses.setForeground(Color.white);
        responses.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_responsesMouseExited

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
            java.util.logging.Logger.getLogger(AdminDirectorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDirectorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDirectorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCA_btn;
    private javax.swing.JLabel add_ca_submit;
    private javax.swing.JLabel back;
    private javax.swing.JLabel ca_newform;
    private javax.swing.JLabel deleteCA_btn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField full_name;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField id;
    private javax.swing.JTextField institution_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel modifyCA_btn;
    private javax.swing.JTextField phone_number;
    private javax.swing.JLabel responses;
    private javax.swing.JLabel start_btn;
    private javax.swing.JComboBox tshirt;
    private javax.swing.JLabel viewCA_btn;
    private javax.swing.JComboBox zone;
    // End of variables declaration//GEN-END:variables
}
