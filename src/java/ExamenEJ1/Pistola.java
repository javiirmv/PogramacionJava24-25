package ExamenEJ1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pistola extends Rectangle {

    Color color;

    public Pistola(int posX, Color color) {
        super(posX, 260, 20, 40);
        
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }




}
