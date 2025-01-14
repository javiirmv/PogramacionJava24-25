package Segunda.Ejercicio08;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Objetos extends Frame {

    TextArea textArea;

    public static void main(String[] args) {
        Objetos app = new Objetos();
    }

    public Objetos() {
        super("Trabajando con objetos de Java");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(800, 800); // Pone el tamaño del objeto
        this.setVisible(true);

    }

    public void setUp() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3, 3));

        Panel paneles[][] = new Panel[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                paneles[i][j] = new Panel();
                paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
            }
        }

        paneles[0][0].add(new Label("Campo de texto:"));
        paneles[0][0].add(new MiTextField("", 15));

        textArea = new TextArea("", 15, 30);
        textArea.setBackground(Color.yellow);

        paneles[0][1].add(textArea);

        paneles[0][2].add(new MiBoton("Borrar text area", textArea));

        String opciones[] = {"Sí", "No", "Quizás"};
        
        principal.add(paneles[0][0]);
        principal.add(paneles[0][1]);
        principal.add(paneles[0][2]);

        principal.add(paneles[1][0]);

        this.add("Center", principal);

    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;

        }

        return false;
    }

}

class MiTextField extends TextField {

    public MiTextField(String text, int columns) {
        super(text, columns);
    }

    public boolean action(Event ev, Object obj) {
        String texto = this.getText();
        this.setText(texto.toUpperCase());

        return false;
    }

}

class MiBoton extends Button {

    TextArea textArea;

    public MiBoton(String nombre, TextArea text) {
        super(nombre);

    }

    public boolean action(Event ev, Object obj) {
        textArea.setText(" ");
        return false;
    }
}
