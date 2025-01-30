package Segunda.Ejercicio13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota extends Rectangle {

    int velX, velY;
    Color color;

   Color colores[] = {Color.RED, Color.YELLOW, Color.MAGENTA, Color.BLUE, Color.ORANGE};
    
    public Pelota() {
        super((int) (Math.random() * 250), (int) (Math.random() * 250), 0, 0);

        int radio = (int) ((Math.random() * 30) + 20);

        this.height = this.width = radio;

        int velX = (int) ((Math.random() * 11) - 5);
        int velY = (int) ((Math.random() * 11) - 5);

        Color color = colores[(int) (Math.random() * colores.length)];
        
    }   

    
    public void paint(Graphics g){
        g.fillOval(x, y, width, height);
    
    }
    
    public void actualizar(){
    
    }
    
}
