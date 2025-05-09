/*
 
 */
package Tercera.Ejercicio09;

import Tercera.Ejercicio08.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Snake extends Applet {

    Image imagen;
    Graphics noseve;

    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();

        this.setSize(700, 800);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 700, 800);

        g.drawImage(imagen, 0, 0, this);
    }

}
