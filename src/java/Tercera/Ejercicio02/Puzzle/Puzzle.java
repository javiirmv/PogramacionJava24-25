package Tercera.Ejercicio02.Puzzle;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Puzzle extends Applet {

    public static final int PIEZAS = 25;
    public static final int FILAS = 5;

    Image imagenes[];

    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pieza piezas[];

    Pieza seleccionada;

    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();

        imagenes = new Image[PIEZAS];
        piezas = new Pieza[PIEZAS];
        for (int i = 0; i < PIEZAS; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/directorioImagenes/" + (i + 1) + ".png");
            piezas[i] = new Pieza(imagenes[i], i);
        }

        this.setSize(700, 500);

    }

    public boolean mouseDown(Event ev, int x, int y) {
        for (Pieza pieza : piezas) {
            if (pieza.contains(x, y)) {
                seleccionada = pieza;
                System.out.println(seleccionada);
                break;
            }
        }
        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        seleccionada = null;
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        if (seleccionada != null) {
            seleccionada.setPosition(x, y);
            repaint();
        }

        return true;
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 700, 500);
        for (Pieza pieza : piezas) {
            pieza.paint(noseve, this);
        }

        g.drawImage(imagen, 0, 0, this);
    }

}
