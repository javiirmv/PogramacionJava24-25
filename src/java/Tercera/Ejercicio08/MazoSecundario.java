package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class MazoSecundario {

    public static final int POSICIONX = 110;
    public static final int POSICIONY = 20;

    ArrayList<Carta> cartas;

    public MazoSecundario() {
        cartas = new ArrayList<Carta>();
    }

    public void anadir(Carta c) {
        cartas.add(c);
    }

    public void paint(Graphics g, Applet a) {
        for (Carta carta : cartas) {
            carta.paint(g, a);
        }
    }

    public void recolocar() {
        if (!cartas.isEmpty()) {
            Carta c = cartas.get(cartas.size() - 1);
            c.x = POSICIONX;
            c.y = POSICIONY;
        }
    }

    public Carta extraer() {
        return cartas.get(cartas.size() - 1);
    }

    public void eliminar() {
        cartas.remove(cartas.get(cartas.size() - 1));
    }
}
