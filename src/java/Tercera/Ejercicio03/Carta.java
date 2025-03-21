package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Carta {

    private int posX, posY;
    public static final int ANCHURA = 100;
    public static final int ALTURA = 150;

    int valor;
    Image imagen;

    public Carta(int valor, Image imagen) {
        this.imagen = imagen;
        this.valor = (valor > 10 ? 10 : valor);
    }

    public void paint(Graphics g, Applet applet) {
        g.drawImage(imagen, posX, posY, ANCHURA, ALTURA, applet);
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    

}
