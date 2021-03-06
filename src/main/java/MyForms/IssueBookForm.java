package MyForms;

import MyClasses.Book;
import MyClasses.Functions;
import MyClasses.Genre;
import MyClasses.IssueBook;
import MyClasses.Student;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class IssueBookForm extends javax.swing.JFrame {
            Functions f = new Functions();
            Book book = new Book();
            Student student = new Student();
            IssueBook issueBook = new IssueBook();
            boolean bookExist = false;
            boolean studentExist = false;

    public IssueBookForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(108,122,137));
        jPanel1.setBorder(panelHeaderBorder);

        f.displayImage(90, 60,null, "C:\\Users\\xxx\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\src\\main\\java\\images\\organizer.png", jLabelFormTitle);

        setBordetToJlable(jLabelBookName, Color.white);
        setBordetToJlable(jLabelStudentFullName, Color.white);

    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFormTitle = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonIssue = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonSearchBook = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDateChooserIssueDate = new com.toedter.calendar.JDateChooser();
        jLabelBookName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSearchStudent = new javax.swing.JButton();
        jLabelStudentFullName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelAvailable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooserReturnDate = new com.toedter.calendar.JDateChooser();
        jSpinnerBookId = new javax.swing.JSpinner();
        jSpinnerStudentId = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNote = new javax.swing.JTextArea();

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Return Date:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 217));

        jLabelFormTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabelFormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormTitle.setText("Issue Book");
        jLabelFormTitle.setOpaque(true);

        jLabelClose.setBackground(new java.awt.Color(108, 122, 137));
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
        jLabel1.setText("Enter Book ID:");

        jButtonIssue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonIssue.setText("Issue Book");
        jButtonIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIssueActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSearchBook.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSearchBook.setText("search book");
        jButtonSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchBookActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Issue Date:");

        jDateChooserIssueDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelBookName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelBookName.setForeground(new java.awt.Color(51, 102, 255));
        jLabelBookName.setText("Book Name");
        jLabelBookName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBookName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBookNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBookNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBookNameMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Is This Book Available:");

        jButtonSearchStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSearchStudent.setText("search student");
        jButtonSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchStudentActionPerformed(evt);
            }
        });

        jLabelStudentFullName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelStudentFullName.setForeground(new java.awt.Color(51, 102, 255));
        jLabelStudentFullName.setText("Student Full-Name");
        jLabelStudentFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelStudentFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStudentFullNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelStudentFullNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelStudentFullNameMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Enter Student ID:");

        jLabelAvailable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelAvailable.setForeground(new java.awt.Color(51, 102, 255));
        jLabelAvailable.setText("YES-or-NO");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Return Date:");

        jDateChooserReturnDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSpinnerBookId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSpinnerStudentId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setText("Note:");

        jTextAreaNote.setColumns(20);
        jTextAreaNote.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNote);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAvailable))
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jDateChooserIssueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jDateChooserReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBookName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinnerBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelStudentFullName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinnerStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIssue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSearchBook, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBookName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchStudent)
                    .addComponent(jSpinnerStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStudentFullName)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jDateChooserIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jDateChooserReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchBookActionPerformed
        int bookId = (int)jSpinnerBookId.getValue();
                try {
                    Book selectedBook = book.getBookById(bookId);
                    if(selectedBook!=null){
                    jLabelBookName.setText(selectedBook.getName());
                    bookExist=true;
                    if(issueBook.checkBookAvailability(bookId)){
                        jLabelAvailable.setText("YES");
                        jLabelAvailable.setForeground(Color.green);
                    }
                    else{
                        jLabelAvailable.setText("NO");
                        jLabelAvailable.setForeground(Color.red);
                    }
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "This Book Doesn't exist","Book Not Found",2);
                    jLabelBookName.setText("Book Name");
                    bookExist=false;
                    jLabelAvailable.setText("YES-or-NO");
                    jLabelAvailable.setForeground(new Color(51,102,255));
                    }
                    } catch (SQLException ex) {
                    Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
                }

    }//GEN-LAST:event_jButtonSearchBookActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIssueActionPerformed
        int bookId = (int)jSpinnerBookId.getValue();
        int studentId = (int)jSpinnerStudentId.getValue();
        String note = jTextAreaNote.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
        String issueDate = dateFormat.format(jDateChooserIssueDate.getDate());
        String returnDate = dateFormat.format(jDateChooserReturnDate.getDate());
        
        Date issDate = dateFormat.parse(issueDate);
        Date retDate = dateFormat.parse(returnDate);
        
        if(!bookExist){
            JOptionPane.showMessageDialog(null, "You Need To Check If This Book Exist First By Clicking The Search Book Button","Check If The Book Exists",2);
        }
        else if(!studentExist){
            JOptionPane.showMessageDialog(null, "You Need To Check If This Student Exist First By Clicking The Search Student Button","Check If The Student Exists",2);
        }
        
        else if(!issueBook.checkBookAvailability(bookId)){
            JOptionPane.showMessageDialog(null, "This Book Is Not Available Right Now","Book Not Available",2);
        }
        
        else if(retDate.before(issDate)){
            JOptionPane.showMessageDialog(null, "The Return Date Must Be After The Issue Date","Wrong Return Date",2);
        }
        else{
                 issueBook.addIssue(bookId, studentId, "issued", issueDate, returnDate,note);   
                 jSpinnerBookId.setValue(0);
                 jSpinnerStudentId.setValue(0);
                 jLabelAvailable.setText("YES-or-NO");
                 jLabelAvailable.setForeground(new Color(51,102,255));
                 jLabelBookName.setText("Book Name");
                 jLabelStudentFullName.setText("Student Full-Name");
                 jDateChooserIssueDate.setDate(new Date());
                 jDateChooserReturnDate.setDate(new Date());
                 bookExist = false;
                 studentExist = false;
        }
        }
        catch (HeadlessException| NullPointerException | ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Select Issue And Return Date","Select Date",2);
                }
    }//GEN-LAST:event_jButtonIssueActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchStudentActionPerformed
        int studentId = (int)jSpinnerStudentId.getValue();
                try {
                    Student selectedStudent = student.getStudentById(studentId);
                    if(selectedStudent!=null){
                    jLabelStudentFullName.setText(selectedStudent.getName()+" "+selectedStudent.getSurname());
                    studentExist=true;
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "This Student Doesn't exist","Student Not Found",2);
                    jLabelStudentFullName.setText("Student Full-Name");
                    studentExist=false;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButtonSearchStudentActionPerformed

    private void jLabelBookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBookNameMouseClicked
        int bookId = (int)jSpinnerBookId.getValue();
        BookInfoCardForm infoCard = new BookInfoCardForm(bookId);
        infoCard.setVisible(true);
    }//GEN-LAST:event_jLabelBookNameMouseClicked

    private void jLabelStudentFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStudentFullNameMouseClicked
        int studentId = (int)jSpinnerStudentId.getValue();
        StudentInfoCardForm infoCard = new StudentInfoCardForm(studentId);
        infoCard.setVisible(true);
    }//GEN-LAST:event_jLabelStudentFullNameMouseClicked

    private void jLabelBookNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBookNameMouseEntered
        setBordetToJlable(jLabelBookName,new Color(51,102,255));
    }//GEN-LAST:event_jLabelBookNameMouseEntered

    private void jLabelBookNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBookNameMouseExited
        setBordetToJlable(jLabelBookName,new Color(255,255,255));
    }//GEN-LAST:event_jLabelBookNameMouseExited

    private void jLabelStudentFullNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStudentFullNameMouseEntered
       setBordetToJlable(jLabelStudentFullName,new Color(51,102,255));
    }//GEN-LAST:event_jLabelStudentFullNameMouseEntered

    private void jLabelStudentFullNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStudentFullNameMouseExited
        setBordetToJlable(jLabelStudentFullName,new Color(255,255,255));
    }//GEN-LAST:event_jLabelStudentFullNameMouseExited


    public void setBordetToJlable(JLabel label, Color color){
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(border);
    }
    
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
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new IssueBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonIssue;
    private javax.swing.JButton jButtonSearchBook;
    private javax.swing.JButton jButtonSearchStudent;
    private com.toedter.calendar.JDateChooser jDateChooserIssueDate;
    private com.toedter.calendar.JDateChooser jDateChooserReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAvailable;
    private javax.swing.JLabel jLabelBookName;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFormTitle;
    private javax.swing.JLabel jLabelStudentFullName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerBookId;
    private javax.swing.JSpinner jSpinnerStudentId;
    private javax.swing.JTextArea jTextAreaNote;
    // End of variables declaration//GEN-END:variables
}
