/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyForms;

import MyClasses.Author;
import MyClasses.Functions;
import MyClasses.Genre;
import MyClasses.User;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xxx
 */
public class ManageUsersForm extends javax.swing.JFrame {
            Functions f = new Functions();
            Author author = new Author();
            User user = new User();
    /**
     * Creates new form ManageGenresForm
     */
    public ManageUsersForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    
        // add gray border 
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(242,217,132));
        jPanel1.setBorder(panelHeaderBorder);
    
        f.displayImage(75, 60,null,"C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images\\users.png", jLabelFormTitle);

//        jTableAuthors.setSelectionBackground(new Color(249,105,14));
//        jTableAuthors.setSelectionForeground(Color.white);
//        jTableAuthors.setRowHeight(35);
//        jTableAuthors.setShowGrid(false);
//        jTableAuthors.setBackground(new Color(248,248,248));
//        jTableAuthors.setShowHorizontalLines(true);
//        jTableAuthors.setGridColor(Color.orange);
        f.customTable(jTableUsers);
//        jTableAuthors.getTableHeader().setBackground(new Color(34,167,240));
//        jTableAuthors.getTableHeader().setForeground(Color.white);
//        jTableAuthors.getTableHeader().setFont(new Font("Verdana", Font.BOLD,16));
//        jTableAuthors.getTableHeader().setOpaque(false);
        f.customTableHeader(jTableUsers, new Color(34,167,240), 15);
        // hiding jlabel empty message
        jLabelEmptyName.setForeground(Color.white);
        jLabelEmptySurname.setForeground(Color.white);
        jLabelEmptyUsername.setForeground(Color.white);
        jLabelEmptyPassword.setForeground(Color.white);
        populateJtableWithUsers();
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
        jLabelFormTitle = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        jLabelEmptyName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelEmptySurname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelEmptyUsername = new javax.swing.JLabel();
        jLabelEmptyPassword = new javax.swing.JLabel();
        jCheckBoxSetAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelFormTitle.setBackground(new java.awt.Color(242, 217, 132));
        jLabelFormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFormTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormTitle.setText("Manage Users");
        jLabelFormTitle.setOpaque(true);

        jLabelClose.setBackground(new java.awt.Color(242, 217, 132));
        jLabelClose.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(51, 51, 51));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.setOpaque(true);
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        jTextFieldName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextFieldID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextFieldID.setEnabled(false);

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableUsers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsers);

        jLabelEmptyName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmptyName.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmptyName.setText("* enter the name");
        jLabelEmptyName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmptyNameMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Surname:");

        jTextFieldSurname.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabelEmptySurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmptySurname.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmptySurname.setText("* enter the surname");
        jLabelEmptySurname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmptySurnameMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Username:");

        jTextFieldUsername.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Retype Password:");

        jPasswordField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabelEmptyUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmptyUsername.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmptyUsername.setText("* enter the username");
        jLabelEmptyUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmptyUsernameMouseClicked(evt);
            }
        });

        jLabelEmptyPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmptyPassword.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmptyPassword.setText("* enter the password");
        jLabelEmptyPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmptyPasswordMouseClicked(evt);
            }
        });

        jCheckBoxSetAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxSetAdmin.setText("Make This User an Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName)
                    .addComponent(jTextFieldSurname)
                    .addComponent(jTextFieldUsername)
                    .addComponent(jPasswordField1)
                    .addComponent(jPasswordField2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelEmptyName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmptySurname, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabelEmptyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabelEmptyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jCheckBoxSetAdmin))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmptyName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmptySurname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmptyUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmptyPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxSetAdmin)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEmptyNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmptyNameMouseClicked

        jLabelEmptyName.setForeground(Color.white);
    }//GEN-LAST:event_jLabelEmptyNameMouseClicked

    private void jTableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersMouseClicked

        //get selected row index
        int index = jTableUsers.getSelectedRow();
        String id = jTableUsers.getValueAt(index, 0).toString();
        String name = jTableUsers.getValueAt(index, 1).toString();
        String surname = jTableUsers.getValueAt(index, 2).toString();
        String username = jTableUsers.getValueAt(index, 3).toString();
        String password = jTableUsers.getValueAt(index, 4).toString();
        String userType = jTableUsers.getValueAt(index, 5).toString();
        
        
        
        jTextFieldID.setText(id);
        jTextFieldName.setText(name);
        jTextFieldSurname.setText(surname);
        jTextFieldUsername.setText(username);
        jPasswordField1.setText(password);
        jPasswordField2.setText(password);
        
        if(userType.equals("admin")){
            jCheckBoxSetAdmin.setSelected(true);
        }
        else{
            jCheckBoxSetAdmin.setSelected(false);
        }
        
    }//GEN-LAST:event_jTableUsersMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try{
            int id = Integer.parseInt(jTextFieldID.getText());
          int confirm = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Delete This User?","Confirmation Box",JOptionPane.YES_NO_OPTION);
          if(confirm==JOptionPane.YES_OPTION){
            user.removeUser(id);
            populateJtableWithUsers();
          }
          
            jTextFieldID.setText("");
            jTextFieldName.setText("");
            jTextFieldSurname.setText("");
            jTextFieldUsername.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jCheckBoxSetAdmin.setSelected(false);
            hideLabels();
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Invalid User ID - " + ex.getMessage(),"error",0);
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String name = jTextFieldName.getText();
        String surname = jTextFieldSurname.getText();
        String username = jTextFieldUsername.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        String confirmPassword = String.valueOf(jPasswordField2.getPassword());
        String userType = "user";
        int id = 0;
        if(!jTextFieldID.getText().isEmpty()){
            id = Integer.parseInt(jTextFieldID.getText());
        }
        if(jCheckBoxSetAdmin.isSelected()){
            userType = "admin";
        }
        if(name.trim().isEmpty()){
            jLabelEmptyName.setForeground(Color.red);
        }
        else if(surname.trim().isEmpty()){
            jLabelEmptySurname.setForeground(Color.red);
        }
        else if(username.trim().isEmpty()){
            jLabelEmptyUsername.setForeground(Color.red);
        }
        else if(password.trim().isEmpty()){
            jLabelEmptyPassword.setForeground(Color.red);
        }
        else if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(null, "Retype The Correct Password","Password Error",0);
        }
        else try {
            if(user.checkUsernameExists(id, username)){
                JOptionPane.showMessageDialog(null, "This Username Already Exists Try Another One","Username Error",0);
            }
            else{
                
                user.addUser(name, surname, username, password, userType);
                
                populateJtableWithUsers();
                jTextFieldID.setText("");
                jTextFieldName.setText("");
                jTextFieldSurname.setText("");
                jTextFieldUsername.setText("");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
                jCheckBoxSetAdmin.setSelected(false);
                hideLabels();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageUsersForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    public void hideLabels(){
        jLabelEmptyName.setForeground(Color.white);
        jLabelEmptySurname.setForeground(Color.white);
        jLabelEmptyUsername.setForeground(Color.white);
        jLabelEmptyPassword.setForeground(Color.white);
    }
    
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed

      try {
                    String name = jTextFieldName.getText();
                    String surname = jTextFieldSurname.getText();
                    String username = jTextFieldUsername.getText();
                    String password = String.valueOf(jPasswordField1.getPassword());
                    String confirmPassword = String.valueOf(jPasswordField2.getPassword());
                    String userType = "user";
                    
                    if(jCheckBoxSetAdmin.isSelected()){
                        userType = "admin";
                    }
                    
                    if(name.trim().isEmpty()){
                        jLabelEmptyName.setForeground(Color.red);
                    }
                    else if(surname.trim().isEmpty()){
                        jLabelEmptySurname.setForeground(Color.red);
                    }
                    else if(username.trim().isEmpty()){
                        jLabelEmptyUsername.setForeground(Color.red);
                    }
                    else if(password.trim().isEmpty()){
                        jLabelEmptyPassword.setForeground(Color.red);
                    }
                    else if(!password.equals(confirmPassword)){
                        JOptionPane.showMessageDialog(null, "Retype The Correct Password","Password Error",0);
                    }
                    else{
                        try{
                        int id = Integer.parseInt(jTextFieldID.getText());
                         if(user.checkUsernameExists(id, username)){
                        JOptionPane.showMessageDialog(null, "This Username Already Exists Try Another One","Username Error",0);
                    }
                         else{
                         user.editUser(id, name, surname, username, password, userType);
                         populateJtableWithUsers();
                         jTextFieldID.setText("");
            jTextFieldName.setText("");
            jTextFieldSurname.setText("");
            jTextFieldUsername.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jCheckBoxSetAdmin.setSelected(false);
            hideLabels();
                         }
                         }
                                            catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Select The User You Want To Edit From The Table","No ID Selected",0);
                    }  
                      
                        }
   
    }//GEN-LAST:event_jButtonEditActionPerformed
      catch (SQLException ex) {
                    Logger.getLogger(ManageUsersForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
      
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelEmptySurnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmptySurnameMouseClicked
        jLabelEmptySurname.setForeground(Color.white);
    }//GEN-LAST:event_jLabelEmptySurnameMouseClicked

    private void jLabelEmptyUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmptyUsernameMouseClicked
        jLabelEmptyUsername.setForeground(Color.white);
    }//GEN-LAST:event_jLabelEmptyUsernameMouseClicked

    private void jLabelEmptyPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmptyPasswordMouseClicked
        jLabelEmptyPassword.setForeground(Color.white);
    }//GEN-LAST:event_jLabelEmptyPasswordMouseClicked

    
    //function to populate jtable with genres
    public void populateJtableWithUsers()
    {
        ArrayList<User> users = user.usersList();
        
        //jtable columns
        String[] colNames = {"ID","NAME","SURNAME","U-NAME","PASS","TYPE"};
        
        //rows
        Object[][] rows = new Object[users.size()][colNames.length];
        
        for(int i = 0; i < users.size(); i++){
            rows[i][0] = users.get(i).getId();
            rows[i][1] = users.get(i).getFirstname();
            rows[i][2] = users.get(i).getSurname();
            rows[i][3] = users.get(i).getUsername();
            rows[i][4] = users.get(i).getPassword();
            rows[i][5] = users.get(i).getUserType();
        }
        
        DefaultTableModel model  = new DefaultTableModel(rows, colNames);
        jTableUsers.setModel(model);
    }
    
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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JCheckBox jCheckBoxSetAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelEmptyName;
    private javax.swing.JLabel jLabelEmptyPassword;
    private javax.swing.JLabel jLabelEmptySurname;
    private javax.swing.JLabel jLabelEmptyUsername;
    private javax.swing.JLabel jLabelFormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
