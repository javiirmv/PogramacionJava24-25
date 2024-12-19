package Segunda.Ejercicio06;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class FrameApp extends Frame {

    MenuBar porDefecto, alternativo;

    String tituloInicial;

    public static void main(String[] args) {
        FrameApp app = new FrameApp();
    }

    public FrameApp() {
        super("Trabajando con Frames");

        tituloInicial = this.getTitle();

        setUp();
        setUpMenu();

        this.pack(); // Meter dentro del frame
        this.setSize(700, 700);
        this.setVisible(true);

    }

    public void setUp() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(4, 1));

        principal.add(new Label("Cambian las características de la ventana", Label.CENTER));

        Panel panel1 = new Panel();
        panel1.add(new Button("Título"));
        panel1.add(new Button("MenuBar"));
        panel1.add(new Button("Resizable"));

        principal.add(panel1);

        principal.add(new Label("Salidas en la ventana", Label.CENTER));

        Panel panel2 = new Panel();
        panel2.add(new Button("Cursor"));
        panel2.add(new Button("Background"));
        panel2.add(new Button("Foreground"));
        panel2.add(new Button("Font"));

        principal.add(panel2);

        this.add("South", principal);

    }

    private void setUpMenu() {
        porDefecto = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Exit"));
        porDefecto.add(fileMenu);

        alternativo = new MenuBar();
        Menu archivoMenu = new Menu("Archivo");
        archivoMenu.add(new MenuItem("Salir"));
        alternativo.add(archivoMenu);

        this.setMenuBar(porDefecto);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Button) {
                if (ev.arg == "Título") {
                    if (this.getTitle() == tituloInicial) {
                        this.setTitle("Pulsado");
                    } else {
                        this.setTitle(tituloInicial);
                    }
                    return true;
                } else if (ev.arg == "MenuBar") {
                    if (this.getMenuBar() == porDefecto) {
                        this.setMenuBar(alternativo);
                    } else {
                        this.setMenuBar(porDefecto);

                    }

                }
            }
        }

        return false;
    }

}
