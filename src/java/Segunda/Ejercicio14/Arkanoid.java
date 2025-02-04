package Segunda.Ejercicio14;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Arkanoid extends Applet {

    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;

    List<Ladrillo> ladrillos;

    Color colores[] = {Color.RED, Color.YELLOW, Color.BLUE, Color.PINK, Color.ORANGE};

    public void init() {
        this.setSize(300, 300);
        ladrillos = new ArrayList<Ladrillo>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                ladrillos.add(new Ladrillo((j * (28 + 2))+1, ((Ladrillo.ALTURA + 2) * i)+10, colores[i]));
            }
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < ladrillos.size(); i++) {
            ladrillos.get(i).paint(g);
        }
    }

}
