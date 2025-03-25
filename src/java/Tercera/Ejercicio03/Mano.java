package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class Mano {

    ArrayList<Carta> cartas;
    int posY;
    
    public Mano(int pY) {
        cartas = new ArrayList<Carta>();
        posY = pY;
    }

    public void paint(Graphics g, Applet applet) {
        for (int i = 0; i < cartas.size(); i++) {
            cartas.get(i).setPosX(100 + (i * 40));
            cartas.get(i).setPosY(posY);
            cartas.get(i).paint(g, applet);
        }
    }

    public void anadirCarta(Carta carta) {
        cartas.add(carta);
    }

    public int getPuntuacion() {
        int puntuacion = 0;
        boolean hayAs = false;
        for (Carta carta : cartas) {
            puntuacion += carta.valor;
            if (carta.valor == 1) {
                hayAs = true;
            }
        }

        if ((puntuacion < 21 - 10) && hayAs) {
            puntuacion += 10;
        }

        return puntuacion;
    }

    public boolean seHaPasado() {

        if (getPuntuacion() > 21) {
            return true;
        } else {
            return false;
        }
    }

}
