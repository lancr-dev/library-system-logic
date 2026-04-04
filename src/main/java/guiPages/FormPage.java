// IMPORT PACKAGES
package guiPages;
import systemData.FormDatabase;
import systemData.SessionData;
import systemData.LogsDatabase;
import java.time.LocalDate;

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

        idField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        courseField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(this::submitBtnActionPerformed);

        jLabel1.setText("FORM PAGE");

        jLabel2.setText("Student ID");

        jLabel3.setText("Course and Year");

        jLabel4.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(submitBtn)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(205, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // IF USER IS NOT LOGGED IN, CANNOT SUBMIT FORM > ERROR MESSAGE
        if (SessionData.currentUser == null) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Must be login first."
            );
            return;
        }
        
        // CREATE VARIABLES TO GET DATA, STUDENT ID, AND COURSE FROM THE TEXT FIELDS
        String date = dateField.getText();
        String idText = idField.getText();
        String course = courseField.getText();
        
        // VALIDATIONS
        // IF DATA IS EMPTY OR ID IS EMPTY OR COURSE IS EMPTY > ERROR MESSAGE
        if (date.isEmpty() || idText.isEmpty() || course.isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Fill the form"
            );
            return;
        }
        // IF USER TYPED DATA THAT IS NOT MATCHES TO GIVEN FORMAT > ERROR MESSAGE
        if (!date.matches("\\d+/\\d+/\\d+")) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Date format: 3/19/2026"
            );
            return;
        }
        LocalDate today = LocalDate.now();

        String currentDate =
                today.getMonthValue() + "/"
                + today.getDayOfMonth() + "/"
                + today.getYear();
        if (!date.equals(currentDate)) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Date must be today: " + currentDate
            );

            return;
        }
        
        // CREATE VARIABLE INT ID
        int id;
        
        if(idText.length() != 9){
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Student ID must be 9 numbers."
            );
            return;
        }
        
        // TRY / CATCH METHOD
        try {
            // ID WILL GET AND STORE TO idText
            id = Integer.parseInt(idText);

        } catch (Exception e) {
            // IF USER DO NOT TYPE INTEGER IN STUDENT ID > ERROR MESSAGE
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Student ID must be number"
            );
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
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Form submitted"
        );
        
        // NAVIGATE TO HOME PAGE
        HomePage page = new HomePage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitBtnActionPerformed

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
    private javax.swing.JTextField courseField;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
