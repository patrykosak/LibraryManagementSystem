/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xxx
 */
public class User {
    private int id;
    private String firstname;
    private String surname;
    private String username;
    private String password;
    private String userType;
    
    public User() {
    }

    public User(int id, String firstname, String surname, String username, String password, String userType) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 public void addUser(String firstname,String surname,String username, String password, String userType){
        
        String insertQuery = "INSERT INTO `userstable` (`firstname`,`surname`,`username`,`password`,`usertype`) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, firstname);
            ps.setString(2, surname);
            ps.setString(3, username);
            ps.setString(4, password);
            ps.setString(5, userType);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "User Added","add user",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "User Not Added","add user",2);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
