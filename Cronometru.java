
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RADU-IOANCIOBANU
 */
public class Cronometru {
    
    static int timp = 120000;
    public static void StartC(){
    TimpExpirat expirat = new TimpExpirat();           
    
Timer time = new Timer(timp,new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
              expirat.setVisible(true);
              
         
         }
     });
    time.start();
    time.setRepeats(false);
}
    
}
