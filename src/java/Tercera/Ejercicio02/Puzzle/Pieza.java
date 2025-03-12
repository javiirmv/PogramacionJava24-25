package Tercera.Ejercicio02.Puzzle;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

public class Pieza extends Rectangle {

    int posicion;
    private boolean colocada = false;
    Image imagen;

    public Pieza(Image imagen, int posicion) {
        this.height = 60;
        this.width = 60;

        Random r = new Random();
        this.x = (int)(Math.random()*300 + 350);  
        this.y = (int)(Math.random() * 450);  
        this.posicion = posicion;
        this.imagen = imagen;
    }

    public void paint(Graphics g, Applet applet) {
        g.drawImage(imagen, x, y, applet);
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setPosition(int newX, int newY) {
        this.x = newX-30;
        this.y = newY-30;
    }

}
