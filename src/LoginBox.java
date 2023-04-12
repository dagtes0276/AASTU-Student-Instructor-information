import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LoginBox extends javax.swing.JFrame {

    /**
     * Creates new form LoginBox
     */
    public LoginBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bl_U2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Option = new javax.swing.JComboBox<>();
        bl_U3 = new javax.swing.JLabel();
        jcreate_new_account = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setBackground(new java.awt.Color(0, 153, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel5.setText("Addis Ababa Science and Technology University");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.setAlignmentX(0.5F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("Student Instructor  information System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Password");

        bl_U2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bl_U2.setForeground(new java.awt.Color(255, 0, 51));
        bl_U2.setText("* please enter password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Choose");

        Option.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student", "Instructor" }));
        Option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionActionPerformed(evt);
            }
        });

        bl_U3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bl_U3.setForeground(new java.awt.Color(255, 0, 51));
        bl_U3.setText("* please enter password");

        jcreate_new_account.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jcreate_new_account.setForeground(new java.awt.Color(255, 0, 0));
        jcreate_new_account.setText("About Us");
        jcreate_new_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcreate_new_accountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(bl_U3)
                                                    .addGap(1, 1, 1))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(29, 29, 29)
                                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(bl_U2))
                                                .addComponent(jButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(44, 44, 44)
                                                .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(83, 83, 83)
                                .addComponent(jLabel6)))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcreate_new_account, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel7)
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bl_U3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(bl_U2))
                        .addGap(66, 66, 66)
                        .addComponent(jButton1)))
                .addGap(33, 33, 33)
                .addComponent(jcreate_new_account)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String choose = (Option.getSelectedItem().toString());
        String UserName= txtUser.getText();
        String PassWord= txtPass.getText();
        
       if(choose=="Instructor"){
        
        if(UserName.equals("")&&PassWord.equals("")){JOptionPane.showMessageDialog(this, "Please,inset user name and password");}
        if(!(UserName.equals(""))&&PassWord.equals("")){JOptionPane.showMessageDialog(this, "Please,inset password");}
        if(UserName.equals("")&&!(PassWord.equals(""))){JOptionPane.showMessageDialog(this, "Please,inset username");}
        if(!(UserName.equals(""))&&!(PassWord.equals(""))){
        try{
        
            
            Class.forName("com.mysql.jdbc.Driver");
    
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost/instructorauthentication","root", "");
    PreparedStatement stm=null;            
            
            
            stm = con.prepareStatement("SELECT * FROM instructorauthentication  WHERE password= ? AND username= ?");
                    stm.setString(1,PassWord);
                    stm.setString(2,UserName);

                    ResultSet rs = stm.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully!");
                        Instructor_Dashboard inst1 = new Instructor_Dashboard();
                        inst1.setVisible(true);
                        this.dispose();

                        inst1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter Correct Username or Password !");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginBox.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
       
        }
        
        if(choose=="Admin"){
        
        if(UserName.equals("")&&PassWord.equals("")){JOptionPane.showMessageDialog(this, "Please,inset user name and password");}
        if(!(UserName.equals(""))&&PassWord.equals("")){JOptionPane.showMessageDialog(this, "Please,inset password");}
        if(UserName.equals("")&&!(PassWord.equals(""))){JOptionPane.showMessageDialog(this, "Please,inset username");}
        if(!(UserName.equals(""))&&!(PassWord.equals(""))){
        try{
        
            
            Class.forName("com.mysql.jdbc.Driver");
    
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost/adminauthentication","root", "");
    PreparedStatement stm=null;            
            
            
            stm = con.prepareStatement("SELECT * FROM adminauthentication WHERE password= ? AND username= ?");
                    stm.setString(1,PassWord);
                    stm.setString(2,UserName);

                    ResultSet rs = stm.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully!");
                        Admin_Dashboard admi = new Admin_Dashboard();
                        admi.setVisible(true);
                        this.dispose();

                        admi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter Correct Username or Password !");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginBox.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
       
        }
        
        
        
        if(choose=="Student"){
        
        if(UserName.equals("")&&PassWord.equals("")){JOptionPane.showMessageDialog(this, "Please,inset user name and password");}
        if(!(UserName.equals(""))&&PassWord.equals("")){JOptionPane.showMessageDialog(this, "Please,inset password");}
        if(UserName.equals("")&&!(PassWord.equals(""))){JOptionPane.showMessageDialog(this, "Please,inset username");}
        if(!(UserName.equals(""))&&!(PassWord.equals(""))){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
    
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost/studentauthentication","root", "");
    PreparedStatement stm=null;            
            
            
            stm = con.prepareStatement("SELECT * FROM studentauthentication WHERE Username = ? AND Password = ?");
                    stm.setString(1,UserName);
                    stm.setString(2,PassWord);

                    ResultSet rs = stm.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully!");
                        Student_Dashboard stu1 = new Student_Dashboard();
                        stu1.show();
                        this.dispose();

                      
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter Correct Username or Password !");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginBox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionActionPerformed

    private void jcreate_new_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcreate_new_accountActionPerformed
        AboutGroupMembers lgf = new AboutGroupMembers();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jcreate_new_accountActionPerformed

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
            java.util.logging.Logger.getLogger(LoginBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Option;
    private javax.swing.JLabel bl_U2;
    private javax.swing.JLabel bl_U3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jcreate_new_account;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
