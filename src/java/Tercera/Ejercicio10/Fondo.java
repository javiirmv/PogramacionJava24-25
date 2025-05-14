package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Fondo {

    Image imagen;
    int posX;

    public Fondo(Image imagen) {
        this.imagen = imagen;
        posX = 0;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, 0 - posX, 0, a.getWidth(), a.getHeight(), a);
        g.drawImage(imagen, a.getWidth() - posX, 0, a.getWidth(), a.getHeight(), a);
    }

    public void update() {
        posX += 30;

        if (posX >= Principal.WIDTH) {
            posX = 0;
        }

    }
}
