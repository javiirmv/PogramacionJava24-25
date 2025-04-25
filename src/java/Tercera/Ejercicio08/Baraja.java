package Tercera.Ejercicio08;

import java.awt.Image;
import java.util.ArrayList;

public class Baraja {

    ArrayList<Carta> cartas;
    Image reves;

    public Baraja(Image[] imagenes) {
        cartas = new ArrayList<Carta>();
        for (int i = 0; i < imagenes.length; i++) {
            int color;
            if (i == 1 || i == 2){
                color = 1;
            } else {
                color = 2;
            }

            cartas.add(new Carta(imagenes[i], i % 13, color, i / 13));

        }
    }
    
    public Carta sacarCarta(){
        return cartas.get(0);
    }

}
