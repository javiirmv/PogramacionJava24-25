package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoJuego extends Rectangle {

    ArrayList<Carta> cartas;
    int palo;
    public static final int ANCHURA = 70;
    public static final int ALTURA = 120;
    int Y = ALTURA + 30;

    public MazoJuego(int x) {
        super(x, ALTURA + 30, ANCHURA, ALTURA);
        cartas = new ArrayList<Carta>();
    }

    public boolean anadir(Carta c) {
        if (cartas.size() == 0) {
            cartas.add(c);
            palo = c.getPalo();
            recolocar();

            return true;
        } else if (cartas.get(cartas.size() - 1).getValor() == c.getValor() + 1 && c.getPalo() != palo) {
            cartas.add(c);
            palo = c.getPalo();
            recolocar();
            return true;
        }

        return false;
    }

    public boolean anadir(Carta c, boolean crear) {
        cartas.add(c);
        palo = c.getPalo();
        recolocar();
        return true;
    }

    public void recolocar() {
        int yPos = Y;
        for (Carta carta : cartas) {
            carta.x = x;
            carta.y = yPos;
            yPos += 30;
        }
    }

    public void paint(Graphics g, Applet a) {
        g.setColor(Color.red);
        g.drawRect(x, y, width, height);
        for (Carta carta : cartas) {
            carta.paint(g, a);
        }
    }

}
