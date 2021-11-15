package MyForms;

import MyClasses.Functions;
import MyClasses.Student;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class StudentsListForm extends javax.swing.JFrame {
            Functions f = new Functions();
            Student student = new Student();

    public StudentsListForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1,152,117));
        jPanel1.setBorder(panelHeaderBorder);
        
        Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0));
        jLabelImage.setBorder(JlabelImageBorder);
        
        f.displayImage(90, 60,null, "C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images\\members.png", jLabelFormTitle);
    
        f.customTable(jTableStudents);
        f.customTableHeader(jTableStudents, new Color(36,37,42), 16);
        
        f.displayImage(259, 159,null, "C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images\\blankProfilePicture.png", jLabelImage);

        populateJtableWithStudents("");
    
    }

     public void populateJtableWithStudents(String  query)
    {
        ArrayList<Student> students = student.studentsList(query);

        String[] colNames = {"ID","Name","Surname","Phone","Email","Gender"};
        
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
        jLabelPhone = new javax.swing.JLabel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 217));

        jLabelFormTitle.setBackground(new java.awt.Color(1, 152, 117));
        jLabelFormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormTitle.setText("Students List");
        jLabelFormTitle.setOpaque(true);

        jLabelClose.setBackground(new java.awt.Color(1, 152, 117));
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

        jLabelPhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(0, 51, 153));
        jLabelPhone.setText("Phone");

        jLabelFullName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(0, 51, 153));
        jLabelFullName.setText("Full Name");

        jLabelGender.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(0, 51, 153));
        jLabelGender.setText("Gender");

        jLabelEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 51, 153));
        jLabelEmail.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPhone)
                            .addComponent(jLabelFullName)
                            .addComponent(jLabelGender)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSerachValue, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSerachValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    jLabelFullName.setText(s.getName()+" "+s.getSurname());
                    jLabelPhone.setText(s.getPhoneNumber());
                    jLabelEmail.setText(s.getEmail());
                    jLabelGender.setText(s.getGender());
                    
                    byte[] image = s.getPicture();
                    f.displayImage(259, 159, image,"", jLabelImage);   
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No Student With This Id Is Found", "Invalid ID",3);
                    }
                   
                    
                } catch (SQLException ex) {
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
            java.util.logging.Logger.getLogger(StudentsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFormTitle;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    private javax.swing.JTextField jTextFieldSerachValue;
    // End of variables declaration//GEN-END:variables
}
