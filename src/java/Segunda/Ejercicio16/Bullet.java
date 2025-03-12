package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends Rectangle {

    int velY = 10;
    Color color;
    
    public Bullet(int posX, Color color) {
        super(posX, 250, 10, 20);
        this.color = color,
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public boolean update() {
        this.setLocation(x, y - velY);

        if (this.y < -20) {
            return true;
        }
        return false;
    }
}
