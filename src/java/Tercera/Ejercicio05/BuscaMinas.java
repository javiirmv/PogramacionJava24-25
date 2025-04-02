package Tercera.Ejercicio05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class BuscaMinas extends Applet {

    public static final int DIM = 10;

    Image imagen;
    Graphics noseve;
    Image mina;
    Image reverso;

    Casilla casillas[][] = new Casilla[DIM][DIM];

    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();

        mina = getImage(getCodeBase(), "Tercera/Ejercicio05/Imagenes/mina.png");
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio05/Imagenes/casilla.png");

        this.setSize(400, 500);

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla((Casilla.TAM * i) + 100, (Casilla.TAM * j) + 100, reverso);
            }
        }

        int[] minasRandom = obtenerAleatorio();

        for (int i = 0; i < minasRandom.length; i++) {
            casillas[minasRandom[i] / DIM][minasRandom[i] % DIM].setMina(mina);
        }

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j].setAlrededor(getCount(i, j));
            }
        }
    }

    private int[] obtenerAleatorio() {
        int resultados[] = new int[DIM];
        int vector[] = new int[DIM * DIM];

        for (int i = 0; i < (DIM * DIM); i++) {
            vector[i] = i;
        }

        for (int i = 0; i < DIM; i++) {
            int aleatorio = (int) (Math.random() * ((DIM * DIM) - i));
            resultados[i] = vector[aleatorio];
            vector[aleatorio] = vector[(DIM * DIM) - i - 1];
        }

        return resultados;
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j].paint(noseve, this);
            }
        }

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean action(Event ev, Object obj) {

        return true;
    }

    public int getCount(int iFila, int jColumna) {
        int contador = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int nuevaFila = iFila + i;
                int nuevaColumna = jColumna + j;

                if (nuevaFila < 0 || nuevaFila > 9 || nuevaColumna < 0 || nuevaColumna > 9) {
                    continue;
                }
                if (casillas[nuevaFila][nuevaColumna].getMina() != null) {
                    contador++;
                }

            }
        }

        return contador;
    }

    public boolean mouseDown(Event ev, int x, int y) {

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j].contains(x, y)) {
                    casillas[i][j].setTapada(false);

                    repaint();

                }
            }
        }

        return true;
    }
}
