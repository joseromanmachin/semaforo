/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author antonio
 */
public class Semaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo_Ventana ventana = new Semaforo_Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
  
        
    }
    
}
