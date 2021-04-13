/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcApi;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerva
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    //Used for SQL
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public String CurrentUser;
    //String [] UserArray; 
    public static ArrayList<String> UserArray = new ArrayList<>();

    public Login() {
        initComponents();
        //When the components of the login form are initialized, we establised the connection

        //Calling method within the following class "create DB class"
        con = DatabaseConnectionDB.ConnectionDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldUsername = new javax.swing.JTextField();
        txtFieldPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(11, 58, 83));
        jPanel3.setPreferredSize(new java.awt.Dimension(820, 570));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password:");

        txtFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });

        txtFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPasswordActionPerformed(evt);
            }
        });
        txtFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldPasswordKeyPressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 204, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(237, 238, 217));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSignUp.setText("SIGN UP");
        btnSignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("SIGN IN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("New to LATA? ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Sign up below.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 70, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcApi/LOGO_Navy_Small.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtFieldUsername.getText();
        //SQL statement to find user
        String sql = "SELECT * From Accounts WHERE Username = ?;";
        //SQL statement to find user that is an admin
        //String sqlAdmin = "SELECT * From Accounts WHERE Username = ? AND Admin = 1;";

        //SQL statement to find user that is an admin
        //String sqlTimeStamp = "INSERT INTO Accounts(LoggedInDate, LoggedInTime) Values (?, ?)";
        //String sqlTimeStamp = "UPDATE Accounts SET LoggedInDate = ?, LoggedInTime = ? WHERE Username = ?";
        //String sqlTimeStamp = "UPDATE Accounts SET LoggedInDate = '" + date + "', LoggedInTime = '" + time + "' WHERE Username = '" + username + "'";
        //Check if fields are empty
        if (txtFieldUsername.getText().equals("") | txtFieldPassword.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "One or more fields are empty, try again!");
            System.out.println("Details have not been given, try again! ");
        } else {

            // Source: https://stackoverflow.com/questions/8292256/get-number-of-rows-returned-by-resultset-in-java
            try {
                //Preparing statement to find user in database
                ps = con.prepareStatement(sql);
                ps.setString(1, txtFieldUsername.getText());
                rs = ps.executeQuery();

                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "Account has not been found \nor password is not correct, Try again!");
                } else {
                    do {
                        String Salt = rs.getString("Salt");
                        String Hash = rs.getString("Hash");
                        //Checking if password is correct
                        if (PasswordUtills.verifyUserPassword(txtFieldPassword.getText(), Hash, Salt)) {
                            JOptionPane.showMessageDialog(null, "Username: " + username + ", Login has been successful!");
                            System.out.println("Username: " + username + " has loged in");

                            /////////////////////////////////////////////////////////////////////////////////////////////
                            CurrentUser = username;
                            UserArray.add(username);
                            AdminVerification();
                            //testSQLScript();
                            setTimeStamp();

                        } else {
                            JOptionPane.showMessageDialog(null, "Username: " + username + ", has not been found \nor password is not correct, please sign up!");
                            System.out.println("Username: " + username + " has not been found, Sign up! ");
                        }
                    } while (rs.next());
                }
            } catch (SQLException ex) {
                System.out.println("User was not found");
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        /* Ignored */
                    }
                }
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException e) {
                        /* Ignored */
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        /* Ignored */
                    }
                }
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    
    public void AdminVerification() {
        int lastUser = UserArray.size()-1;
        System.out.println("Array size: "+ UserArray.size());
        String CurrentUser = UserArray.get(lastUser);
        System.out.println("User in array: " + UserArray);
        String sqlAdmin = "SELECT * From Accounts WHERE Username = ? AND Admin = 1;";

        try {
            //Preparing statement to check if user is an admin
            ps = con.prepareStatement(sqlAdmin);
            System.out.println("The current user is " + CurrentUser);
            ps.setString(1, CurrentUser);
            rs = ps.executeQuery();

            if (!rs.next()) {
                //If user is NOT admin the admin button will not appear on screen
                System.out.println("Stage 1: User is not an admin");
                java.awt.EventQueue.invokeLater(() -> {
                    new HomeScreen(true).setVisible(true);
                    setVisible(false);
                });
            } else {
                //If user is admin the admin button will appear on screen
                System.out.println("Stage 1: User is an admin");
                java.awt.EventQueue.invokeLater(() -> {
                    new HomeScreen().setVisible(true);
                    setVisible(false);
                });

            }
        } catch (SQLException ex) {
            System.out.println("An Error has been found");
        }

    }

    public void setTimeStamp() {

        int lastUser = UserArray.size()-1;
        String username = UserArray.get(lastUser);

        long millis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(millis);
        System.out.println(timestamp);
        String currentTime;
        currentTime = timestamp.toString();

        String[] dateAndTime = currentTime.split(" ");
        String date = dateAndTime[0];
        String time = dateAndTime[1];

        String sqlTimeStamp = "UPDATE Accounts SET LoggedInDate = '" + date + "', LoggedInTime = '" + time + "' WHERE Username = '" + username + "';";

        System.out.println("User: " + username + " Date: " + date + " at: " + time);

        try {

            ps = con.prepareStatement(sqlTimeStamp);
            ps.executeUpdate();
            System.out.println("Time has been set for " + txtFieldUsername.getText()+"\n");
        } catch (SQLException e) {
            System.out.println("Time was NOT been set for " + txtFieldUsername.getText()+"\n");
        }
    }
    
    public void setLogOutTimeStamp() {
        int lastUser = UserArray.size()-1;
        String username = UserArray.get(lastUser);

        long millis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(millis);
        System.out.println(timestamp);
        String currentTime;
        currentTime = timestamp.toString();

        String[] dateAndTime = currentTime.split(" ");
        String date = dateAndTime[0];
        String time = dateAndTime[1];

        String sqlTimeStamp = "UPDATE Accounts SET LoggedOutDate = '" + date + "', LoggedOutTime = '" + time + "' WHERE Username = '" + username + "';";

        System.out.println("User: " + username + " Date: " + date + " at: " + time);

        try {

            ps = con.prepareStatement(sqlTimeStamp);
            ps.executeUpdate();
            System.out.println("Time has been set for " + username);
        } catch (SQLException e) {
            System.out.println("Time was NOT been set for " + username);
        }
    }

    public void testSQLScript() {
        String testScript = "";

        try {
            String username = "";
            String date = "";
            ps = con.prepareStatement(testScript);
            ps.setString(1, username);
            ps.setString(2, date);

            ps.executeUpdate();
            System.out.println("test script successed! ");
        } catch (SQLException e) {
            System.out.println("test script failed! ");
            System.out.println(e);
        }
    }


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.out.println("Attempting to close the application...");
        JOptionPane.showMessageDialog(null, "Thank you for using LATA! ");
        System.out.println("Application Closed.");
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
                setVisible(false);
            }
        });
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsernameActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(new Color(27, 255, 0));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(new Color(51, 204, 0));
    }//GEN-LAST:event_btnLoginMouseExited

    private void txtFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // pressing the Log in button upon clicking enter , Just for fun

        }
    }//GEN-LAST:event_txtFieldPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtFieldPassword;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
