package Tercera.Ejercicio05;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Casilla extends Rectangle {

    public static final int TAM = 17;
    private Image mina;
    Image reverso;
    private boolean tapada;
    private int alrededor = 0;

    public Casilla(int posX, int posY, Image rev) {
        super(posX, posY, TAM, TAM);
        reverso = rev;
        tapada = false;
        alrededor = 0;
    }

    public void paint(Graphics g, Applet a) {
        g.drawRect(x, y, width, height);
        if (tapada) {
            g.drawImage(reverso, this.x, this.y, a);
        } else if (mina != null) {
            g.drawImage(mina, this.x, this.y, a);
        } else {
            g.drawString("" + alrededor, x + 4, y + 13);
        }

    }

    public Image getMina() {
        return mina;
    }

    public void setMina(Image mina) {
        this.mina = mina;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }

    public int getAlrededor() {
        return alrededor;
    }

    public void setAlrededor(int alrededor) {
        this.alrededor = alrededor;
    }

}
