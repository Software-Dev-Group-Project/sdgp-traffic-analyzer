/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcApi;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * Authorship information 
 * @author Gervais Boadi Appiah, w1735205
 * Information: This is a form that severs as admin panel which displays user information
 */
public class UserActivity extends javax.swing.JFrame {

    /**
     * Creates new form UserActivity
     */
    private static String User;

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;

    public UserActivity() {
        //getting the current user of the application
        int lastUser = Login.UserArray.size() - 1;
        User = Login.UserArray.get(lastUser);
        System.out.println("Current user: " + User);
        // After the components have been set then the showTableData() is called.
        initComponents();
        showTableData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSignOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserActivityTable1 = new javax.swing.JTable();
        UserActivityTable = new javax.swing.JTable();
        btnHomeScreen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteUserBTN = new javax.swing.JButton();
        updateUserBTN = new javax.swing.JButton();
        txtFirstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtAdminStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearchRecord = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(11, 58, 83));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 570));

        jPanel2.setBackground(new java.awt.Color(11, 58, 83));
        jPanel2.setForeground(new java.awt.Color(14, 56, 84));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 570));

        btnSignOut.setBackground(new java.awt.Color(255, 0, 51));
        btnSignOut.setText("SIGN OUT");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WELCOME "+User+" TO THE USER ACTIVITY SCREEN");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        UserActivityTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Firstname", "Lastname", "Email", "Sign In Date", "Sign In Time", "Sign Out Date", "Sign Out Time", "Admin"
            }
        ));
        UserActivityTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserActivityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserActivityTable1);
        if (UserActivityTable1.getColumnModel().getColumnCount() > 0) {
            UserActivityTable1.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        UserActivityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Firstname", "Lastname", "Email", "Sign In Date", "Sign In Time", "Sign Out Date", "Sign Out Time", "Admin"
            }
        ));
        UserActivityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserActivityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserActivityTable);
        if (UserActivityTable.getColumnModel().getColumnCount() > 0) {
            UserActivityTable.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        btnHomeScreen.setBackground(new java.awt.Color(237, 238, 217));
        btnHomeScreen.setText("HOMESCREEN");
        btnHomeScreen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHomeScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignOut))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(11, 58, 83));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcApi/LOGO_Navy_Small.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a record to do the following:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("+ Update user information or admin status");

        deleteUserBTN.setBackground(new java.awt.Color(237, 238, 217));
        deleteUserBTN.setText("DELETE");
        deleteUserBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBTNActionPerformed(evt);
            }
        });

        updateUserBTN.setBackground(new java.awt.Color(237, 238, 217));
        updateUserBTN.setText("UPDATE");
        updateUserBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBTNActionPerformed(evt);
            }
        });

        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Firstname");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lastname");

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });

        txtAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminStatusActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin Status");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search for a data below:");

        txtSearchRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRecordActionPerformed(evt);
            }
        });
        txtSearchRecord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchRecordKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("+ Delete user information");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Update admin status to 'YES' / 'NO'");

        btnClear.setBackground(new java.awt.Color(237, 238, 217));
        btnClear.setText("CLEAR");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(237, 238, 217));
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(122, 122, 122))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(updateUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLastname)
                                    .addComponent(txtFirstname)
                                    .addComponent(txtAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(deleteUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAdminStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(256, 256, 256))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignOut().setVisible(true);
                setVisible(false);
            }
        });
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnHomeScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeScreenActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
                setVisible(false);
            }
        });
    }//GEN-LAST:event_btnHomeScreenActionPerformed

    private void txtSearchRecordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchRecordKeyReleased
        //This is used for the search feature to find data within the database
        DefaultTableModel table = (DefaultTableModel) UserActivityTable.getModel();
        String search = txtSearchRecord.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        UserActivityTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_txtSearchRecordKeyReleased

    private void txtSearchRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchRecordActionPerformed

    private void txtAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminStatusActionPerformed

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void updateUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBTNActionPerformed
        updateUser();
    }//GEN-LAST:event_updateUserBTNActionPerformed

    private void deleteUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBTNActionPerformed
        deleteUser();
    }//GEN-LAST:event_deleteUserBTNActionPerformed

    private void UserActivityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserActivityTableMouseClicked
        //when the admin selects a user the data is shown in the txt fields
        DefaultTableModel RecordTable = (DefaultTableModel) UserActivityTable.getModel();
        int SelectedRows = UserActivityTable.getSelectedRow();

        txtFirstname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtLastname.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtAdminStatus.setText(RecordTable.getValueAt(SelectedRows, 8).toString());

    }//GEN-LAST:event_UserActivityTableMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetField();
        JOptionPane.showMessageDialog(null, "Text Fields have been refreshed!");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        resetTable();
        JOptionPane.showMessageDialog(null, "Table has been refreshed!");
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(UserActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserActivity().setVisible(true);
            }
        });
    }

    public void resetTable() {
        DefaultTableModel tblModel = (DefaultTableModel) UserActivityTable.getModel();
        //Reset table
        tblModel.setRowCount(0);
        showTableData();
    }

    public void resetField() {
        //Setting strings to empty strings
        txtFirstname.setText("");
        txtLastname.setText("");
        txtAdminStatus.setText("");
    }

    public void showTableData() {
        try {
            con = DriverManager.getConnection("jdbc:sqlite:LATAAccountDB.db");
            //getting data from user database
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Accounts";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String Username = String.valueOf(rs.getString("Username"));
                String Firstname = String.valueOf(rs.getString("FirstName"));
                String Lastname = String.valueOf(rs.getString("LastName"));
                String Email = String.valueOf(rs.getString("Email"));
                String LoggedInDate = String.valueOf(rs.getString("LoggedInDate"));
                String LoggedInTime = String.valueOf(rs.getString("LoggedInTime"));
                String LoggedOutDate = String.valueOf(rs.getString("LoggedOutDate"));
                String LoggedOutTime = String.valueOf(rs.getString("LoggedOutTime"));
                String Admin = String.valueOf(rs.getString("Admin"));

                String[] userRecordData = {Username, Firstname, Lastname, Email, LoggedInDate, LoggedInTime, LoggedOutDate, LoggedOutTime, Admin};
                DefaultTableModel tblModel = (DefaultTableModel) UserActivityTable.getModel();
                //adding data from databse to defaul table model
                tblModel.addRow(userRecordData);

            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void deleteUser() {
        //Check if txt fields are empty
        if ("".equals(txtFirstname.getText()) || "".equals(txtLastname.getText()) || "".equals(txtAdminStatus.getText())) {
            JOptionPane.showMessageDialog(null, "Select a user to delete");
        } else {
            try {
                //removes the user shown in the table and deletes them from the database
                con = DriverManager.getConnection("jdbc:sqlite:LATAAccountDB.db");
                Statement st = con.createStatement();
                int row = UserActivityTable.getSelectedRow();
                String selectedUser = UserActivityTable.getModel().getValueAt(row, 0).toString();
                System.out.println(selectedUser);
                String sql = "DELETE FROM Accounts WHERE Username = '" + selectedUser + "'";
                st.executeUpdate(sql);
                System.out.println("User: " + selectedUser + " has been deleted!");
                JOptionPane.showMessageDialog(null, "User: " + selectedUser + " has been deleted!");
                //resets table and fields
                resetTable();
                resetField();

            } catch (HeadlessException | SQLException e) {
                System.out.println("Deletion NOT Complete! ");
            }
        }
    }

    public void updateUser() {
        //Check if txt fields are empty
        if ("".equals(txtFirstname.getText()) || "".equals(txtLastname.getText()) || "".equals(txtAdminStatus.getText())) {
            JOptionPane.showMessageDialog(null, "Select a user to update");
        } else {
            try {
                //Updates record of selected user
                int rowSelected = UserActivityTable.getSelectedRow();
                String selectedUser = UserActivityTable.getModel().getValueAt(rowSelected, 0).toString();
                System.out.println(selectedUser);
                String sql = "UPDATE Accounts SET Firstname = '" + txtFirstname.getText() + "', Lastname = '" + txtLastname.getText() + "', Admin = '" + txtAdminStatus.getText() + "' WHERE Username = '" + selectedUser + "'";

                ps = con.prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User: " + selectedUser + " has been updated!");
                
                //Reset table
                resetTable();
                resetField();

            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
                Logger.getLogger(UserActivity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserActivityTable;
    private javax.swing.JTable UserActivityTable1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHomeScreen;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton deleteUserBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAdminStatus;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtSearchRecord;
    private javax.swing.JButton updateUserBTN;
    // End of variables declaration//GEN-END:variables

}
