package Segunda.Ejercicio15;

import Segunda.Ejercicio14.Ladrillo;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class FlappyBird extends Applet implements Runnable {

    Pajaro pajaro;
    Image imagen;
    Graphics noseve;
    Thread animacion;
        public static final int FILAS = 5;

    
    int contColumnas = 10;

    List<Columna> columnas;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);
        columnas = new ArrayList<Columna>();

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
        for (Columna columna : columnas) {
            columna.paint(noseve);
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public boolean keyDown(Event ev, int tecla) {
        if (tecla == Event.UP) {
            pajaro.saltar();
        }
        return true;
    }

    @Override
    public void run() {
        do {
            for (Columna columna : columnas) {
                columna.update();
            }
            pajaro.update();
            repaint();

            if (contColumnas >= 10) {
                contColumnas = 0;
                columnas.add(new Columna());

            } else {
            
                contColumnas++;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }
}
