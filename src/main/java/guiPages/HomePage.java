// IMPORT NECESSARY PACKAGES
package guiPages;
import systemData.BookDatabase;
import systemData.SessionData;
import systemData.LogsDatabase;
import systemData.UserDatabase;

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

        lib = new javax.swing.JButton();
        signBtn = new javax.swing.JButton();
        logBtn = new javax.swing.JButton();
        returnBook = new javax.swing.JButton();
        logsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(556, 411));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lib.setText("Go Library");
        lib.addActionListener(this::libActionPerformed);
        getContentPane().add(lib, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        signBtn.setText("Sign in");
        signBtn.addActionListener(this::signBtnActionPerformed);
        getContentPane().add(signBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        logBtn.setText("Log in");
        logBtn.addActionListener(this::logBtnActionPerformed);
        getContentPane().add(logBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        returnBook.setText("Return Book");
        returnBook.addActionListener(this::returnBookActionPerformed);
        getContentPane().add(returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        logsBtn.setText("Logs");
        logsBtn.addActionListener(this::logsBtnActionPerformed);
        getContentPane().add(logsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(this::logoutBtnActionPerformed);
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 368, 151, -1));

        welcomeLabel.setText("jLabel2");
        getContentPane().add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void libActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libActionPerformed
        // IF USER IS NOT LOGGED IN, CANNOT GO TO LIBRARY PAGE > ERROR MESSAGE
        if (SessionData.currentUser == null) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "You must login first."
            );
            
            // NAVIGATE TO HOME PAGE AGAIN
            HomePage page = new HomePage();
            page.setVisible(true);
            this.dispose();
            return;
        }
        
        // IF USER IS LOGGED IN > NAVIGATE TO LIBRARY PAGE
        LibraryPage page = new LibraryPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_libActionPerformed

    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBtnActionPerformed
        // IF USER CLICKED SIGN IN BUTTON > NAVIGATE TO SIGN IN PAGE
        SignInPage page = new SignInPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        // IF USER CLICKED LOG IN BUTTON > NAVIGATE TO LOGIN PAGE
        LogInPage page = new LogInPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logBtnActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        // IF USER IS NOT LOGGED IN, CANNOT RETURN BOOK > ERROR MESSAGE
        if (SessionData.currentUser == null) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "You must login first."
            );
            // NAVIGATE TO HOME PAGE AGAIN
            HomePage page = new HomePage();
            page.setVisible(true);
            this.dispose();
        } else {
            // IF USER IS LOGGED IN > NAVIGATE TO RETURN BOOK PAGE
            ReturnBookPage page = new ReturnBookPage();
            page.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_returnBookActionPerformed

    private void logsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsBtnActionPerformed
        // IF USER CLICKED LOGS BUTTON > NAVIGATE TO LOGS PAGE
        LogsPage page = new LogsPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // IF USER IS NOT LOGGED IN CANNOT LOGOUT > ERROR MESSAGE
        if (SessionData.currentUser == null) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "No user logged in. Cannot logout."
            );
            return;
        }
        
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
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Logged out"
        );
    }//GEN-LAST:event_logoutBtnActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lib;
    private javax.swing.JButton logBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton logsBtn;
    private javax.swing.JButton returnBook;
    private javax.swing.JButton signBtn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private void updateUIState() {
        
        // IF USER IS NOT LOGGED IN > HIDE LOGOUT BTN, LOGS BTN, AND WELCOME LABEL
        if (SessionData.currentUser == null) {

            logoutBtn.setVisible(false);
            logsBtn.setVisible(false);

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
            if (SessionData.currentUser.equals("admin")) {

                logsBtn.setVisible(true);

            } else {

                logsBtn.setVisible(false);
            }
        }
    }
}
