package Tercera.Ejercicio04;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablero extends Applet {

    public static final int TAM = 5;

    Image imagen;
    Graphics noseve;

    Image[][] imagenes = new Image[TAM][TAM];
    Lugar lugares[][] = new Lugar[TAM][TAM];
    Point blanco;

    AudioClip error, acierto, exito;

    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();

        try {
            error = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/error.wav"));
            acierto = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/correct.wav"));
            exito = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/exito.wav"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                imagenes[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio04/botones/" + ((i * TAM) + j + 1) + ".gif");
                System.out.println(((i * TAM) + j + 1));
                lugares[i][j] = new Lugar(imagenes[i][j], (i * TAM) + j);
            }
        }

        blanco = new Point(TAM - 1, TAM - 1);

        this.setSize(400, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void pintarTodo() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                lugares[i][j].paint(noseve, this, x, y);
                x += 48;
            }
            y += 48;
            x = 0;
        }

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY);
        noseve.fillRect(0, 0, 700, 700);
        noseve.setColor(Color.GRAY);

        pintarTodo();

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean action(Event ev, Object obj) {

        return true;
    }

    public boolean mover(Point click) {

        Point desplazamiento, hasta;

        desplazamiento = new Point(delta(click.x, blanco.x), delta(click.y, blanco.y));

        if (desplazamiento.x == 0 && desplazamiento.y == 0) {
            return false;
        } else if (desplazamiento.x != 0 && desplazamiento.y != 0) {
            return false;
        } else {
            System.out.println(click.x);
            System.out.println(desplazamiento.y);

            hasta = new Point(desplazamiento.x + click.x, desplazamiento.y + click.y);

            if (hasta.x == blanco.x && hasta.y == blanco.y) {
                System.out.println("Mover");
            }
            return true;
        }

    }

    public int delta(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            return ((b - a / Math.abs(b - a)));
        }
    }

    public boolean mouseDown(Event ev, int x, int y) {
        Point click;

        click = new Point(x / Lugar.DIM, y / Lugar.DIM);

        if (mover(click)) {
            acierto.play();

        } else {
            error.play();

        }

        return true;
    }
}
