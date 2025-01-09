package Segunda.Ejercicio07;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditorApp extends Frame {

    MenuBar menubar;
    TextArea texto;
    FileDialog abrirFichero, guardarFichero;
    String ruta;

    public static void main(String[] args) {
        EditorApp app = new EditorApp();
    }

    public EditorApp() {
        super("Editor de textos");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(texto.minimumSize()); // Pone el tamaño del objeto
        this.setVisible(true);

    }

    public void setUp() {
        setUpMenu();

        texto = new TextArea(50, 150);

        this.add("Center", texto);
        abrirFichero = new FileDialog(this, "Abrir Fichero", FileDialog.LOAD);
        guardarFichero = new FileDialog(this, "Guardar Fichero", FileDialog.SAVE);

    }

    private void setUpMenu() {
        menubar = new MenuBar();
        Menu fileMenu = new Menu("Archivo");
        fileMenu.add(new MenuItem("Nuevo"));
        fileMenu.add(new MenuItem("Abrir"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Guardar"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Salir"));

        menubar.add(fileMenu);

        this.setMenuBar(menubar);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                } else if (ev.arg.equals("Nuevo")) {
                    texto.setText(" ");
                } else if (ev.arg.equals("Abrir")) {
                    abrirFichero.setVisible(true);
                    ruta = abrirFichero.getDirectory().concat(abrirFichero.getFile());

                    leerFichero(ruta);

                } else if (ev.arg.equals("Guardar")) {
                    guardarFichero.setVisible(true);
                    ruta = abrirFichero.getDirectory().concat(abrirFichero.getFile());

                    guardarFichero(ruta);
                }
            }
        }

        return false;
    }

    public void leerFichero(String ruta) {
        System.out.println(ruta);

        DataInputStream inStream;

        try {
            inStream = new DataInputStream(new FileInputStream(ruta));
            String nuevoTexto = "";
            String linea;

            while ((linea = inStream.readLine()) != null) {
                nuevoTexto = nuevoTexto.concat(linea).concat("\n");
            }

            texto.setText(nuevoTexto);

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

    public void guardarFichero(String ruta) {
        String textoLeer = texto.getText();

        DataOutputStream outStream;

        try {
            outStream = new DataOutputStream(new FileOutputStream(ruta));

            outStream.writeBytes(textoLeer);

        } catch (FileNotFoundException e) {
        } catch (IOException e) {

        }
    }

}
