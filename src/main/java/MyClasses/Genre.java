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
public class Genre {
    private int id;
    private String name;
   
    public Genre(){}
    
    public Genre(int id, String name){
        this.id=id;
        this.name=name;
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
    
    public void addGenre(String name){
        
        String insertQuery = "INSERT INTO `bookgenres` (`name`) VALUES (?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, name);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Genre Added","add genre",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Genre Not Added","add genre",2);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
       public void editGenre(int id,String name){
        
        String editQuery = "UPDATE `bookgenres` SET `name` = ? WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
              
            ps.setString(1, name);
            ps.setInt(2, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Genre Edited","edit genre",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre Not Edited","edit genre",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
       public void removeGenre(int id){
        
        String removeQuery = "DELETE FROM `bookgenres` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Genre Removed","remove genre",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre Not Removed","remove genre",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       
       // function to populate an arrayList with geners
       public ArrayList<Genre> genreList(){
           ArrayList<Genre> gList = new ArrayList<>();
           
           String selectQuery = "SELECT * FROM `bookgenres`";
           PreparedStatement ps;
           ResultSet rs;
           
        try {
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            Genre genre;
            
            while(rs.next()){
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                gList.add(genre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return gList;
       }
       
}
