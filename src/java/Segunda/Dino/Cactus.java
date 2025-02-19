package Segunda.Dino;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Cactus extends Rectangle {

    private Image imagen;

    private int originalHeight = 500;
    private int originalWidth = 289;

    private int scale = 4;

    private int scaledHeight = originalHeight / scale;
    private int scaledWidth = originalWidth / scale;

    public static int velX = 15;

    public Cactus() {
        super(1500, 1000, 0, 0); 
        this.height = scaledHeight;
        this.width = scaledWidth;
        this.y = (1000 - scaledHeight);


        imagen = new ImageIcon(getClass().getResource("/imagenes/cactus.png")).getImage();
    }

    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }

    public boolean update() {

        this.x -= velX;
        
        if (this.x <0-this.scaledWidth){
            return true;
        }
        
        return false;
    }
}
