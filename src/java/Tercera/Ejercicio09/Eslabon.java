package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Eslabon extends Rectangle {

    public static final int TAM = 15;
    public static final int IZQUIERDA = 0;
    public static final int DERECHA = 1;
    public static final int ARRIBA = 2;
    public static final int ABAJO = 3;

    private int direccion;

    Image imagen;

    public Eslabon(int posX, int posY, Image img, int dir) {
        super(posX, posY, TAM, TAM);
        this.direccion = dir;
        this.imagen = img;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, this.x, this.y, a);
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void update() {
        switch (direccion) {
            case IZQUIERDA:
                this.x -= TAM;
            case DERECHA:
                this.x += TAM;
            case ARRIBA:
                this.y -= TAM;
            case ABAJO:
                this.y += TAM;
        }
    }

}
