package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pedal extends Rectangle {

    Image imagen;
    
    public Pedal(Image imagen, int posX, int vel) {
        super(posX, 600, 70, 140);
        this.imagen = imagen;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, this.x, this.y, this.width, this.height, a);
    }

    public void update() {


    }
}
