/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author Javi
 */
public class Ficha extends Rectangle {

    public static final int DIM = 50;
    Image imagen;
    int precio;

    public Ficha(int y, Image imagen, int Precio) {
        this.x = 300;
        this.y = y;
        this.width = DIM;
        this.height = DIM;

        this.precio = Precio;
        this.imagen = imagen;
    }

    public void mover(int posX, int posY) {
        this.x = posX;
        this.y = posY;
    }

    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, x, y, this.width, this.height, a);
    }

}
