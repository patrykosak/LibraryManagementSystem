/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyForms;

import MyClasses.Author;
import MyClasses.Functions;
import MyClasses.Genre;
import MyClasses.Student;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xxx
 */
public class BooksListForm extends javax.swing.JFrame {
            Functions f = new Functions();
            Student student = new Student();
            String imagePath=null;
            /**
     * Creates new form ManageGenresForm
     */
    public BooksListForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    
        // add gray border 
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211,84,0));
        jPanel1.setBorder(panelHeaderBorder);
        
        Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0));
        jLabelImage.setBorder(JlabelImageBorder);
        
        f.displayImage(90, 60,null, "C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images\\book.png", jLabelFormTitle);

    
        f.customTable(jTableStudents);
        f.customTableHeader(jTableStudents, new Color(36,37,42), 16);
        
        f.displayImage(125, 80,null, "C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images\\blankProfilePicture.png", jLabelImage);


        
        populateJtableWithStudents("");


        //f.customTable(jTableAuthors);
        //f.customTableHeader(jTableAuthors, new Color(34,167,240), 16);
        // hiding jlabel empty message
        
    }

     public void populateJtableWithStudents(String  query)
    {
        ArrayList<Student> students = student.studentsList(query);
        
        //jtable columns
        String[] colNames = {"ID","Name","Surname","Phone","Email","Gender"};
        
        //rows
        Object[][] rows = new Object[students.size()][colNames.length];
        
        for(int i = 0; i < students.size(); i++){
            rows[i][0] = students.get(i).getId();
            rows[i][1] = students.get(i).getName();
            rows[i][2] = students.get(i).getSurname();
            rows[i][3] = students.get(i).getPhoneNumber();
            rows[i][4] = students.get(i).getEmail();
            rows[i][5] = students.get(i).getGender();
        }
        
        DefaultTableModel model  = new DefaultTableModel(rows, colNames);
        jTableStudents.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFormTitle = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSerachValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelISBN = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelPublisher = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 217));

        jLabelFormTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabelFormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormTitle.setText("Books List");
        jLabelFormTitle.setOpaque(true);

        jLabelClose.setBackground(new java.awt.Color(211, 84, 0));
        jLabelClose.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.setOpaque(true);
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Value to Search:");

        jTextFieldSerachValue.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStudents);

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSearch.setText("search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelImage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImage.setOpaque(true);

        jLabelName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 51, 153));
        jLabelName.setText("Name");

        jLabelISBN.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelISBN.setForeground(new java.awt.Color(0, 51, 153));
        jLabelISBN.setText("ISBN");

        jLabelGenre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelGenre.setForeground(new java.awt.Color(0, 51, 153));
        jLabelGenre.setText("Genre");

        jLabelAuthor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelAuthor.setForeground(new java.awt.Color(0, 51, 153));
        jLabelAuthor.setText("Author");

        jLabelPublisher.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelPublisher.setForeground(new java.awt.Color(0, 51, 153));
        jLabelPublisher.setText("Publisher");

        jLabelPrice.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(0, 51, 153));
        jLabelPrice.setText("Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerachValue, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 364, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelName)
                                    .addComponent(jLabelISBN)
                                    .addComponent(jLabelGenre)
                                    .addComponent(jLabelAuthor)
                                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrice)
                                    .addComponent(jLabelPublisher))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSerachValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String searchValue = jTextFieldSerachValue.getText();
        String query = "SELECT * FROM `students` WHERE `name` LIKE'%"+searchValue+"%' or `surname` LIKE'%"+searchValue+"%'";
        populateJtableWithStudents(query);

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentsMouseClicked
       
        try {
                    int rowIndex = jTableStudents.getSelectedRow();
                    int id = Integer.parseInt(jTableStudents.getModel().getValueAt(rowIndex, 0).toString());
                    Student s = student.getStudentById(id);
                    
                    if(s!=null){
                    jLabelISBN.setText(s.getName()+" "+s.getSurname());
                    jLabelName.setText(s.getPhoneNumber());
                    jLabelAuthor.setText(s.getEmail());
                    jLabelGenre.setText(s.getGender());
                    
                    byte[] image = s.getPicture();
                    f.displayImage(125, 80, image,"", jLabelImage);   
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No Student With This Id Is Found", "Invalid ID",3);
                    }
                   
                    
                } catch (SQLException ex) {
                    //Logger.getLogger(EditStudentForm.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Enter a Vaild Student Id", "Invalid ID",3);
                }
        
    }//GEN-LAST:event_jTableStudentsMouseClicked

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BooksListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFormTitle;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelPublisher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    private javax.swing.JTextField jTextFieldSerachValue;
    // End of variables declaration//GEN-END:variables
}