package Segunda.Ejercicio06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class FrameApp extends Frame {

    MenuBar porDefecto, alternativo;
    String tituloInicial;

    int cursores[] = {DEFAULT_CURSOR, CROSSHAIR_CURSOR, HAND_CURSOR, MOVE_CURSOR, NE_RESIZE_CURSOR, E_RESIZE_CURSOR};
    int posCursor = 0;

    Color colores[] = {Color.CYAN, Color.YELLOW, Color.GREEN, Color.ORANGE};
    int posColor = 0;

    String fuentes[] = {"Serif", "Arial"};
    int posFuente = 0;

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

    public void paint(Graphics g) {
        g.drawString("Cambia el color al pulsar Foreground", 100, 150);
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
                    return true;
                } else if (ev.arg == "Resizable") {
                    this.setResizable(!this.isResizable());
                    return true;
                } else if (ev.arg == "Cursor") {
                    posCursor++;
                    if (posCursor >= cursores.length) {
                        posCursor = 0;
                    }
                    this.setCursor(cursores[posCursor]);
                    return true;
                } else if (ev.arg == "Foreground") {
                    this.setForeground(colores[(posColor++) % colores.length]);
                    return true;
                } else if (ev.arg == "Background") {
                    this.setBackground(colores[(posColor++) % colores.length]);
                    return true;
                } else if (ev.arg == "Font") {
                    this.setFont(new Font(fuentes[(posFuente++) % fuentes.length], Font.BOLD, 14));
                    return true;
                }
            }
        }

        return false;
    }

}
