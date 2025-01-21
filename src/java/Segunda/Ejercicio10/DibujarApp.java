package Segunda.Ejercicio10;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class DibujarApp extends Frame {

    public static void main(String[] args) {
        DibujarApp app = new DibujarApp();
    }

    public DibujarApp() {
        super("Dibujar");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(800, 600); // Pone el tamaño del objeto
        this.setVisible(true);

    }


    public void setUp() {
        setupMenuBar();

        DosPuntos prueba = new DosPuntos(10, 10, 20, 20, 1);
    }

    private void setupMenuBar() {
        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menuBar.add(menu1);

        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Línea"));
        menu2.add(new MenuItem("Óvalo"));
        menu2.add(new MenuItem("Rectánglo"));
        menuBar.add(menu2);
        this.setMenuBar(menuBar);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;

        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg == "Salir") {
                    System.exit(0);
                    return true;
                }
            }
        }
        return false;
    }

}
