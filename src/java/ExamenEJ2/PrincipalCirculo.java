package ExamenEJ2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class PrincipalCirculo extends Applet implements Runnable {

    boolean continua = true;
    List<Circulo> circulos;

    int pinchados = 0;
    int limitePerder = 10;
    int cont = 0;
    int timer = 2000;
    private int SPEED = 35;

    Thread animacion;
    Image imagen;
    Graphics noseve;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        this.setSize(300, 300);
        circulos = new ArrayList<Circulo>();
        circulos.add(new Circulo());
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        noseve.setColor(Color.WHITE);

        for (Circulo circulo : circulos) {
            circulo.paint(noseve);
        }

        if (!continua) {
            noseve.drawString("GAME OVER", 60, 200);
        }
        
        noseve.drawString("PINCHADOS: ".concat(String.valueOf(pinchados)), 50, 30);
        g.drawImage(imagen, 0, 0, this);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public boolean mouseDown(Event ev, int x, int y) {
        for (Circulo circulo : circulos) {
            if (circulo.contains(x, y)) {
                if (circulo.addNumber()) {
                    
                    circulos.remove(circulo);
                    pinchados++;
                    break;
                }
            }
        }
        return false;
    }

    public void run() {
        do {
            if (!continua) {
                repaint();
                animacion.stop();
            }

            for (Circulo circulo : circulos) {
                circulo.update();
            }

            if (circulos.size() > limitePerder) {
                continua = false;
            }

            repaint();

            if (cont >= timer) {
                cont = 0;
                circulos.add(new Circulo());
            } else {
                cont += SPEED;
            }

            try {
                Thread.sleep(SPEED);
            } catch (InterruptedException ex) {
            }

        } while (true);

    }

}
