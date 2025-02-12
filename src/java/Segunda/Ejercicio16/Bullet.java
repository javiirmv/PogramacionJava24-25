package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends Rectangle {

    int velY = 10;

    public Bullet(int posX) {
        super(posX, 250, 10, 20);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
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
