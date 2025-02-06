package Segunda.Ejercicio15;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class FlappyBird extends Applet implements Runnable {

    Pajaro pajaro;
    Image imagen;
    Graphics noseve;
    Thread animacion;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);

        pajaro = new Pajaro();

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);

        pajaro.paint(noseve);
        g.drawImage(imagen, 0, 0, this);

    }

    public boolean keyDown(Event ev, int tecla){
        if (tecla == Event.UP){
            pajaro.saltar();
        }
        return true;
    }
    
    
    @Override
    public void run() {
        do {
            System.out.println("as");
            pajaro.update();
            repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }
}
