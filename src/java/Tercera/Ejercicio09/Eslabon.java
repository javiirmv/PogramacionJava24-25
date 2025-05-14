package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Eslabon extends Rectangle {

    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    public static final int TAM = 20;
    private int direccion;
    Image imagen;

    public Eslabon(Image img, int x, int y, int direccion) {
        super(x, y, TAM, TAM);
        imagen = img;
        this.direccion = direccion;
    }

    public Eslabon(Image img, int x, int y) {
        super(x, y, TAM, TAM);
        imagen = img;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void paint(Graphics g, Applet ap) {
        g.drawImage(imagen, x, y, width, height, ap);

    }

    public void update() {
        switch (direccion) {
            case Event.UP:
                y -= TAM;
                break;
            case Event.DOWN:
                y += TAM;
                break;
            case Event.LEFT:
                x -= TAM;
                break;
            case Event.RIGHT:
                x += TAM;
                break;
        }
    }

}
