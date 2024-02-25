package Othello;

import static Othello.FatmaCilginData.personList;
import javax.swing.JOptionPane;

public class FatmaCilginLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public FatmaCilginLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        lbl_mail = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        btn_Register1 = new javax.swing.JButton();
        txt_Loginmail1 = new javax.swing.JTextField();
        txt_Loginpassword1 = new javax.swing.JPasswordField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusTraversalPolicyProvider(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First User Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_mail.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_mail.setText("E-Mail");
        jPanel2.add(lbl_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 30));

        lbl_password.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_password.setText("Password");
        jPanel2.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));

        btn_next.setBackground(new java.awt.Color(204, 255, 204));
        btn_next.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_next.setText("Next User");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel2.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));

        btn_Register1.setBackground(new java.awt.Color(204, 255, 204));
        btn_Register1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_Register1.setText("Register");
        btn_Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Register1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));
        jPanel2.add(txt_Loginmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, -1));
        jPanel2.add(txt_Loginpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));
        jPanel2.getAccessibleContext().setAccessibleName("First User Name");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Register1ActionPerformed
        //Login sayfasını kapatıp register sayfasını açar.
        this.setVisible(false);
        FatmaCilginRegister r = new FatmaCilginRegister(this);
        r.setVisible(true);
    }//GEN-LAST:event_btn_Register1ActionPerformed
    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
       String email = txt_Loginmail1.getText();
        String password = txt_Loginpassword1.getText();
        for (int i = 0; i < FatmaCilginData.personList.size(); i++) {
            FatmaCilginPerson o = FatmaCilginData.personList.get(i);
            if (email.contains(o.eMail)) {
                FatmaCilginData.idList.add(o.id);
            }
        }
        boolean isLogin = FatmaCilginData.Login(email, password);
        if (isLogin) {
            FatmaCilginLogin2 ilk = new FatmaCilginLogin2();
            FatmaCilginOyun Frm_Main = new FatmaCilginOyun();
            Frm_Main.isimekle();
            ilk.setVisible(true);
            this.setVisible(false);
        } else {
            try {
                FatmaCilginData.WritePersonListToFile();
                if (!isLogin) {

                    for (FatmaCilginPerson personel : personList) {
                        if (personel.eMail.compareTo(txt_Loginmail1.getText()) != 0) {
                            throw new Exception("not registered");
                             //  }  if (personel.nameSurname.compareTo(txt_Loginmail1.getText() == 0)) {
                           //  throw new Exception("please enter a valid email address!");
                        } else {
                            throw new Exception("wrong password");
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(), "EXCEPTION", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_nextActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Register1;
    private javax.swing.JButton btn_next;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_Loginmail1;
    private javax.swing.JPasswordField txt_Loginpassword1;
    // End of variables declaration//GEN-END:variables
}
