/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenEJ2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Circulo extends Rectangle {

    private Color color;
    private final int velX;
    private final int velY;
    private final Random r;

    int cont = 1;
    
    Color[] colors = {Color.RED, Color.ORANGE, Color.CYAN, Color.PINK, Color.BLUE, Color.GREEN};

    public Circulo() {
        super((300 - 60) / 2, (300 - 60) / 2, 60, 60);
        this.color = Color.RED;
        r = new Random();
        velX = r.nextInt(8) - 4;
        velY = r.nextInt(8) - 4;

    }

    public void paint(Graphics g) {
        g.setColor(colors[cont-1]);
        g.fillOval(this.x, this.y, this.width, this.height);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString(String.valueOf(cont), this.x + (this.width / 2) - 7, this.y + (this.height / 2) + 10);

    }

    public void update() {
        this.x += velX;
        this.y += velY;
    }

    public boolean addNumber() {
        this.cont += 1;

        if (this.cont >= 6) {
            return true;
        }
        
        return false;
    }

}
