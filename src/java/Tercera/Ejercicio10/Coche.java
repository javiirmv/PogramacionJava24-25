package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Coche extends Rectangle {

    Image imagen;
    
    public Coche(Image imagen) {
        super(0, 500, 500, 400);
        this.imagen = imagen;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, this.x, this.y, this.width, this.height, a);
    }

    public void update() {


    }
}
