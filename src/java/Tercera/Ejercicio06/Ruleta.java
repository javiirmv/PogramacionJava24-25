package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Ruleta extends Applet {

    public static final int DIM = 10;

    Image imagen;
    Graphics noseve;

    Casilla casillas[][] = new Casilla[DIM][DIM];
    Casilla prueba;

    Casilla prueba2;

    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();

        prueba = new Casilla(50, 50, 50, Color.red);
        prueba2 = new Casilla(110, 50, 50, Color.BLACK);

        this.setSize(400, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);
        prueba.paint(noseve);
        prueba2.paint(noseve);

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }
}
