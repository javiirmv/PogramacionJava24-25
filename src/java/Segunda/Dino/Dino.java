package Segunda.Dino;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Dino extends Rectangle {

    private Image imagen;

    private int originalHeight = 300;
    private int originalWidth = 279;

    private int scale = 2;

    private int scaledHeight = originalHeight / scale;
    private int scaledWidth = originalWidth / scale;

    private int velY = 15;

    public Dino() {
        super(300, 1000, 0, 0); 
        this.height = scaledHeight;
        this.width = scaledWidth;
        this.y = (1000 - scaledHeight);


        imagen = new ImageIcon(getClass().getResource("/imagenes/dino.png")).getImage();
    }

    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }

    public boolean update() {

        if (this.y <= (990 - this.scaledHeight)) {
            this.y += velY;
        }

        return false;
    }

    public void jump() {
        if (this.y >= (990 - this.scaledHeight)) {
            new Thread(() -> {
                for (int i = 0; i < 30; i++) {
                    this.y -= (60 - (i * 3));

                    try {
                        Thread.sleep(20); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

}
