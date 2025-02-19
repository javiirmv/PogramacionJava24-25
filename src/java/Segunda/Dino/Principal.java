package Segunda.Dino;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Principal extends Applet implements Runnable {

    boolean continua = true;
    List<Cactus> cactusLista;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Dino dino;

    int speed = 30;
    int timerCactus = 1500;
    int cont = 0;
    int timerSpeed = 3000;
    int contSpeed = 0;

    public void init() {
        imagen = this.createImage(1500, 1000);
        noseve = imagen.getGraphics();
        Color colores[] = {Color.BLUE, Color.RED, Color.ORANGE, Color.YELLOW, Color.PINK};// aqui porque solo lo uso para aqui local;
        this.setSize(1500, 1000);
        cactusLista = new ArrayList<Cactus>();
        cactusLista.add(new Cactus());
        dino = new Dino();
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 1500, 1000);
        dino.paint(noseve);
        if (!cactusLista.isEmpty()) {
            for (int i = 0; i < cactusLista.size(); i++) {
                cactusLista.get(i).paint(noseve);
            }
        }

        if (!continua) {
            noseve.setColor(Color.BLACK);
            noseve.setFont(new Font("Arial", Font.BOLD, 50));
            noseve.drawString("GAME OVER", 600, 450);

        }

        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean keyDown(Event ev, int tecla) {
        if (tecla == Event.UP) {
            dino.jump();
        }
        return false;
    }

    @Override
    public void run() {
        do {
            if (!continua) {
                repaint();
                animacion.stop();
            }

            if (!cactusLista.isEmpty()) {
                for (Cactus cactus : cactusLista) {
                    if (cactus.update()) {
                        cactusLista.remove(cactus);
                        break;
                    }
                }
            }

            dino.update();

            if (cont > timerCactus) {
                cactusLista.add(new Cactus());
                cont = 0;
                timerCactus = (((int) Math.random()) * 1000) + 1500;
            } else {
                cont += speed;
            }

            if (contSpeed > timerSpeed) {
                Cactus.velX *= 1.25;
                contSpeed = 0;
                System.out.println("Faster cactus");
            } else {
                contSpeed += speed;
            }

            if (!cactusLista.isEmpty()) {

                if (cactusLista.get(0).intersects(dino)) {
                    continua = false;
                }
            }
            repaint();

            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

}
