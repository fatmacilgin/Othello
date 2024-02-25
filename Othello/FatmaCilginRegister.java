package Othello;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FATMA
 */
public class FatmaCilginRegister extends javax.swing.JFrame {

    JFrame ParentFrame;

    /**
     * Creates new form Register
     */
    public FatmaCilginRegister(JFrame ParentFrame) {
        initComponents();
        this.ParentFrame = ParentFrame;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_nameSurname = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        rbtn_genderMail = new javax.swing.JRadioButton();
        rbtn_genderFemale = new javax.swing.JRadioButton();
        txt_register = new javax.swing.JButton();
        txt_cancel = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txt_passwordAgain = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N

        txt_nameSurname.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        txt_mail.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setText("Mail");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Name Surname");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setText("Password");

        lbl_gender.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lbl_gender.setText("Gender");

        buttonGroup1.add(rbtn_genderMail);
        rbtn_genderMail.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rbtn_genderMail.setText("Male");

        buttonGroup1.add(rbtn_genderFemale);
        rbtn_genderFemale.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rbtn_genderFemale.setText("Female");

        txt_register.setBackground(new java.awt.Color(204, 255, 204));
        txt_register.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        txt_register.setText("Register");
        txt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_registerActionPerformed(evt);
            }
        });

        txt_cancel.setBackground(new java.awt.Color(204, 255, 204));
        txt_cancel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        txt_cancel.setText("Back to Login");
        txt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cancelActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel1.setText("password again");

        txt_passwordAgain.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(txt_mail))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(lbl_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_password)
                                    .addComponent(txt_nameSurname)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbtn_genderMail)
                                        .addGap(43, 43, 43)
                                        .addComponent(rbtn_genderFemale))
                                    .addComponent(txt_passwordAgain, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_passwordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_genderMail)
                    .addComponent(rbtn_genderFemale)
                    .addComponent(lbl_gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cancel)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void txt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_registerActionPerformed
        /*oyuncu kaydeden ve bu oyuncuların listesini arraylistte tutan method*/
        FatmaCilginPerson newp = new FatmaCilginPerson();
        newp.eMail = txt_mail.getText();
        newp.nameSurname = txt_nameSurname.getText();
        newp.password = txt_password.getText();
        newp.passworgAgain = txt_passwordAgain.getText();
        if (rbtn_genderMail.isSelected()) {
            newp.gender = FatmaCilginPerson.Gender.Male;
        } else {
            newp.gender = FatmaCilginPerson.Gender.Famale;
        }
        try {
            //try cathle register ekranında boş yer kalmasını engelledim.
            if (txt_mail.getText().isEmpty()) {
                throw new Exception("please Fill mail area!");
            }
            if (txt_nameSurname.getText().isEmpty()) {
                throw new Exception("please fill name surname area!");
            }
            if (txt_password.getText().length() < 6) {
                throw new Exception("Please, create password least 6 characters");
            }
            if (newp.password.compareTo(txt_passwordAgain.getText()) != 0) {
                throw new Exception("Please, your password not match!");
            }

            try {
                //regex kullanarak mailleri @hotmail.com veya @gmail.com formunda yazılmasını kontrol ettim.
                Pattern pattern = Pattern.compile("^([a-z]+\\w*){4,}@{1}((gmail)|(hotmail)){1}(.com){1}$");
                Matcher matcher = pattern.matcher(txt_mail.getText());
                if (matcher.find()) {
                    FatmaCilginData.AddPerson(newp);
                    FatmaCilginData.WritePersonListToFile();
                    this.ParentFrame.setVisible(true);
                    this.dispose();
                    throw new Exception("was recorded :)");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Invalid mail! Try again.");
                }
            } catch (IOException ex) {
                Logger.getLogger(FatmaCilginLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "UYARI", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_registerActionPerformed
    private void txt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cancelActionPerformed
// cancel butonuna tıklandığında karşısına programdan çıkmak isteyip istemediğini soran kod.
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to close the program?", "Closing", JOptionPane.YES_NO_OPTION);
        FatmaCilginLogin login = new FatmaCilginLogin();
        switch (option) {
            case JOptionPane.YES_OPTION:
                ParentFrame.setVisible(false);
                login.setVisible(true);
                dispose();
                break;
            case JOptionPane.NO_OPTION:
                break;
            default:
        }
    }//GEN-LAST:event_txt_cancelActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JRadioButton rbtn_genderFemale;
    private javax.swing.JRadioButton rbtn_genderMail;
    private javax.swing.JButton txt_cancel;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nameSurname;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_passwordAgain;
    private javax.swing.JButton txt_register;
    // End of variables declaration//GEN-END:variables
}
