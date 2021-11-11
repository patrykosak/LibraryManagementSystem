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
public class Author {
    
    private int id;
    private String name;
    private String surname;
    private String fieldOfExpertise;
    private String about;
    
    public Author(){}
    
    public Author(int id, String name,String surname,String fieldOfExpertise, String about){
    
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.fieldOfExpertise=fieldOfExpertise;
        this.about=about;
        
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

    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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
    
       public Author getAuthorById(Integer id) throws SQLException{
           String selectQuery = "SELECT * FROM `authors` where id = "+id;
           PreparedStatement ps;
           ResultSet rs;
           Author author = null;
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
           try {
            if(rs.next())
                author = new Author(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("expertise"), rs.getString("about"));
        }
            catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
       return author;
}
}