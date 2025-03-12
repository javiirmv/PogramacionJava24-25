package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Rana extends Rectangle {

    int velY = 30;
    
    public Rana() {
        super(500-50, 1500-100, 100, 100);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }
    
    public void setY(int key){
        this.y -= velY;
    }

}
