package Segunda.Ejercicio05;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class OvalApp extends Frame {

    Ovalo ovalo;

    public static void main(String[] args) {
        OvalApp app = new OvalApp();

    }

    public OvalApp() {
        super("Dibujando óvalos");

        ovalo = new Ovalo();

        this.show();
        this.pack();
        this.resize(900, 900);

        Panel panel = new Panel();

        Button boton1 = new Button("Siguiente");
        panel.add("South", boton1);

        Button boton2 = new Button("Salir");
        panel.add("South", boton2);

        this.add("South", panel);
    }

    public void paint(Graphics g) {
        ovalo.dibujar(g);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Button) {
                if (ev.arg == "Salir") {
                    System.exit(0);
                    return true;
                } else if (ev.arg == "Siguiente") {
                    ovalo.inicializar();
                    repaint();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

}
