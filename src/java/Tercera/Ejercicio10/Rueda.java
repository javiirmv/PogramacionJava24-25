package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Rueda {

    Image imagenes[];
    Image actual;
    int x;
    int cont;
    
    public Rueda(Image imagen[], int posX) {
        this.imagenes = imagen;
        this.x = posX;
        actual = imagenes[0];
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(actual, x, 680, 100, 100, a);
    }

    public void update() {
        cont++;
        actual = imagenes[cont%5];
    }
}
