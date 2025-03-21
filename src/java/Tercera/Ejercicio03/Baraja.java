package Tercera.Ejercicio03;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    ArrayList<Carta> cartas;

    public Baraja(Image imagenes[]) {
        cartas = new ArrayList<Carta>();

        for (Image imagen : imagenes) {
            int valor = 0;

            cartas.add(new Carta((valor % 13) + 1, imagen));
            valor++;
        }
        Collections.shuffle(cartas);

    }

    public Carta sacarCarta() {
        Carta carta = cartas.get(0);
        cartas.remove(0);
        return carta;

    }
}
