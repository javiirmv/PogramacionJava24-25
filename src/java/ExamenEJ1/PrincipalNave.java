package ExamenEJ1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class PrincipalNave extends Applet implements Runnable {

    List<Pistola> pistolas;
    List<Nave> naves;
    List<Bala> balas;

    Thread animacion;
    Image imagen;
    Graphics noseve;

    Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE, Color.PINK};

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);
        pistolas = new ArrayList<Pistola>();
        naves = new ArrayList<Nave>();
        balas = new ArrayList<Bala>();

        for (int i = 0; i < colors.length; i++) {
            pistolas.add(new Pistola(((300 / colors.length) * i + 25), colors[i]));
            naves.add(new Nave(10 + (i * 60), colors[i]));
        }

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);

        for (Bala bala : balas) {
            bala.paint(noseve);
        }
        for (Pistola pistola : pistolas) {
            pistola.paint(noseve);
        }
        for (Nave nave : naves) {
            nave.paint(noseve);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public boolean mouseDown(Event ev, int x, int y) {
        for (Pistola pistola : pistolas) {
            if (pistola.contains(x, y)) {
                balas.add(new Bala((int) (pistola.getX()) + (pistola.width / 4), pistola.color));
            }
        }
        return false;
    }

    public void run() {
        do {

            for (Nave nave : naves) {
                nave.update();
                for (Bala bala : balas) {
                    if (nave.intersects(bala) && nave.color == bala.color) {
                        nave.width += 10;
                        nave.height += 10;
                        balas.remove(bala);
                        break;
                    }
                }
            }
            for (Bala bala : balas) {
                if (bala.update()) {
                    balas.remove(bala);
                    break;
                };

            }
            repaint();

            try {
                Thread.sleep(35);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

}
