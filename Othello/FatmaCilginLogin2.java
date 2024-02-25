package Othello;

import static Othello.FatmaCilginData.personList;
import javax.swing.JOptionPane;

public class FatmaCilginLogin2 extends javax.swing.JFrame {

    /**
     * Creates new form FatmaCilginLogin
     */
    public FatmaCilginLogin2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl_mail = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        btn_oyunaBasla = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        txt_Loginmail2 = new javax.swing.JTextField();
        txt_Loginpassword2 = new javax.swing.JPasswordField();
        btn_register2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Second User Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_mail.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_mail.setText("E-Mail");
        jPanel2.add(lbl_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 30));

        lbl_password.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_password.setText("Password");
        jPanel2.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));

        btn_oyunaBasla.setBackground(new java.awt.Color(204, 255, 204));
        btn_oyunaBasla.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_oyunaBasla.setText("Start Game");
        btn_oyunaBasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oyunaBaslaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_oyunaBasla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 150, -1));

        btn_back.setBackground(new java.awt.Color(204, 255, 204));
        btn_back.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_back.setText("Back ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, -1));
        jPanel2.add(txt_Loginmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, -1));
        jPanel2.add(txt_Loginpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, -1));

        btn_register2.setBackground(new java.awt.Color(204, 255, 204));
        btn_register2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_register2.setText("Register");
        btn_register2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_register2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setText("first user login successful, enter second user :)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 280, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "do you want to close program", "closing", JOptionPane.YES_NO_OPTION);
        switch (option) {
            case JOptionPane.YES_OPTION:
                dispose();
                break;

            default:
                throw new AssertionError();
        }
        this.setVisible(false);
        FatmaCilginLogin back = new FatmaCilginLogin();
        back.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_oyunaBaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oyunaBaslaActionPerformed
        String email = txt_Loginmail2.getText();
        String password = txt_Loginpassword2.getText();
        for (int i = 0; i < FatmaCilginData.personList.size(); i++) {
            FatmaCilginPerson o = FatmaCilginData.personList.get(i);
            if (email.contains(o.eMail)) {
                FatmaCilginData.idList.add(o.id);
            }
        }
        boolean isLogin = FatmaCilginData.Login(email, password);
        if (isLogin) {
            FatmaCilginOyun Frm_Main = new FatmaCilginOyun();
            Frm_Main.setVisible(true);
            Frm_Main.isimekle();
            this.setVisible(false);
        } else {
            try {
                FatmaCilginData.WritePersonListToFile();
                for (FatmaCilginPerson personel : personList) {

                    if (!isLogin) {

                        if (personel.eMail.compareTo(txt_Loginmail2.getText()) != 0) {
                            throw new Exception("kayıtlı değil");
                        } else {
                            throw new Exception("wrong password");
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(), "EXCEPTİON", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_oyunaBaslaActionPerformed

    private void btn_register2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register2ActionPerformed
        //Login sayfasını kapatıp register sayfasını açar.
        this.setVisible(false);
        FatmaCilginRegister r = new FatmaCilginRegister(this);
        r.setVisible(true);
    }//GEN-LAST:event_btn_register2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_oyunaBasla;
    private javax.swing.JButton btn_register2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_Loginmail2;
    private javax.swing.JPasswordField txt_Loginpassword2;
    // End of variables declaration//GEN-END:variables
}
