package Tercera.Ejercicio08;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    ArrayList<Carta> cartas;
    Image reves;

    public Baraja(Image[] imagenes) {
        cartas = new ArrayList<Carta>();
        for (int i = 0; i < imagenes.length; i++) {
            int color;
            if (i / Solitario.CPP == 1 || i / Solitario.CPP == 2) {
                color = 1;
            } else {
                color = 2;
            }

            cartas.add(new Carta(imagenes[i], (i % Solitario.CPP) + 1, color, i / Solitario.CPP));
        }
        Collections.shuffle(cartas);

    }

    public Carta sacarCarta() {
        return cartas.get(0);
    }

}
