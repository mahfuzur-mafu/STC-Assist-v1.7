package stc.swing.project.version0.pkg1;

import dbms.DbmsUtil;
import java.awt.Color;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class EventPage extends javax.swing.JFrame implements Runnable  {
    int hour;
    int min;
    int sec;
    

   

    DefaultTableModel defaultModel = new DefaultTableModel() {

        public Class<?> getcolumnClass(int column) {
            switch (column) {
                case 0:
                    return String.class;
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                case 3:
                    return String.class;

                default:
                    return String.class;

            }

        }

    };

    private ResultSet rs;
    private PreparedStatement pst;
    public static Thread t;

    public EventPage() {
        initComponents();
         t = new Thread(this);
        t.start();

        jTable.setModel(defaultModel);
        TableColumnModel columnModel = jTable.getColumnModel();
        defaultModel.addColumn("Serial");
        defaultModel.addColumn("Date");
        defaultModel.addColumn("Event Title");
        defaultModel.addColumn("Event Link");

        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(220);
        columnModel.getColumn(3).setPreferredWidth(220);

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
        coming_event = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        prev_event = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_link = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dtime = new javax.swing.JLabel();

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
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 30));

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

        event_btn.setBackground(new java.awt.Color(241, 78, 78));
        event_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        event_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        event_btn.setText("EVENTS");
        event_btn.setMaximumSize(new java.awt.Dimension(150, 80));
        event_btn.setMinimumSize(new java.awt.Dimension(150, 80));
        event_btn.setOpaque(true);
        event_btn.setPreferredSize(new java.awt.Dimension(150, 80));

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
                            .addComponent(developer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(start_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(start_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(93, 93, 93))
        );

        jPanel4.setMaximumSize(new java.awt.Dimension(545, 410));
        jPanel4.setMinimumSize(new java.awt.Dimension(545, 410));
        jPanel4.setPreferredSize(new java.awt.Dimension(545, 410));

        coming_event.setBackground(new java.awt.Color(51, 51, 51));
        coming_event.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        coming_event.setForeground(new java.awt.Color(255, 255, 255));
        coming_event.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coming_event.setText("COMING EVENT");
        coming_event.setOpaque(true);
        coming_event.setPreferredSize(new java.awt.Dimension(39, 14));
        coming_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coming_eventMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coming_eventMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                coming_eventMouseExited(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setPreferredSize(new java.awt.Dimension(545, 380));
        jScrollPane1.setViewportView(jTable);

        prev_event.setBackground(new java.awt.Color(51, 51, 51));
        prev_event.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prev_event.setForeground(new java.awt.Color(255, 255, 255));
        prev_event.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prev_event.setText(" ALL EVENT'S");
        prev_event.setOpaque(true);
        prev_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prev_eventMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prev_eventMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prev_eventMouseExited(evt);
            }
        });

        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_title.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Date (Y/M/D):");
        jLabel4.setOpaque(true);

        jLabel_date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_date.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Event Link :");
        jLabel6.setOpaque(true);

        jLabel_link.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_link.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_link.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Event Title :");

        dtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(prev_event, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(coming_event, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(dtime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_link, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coming_event, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dtime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_link, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(prev_event, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
                .addGap(63, 63, 63)
                .addComponent(jLabel7))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void start_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_btnMouseClicked
        LoginPage loginpage = new LoginPage();
        loginpage.setVisible(true);
        t.stop();
        this.dispose();
    }//GEN-LAST:event_start_btnMouseClicked

    private void developer_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseExited
        developer_btn.setForeground(Color.white);
        developer_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_developer_btnMouseExited

    private void developer_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseEntered
        developer_btn.setForeground(Color.black);
        developer_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_developer_btnMouseEntered

    private void member_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseExited
        member_btn.setForeground(Color.white);
        member_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_member_btnMouseExited

    private void member_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseEntered
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_member_btnMouseEntered

    private void publication_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseExited
        publication_btn.setForeground(Color.white);
        publication_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_publication_btnMouseExited

    private void publication_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseEntered
        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_publication_btnMouseEntered

    private void data_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseExited
        data_btn.setForeground(Color.white);
        data_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_data_btnMouseExited

    private void data_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseEntered
        data_btn.setForeground(Color.black);
        data_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_data_btnMouseEntered

    private void data_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_btnMouseClicked

        DataPage datapage = new DataPage();
        data_btn.setForeground(Color.black);
        data_btn.setBackground(new Color(241, 78, 78));
        datapage.setVisible(true);
        t.stop();
        this.dispose();

    }//GEN-LAST:event_data_btnMouseClicked

    private void social_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseExited
        social_btn.setForeground(Color.white);
        social_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_social_btnMouseExited

    private void social_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseEntered
        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_social_btnMouseEntered

    private void social_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_social_btnMouseClicked
        SocialPage socialpage = new SocialPage();
        social_btn.setForeground(Color.black);
        social_btn.setBackground(new Color(241, 78, 78));
        socialpage.setVisible(true);
        t.stop();
        this.dispose();

    }//GEN-LAST:event_social_btnMouseClicked

    private void home_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseExited
        home_btn.setForeground(Color.white);
        home_btn.setBackground(new Color(51, 51, 51));

    }//GEN-LAST:event_home_btnMouseExited

    private void home_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseEntered
        home_btn.setForeground(Color.black);
        home_btn.setBackground(new Color(241, 78, 78));

    }//GEN-LAST:event_home_btnMouseEntered

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
        HomePage homepage = new HomePage();
        home_btn.setForeground(Color.black);
        home_btn.setBackground(new Color(241, 78, 78));
        homepage.setVisible(true);
        t.stop();
        this.dispose();
        

    }//GEN-LAST:event_home_btnMouseClicked

    private void publication_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publication_btnMouseClicked
        PublicationPage publicationpage = new PublicationPage();

        publication_btn.setForeground(Color.black);
        publication_btn.setBackground(new Color(241, 78, 78));
        publicationpage.setVisible(true);
        t.stop();
        this.dispose();
    }//GEN-LAST:event_publication_btnMouseClicked

    private void member_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_btnMouseClicked
        MemberPage memberpage = new MemberPage();
        member_btn.setForeground(Color.black);
        member_btn.setBackground(new Color(241, 78, 78));
        memberpage.setVisible(true);
        t.stop();
        this.dispose();
    }//GEN-LAST:event_member_btnMouseClicked

    private void developer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developer_btnMouseClicked
        DeveloperPage developerpage = new DeveloperPage();
        developer_btn.setBackground(Color.black);
        developer_btn.setBackground(new Color(241, 78, 78));
        developerpage.setVisible(true);
        t.stop();
        this.dispose();
    }//GEN-LAST:event_developer_btnMouseClicked

    private void coming_eventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coming_eventMouseEntered
        coming_event.setForeground(Color.black);
        coming_event.setBackground(new Color(241, 78, 78));
    }//GEN-LAST:event_coming_eventMouseEntered

    private void coming_eventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coming_eventMouseExited
        coming_event.setForeground(Color.white);
        coming_event.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_coming_eventMouseExited

    private void coming_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coming_eventMouseClicked

        String sql = " SELECT  date,title,event_link FROM event_dbms ORDER BY serial DESC LIMIT 1 ";

        try {
            rs = DbmsUtil.getConnection().createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EventPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        defaultModel.setRowCount(0);

        try {
            while (rs.next()) {
                try {
                    String event_title = null;
//                                String event_date = null;
//                               String event_link = null;

                    event_title = rs.getNString(2);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    String event_date = sdf.format(rs.getDate(1));
                    String event_link = rs.getNString(3);

                    jLabel_title.setText(event_title);
                    jLabel_date.setText(event_date);
                    jLabel_link.setText(event_link);

                } catch (SQLException ex) {
                    Logger.getLogger(EventPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(EventPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_coming_eventMouseClicked

    private void prev_eventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev_eventMouseEntered
        prev_event.setForeground(Color.black);
        prev_event.setBackground(new Color(241, 78, 78));
    }//GEN-LAST:event_prev_eventMouseEntered

    private void prev_eventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev_eventMouseExited
        prev_event.setForeground(Color.white);
        prev_event.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_prev_eventMouseExited

    private void prev_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev_eventMouseClicked
        try {
            String sql = " select serial,date,title, event_link FROM event_dbms ";

            rs = DbmsUtil.getConnection().createStatement().executeQuery(sql);
            defaultModel.setRowCount(0);
            while (rs.next()) {
                defaultModel.addRow(new Object[]{rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4)});

            }
            defaultModel.fireTableDataChanged();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Showing data Failed");
        }
 
    }//GEN-LAST:event_prev_eventMouseClicked

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
            java.util.logging.Logger.getLogger(EventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EventPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coming_event;
    private javax.swing.JLabel data_btn;
    private javax.swing.JLabel developer_btn;
    private javax.swing.JLabel dtime;
    private javax.swing.JLabel event_btn;
    private javax.swing.JLabel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_link;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel member_btn;
    private javax.swing.JLabel prev_event;
    private javax.swing.JLabel publication_btn;
    private javax.swing.JLabel social_btn;
    private javax.swing.JLabel start_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true)
                      {
                        Calendar cal = Calendar.getInstance();
                        hour = cal.get(Calendar.HOUR_OF_DAY);
                        min = cal.get(Calendar.MINUTE);
                        sec = cal.get(Calendar.SECOND);
                        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
                        java.util.Date dat = cal.getTime();
                        String time12 = sdf.format(dat);
                        dtime.setText(time12);
                      }
             
       
    }

}
