package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;

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
    TextField apuesta;
    Button boton1, boton2;

    public void init() {
        imagen = this.createImage(700, 700);
        noseve = imagen.getGraphics();

        imagenes = new Image[NUMCARTAS];
        for (int i = 0; i < NUMCARTAS; i++) {

            String nombre = cartas[i / CPP];
            int num = (i % CPP) + 1;

            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio03/Cartas/" + num + "_of_" + nombre + ".png");

        }

        baraja = new Baraja(imagenes);
        jugador = new Mano(500);
        crupier = new Mano(100);

        pedir = new Button();
        plantar = new Button();

        Panel primerPanel = new Panel();
        Label etiqueta = new Label("Introduce tu apuesta", Label.RIGHT);
        apuesta = new TextField("", 10);

        primerPanel.add(etiqueta);
        primerPanel.add(apuesta);

        confPaneles();

        this.add("North", primerPanel);
        this.setSize(700, 700);

    }

    public boolean mouseDown(Event ev, int x, int y) {

        return true;
    }

    public void update(Graphics g) {
        paint(g);
    }

    private void confPaneles() throws HeadlessException {
        this.setLayout(new BorderLayout());
        Panel primerPanel = new Panel();
        Label etiqueta = new Label("Introduce tu apuesta : ", Label.RIGHT);
        apuesta = new TextField("", 10);
        primerPanel.add(etiqueta);
        primerPanel.add(apuesta);
        this.add("North", primerPanel);

        Panel segundoPanel = new Panel();
        boton1 = new Button("Carta");
        boton2 = new Button("Me planto");
        segundoPanel.add(boton1);
        segundoPanel.add(boton2);
        this.add("South", segundoPanel);

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);

        jugador.paint(noseve, this);
        crupier.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);

    }

    public void plantar() {
        while (crupier.getPuntuacion() <= 17) {
            crupier.anadirCarta(baraja.sacarCarta());
            repaint();
        }

        if ((crupier.seHaPasado() || jugador.getPuntuacion() > crupier.getPuntuacion()) && !jugador.seHaPasado()) {
            System.out.println("Has ganado");
        } else if (jugador.getPuntuacion() < crupier.getPuntuacion()) {
            System.out.println("Has perdido :(");
        } else {
            System.out.println("Empate jeje");

        }
    }

    public boolean action(Event ev, Object obj) {
        if (ev.target instanceof TextField) {
            apuesta.setEnabled(false);
            jugador.anadirCarta(baraja.sacarCarta());
            jugador.anadirCarta(baraja.sacarCarta());
            crupier.anadirCarta(baraja.sacarCarta());
            System.out.println("Tienes " + jugador.getPuntuacion() + " puntos.");

            repaint();

        } else if (ev.target instanceof Button) {
            if (ev.arg == "Carta") {
                jugador.anadirCarta(baraja.sacarCarta());
                System.out.println("Tienes " + jugador.getPuntuacion() + " puntos.");

                if (jugador.seHaPasado()) {
                    System.out.println("Te has pasado");
                    plantar();
                }
            } else if (ev.arg == "Me planto") {
                System.out.println("Te has plantado con " + jugador.getPuntuacion() + " puntos.");
                plantar();
            }

            repaint();
        }
        return true;
    }

}
