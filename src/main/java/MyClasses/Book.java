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
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xxx
 */
public class Book {
 
    Functions f = new Functions();
    
    private Integer id;
    private String ISBN;
    private String name;
    private Integer authorId;
    private Integer genreId;
    private Integer quantity;
    private String publisher;
    private double price;
    private String dateReceived;
    private String description;
    private byte[] cover;
 
    
    public Book(){}

    public Book(Integer id, String ISBN, String name, Integer authorId, Integer genreId, Integer quantity, String publisher, double price, String dateReceived, String description, byte[] cover) {
        this.id=id;
        this.ISBN = ISBN;
        this.name = name;
        this.authorId = authorId;
        this.genreId = genreId;
        this.quantity = quantity;
        this.publisher = publisher;
        this.price = price;
        this.dateReceived = dateReceived;
        this.description = description;
        this.cover = cover;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }
    
    public void addBook(String ISBN, String name, Integer authorId, Integer genreId, Integer quantity, String publisher, double price, String dateRecived, String description, byte[] cover){
        
        String insertQuery = "INSERT INTO `books` (`isbn`,`name`,`authorid`,`genreid`,`quantity`,`publisher`,`price`,`datereceived`,`description`,`coverimage`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, ISBN);
            ps.setString(2, name);
            ps.setInt(3, authorId);
            ps.setInt(4, genreId);
            ps.setInt(5, quantity);
            ps.setString(6, publisher);
            ps.setDouble(7, price);
            ps.setString(8, dateRecived);
            ps.setString(9, description);
            ps.setBytes(10, cover);

            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Book Added","add book",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Book Not Added","add book",2);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void editBook(int id, String name, Integer authorId, Integer genreId, Integer quantity, String publisher, double price, String dateRecived, String description, byte[] cover){
        
        String editQuery;
        PreparedStatement ps;
        
                try {
        if(cover != null){
            editQuery = "UPDATE `books` SET `name` = ?,`authorid`=?,`genreid`=?,`quantity`=?,`publisher`=?,`price`=?,`datereceived`=?,`description`=?,`coverimage`=? WHERE `id` = ?";
            ps = DB.getConnection().prepareStatement(editQuery);   
            ps.setString(1, name);
            ps.setInt(2, authorId);
            ps.setInt(3, genreId);
            ps.setInt(4, quantity);
            ps.setString(5, publisher);
            ps.setDouble(6, price);
            ps.setString(7, dateRecived);
            ps.setString(8, description);
            ps.setBytes(9, cover);
            ps.setInt(10, id);
        }
        else{
            editQuery = "UPDATE `books` SET `name` = ?,`authorid`=?,`genreid`=?,`quantity`=?,`publisher`=?,`price`=?,`datereceived`=?,`description`=? WHERE `id` = ?";
            ps = DB.getConnection().prepareStatement(editQuery);   
            ps.setString(1, name);
            ps.setInt(2, authorId);
            ps.setInt(3, genreId);
            ps.setInt(4, quantity);
            ps.setString(5, publisher);
            ps.setDouble(6, price);
            ps.setString(7, dateRecived);
            ps.setString(8, description);
            ps.setInt(9, id);
        }
        

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Book Edited","edit book",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Book Not Edited","edit book",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void removeBook(int id){
        
        String removeQuery = "DELETE FROM `students` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Book Removed","remove book",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Book Not Removed","remove book",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       public Book searchBookByIdorISBN(int id, String isbn) throws SQLException{
           String query="SELECT * FROM `books` WHERE `id`="+id+" or `isbn` = '"+isbn+"'";
  
           ResultSet rs = f.getData(query);
           Book book = null;
           try{
           if(rs.next()){
               book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getDouble(8),rs.getString(9),rs.getString(10),rs.getBytes(11));
           }
           else{
               return book;
           }
           }
           catch(SQLException ex){
               
           }
           return book;
       }
       
       public ArrayList<Book> booksList(String query){
           ArrayList<Book> bList = new ArrayList<>();
           
           PreparedStatement ps;
           ResultSet rs;
           
        try {
            if(query.equals("")){
            query = "SELECT * FROM `books`";
        }
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            Student student;
            
            while(rs.next()){
//                book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getBytes(6));
//                bList.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return bList;
       }
    
       public boolean isISBNexists(String isbn){
           String query = "SELECT * FROM `books` WHERE `isbn` = '"+isbn+"'";
           ResultSet rs = f.getData(query);
           try{
           if(rs.next()){
               return true;
           }
           else{
               return false;
           }
           }
           catch(SQLException ex){
               Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
           }
           return true;
       }
       
}
