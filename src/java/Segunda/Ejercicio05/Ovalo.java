/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segunda.Ejercicio05;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ovalo {

    int posX, posY, anchura, altura;
    Color color;
    Random r;
    int cont = 0;
    
    public Ovalo() {
        r = new Random();
        inicializar();
    }

    public void inicializar() {
        this.posX = r.nextInt(600);
        this.posY = r.nextInt(600);
        this.anchura = r.nextInt(400) + 100;
        this.altura = r.nextInt(400) + 100;

        this.color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(posX, posY, anchura, altura);
    }

}
