package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Ruleta extends Applet {

    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;

    Image imagen;
    Graphics noseve;

    Casilla casillas[][];

    public int rojos[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

    public void init() {
        imagen = this.createImage(400, 900);
        noseve = imagen.getGraphics();

        casillas = new Casilla[COLUMNAS][FILAS];

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                Color color = Color.black;
                int num = i * FILAS + j + 1;
                for (int z = 0; z < rojos.length; z++) {
                    if (num == rojos[z]) {
                        color = color.red;
                    }
                }

                casillas[i][j] = new Casilla(Casilla.DIM * i + 30, Casilla.DIM * j + 30, num, color);


            }
        }

        this.setSize(400, 900);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 400, 900);
        noseve.setColor(Color.GRAY);

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                casillas[i][j].paint(noseve);

            }
        }

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }
}
