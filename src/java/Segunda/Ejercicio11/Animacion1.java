package Segunda.Ejercicio11;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Animacion1 extends Frame implements Runnable {

    Thread animacion;
    String frames[] = {"*", "**", "***", "****", "*****","******","****","***","**"};
    int actual = 0;
    
    public static void main(String[] args) {
        Animacion1 app = new Animacion1();
    }

    public Animacion1() {
        super("Animacion sencilla");

        this.pack(); // Meter dentro del frame
        this.setSize(500, 500); // Pone el tamaño del objeto
        this.setVisible(true);

        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g){
        g.drawString(frames[actual], 200, 200);
    }
    
    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }

    public void run() {

        do {
            actual = (actual + 1 ) % frames.length;
            repaint();
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animacion1.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (true);
    }

}
