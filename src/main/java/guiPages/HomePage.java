// IMPORT NECESSARY PACKAGES
package guiPages;
import systemData.BookDatabase;
import systemData.SessionData;
import systemData.LogsDatabase;
import systemData.UserDatabase;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HomePage.class.getName());

    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
        BookDatabase.loadBooks();
        UserDatabase.loadDefaultUsers();
        updateUIState();
        
        // IF USER IS NOT LOGGED IN > SHOW LOG IN BTN | IF USER IS ALREADY LOGGED IN > HIDE LOG IN BTN
        if(SessionData.currentUser == null){
            logoutBtn.setVisible(false);
        } else {
            logoutBtn.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logBtn = new javax.swing.JButton();
        signBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goLibraryBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        logsBtn = new javax.swing.JButton();
        returnBookBtn = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        manageBooksBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 368, 151, -1));

        jPanel1.setBackground(new java.awt.Color(58, 93, 46));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 86)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("with us!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        logBtn.setBackground(new java.awt.Color(204, 255, 204));
        logBtn.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        logBtn.setForeground(new java.awt.Color(0, 51, 0));
        logBtn.setText("Log in");
        logBtn.addActionListener(this::logBtnActionPerformed);
        jPanel1.add(logBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        signBtn.setBackground(new java.awt.Color(204, 255, 204));
        signBtn.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        signBtn.setForeground(new java.awt.Color(0, 51, 0));
        signBtn.setText("Register Now!");
        signBtn.addActionListener(this::signBtnActionPerformed);
        jPanel1.add(signBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 86)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Start Reading");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Library System Management");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cavite, Civic Center, Palico IV, Imus City, Cavite, 4103");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tel: (046) 471-6607");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("cvsulibrary@cvsu.edu.ph");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 140));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cavite State University - Imus Campus");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright © CvSU Library System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1370, 160));

        goLibraryBtn.setBackground(new java.awt.Color(153, 255, 102));
        goLibraryBtn.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        goLibraryBtn.setForeground(new java.awt.Color(0, 51, 0));
        goLibraryBtn.setText("Go Library!");
        goLibraryBtn.addActionListener(this::goLibraryBtnActionPerformed);
        jPanel1.add(goLibraryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, -1));

        logoutBtn.setBackground(new java.awt.Color(153, 255, 102));
        logoutBtn.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(0, 51, 0));
        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(this::logoutBtnActionPerformed);
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));

        logsBtn.setBackground(new java.awt.Color(204, 255, 204));
        logsBtn.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        logsBtn.setForeground(new java.awt.Color(0, 51, 0));
        logsBtn.setText("Logs");
        logsBtn.addActionListener(this::logsBtnActionPerformed);
        jPanel1.add(logsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, -1, -1));

        returnBookBtn.setBackground(new java.awt.Color(204, 255, 204));
        returnBookBtn.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        returnBookBtn.setForeground(new java.awt.Color(0, 51, 0));
        returnBookBtn.setText("Return Book");
        returnBookBtn.addActionListener(this::returnBookBtnActionPerformed);
        jPanel1.add(returnBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        welcomeLabel.setBackground(new java.awt.Color(153, 255, 102));
        welcomeLabel.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("jLabel2");
        jPanel1.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cavite State University - Imus Campus");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CvSU Library System");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        manageBooksBtn.setBackground(new java.awt.Color(204, 255, 204));
        manageBooksBtn.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        manageBooksBtn.setForeground(new java.awt.Color(0, 51, 0));
        manageBooksBtn.setText("Book Management");
        manageBooksBtn.addActionListener(this::manageBooksBtnActionPerformed);
        jPanel1.add(manageBooksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookBtnActionPerformed
        // IF USER IS NOT LOGGED IN, CANNOT RETURN BOOK > ERROR MESSAGE
        if (SessionData.currentUser == null) {

            JOptionPane.showMessageDialog(null, "You must login first.", "No account was found.", JOptionPane.INFORMATION_MESSAGE);
            
            // NAVIGATE TO HOME PAGE AGAIN
            LogInPage page = new LogInPage();
            page.setVisible(true);
        } else {
            // IF USER IS LOGGED IN > NAVIGATE TO RETURN BOOK PAGE
            ReturnBookPage page = new ReturnBookPage();
            page.setVisible(true);
        }

    }//GEN-LAST:event_returnBookBtnActionPerformed

    private void logsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsBtnActionPerformed
        // IF USER CLICKED LOGS BUTTON > NAVIGATE TO LOGS PAGE
        LogsPage page = new LogsPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // IF USER LOGOUT > CREATE LOG
        LogsDatabase.addLog(
            SessionData.currentUser,
            "LOGOUT",
            "-"
        );
        // THEN CURRENT USER WILL BE NULL/NONE
        SessionData.currentUser = null;

        updateUIState();

        // SEND LOGOUT MESSAGE
        javax.swing.JOptionPane.showMessageDialog(this, "Logged out sucessfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void goLibraryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goLibraryBtnActionPerformed
        // IF USER IS NOT LOGGED IN, CANNOT GO TO LIBRARY PAGE > ERROR MESSAGE
        if (SessionData.currentUser == null) {

            JOptionPane.showMessageDialog(null, "You must login first.", "No account was found.", JOptionPane.INFORMATION_MESSAGE);

            // NAVIGATE TO HOME PAGE AGAIN
            LogInPage page = new LogInPage();
            page.setVisible(true);
            return;
        }

        // IF USER IS LOGGED IN > NAVIGATE TO LIBRARY PAGE
        LibraryPage page = new LibraryPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goLibraryBtnActionPerformed

    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBtnActionPerformed
        // IF USER CLICKED SIGN IN BUTTON > NAVIGATE TO SIGN IN PAGE
        SignInPage page = new SignInPage();
        page.setVisible(true);
    }//GEN-LAST:event_signBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        // IF USER CLICKED LOG IN BUTTON > NAVIGATE TO LOGIN PAGE
        LogInPage page = new LogInPage();
        page.setVisible(true);
    }//GEN-LAST:event_logBtnActionPerformed

    private void manageBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBooksBtnActionPerformed
        // TODO add your handling code here:
        BookManagementPage page = new BookManagementPage();
        page.setVisible(true);
    }//GEN-LAST:event_manageBooksBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new HomePage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goLibraryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton logsBtn;
    private javax.swing.JButton manageBooksBtn;
    private javax.swing.JButton returnBookBtn;
    private javax.swing.JButton signBtn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private void updateUIState() {
        
        // IF USER IS NOT LOGGED IN > HIDE LOGOUT BTN, LOGS BTN, AND WELCOME LABEL
        if (SessionData.currentUser == null) {

            logoutBtn.setVisible(false);
            logsBtn.setVisible(false);
            manageBooksBtn.setVisible(false);

            signBtn.setVisible(true);
            logBtn.setVisible(true);

            welcomeLabel.setVisible(false);
        // ELSE IF USER LOGGED IN > SHOW LOGOUT BTN, HIDE LOG IN AND SIGN IN BTN, SHOW WELCOME LABEL
        } else {

            logoutBtn.setVisible(true);

            signBtn.setVisible(false);
            logBtn.setVisible(false);

            welcomeLabel.setVisible(true);

            welcomeLabel.setText(
                    "Welcome " +
                    SessionData.currentUser +
                    "!"
            );

            // SHOW LOGS BTN ONLY IF CURRENT USER IS ADMIN | OTHERWISE HIDE LOGS BUTTON
            if (SessionData.currentUser.equals("Admin")) {

                logsBtn.setVisible(true);
                manageBooksBtn.setVisible(true);
                returnBookBtn.setVisible(false);
                goLibraryBtn.setVisible(false);        

            } else {

                logsBtn.setVisible(false);
                manageBooksBtn.setVisible(false);
            }
        }
    }
}
