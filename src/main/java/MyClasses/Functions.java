/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author xxx
 */
public class Functions {
    public void displayImage(int width,int height,String imagePath, JLabel label)
    {
        //get image
        //ImageIcon imgIco = new ImageIcon(getClass().getResource("/images/bookLoginLogo"));      
        ImageIcon imgIco = new ImageIcon(imagePath);
//        //make image fit in label
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

}

