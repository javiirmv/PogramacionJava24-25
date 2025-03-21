package Tercera.Ejercicio03;

import java.awt.Image;
import java.util.ArrayList;

public class Baraja {
    ArrayList<Carta> cartas;

    public Baraja(Image imagenes[]) {
        cartas = new ArrayList<Carta>();

        for (Image imagen : imagenes) {
            int valor = 0;
            
            cartas.add(new Carta((valor % 13) + 1, imagen)); 
            valor++;
            System.out.println("hola");
        }
    }
}
