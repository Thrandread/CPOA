/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis_java;

import ihm.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author p1402054
 */
public class Tennis_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Accueil win = new Accueil();
                win.setVisible(true);
            }
        });
    }
    
}
