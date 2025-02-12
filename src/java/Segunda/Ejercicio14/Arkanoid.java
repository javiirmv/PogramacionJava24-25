package Segunda.Ejercicio14;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arkanoid extends Applet implements Runnable {

    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
    public static final int DERECHA = 0;
    public static final int IZQUIERDA = 1;
    boolean continua=true;
    List<Ladrillo> ladrillos;
    Raqueta raqueta;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pelota pelota;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        Color colores[] = {Color.BLUE, Color.RED, Color.ORANGE, Color.YELLOW, Color.PINK};// aqui porque solo lo uso para aqui local;
        this.setSize(300, 300);
        ladrillos = new ArrayList<Ladrillo>();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                ladrillos.add(new Ladrillo(((Ladrillo.ANCHURA + 2) * j) + 1, ((Ladrillo.ALTURA + 2) * i) + 10, colores[i]));
            }
        }

        raqueta = new Raqueta();
        pelota = new Pelota(); //le pasas la referencia de la raqueta (que está siendo controlada por las teclas);De esta manera, la clase Bola tiene acceso a la misma raqueta que el Applet, 

    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();

    }

    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        for (int i = 0; i < ladrillos.size(); i++) {
            ladrillos.get(i).paint(noseve);
        }

        raqueta.paint(noseve);
        pelota.paint(noseve);
        
        if (!continua)noseve.drawString("GAME OVER", 120, 140);

        g.drawImage(imagen, 0, 0, this);

    }

    public void update(Graphics g) {
        paint(g);
    }

   
    //Otra forma de emover la raqueta.
    public boolean keyDown(Event ev, int tecla){
          if (tecla==1006){
            raqueta.setX(IZQUIERDA);
        }else if (tecla==1007)
            raqueta.setX(DERECHA);
        repaint();
        return true;
    }   
     
    @Override
    public void run() {
        do {
            continua =pelota.update(raqueta, ladrillos);// porque nos devuelve un booleano;
            if(!continua){
                repaint();
                animacion.stop();
            }
   
            repaint();
            
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Arkanoid.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (true);

    }

}