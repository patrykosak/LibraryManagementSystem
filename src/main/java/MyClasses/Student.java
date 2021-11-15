package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    
    public void addStudent(int id,String name,String surname,String phoneNumber, String email,String gender,byte[] picture){
        
        String insertQuery = "INSERT INTO `students` (`id`,`name`,`surname`,`phonenumber`,`email`,`picture`,`gender`) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, surname);
            ps.setString(4, phoneNumber);
            ps.setString(5, email);
            ps.setBytes(6, picture);
            ps.setString(7, gender);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Student Added","add student",1);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Student Not Added","add student",2);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void editStudent(int id,String name,String surname,String phoneNumber, String email,String gender,byte[] picture){
        
        String editQuery = "UPDATE `students` SET `name` = ?,`surname`=?,`phonenumber`=?,`email`=?,`picture`=?,`gender`=? WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
              
            
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, phoneNumber);
            ps.setString(4, email);
            ps.setBytes(5, picture);
            ps.setString(6, gender);
            ps.setInt(7, id);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Student Edited","edit student",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Student Not Edited","edit student",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void removeStudent(int id){
        
        String removeQuery = "DELETE FROM `students` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Student Removed","remove student",1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Student Not Removed","remove student",2);
                  }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       public Student getStudentById(int id) throws SQLException{
           Functions f = new Functions();
           String query="SELECT * FROM `students` WHERE `id`="+id;
           ResultSet rs = f.getData(query);
           if(rs.next()){
               return new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getBytes(6));
           }
           else{
               return null;
           }
       }
       
       public ArrayList<Student> studentsList(String query){
           ArrayList<Student> sList = new ArrayList<>();
           
           PreparedStatement ps;
           ResultSet rs;
           
        try {
            if(query.equals("")){
            query = "SELECT * FROM `students`";
        }
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            Student student;
            
            while(rs.next()){
                student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getBytes(6));
                sList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return sList;
       }
}
