package Segunda.Ejercicio18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal extends Applet implements Runnable {

    boolean continua = true;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rana rana;
    List<Coche> coches;

    Rectangle carretera;

    int speed = 30;
    int timerCar = 1500;
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

        noseve.setColor(Color.GRAY);

        noseve.fillRect(0, 500, 1000, 400);

        if (!continua) {
            noseve.setColor(Color.WHITE);
            noseve.setFont(new Font("Arial", Font.BOLD, 50));
            noseve.drawString("GAME OVER", 325, 450);

        }

        for (Coche coche : coches) {
            coche.paint(noseve);
        }

        rana.paint(noseve);

        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean keyDown(Event ev, int tecla) {
        rana.setY(tecla);
        return false;
    }

    public void run() {
        do {
            if (!continua) {
                repaint();
                animacion.stop();
            }

            for (Coche coche : coches) {
                if (coche.update()) {
                    coches.remove(coche);
                    break;
                }
                
                if (coche.intersects(rana)){
                    continua = false;
                }
            }
            
            

            if (cont > timerCar) {
                coches.add(new Coche(new Random().nextBoolean()));
                cont = 0;
                timerCar = (((int) Math.random()) * 1000) + 500;

            } else {
                cont += speed;
            }

            repaint();

            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

}
