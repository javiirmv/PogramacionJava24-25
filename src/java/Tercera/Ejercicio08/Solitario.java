/*
 
 */
package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Solitario extends Applet {

    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    public static final int NUM_PALOS = 4;
    public static final int NUM_JUEGOS = 7;

    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image reverso;
    Carta cartas[][];
    MazoSecundario mazoSecundario;
    Rectangle rectangulo;
    Baraja baraja;

    MazoPalo[] mazoPalos;
    MazoJuego[] mazoJuegos;
    Carta activa;

    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        String palos[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};

        mazoSecundario = new MazoSecundario();
        mazoPalos = new MazoPalo[NUM_PALOS];
        mazoJuegos = new MazoJuego[NUM_JUEGOS];

        imagenes = new Image[NUMCARTAS];
        for (int i = 0; i < NUMCARTAS; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio08/Cartas/" + ((i % CPP) + 1) + palos[i / CPP]);

        }
        baraja = new Baraja(imagenes);
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio08/Cartas/reverso.png");

        rectangulo = new Rectangle(20, 20, Carta.ANCHURA, Carta.ALTURA);

        for (int i = 0; i < mazoPalos.length; i++) {
            mazoPalos[i] = new MazoPalo((320 + (Carta.ANCHURA + 30) * i));
        }

        for (int i = 0; i < mazoJuegos.length; i++) {
            mazoJuegos[i] = new MazoJuego((20 + (Carta.ANCHURA + 30) * i));
        }

        for (int i = 0; i < mazoJuegos.length; i++) {
            for (int j = 0; j < i; j++) {
                mazoJuegos[i].anadir(baraja.sacarCarta(), true);
            }
        }

        this.setSize(700, 800);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 700, 800);
        noseve.drawImage(reverso, 20, 20, Carta.ANCHURA, Carta.ALTURA, this);
        mazoSecundario.paint(noseve, this);

        for (int i = 0; i < mazoPalos.length; i++) {
            mazoPalos[i].paint(noseve, this);
        }

        for (int i = 0; i < mazoJuegos.length; i++) {
            mazoJuegos[i].paint(noseve, this);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public boolean mouseDown(Event e, int x, int y) {
        if (rectangulo.contains(x, y)) {
            if (!baraja.getCartas().isEmpty()) {
                mazoSecundario.anadir(baraja.sacarCarta());
                mazoSecundario.recolocar();
            } else {
                baraja.setCartas(mazoSecundario.cartas);
                mazoSecundario.cartas = (new ArrayList<Carta>());
                mazoSecundario.anadir(baraja.sacarCarta());
            }

        } else {
            if (mazoSecundario.extraer().contains(x, y)) {
                activa = mazoSecundario.extraer();
            }
        }

        repaint();

        return true;
    }

    public boolean mouseDrag(Event e, int x, int y) {
        if (activa != null) {
            activa.y = (y - (Carta.ALTURA / 2));
            activa.x = (x - (Carta.ANCHURA / 2));
            repaint();
        }

        return true;
    }

    public boolean mouseUp(Event e, int x, int y) {
        if (activa != null) {
            for (int i = 0; i < mazoPalos.length; i++) {
                if (activa.intersects(mazoPalos[i])) {
                    if (mazoPalos[i].anadir(activa)) {
                        mazoSecundario.eliminar();
                    } else {
                        mazoSecundario.recolocar();
                    }
                    break;
                }
            }
            for (int i = 0; i < mazoJuegos.length; i++) {
                if (mazoJuegos[i].cartas.isEmpty()) {
                    if (activa.intersects(mazoJuegos[i])) {
                        if (mazoJuegos[i].anadir(activa)) {
                            mazoSecundario.eliminar();
                        } else {
                            mazoSecundario.recolocar();
                        }
                        break;
                    }
                } else {
                    Carta ultima = mazoJuegos[i].cartas.get(mazoJuegos[i].cartas.size() - 1);
                    System.out.println(ultima); 
                    if (activa.intersects(ultima)) {
                        if (mazoJuegos[i].anadir(activa)) {
                            mazoSecundario.eliminar();
                        } else {
                            mazoSecundario.recolocar();
                        }
                        break;
                    }
                }

            }

            mazoSecundario.recolocar();
            for (int i = 0; i < mazoJuegos.length; i++) {
                mazoJuegos[i].recolocar();
            }
            activa = null;
            repaint();
        }
        return true;
    }

}
