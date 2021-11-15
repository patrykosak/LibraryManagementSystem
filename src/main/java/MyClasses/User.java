package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class User {
    Functions f = new Functions();
    
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
 
        public void editUser(int id,String name,String surname,String username, String password, String userType){
        
        String editQuery = "UPDATE `userstable` SET `firstname` = ?,`surname`=?,`username`=?,`password`=?,`usertype`=? WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
              
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, username);
            ps.setString(4, password);
            ps.setString(5, userType);
            ps.setInt(6, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "User Edited","Edit User",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "User Not Edited","Edit User",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
        
        public void removeUser(int id){
        
        String removeQuery = "DELETE FROM `userstable` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "User Removed","Remove User",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "User Not Removed","Remove User",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
 
  public ArrayList<User> usersList(){
           ArrayList<User> uList = new ArrayList<>();
           
           String selectQuery = "SELECT * FROM `userstable` where usertype <> 'owner'";
           PreparedStatement ps;
           ResultSet rs;
           
        try {
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            User user;
            
            while(rs.next()){
                user = new User(rs.getInt("id"), rs.getString("firstname"), rs.getString("surname"), rs.getString("username"), rs.getString("password"), rs.getString("usertype"));
                uList.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return uList;
       }
 
 public boolean checkUsernameExists(int id, String username) throws SQLException{
           String selectQuery = "SELECT * FROM `userstable` where username = '"+username+"' and id<> "+id;
           PreparedStatement ps;
           ResultSet rs;
           boolean exists = false;
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
           try {
            if(rs.next())
                exists = true;
        }
            catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       return exists;
}
 
 public User tryLogin(String username, String password){
     

           ResultSet rs = f.getData("SELECT * FROM `userstable` where username = '"+username+"' and password = '"+password+"'");
           User user = null;

           try {
            if(rs.next())
                user = new User(rs.getInt("id"), rs.getString("firstname"), rs.getString("surname"), rs.getString("username"), rs.getString("password"), rs.getString("usertype"));
        }
            catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       return user;
 }
 
}
