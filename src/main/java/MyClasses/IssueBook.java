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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xxx
 */
public class IssueBook {
    
    Book book = new Book();
    
    private int id;
    private int bookId;
    private int studentId;
    private String status;
    private String issueDate;
    private String returnDate;
    private String note;

    public IssueBook(){}
    
    public IssueBook(int id, int bookId, int studentId, String status, String issueDate, String returnDate, String note){
        this.id=id;
        this.bookId=bookId;
        this.studentId=studentId;
        this.status=status;
        this.issueDate=issueDate;
        this.returnDate=returnDate;
        this.note=note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
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
    
     public void updateIssue(int bookId, int studentId, String status,String issueDate, String returnDate, String note){
        
         String updateQuery = "UPDATE `issuebooks` SET `status`= ?, `issuedate`= ?, `returndate`= ?,`note`=? WHERE `bookid`=? AND `studentid`=?";
      try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);

            ps.setString(1, status);
            ps.setString(2, issueDate);
            ps.setString(3, returnDate);
            ps.setString(4, note);
            ps.setInt(5, bookId);
            ps.setInt(6, studentId);

            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Status Updated","Book Issue",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Status Not Updated","Book Issue",2);
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

     public ArrayList<IssueBook> issuedBooksList(String status){
           ArrayList<IssueBook> ibList = new ArrayList<>();
           String query;
           
           if(status.equals("")){
               query = "SELECT * FROM `issuebooks`";
           }
           else{
               query = "SELECT * FROM `issuebooks` WHERE `status` = '"+ status + "'";
           }
           
          
           
           PreparedStatement ps;
           ResultSet rs;
           
        try {

            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            IssueBook ibook;
            
            while(rs.next()){
                ibook = new IssueBook(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ibList.add(ibook);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return ibList;
       }
    
     
        public void removeIssueBook(int bookId, int studentId, String issueDate){
        
        String removeQuery = "DELETE FROM `issuebooks` WHERE `bookid`=? AND `studentid`=? AND `issuedate`=?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, bookId);
            ps.setInt(2, studentId);
            ps.setString(3, issueDate);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Deleted Succesfully","Remove",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Deleted Not Succesfully","Remove",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
     
}
