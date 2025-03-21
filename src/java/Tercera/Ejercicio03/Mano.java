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
            cartas.get(i).setPosX(100 + ( i * 20 ));
            cartas.get(i).setPosY(posY);
            cartas.get(i).paint(g, applet);
        }
    }
    
    public void anadirCarta(Carta carta){
        cartas.add(carta);
    }

}
