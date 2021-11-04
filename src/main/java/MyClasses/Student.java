/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xxx
 */
public class Student {
    private int id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String gender;
    private byte[] picture;
    
    public Student(){}
    
    public Student(int id, String name,String surname, String phoneNumber,String email, String gender,byte[] picture){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.gender=gender;
        this.picture=picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
    public void addAuthor(String name,String surname,String expertise, String about){
        
        String insertQuery = "INSERT INTO `authors` (`name`,`surname`,`expertise`,`about`) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Author Added","add author",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Author Not Added","add author",2);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
       public void editAuthor(int id,String name,String surname,String expertise, String about){
        
        String editQuery = "UPDATE `authors` SET `name` = ?,`surname`=?,`expertise`=?,`about`=? WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
              
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            ps.setInt(5, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Author Edited","edit author",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Author Not Edited","edit author",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
       public void removeAuthor(int id){
        
        String removeQuery = "DELETE FROM `authors` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Author Removed","remove author",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Author Not Removed","remove author",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       
       // function to populate an arrayList with geners
       public ArrayList<Author> authorsList(){
           ArrayList<Author> aList = new ArrayList<>();
           
           String selectQuery = "SELECT * FROM `authors`";
           PreparedStatement ps;
           ResultSet rs;
           
        try {
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            Author author;
            
            while(rs.next()){
                author = new Author(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("expertise"), rs.getString("about"));
                aList.add(author);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return aList;
       }
    
    
}
