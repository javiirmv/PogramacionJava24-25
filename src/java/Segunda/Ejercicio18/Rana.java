package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Rana extends Rectangle {

    public Rana() {

        super(30, 30, 30, 30);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }

}
