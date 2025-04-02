package Tercera.Ejercicio06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle {

    public static final int DIM = 60;
    int valor;
    Color color;

    public Casilla(int x, int y, int valor, Color color) {
        this.x = x;
        this.y = y;
        this.width = DIM;
        this.height = DIM;

        this.valor = valor;
        this.color = color;
    }

public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(x, y, width, height);
    g.setColor(Color.white);
    g.drawRect(x, y, width, height);
    g.setColor(Color.white);

    g.setFont(new Font("Arial", Font.BOLD, 25)); 

    g.drawString("" + valor, x + 16, y + 40);
}


}
