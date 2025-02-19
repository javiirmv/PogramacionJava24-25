package Segunda.Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Alien extends Rectangle {

    Color color;

    int velY = 3;
    int velX;
    
    public static final int ANCHURA = 28;
    public static final int ALTURA = 10;

    public Alien() {
        super(0, 20, ANCHURA, ALTURA);
        int xRandom = (int) ((Math.random() * 240) + 30);
        this.x = xRandom;
        this.color = Color.cyan;
        this.velX = (int) ((Math.random() * 30) -10);
    }

    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, height);
    }

    public boolean detectar(Bullet bullet) {
        return this.intersects(bullet);

    }

    public boolean update() {
        this.setLocation(x + velX, y + velY);

        
        if (this.y > 330) {
            return true;
        }
        
        if (this.x <= 0 || this.x >= 300 - ANCHURA){
            velX *= -1;
        }
        
        return false;
    }
}
