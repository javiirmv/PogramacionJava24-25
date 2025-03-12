package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle {

    int velX;

    public Coche(boolean direccion) {
        super(400, 575, 150, 70);
        if (direccion) {
            this.x = 0-150;
            this.velX = 10;
        } else {
            this.x = 1000+150;
            this.y = 750;
            this.velX = -10;
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

    public boolean update() {
        this.x += velX;
        
        
        
        if (this.x < 0-150 || this.x > 1000+150){
            return true;
        }
        
        return false;
    }

}
