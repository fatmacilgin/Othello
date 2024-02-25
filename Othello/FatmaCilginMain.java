package Othello;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FatmaCilginMain {

    public static void main(String[] args) {
        try {
            FatmaCilginData.ReadFromFileToPersonList();
        } catch (IOException ex) {
            Logger.getLogger(FatmaCilginMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        FatmaCilginLogin newFrm = new FatmaCilginLogin();
        newFrm.setVisible(true);
    }
}
