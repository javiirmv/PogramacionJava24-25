package Segunda.Ejercicio16;

import static Segunda.Ejercicio14.Arkanoid.DERECHA;
import static Segunda.Ejercicio14.Arkanoid.IZQUIERDA;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Principal extends Applet implements Runnable {

    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
    boolean continua = true;
    List<Bullet> bullets;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Gun gun;
    List<Alien> aliens;

    int cont = 0;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);
        bullets = new ArrayList<Bullet>();
        aliens = new ArrayList<Alien>();

        gun = new Gun();

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);

        gun.paint(noseve);

        if (!continua) {
            noseve.drawString("GAME OVER", 120, 140);
        }

        for (Bullet bullet : bullets) {
            bullet.paint(noseve);
        }

        for (Alien alien : aliens) {
            alien.paint(noseve);
        }

        g.drawImage(imagen, 0, 0, this);
    }

    public boolean keyDown(Event ev, int tecla) {
        if (tecla == 1006) {
            gun.setX(false);
        } else if (tecla == 1007) {
            gun.setX(true);
        } else if (tecla == 32) {
            bullets.add(new Bullet((int) (gun.getX()) + (gun.width / 4)));
        }
        repaint();
        return true;
    }

    public void run() {
        do {
            if (!continua) {
                repaint();
                animacion.stop();
            }

            for (Bullet bullet : bullets) {
                boolean delete = false;

                for (Alien alien : aliens) {
                    if (alien.detectar(bullet)) {
                        aliens.remove(alien);
                        delete = true;
                        break;
                    }
                }

                if (bullet.update() || delete) {
                    bullets.remove(bullet);
                    
                    break;
                }
            }

            for (Alien alien : aliens) {
                if (alien.update()) {
                    aliens.remove(alien);
                    continua = false;
                    break;
                }
            }

            if (cont >= 10) {
                aliens.add(new Alien());
                cont = 0;
            }
            cont++;

            repaint();

            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

}
