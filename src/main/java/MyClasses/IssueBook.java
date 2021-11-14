/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xxx
 */
public class IssueBook {
    
    Book book = new Book();
    
    private int bookId;
    private int studentId;
    private String status;
    private String issueDate;
    private String returnDate;
    private String note;
    
    public void addIssue(int bookId, int studentId, String status, String issueDate, String returnDate, String note){
        String insertQuery = "INSERT INTO `issuebooks` (`bookid`,`studentid`,`status`,`issuedate`,`returndate`,`note`) VALUES (?,?,?,?,?,?)";
      try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
           ps.setInt(1, bookId);
            ps.setInt(2, studentId);
            ps.setString(3, status);
            ps.setString(4, issueDate);
            ps.setString(5, returnDate);
            ps.setString(6, note);


            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Issue Added","add issue",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Issue Not Added","add issue",2);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean checkBookAvailability(int bookId){
        boolean availability = false;
        try {
            Book selectedBook = book.getBookById(bookId);
            int quantity = selectedBook.getQuantity();
            
            int issuedBook = countData(bookId);
            if(quantity>issuedBook){
                availability = true;
            }
            else{
                availability = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return availability;
    }
    
     public int countData(int bookId){
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try{
        ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `issuebooks` WHERE bookid = ? and `status` = 'issued'");

        ps.setInt(1, bookId);
        
        rs = ps.executeQuery();
        if(rs.next()){
            total = rs.getInt("total");
        }
        }
        catch(SQLException ex){
             Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE,null,ex);
        }
        return total;
    }

    
}
