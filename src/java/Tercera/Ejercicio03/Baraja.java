package Tercera.Ejercicio03;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    ArrayList<Carta> cartas;

    public Baraja(Image imagenes[]) {
        cartas = new ArrayList<Carta>();

        for (int i = 0; i < imagenes.length; i++) {
            
            cartas.add(new Carta((i % 13) + 1, imagenes[i]));

        }

        Collections.shuffle(cartas);

    }

    public Carta sacarCarta() {
        Carta carta = cartas.get(0);
        cartas.remove(0);
        return carta;

    }
}
