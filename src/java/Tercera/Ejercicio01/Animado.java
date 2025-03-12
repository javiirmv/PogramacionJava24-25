package Tercera.Ejercicio01;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Animado {

    private Image imagenes[];
    int index = 0;

    public Animado(Image[] imagenes) {
        this.imagenes = imagenes;
    }

    public void Paint(Graphics g, Applet applet) {
        g.drawImage(imagenes[index], 0, 0, applet);
    }

    public void Update() {
        index = (index + 1) % imagenes.length;
    }

    public void setImages(Image[] imagenes) {
        index = 0;
        this.imagenes = imagenes;
    }

}
