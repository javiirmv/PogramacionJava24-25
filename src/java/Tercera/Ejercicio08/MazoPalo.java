package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoPalo extends Rectangle {

    ArrayList<Carta> cartas;
    int palo;
    public static final int ANCHURA = 70;
    public static final int ALTURA = 120;
    public static final int Y = 20;

    public MazoPalo(int x) {
        super(x, Y, ANCHURA, ALTURA);
        cartas = new ArrayList<Carta>();

    }

    public boolean anadir(Carta c) {
        if (cartas.size() == 0 && c.getValor() == 1) {
            cartas.add(c);
            palo = c.getPalo();
            recolocar();
            return true;
        } else if (cartas.size() + 1 == c.getValor() && c.getPalo() == palo) {
            cartas.add(c);
            recolocar();
            return true;
        }

        return false;
    }

    public void recolocar() {
        cartas.get(cartas.size() - 1).x = x;
        cartas.get(cartas.size() - 1).y = Y;

    }

    public void paint(Graphics g, Applet a) {
        g.setColor(Color.red);
        g.drawRect(x, y, width, height);
        for (Carta carta : cartas) {
            carta.paint(g, a);
        }
    }

}
