package Segunda.Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public class Pelota extends Rectangle {
    //Aqui no ponemos los final porque es solo un objeto no los necesitamos

    int velX, velY;

    public Pelota() { //se le podria pasar la raqueta que ya está siendo controlada en el Applet
        super(136, 230, 13, 13);
        this.velX = 5;
        this.velY = 5;
       

    }

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(x, y, width, height);
    }

    public boolean update(Raqueta raqueta, List<Ladrillo> ladrillos) {
        this.x += velX;
        this.y += velY;

        if (this.x <= 0 || this.x + width >= 300) {
            velX = -velX;
        }

        if (this.y <= 0) {
            velY = -velY;
        }
        
        if(this.y >=300-height)
            return false; // cuando se ejecuta un return se acaba la funcion;

        if (this.intersects(raqueta)) //objeto de la clase pelota a traves de la cual llamo al metodo upadte.
        {
            velY = -velY;
        }

        for (Ladrillo ladrillo:ladrillos)
            if (this.intersects(ladrillo)) {
                ladrillos.remove(ladrillo); // se le puede pasar el int o el objeto a leiminat; 
                velY = -velY;
                break;
            }
        return true;
    }

}