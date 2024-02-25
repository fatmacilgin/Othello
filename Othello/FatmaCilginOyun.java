package Othello;

import static Othello.FatmaCilginData.personList;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FatmaCilginOyun extends javax.swing.JFrame {

    int count = 1;
    int countBlue = 2;
    int countMagenta = 2;
    JButton buton;
    int greenbutton = 0;
    static Color DEFAULT_COLOR = Color.LIGHT_GRAY;

    public FatmaCilginOyun() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        pnl_up = new javax.swing.JPanel();
        lbl_ilkKullanici = new javax.swing.JLabel();
        lbl_ikinciKullanici = new javax.swing.JLabel();
        lbl_ilkSkor = new javax.swing.JLabel();
        lbl_ikinciSkor = new javax.swing.JLabel();
        btn_newGame = new javax.swing.JButton();
        spnr_dimension = new javax.swing.JSpinner();
        pnl_gameTable = new javax.swing.JPanel();
        lbl_ilkSira = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_ikinciSira = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_oyun = new javax.swing.JMenu();
        menuItem_exit = new javax.swing.JMenuItem();
        menu_skorlar = new javax.swing.JMenu();
        menuItem_skoruGoster = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnl_up.setBackground(new java.awt.Color(204, 204, 255));
        pnl_up.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl_up.add(lbl_ilkKullanici, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 121, 27));
        pnl_up.add(lbl_ikinciKullanici, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 121, 27));

        lbl_ilkSkor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ilkSkor.setText("0");
        pnl_up.add(lbl_ilkSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, 27));

        lbl_ikinciSkor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ikinciSkor.setText("0");
        pnl_up.add(lbl_ikinciSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 90, 27));

        btn_newGame.setBackground(new java.awt.Color(204, 255, 204));
        btn_newGame.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_newGame.setText("New Game");
        btn_newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newGameActionPerformed(evt);
            }
        });
        pnl_up.add(btn_newGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 160, 33));

        spnr_dimension.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spnr_dimension.setModel(new javax.swing.SpinnerNumberModel(6, 6, 10, 2));
        pnl_up.add(spnr_dimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, 33));

        pnl_gameTable.setPreferredSize(new java.awt.Dimension(470, 470));
        pnl_gameTable.setLayout(new java.awt.GridLayout(1, 0));
        pnl_up.add(pnl_gameTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 410, 370));

        lbl_ilkSira.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_ilkSira.setText("order of play");
        pnl_up.add(lbl_ilkSira, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 440, 100, 20));
        pnl_up.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 440, 100, 20));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText(">>>");
        pnl_up.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setText("<<<");
        pnl_up.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 50, -1));

        lbl_ikinciSira.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_ikinciSira.setText("order of play");
        pnl_up.add(lbl_ikinciSira, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 110, -1));
        pnl_up.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 100, 20));

        menu_oyun.setBackground(new java.awt.Color(102, 102, 255));
        menu_oyun.setText("Game");
        menu_oyun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuItem_exit.setText("Exit");
        menuItem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_exitActionPerformed(evt);
            }
        });
        menu_oyun.add(menuItem_exit);

        jMenuBar1.add(menu_oyun);

        menu_skorlar.setText("Scores");
        menu_skorlar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuItem_skoruGoster.setText("Show Leaderboard");
        menuItem_skoruGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_skoruGosterActionPerformed(evt);
            }
        });
        menu_skorlar.add(menuItem_skoruGoster);

        jMenuBar1.add(menu_skorlar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_up, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_up, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void menuItem_skoruGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_skoruGosterActionPerformed
        String[] columns = {"Adı Soyadı", "Skor"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (FatmaCilginPerson p : personList) {
            Object[] row = {p.nameSurname, 0}; // ad soyad ve varsayılan skor değeri içeren bir satır oluştur
            model.addRow(row); // satırı modele ekle
        }
        JTable table = new JTable(model); // modeli kullanarak yeni bir JTable nesnesi oluşturdum. 
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }//GEN-LAST:event_menuItem_skoruGosterActionPerformed
    private void menuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuItem_exitActionPerformed
    private void btn_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newGameActionPerformed
        buton = (JButton) evt.getSource();
        pnl_gameTable.removeAll();
        int boyut = (int) spnr_dimension.getValue();
        JButton[][] bmat = new JButton[boyut][boyut];
        pnl_gameTable.setLayout(new GridLayout(boyut, boyut));
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                JButton btn_new = new JButton();
                btn_new.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_cardActionPerformed(evt);
                    }
                });
                btn_new.setSize(70, 70);
                btn_new.setBackground(Color.GREEN);
                bmat[i][j] = btn_new;
                greenbutton++;
                // oyunun başında olan iki siyah iki beyaz olan taşları matrixteki yere göre değiştiren kod.
                if (boyut == 6 && (i == 2 || i == 3) && (j == 2 || j == 3)) {
                    if (i == 2 && j == 3 || i == 3 && j == 2) {
                        btn_new.setBackground(Color.BLUE);
                    } else {
                        btn_new.setBackground(Color.MAGENTA);
                    }
                } else if (boyut == 8 && (i == 3 || i == 4) && (j == 3 || j == 4)) {
                    if (i == 3 && j == 4 || i == 4 && j == 3) {
                        btn_new.setBackground(Color.BLUE);
                    } else {
                        btn_new.setBackground(Color.MAGENTA);
                    }
                } else if (boyut == 10 && (i == 4 || i == 5) && (j == 4 || j == 5)) {
                    if (i == 4 && j == 5 || i == 5 && j == 4) {
                        btn_new.setBackground(Color.BLUE);
                    } else {
                        btn_new.setBackground(Color.MAGENTA);
                    }
                } else {
                    btn_new.setBackground(Color.GREEN);

                }
                bmat[i][j] = btn_new;
                pnl_gameTable.add(btn_new);
            }
        }
        this.countBlue = 2;
        this.countMagenta = 2;
        lbl_ilkSkor.setText("2");
        lbl_ikinciSkor.setText("2");
        if (buton.getBackground() == Color.GREEN) {
            greenbutton--;
            if (greenbutton == 0) {
                if (countBlue > countMagenta) {
                    JOptionPane.showMessageDialog(rootPane, "Blue kazandı!");
                } else if (countMagenta > countBlue) {
                    JOptionPane.showMessageDialog(rootPane, "Magenta kazandı!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Berabere!");
                }
            }
        }
        pnl_gameTable.revalidate();
    }//GEN-LAST:event_btn_newGameActionPerformed
    public void sequenceControl() {
        /* Bu metot oyun sırası bir sarıya bir siyaha geçmesi gerektiğinin kontrolünü 
         yapmaktadır. Bu kontrol count değişkeni artırılarak tek sayılar geldiğinde oyun sırasını sarı renge
         çift sayı geldiğinde oyun sırasını siyah renge vermekte ve score değişkenine her basıldığına bir puan eklemektedir*/
        if (count % 2 == 1) {
            buton.setBackground(Color.BLUE);
            jButton2.setBackground(Color.MAGENTA);
            jButton1.setBackground(DEFAULT_COLOR);
//            jLabel1.setText("<<<");
//            jLabel4.setText("");
            scoreUpdateBlue(1);

        } else if (count % 2 == 0) {
            buton.setBackground(Color.MAGENTA);
            jButton1.setBackground(Color.BLUE);
            jButton2.setBackground(DEFAULT_COLOR);
//            jLabel4.setText(">>>");
//            jLabel1.setText("");
            scoreUpdateMagenta(1);
        }
        count++;
    }

    public void scoreUpdateBlue(int point) {
        //skor değişkenini kontrol eden method.
        this.countBlue += point;
        lbl_ilkSkor.setText(this.countBlue + "");
    }

    public void scoreUpdateMagenta(int point) {
        //skor değişkenini kontrol eden method.
        this.countMagenta += point;
        lbl_ikinciSkor.setText(this.countMagenta + "");
    }

    private void btn_cardActionPerformed(java.awt.event.ActionEvent evt) {
        buton = (JButton) evt.getSource();
        if (buton.getBackground() != Color.MAGENTA && buton.getBackground() != Color.BLUE) {
            sequenceControl();
        }
    }
    public void isimekle() {
        /*id listesinde tuttuğumuz iki değişkeni sırasıyla labellere koyan method.*/
        if (FatmaCilginData.idList.size() >= 1) {
            int id1 = FatmaCilginData.idList.get(0);
            FatmaCilginPerson oyuncu1 = null;
            for (FatmaCilginPerson oyuncu : FatmaCilginData.personList) {
                if (oyuncu.id == id1) {
                    oyuncu1 = oyuncu;
                    break;
                }
            }
            if (oyuncu1 != null) {
                lbl_ilkKullanici.setText(oyuncu1.nameSurname + " (P)");
            }
        }
        if (FatmaCilginData.idList.size() == 2) {
            int id2 = FatmaCilginData.idList.get(1);
            FatmaCilginPerson oyuncu2 = null;
            for (FatmaCilginPerson oyuncu : FatmaCilginData.personList) {
                if (oyuncu.id == id2) {
                    oyuncu2 = oyuncu;
                    break;
                }
            }
            if (oyuncu2 != null) {
                lbl_ikinciKullanici.setText(oyuncu2.nameSurname + " (M)");
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FatmaCilginOyun().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_newGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lbl_ikinciKullanici;
    private javax.swing.JLabel lbl_ikinciSira;
    private javax.swing.JLabel lbl_ikinciSkor;
    private javax.swing.JLabel lbl_ilkKullanici;
    private javax.swing.JLabel lbl_ilkSira;
    private javax.swing.JLabel lbl_ilkSkor;
    private javax.swing.JMenuItem menuItem_exit;
    private javax.swing.JMenuItem menuItem_skoruGoster;
    private javax.swing.JMenu menu_oyun;
    private javax.swing.JMenu menu_skorlar;
    private javax.swing.JPanel pnl_gameTable;
    private javax.swing.JPanel pnl_up;
    private javax.swing.JSpinner spnr_dimension;
    // End of variables declaration//GEN-END:variables
}
