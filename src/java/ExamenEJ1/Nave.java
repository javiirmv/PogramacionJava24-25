package ExamenEJ1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Nave extends Rectangle {

    Color color;
    int velX = 10;

    public Nave(int posY, Color color) {
        super(138, posY, 30, 30);

        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void update() {

        this.x += velX;

       if (this.x <= 0 || this.x + width >= 300) {
            velX = -velX;
        }

    }

}
