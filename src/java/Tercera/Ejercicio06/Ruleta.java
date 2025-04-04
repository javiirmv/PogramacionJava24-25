package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Ruleta extends Applet {

    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
    public static final int NUMJUGADAS = 10;

    Image imagen;
    Graphics noseve;

    Casilla casillas[][];

    Ficha activa;

    ArrayList<Ficha> fichas;

    public int rojos[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

    int valores[] = {1, 5, 10, 25, 50, 100, 500, 1000, 5000, 10000};

    public void init() {
        imagen = this.createImage(700, 900);
        noseve = imagen.getGraphics();

        casillas = new Casilla[FILAS][COLUMNAS];
        fichas = new ArrayList<Ficha>();

        ArrayList<Integer> lRojos = new ArrayList<Integer>();
        for (int z = 0; z < rojos.length; z++) {
            lRojos.add(rojos[z]);
        }

        for (int i = 0; i < valores.length; i++) {
            Image img = getImage(getCodeBase(), "Tercera/Ejercicio06/Fichas/ficha" + (i + 1) + ".png");
            fichas.add(new Ficha(50 + (60 * i), img, valores[i]));
        }

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                int num = i * COLUMNAS + j + 1;

                if (lRojos.contains(num)) {
                    casillas[i][j] = new Casilla(Casilla.DIM * j + 30, Casilla.DIM * i + 30, num, Color.RED);
                } else {
                    casillas[i][j] = new Casilla(Casilla.DIM * j + 30, Casilla.DIM * i + 30, num, Color.BLACK);
                }
            }
        }

        this.setSize(700, 900);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 700, 900);
        noseve.setColor(Color.GRAY);

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j].paint(noseve);

            }
        }

        for (Ficha ficha : fichas) {
            ficha.paint(noseve, this);
        }

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {
        for (Ficha ficha : fichas) {
            if (ficha.contains(x, y)) {
                activa = ficha;
                fichas.add(new Ficha(ficha.y, ficha.imagen, ficha.precio));
                break;
            }
        }
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        if (activa != null) {
            activa.mover(x, y);
            repaint();
        }

        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        activa = null;
        return true;
    }
}
