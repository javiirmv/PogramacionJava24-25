package Segunda.Ejercicio18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Principal extends Applet implements Runnable {

    boolean continua = true;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rana rana;
    List<Coche> coches;

    Rectangle carretera;

    int cont = 0;

    public void init() {
        imagen = this.createImage(1000, 1500);
        noseve = imagen.getGraphics();
        this.setSize(1000, 1500);
        coches = new ArrayList<Coche>();

        rana = new Rana();

        carretera = new Rectangle(0, 500, 1000, 300);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 1000, 1500);

        rana.paint(noseve);

        

        if (!continua) {
            noseve.drawString("GAME OVER", 120, 140);
        }

        for (Coche coche : coches) {
            coche.paint(noseve);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean keyDown(Event ev, int tecla) {

        return true;
    }

    public void run() {
        do {
            if (!continua) {
                repaint();
                animacion.stop();
            }

            if (cont >= 10) {
                //aliens.add(new Alien());
                cont = 0;
            }
            cont++;

            repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

}
