package Segunda.Ejercicio04;

import java.util.Random;

public class Bombo {

    int bolas[];
    Random aleatorio;
    int numBolas = 48;
    int x = 0;

    public Bombo() {
        bolas = new int[numBolas];
        for (int i = 0; i < numBolas; i++) {
            bolas[i] = i + 1;
        }
        aleatorio = new Random();
    }

    public int sacaBola() {
        int numAleatorio = aleatorio.nextInt(numBolas);
        int bola = bolas[numAleatorio];

        bolas[numAleatorio] = bolas[numBolas - 1];
        numBolas--;
        return bola;
    }

}
