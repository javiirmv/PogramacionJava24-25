package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Gun extends Rectangle {

    int velX = 15;

    public Gun() {
        super(140, 260, 20, 40);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }

    public void setX(boolean direction) {
        if (direction && x < 300 - 65) {
            this.setLocation(x + velX, y);
        } else if (!direction && x > 0 + 5) {
            this.setLocation(x - velX, y);
        }
    }

}
