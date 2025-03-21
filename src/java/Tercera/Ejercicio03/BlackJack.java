package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class BlackJack extends Applet {

    public static final int NUMCARTAS = 52;
    public static final int CPP = 13;
    Image imagenes[];

    String cartas[] = {"clubs", "diamonds", "hearts", "spades"};

    Thread animacion;
    Image imagen;
    Graphics noseve;

    Rectangle tablero[][];
    Baraja baraja;

    Mano jugador;
    Mano crupier;

    Button pedir;
    Button plantar;

    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();

        imagenes = new Image[NUMCARTAS];
        for (int i = 0; i < NUMCARTAS; i++) {

            String nombre = cartas[i / CPP];
            int num = (i % CPP) + 1;

            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio03/Cartas/" + num + "_of_" + nombre + ".png");

        }

        baraja = new Baraja(imagenes);
        jugador = new Mano(100);
        crupier = new Mano(300);

        jugador.anadirCarta(baraja.sacarCarta());
        jugador.anadirCarta(baraja.sacarCarta());
        crupier.anadirCarta(baraja.sacarCarta());
        crupier.anadirCarta(baraja.sacarCarta());

        pedir = new Button();
        plantar = new Button();

        this.setSize(700, 500);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 700, 500);
        noseve.setColor(Color.GRAY);

        jugador.paint(noseve, this);
        crupier.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);

    }

}
