package MyClasses;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Functions {
    public void displayImage(int width,int height,byte[] imagebyte,String imagePath, JLabel label)
    {
        ImageIcon imgIco;
        //get image
        if(imagebyte!=null){
            imgIco = new ImageIcon(imagebyte);
        }
        else{
            try{
    
                       // get img from  project resources
        
                       imgIco = new ImageIcon(getClass().getResource(imagePath));
            }
            catch(Exception e){
                //get image from deskop
                    imgIco = new ImageIcon(imagePath);
                    }
        }
//        
//make image fit in label
       Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
//        //set image in label
        label.setIcon(new ImageIcon(image));

    }
    public void customTable(JTable table){
        table.setSelectionBackground(new Color(249,105,14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(35);
        table.setShowGrid(false);
        table.setBackground(new Color(248,248,248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.orange);
    }
   
    public void customTableHeader(JTable table, Color backColor, Integer fontSize){
        table.getTableHeader().setBackground(backColor);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD,fontSize));
        table.getTableHeader().setOpaque(false);
    }
    
    public String selectImage(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File("C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image",".png",".jpg",".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        String path = "";
        if(fileState == JFileChooser.APPROVE_OPTION)
        {
            path = fileChooser.getSelectedFile().getAbsolutePath();
    }
        return path;
    }
    
    public ResultSet getData(String query)
    {
        PreparedStatement ps;
        ResultSet rs = null;
        
        try{
            ps=DB.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
        }
        catch(SQLException ex){
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE,null,ex);
        }
        return rs; 
    }
    
    public int countData(String tableName){
        int total = 0;
        ResultSet rs;
        Statement st;
        try{
        st = DB.getConnection().createStatement();
        rs = st.executeQuery("SELECT COUNT(*) FROM `"+tableName+"`");
        if(rs.next()){
            total = rs.getInt(1);
        }
        }
        catch(SQLException ex){
             Logger.getLogger(Functions.class.getName()).log(Level.SEVERE,null,ex);
        }
        return total;
    }

}

