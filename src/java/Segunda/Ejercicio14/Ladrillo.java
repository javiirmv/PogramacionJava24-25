
package Segunda.Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Ladrillo extends Rectangle {

    Color color;

    public static final int ANCHURA = 28;
    public static final int ALTURA = 10;

    public Ladrillo(int x, int y, Color color) {
        super(x, y, ANCHURA, ALTURA);
        this.color = color;
        
        
    }

    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, height);
    }

}
