/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
}
