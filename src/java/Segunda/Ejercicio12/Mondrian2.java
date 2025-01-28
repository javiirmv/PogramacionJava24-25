package Segunda.Ejercicio12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mondrian2 extends Applet implements Runnable {

    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rectangulo rectangulos[];
    int pos = 0;

    public void init() { //cilco de vida del applet;
        rectangulos = new Rectangulo[9];

        int rectangulos2[][] = {
            {0, 0, 90, 90},
            {250, 0, 40, 190},};
        
        Color colores[] = {
            Color.YELLOW,
            Color.YELLOW,
        };

        rectangulos[0] = new Rectangulo(0, 0, 90, 90, Color.YELLOW);
        rectangulos[1] = new Rectangulo(250, 0, 40, 190, Color.YELLOW);
        rectangulos[2] = new Rectangulo(80, 160, 100, 120, Color.YELLOW);
        rectangulos[3] = new Rectangulo(80, 220, 220, 90, Color.BLUE);
        rectangulos[4] = new Rectangulo(100, 10, 90, 80, Color.BLUE);
        rectangulos[5] = new Rectangulo(80, 100, 110, 90, Color.LIGHT_GRAY);
        rectangulos[6] = new Rectangulo(200, 0, 45, 45, Color.RED);
        rectangulos[7] = new Rectangulo(0, 110, 70, 200, Color.RED);
        rectangulos[8] = new Rectangulo(200, 55, 60, 135, Color.MAGENTA);

        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        for (int i = 0; i < rectangulos.length; i++) {
            rectangulos[i].paint(noseve);
        }

        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        
        
        paint(g);

    }

    @Override
    public void run() {
        do {
            for (int i = 0; i < rectangulos.length; i++) {
                rectangulos[i].update();
            }

            repaint();

            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mondrian2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);

    }

}
