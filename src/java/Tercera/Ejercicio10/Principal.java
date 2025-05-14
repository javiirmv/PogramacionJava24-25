/*
 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends Applet implements Runnable {

    int tiempo = 50;
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    int temporizador = 1000;
    int cont = 0;

    Image imgFondo;
    Image imgCoche;
    Image imgRueda[];
    Image imgAcelerador;
    Image imgFreno;

    Fondo fondo;

    Image rueda;
    Coche coche;
    Rueda ruedas[];

    Pedal acelerador;
    Pedal freno;

    Image imagen;
    Graphics noseve;
    Thread animacion;

    public void init() {
        imagen = this.createImage(WIDTH, HEIGHT);
        noseve = imagen.getGraphics();
        this.setSize(WIDTH, HEIGHT);
        imgFondo = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/fondo.jpg");
        imgCoche = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/mercedes.png");
        imgAcelerador = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/pedal1.png");
        imgFreno = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/pedal2.png");

        imgRueda = new Image[5];

        for (int i = 1; i <= imgRueda.length; i++) {
            System.out.println("Tercera/Ejercicio10/imgsCoche/rueda" + i + ".gif");
            imgRueda[i - 1] = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/rueda" + i + ".gif");
        }

        coche = new Coche(imgCoche);
        fondo = new Fondo(imgFondo);
        ruedas = new Rueda[2];

        acelerador = new Pedal(imgAcelerador, 700, 15);
        freno = new Pedal(imgFreno, 550, 15);

        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = new Rueda(imgRueda, 80 + (i * 250));
        }

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, WIDTH, HEIGHT);

        fondo.paint(noseve, this);
        coche.paint(noseve, this);
        acelerador.paint(noseve, this);
        freno.paint(noseve, this);

        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i].paint(noseve, this);
        }
        g.drawImage(imagen, 0, 0, this);

    }

    public boolean mouseDown(Event ev, int x, int y) {
        if (acelerador.contains(x, y)) {
            if (tiempo >= 15) {
                tiempo -= 5;
            }
        }
        if (freno.contains(x, y)) {
            if (tiempo <= 200) {
                tiempo += 5;
            }
        }
        return true;
    }

    @Override
    public void run() {
        do {
            repaint();
            fondo.update();
            for (int i = 0; i < ruedas.length; i++) {
                ruedas[i].update();
            }
            try {
                Thread.sleep(tiempo);
                cont += tiempo;
                if (cont > temporizador) {
                    cont = 0;

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (true);
    }

}
