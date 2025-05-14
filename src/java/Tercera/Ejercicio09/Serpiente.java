
package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Serpiente {

    public static final int posX = 100;
    public static final int posY = 100;
    ArrayList<Eslabon> eslabones;

    public Serpiente(Image imagen) {
        eslabones = new ArrayList<Eslabon>();
        for (int i = 0; i < 10; i++) {
            eslabones.add(new Eslabon(imagen, 200 - (Eslabon.TAM * i), 100, Event.RIGHT));
        }
    }

    public void paint(Graphics g, Applet ap) {
        for (Eslabon eslabon : eslabones) {
            eslabon.paint(g, ap);
        }

    }

    public Eslabon primerEslabon() {
        return eslabones.get(0);
    }

    public Eslabon ultimoEslabon() {
        return eslabones.get(eslabones.size() - 1);
    }

    public void comer() {
        Eslabon ultimo = this.ultimoEslabon();
        int x = ultimo.x;
        int y = ultimo.y;
        int direccion = ultimo.getDireccion();

        switch (direccion) {
            case Event.UP:
                y += Eslabon.TAM;
                break;
            case Event.DOWN:
                y -= Eslabon.TAM;
                break;
            case Event.LEFT:
                x += Eslabon.TAM;
                break;
            case Event.RIGHT:
                x -= Eslabon.TAM;
                break;
        }

        Eslabon nuevo = new Eslabon(ultimo.imagen, x, y, direccion);
        eslabones.add(nuevo);
    }

    public void cambiarDireccion(int nuevaDireccion) {
        primerEslabon().setDireccion(nuevaDireccion);
    }

    public void update() {
        for (Eslabon eslabon : eslabones) {
            eslabon.update();
        }

        for (int i = eslabones.size() - 1; i > 0; i--) {
            eslabones.get(i).setDireccion(eslabones.get(i - 1).getDireccion());
        }

    }

}
