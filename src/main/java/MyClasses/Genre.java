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
    
    public boolean addGenre(String name){
        
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
        
        return true;
    }
}
