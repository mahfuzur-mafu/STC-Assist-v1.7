
package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DirectorModifyCA extends javax.swing.JFrame {
  private   String  inputid;
  private   String inputFName;
   private   String inputInstitution;
   private  String inputemail;
   private  String inputphone_number;
   private String inputzone;
   private  String inputgender;
   private  String input_tshirt;
   private PreparedStatement pst;
     
     
     
     

    private int dbmsid;
   private  String dbmspassword;
   private  ResultSet rs;

    
    public DirectorModifyCA() {
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
        signOut_btn = new javax.swing.JLabel();
        start_btn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        phone_number = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        full_name = new javax.swing.JTextField();
        institution_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone_nmbr = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        tshirt = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ca_newform1 = new javax.swing.JLabel();
        add_ca_submit1 = new javax.swing.JLabel();
        zone = new javax.swing.JComboBox();

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

        modifyCA_btn.setBackground(new java.awt.Color(241, 78, 78));
        modifyCA_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modifyCA_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyCA_btn.setText("MODIFY CA");
        modifyCA_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        modifyCA_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        modifyCA_btn.setOpaque(true);
        modifyCA_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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

        start_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_menu.png"))); // NOI18N

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
                            .addComponent(viewCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(81, 81, 81)
                .addComponent(addCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signOut_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(238, 244, 244));
        jPanel4.setMaximumSize(new java.awt.Dimension(545, 410));
        jPanel4.setMinimumSize(new java.awt.Dimension(545, 410));

        phone_number.setBackground(java.awt.Color.white);
        phone_number.setPreferredSize(new java.awt.Dimension(485, 355));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));

        tshirt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S", "M", "L", "XL", "XXL" }));

        jLabel11.setText("ID");

        jLabel12.setText("Full Name");
        jLabel12.setToolTipText("");

        jLabel13.setText("Institution Name");

        jLabel14.setText("Email");

        jLabel15.setText("Phone Number");
        jLabel15.setToolTipText("");

        jLabel16.setText("Zone");

        jLabel17.setText("Gender");

        jLabel18.setText("T Shirt Size");

        ca_newform1.setBackground(new java.awt.Color(51, 51, 51));
        ca_newform1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ca_newform1.setForeground(new java.awt.Color(255, 255, 255));
        ca_newform1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ca_newform1.setText("New Form");
        ca_newform1.setOpaque(true);
        ca_newform1.setPreferredSize(new java.awt.Dimension(40, 15));
        ca_newform1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ca_newform1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ca_newform1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ca_newform1MouseExited(evt);
            }
        });

        add_ca_submit1.setBackground(new java.awt.Color(51, 51, 51));
        add_ca_submit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_ca_submit1.setForeground(new java.awt.Color(255, 255, 255));
        add_ca_submit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_ca_submit1.setText("Submit");
        add_ca_submit1.setOpaque(true);
        add_ca_submit1.setPreferredSize(new java.awt.Dimension(40, 15));
        add_ca_submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_ca_submit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_ca_submit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_ca_submit1MouseExited(evt);
            }
        });

        zone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhaka", "Chittagong", "Khulna", "Mymensingh", "Rajshahi", "Sylhet", "Rangpur", "Barisal" }));

        javax.swing.GroupLayout phone_numberLayout = new javax.swing.GroupLayout(phone_number);
        phone_number.setLayout(phone_numberLayout);
        phone_numberLayout.setHorizontalGroup(
            phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phone_numberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phone_numberLayout.createSequentialGroup()
                        .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(institution_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gender, 0, 202, Short.MAX_VALUE)
                            .addComponent(tshirt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phone_numberLayout.createSequentialGroup()
                        .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(phone_numberLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(phone_nmbr, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(phone_numberLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zone, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(phone_numberLayout.createSequentialGroup()
                                        .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(phone_numberLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(ca_newform1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_ca_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        phone_numberLayout.setVerticalGroup(
            phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phone_numberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addGap(1, 1, 1)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_nmbr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(full_name, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(zone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(institution_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tshirt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ca_newform1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(add_ca_submit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void signOut_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOut_btnMouseExited
        signOut_btn.setForeground(Color.white);
        signOut_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_signOut_btnMouseExited

    private void signOut_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOut_btnMouseEntered
        signOut_btn.setForeground(Color.black);
        signOut_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_signOut_btnMouseEntered

    private void signOut_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOut_btnMouseClicked
         DataPage datapage = new DataPage();
        signOut_btn.setForeground(Color.black);
        signOut_btn.setBackground(new Color (241,78,78));
        datapage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signOut_btnMouseClicked

    private void viewCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseExited
        viewCA_btn.setForeground(Color.white);
        viewCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_viewCA_btnMouseExited

    private void viewCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseEntered
        viewCA_btn.setForeground(Color.black);
        viewCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_viewCA_btnMouseEntered

    private void viewCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCA_btnMouseClicked
        DirectorViewCA directorviewca= new DirectorViewCA();
        viewCA_btn.setForeground(Color.black);
        viewCA_btn.setBackground(new Color (241,78,78));
        directorviewca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewCA_btnMouseClicked

    private void deleteCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCA_btnMouseEntered
          deleteCA_btn.setForeground(Color.black);
        deleteCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_deleteCA_btnMouseEntered

    private void deleteCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCA_btnMouseExited
         deleteCA_btn.setForeground(Color.white);
        deleteCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_deleteCA_btnMouseExited

    private void deleteCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCA_btnMouseClicked
       DirectorDeleteCA directordeleteca = new DirectorDeleteCA();
        deleteCA_btn.setForeground(Color.black);
        deleteCA_btn.setBackground(new Color (241,78,78));
        directordeleteca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteCA_btnMouseClicked

    private void addCA_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCA_btnMouseEntered
           addCA_btn.setForeground(Color.black);
         addCA_btn.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_addCA_btnMouseEntered

    private void addCA_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCA_btnMouseExited
           addCA_btn.setForeground(Color.white);
        addCA_btn.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_addCA_btnMouseExited

    private void addCA_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCA_btnMouseClicked
        DirectorPage directorpage = new DirectorPage();
          addCA_btn.setForeground(Color.black);
        addCA_btn.setBackground(new Color (241,78,78));
        directorpage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addCA_btnMouseClicked

    private void ca_newform1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_newform1MouseClicked
           DirectorModifyCA directormodifyca  = new DirectorModifyCA();
               directormodifyca.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_ca_newform1MouseClicked

    private void ca_newform1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_newform1MouseEntered
        ca_newform1.setForeground(Color.black);
        ca_newform1.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_ca_newform1MouseEntered

    private void ca_newform1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ca_newform1MouseExited
        ca_newform1.setForeground(Color.white);
        ca_newform1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ca_newform1MouseExited

    private void add_ca_submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ca_submit1MouseClicked
          inputid=id.getText().toString().trim();
          inputFName= full_name.getText().toString().trim();
          inputInstitution=institution_name.getText().toString().trim();
          inputemail=email.getText().toString().trim();
        inputphone_number=phone_nmbr.getText().toString().trim();
         inputzone=zone.getSelectedItem().toString().trim();
         inputgender=gender.getSelectedItem().toString().trim();
         input_tshirt=tshirt.getSelectedItem().toString().trim();
              if(inputid.equals(""))
              {
         JOptionPane.showMessageDialog(this, "Please Enter ID Number First");
              } 
              
             else{
                  
              
         try {
              String sql =" UPDATE ca_dbms SET full_name='"+inputFName+"',institution_name='"+inputInstitution+"',email='"+inputemail+"',phone_number='"+inputphone_number+"',zone='"+inputzone+"',gender='"+inputgender+"',tshirt='"+input_tshirt+"' WHERE Id ='"+inputid+"';";
             pst = DbmsUtil.getConnection().prepareStatement(sql);
             

        
               pst.executeUpdate();
               JOptionPane.showMessageDialog(this, "Updated");
               DirectorModifyCA directormodifyca  = new DirectorModifyCA();
               directormodifyca.setVisible(true);
               this.dispose();
               

         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed");
         }
              }
         
         
    }//GEN-LAST:event_add_ca_submit1MouseClicked

    private void add_ca_submit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ca_submit1MouseEntered
        add_ca_submit1.setForeground(Color.black);
        add_ca_submit1.setBackground(new Color (241,78,78));
    }//GEN-LAST:event_add_ca_submit1MouseEntered

    private void add_ca_submit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ca_submit1MouseExited

        add_ca_submit1.setForeground(Color.white);
        add_ca_submit1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_add_ca_submit1MouseExited

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
            java.util.logging.Logger.getLogger(DirectorModifyCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DirectorModifyCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DirectorModifyCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DirectorModifyCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DirectorModifyCA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCA_btn;
    private javax.swing.JLabel add_ca_submit1;
    private javax.swing.JLabel ca_newform1;
    private javax.swing.JLabel deleteCA_btn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField full_name;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField id;
    private javax.swing.JTextField institution_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel modifyCA_btn;
    private javax.swing.JTextField phone_nmbr;
    private javax.swing.JPanel phone_number;
    private javax.swing.JLabel signOut_btn;
    private javax.swing.JLabel start_btn;
    private javax.swing.JComboBox tshirt;
    private javax.swing.JLabel viewCA_btn;
    private javax.swing.JComboBox zone;
    // End of variables declaration//GEN-END:variables
}
