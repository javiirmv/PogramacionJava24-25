package ExamenEJ1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bala extends Rectangle {

    int velY = 5;
    Color color;
    
    public Bala(int posX, Color color) {
        super(posX, 250, 10, 20);
        this.color = color;
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
