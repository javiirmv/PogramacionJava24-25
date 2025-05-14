/*
 */
package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Snake extends Applet implements Runnable {

    public static final int TIEMPO = 50;
    Image imgCasilla;
    Image imgManzana;

    int appleSpawn = 1000;
    int cont = 0;

    Serpiente serpiente;

    Image imagen;
    Graphics noseve;
    Thread animacion;

    ArrayList<Eslabon> manzanas;

    public void init() {
        imagen = this.createImage(800, 800);
        noseve = imagen.getGraphics();
        this.setSize(800, 800);

        manzanas = new ArrayList<Eslabon>();

        imgCasilla = getImage(getCodeBase(), "Tercera/Ejercicio09/casilla.png");
        imgManzana = getImage(getCodeBase(), "Tercera/Ejercicio09/manzana2.png");

        serpiente = new Serpiente(imgCasilla);

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 800, 800);

        serpiente.paint(noseve, this);

        for (Eslabon manzana : manzanas) {
            manzana.paint(noseve, this);
        }

        g.drawImage(imagen, 0, 0, this);

    }

    @Override
    public void run() {
        do {
            serpiente.update();
            repaint();

            for (Eslabon manzana : manzanas) {
                if (manzana.intersects(serpiente.primerEslabon())) {
                    manzanas.remove(manzana);
                    serpiente.comer();

                    break;
                }
            }

            try {
                Thread.sleep(TIEMPO);
                cont += TIEMPO;
                if (cont > appleSpawn) {
                    cont = 0;

                    int posX = (int) (Math.random() * 700);
                    int posY = (int) (Math.random() * 700);

                    manzanas.add(new Eslabon(imgManzana, posX, posY));

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Snake.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (true);
    }

    public boolean keyDown(Event ev, int tecla) {
        serpiente.cambiarDireccion(tecla);
        return true;
    }

}
