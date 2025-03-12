package Tercera.Ejercicio01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caminar extends Applet implements Runnable {

    public static final int TIEMPO = 100;
    private static final int GUERRILLERO = 0;
    private static final int HAMPON = 1;
    private static final int VAQUERO = 2;

    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image img1;
    Image fotogramas[][];
    String lugares[] = {"Guerrillero/g", "Hampon/h", "Vaquero/v"};
    Animado animado;

    public void init() {
        imagen = this.createImage(500, 500);
        noseve = imagen.getGraphics();

        fotogramas = new Image[3][4];
        for (int i = 0; i < fotogramas.length; i++) {
            for (int j = 0; j < fotogramas[i].length; j++) {
                fotogramas[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio01/Sprites/" + lugares[i] + (j + 1) + ".gif");
            }
        }

        animado = new Animado(fotogramas[GUERRILLERO]);

        this.setSize(500, 500);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 500, 500);

        animado.Paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);

    }

    public boolean keyDown(Event ev, int tecla) {

        switch (tecla) {
            case 103:
            case 71:
                animado.setImages(fotogramas[GUERRILLERO]);
                break;
            case 104:
            case 72:
                animado.setImages(fotogramas[HAMPON]);
                break;
            case 118:
            case 86:
                animado.setImages(fotogramas[VAQUERO]);
                break;

            default:
                break;
        }

        return true;
    }

    @Override
    public void run() {
        do {

            animado.Update();
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {
                Logger.getLogger(Caminar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

}
