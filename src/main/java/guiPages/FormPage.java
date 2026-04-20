// IMPORT PACKAGES
package guiPages;
import systemData.FormDatabase;
import systemData.SessionData;
import systemData.LogsDatabase;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class FormPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPage.class.getName());
    
    // JAVA CONSTRUCTOR
    public FormPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        agreeCheckBox = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        courseField = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(58, 93, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 237, 243, -1));

        dateField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jPanel1.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 177, 241, -1));

        submitBtn.setBackground(new java.awt.Color(153, 255, 102));
        submitBtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 51, 0));
        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(this::submitBtnActionPerformed);
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 365, 243, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 213, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course and Year");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 279, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date | MM/DD/YEAR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 152, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Please complete the form with required information.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 106, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 102));
        jLabel7.setText("IN-LIBRARY BOOK USAGE FORM");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 14, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Reminder/Take Note:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 408, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Return the book you borrowed whitin 2 days.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 432, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- Late book returns will have a P20 penalty.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 453, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- Handle books with care. Avoid scratches, folds, or damage.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 474, -1, -1));

        agreeCheckBox.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        agreeCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        agreeCheckBox.setText("I Agree to the Library Rules and Conditions.");
        agreeCheckBox.addActionListener(this::agreeCheckBoxActionPerformed);
        jPanel1.add(agreeCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 528, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("- Damaging the book will require payment based on its value.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 495, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Thank you for choosing CvSU Library!");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 345, -1, -1));

        courseField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        courseField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "BSCS", "BSIT" }));
        courseField.addActionListener(this::courseFieldActionPerformed);
        jPanel1.add(courseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 303, 243, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\ComProg\\librarySystem\\src\\main\\java\\resources\\cvsu stroke.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // CREATE VARIABLES TO GET DATA, STUDENT ID, AND COURSE FROM THE TEXT FIELDS
        String date = dateField.getText().trim();
        String idText = idField.getText().trim();
        String course = courseField.getSelectedItem().toString();
        
        // VALIDATIONS
        // IF DATA IS EMPTY OR ID IS EMPTY OR COURSE IS EMPTY > ERROR MESSAGE
        if (date.isEmpty() || idText.isEmpty() || course.isEmpty()) {

            JOptionPane.showMessageDialog(this, "All fields are required!", "Submission failed", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        // IF USER TYPED DATA THAT IS NOT MATCHES TO GIVEN FORMAT > ERROR MESSAGE || THIS IS A REGEX METHOD
        if (!date.matches("\\d+/\\d+/\\d+")) {

            JOptionPane.showMessageDialog(this, "Date Format: MM/DD/YYYY", "Submission failed", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        LocalDate today = LocalDate.now();

        String currentDate =
                today.getMonthValue() + "/"
                + today.getDayOfMonth() + "/"
                + today.getYear();
        if (!date.equals(currentDate)) {

            JOptionPane.showMessageDialog(this, "Date must be today: " + currentDate, "Submission failed", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // CREATE VARIABLE INT ID
        int id;
        
        if(idText.length() != 9 || idText.length() > 9){
            JOptionPane.showMessageDialog(this, "Invalid ID format.", "Submission failed", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(courseField.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Please select your course.", "Submission failed", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // TRY / CATCH METHOD
        try {
            // ID WILL GET AND STORE TO idText
            id = Integer.parseInt(idText);

        } catch (Exception e) {
            // IF USER DO NOT TYPE INTEGER IN STUDENT ID > ERROR MESSAGE
            JOptionPane.showMessageDialog(this, "Invalid ID format.", "Submission failed", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(!agreeCheckBox.isSelected()){
            JOptionPane.showMessageDialog(this, "You must agree to the Library \nRules and Conditions. ", "Terms and Conditions.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // AFTER THE USER CLICK SUBMIT BUTTON, WE WILL CALL/USE addForm() METHOD TO STORE FORM PAGE DATA TO FORM DATABASE
        FormDatabase.addForm(
                date,
                id,
                course
        );
        
        // THEN LOGS THE USER AND ACTION AS "FORM"
        LogsDatabase.addLog(
                SessionData.currentUser,
                "FORM",
                "-"
        );
        
        // SHOW SUCCESS MESSAGE
        javax.swing.JOptionPane.showMessageDialog(this, "Form submitted successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // NAVIGATE TO HOME PAGE
        HomePage page = new HomePage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void agreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agreeCheckBoxActionPerformed

    private void courseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseFieldActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JComboBox<String> courseField;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
