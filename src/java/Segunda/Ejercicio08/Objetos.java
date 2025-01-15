package Segunda.Ejercicio08;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
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
        paneles[1][0].add(new MiChoice(opciones, textArea));

        String deportes[] = {"Furbo", "Baloncesto", "Tenis", "Petanca", "!GIMNASIO!"};
        paneles[1][1].add(new MiLista(10, true, deportes, textArea));

        paneles[1][2].add(new MiCanvas());

        String alimentos[] = {"Patatas", "Cebollas", "Tomates", "Lechuga"};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                principal.add(paneles[i][j]);

            }
        }

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
        this.textArea = text;
    }

    public boolean action(Event ev, Object obj) {
        textArea.setText(" ");
        return false;
    }
}

class MiChoice extends Choice {

    TextArea textArea;

    public MiChoice(String opciones[], TextArea textArea) {
        super();

        this.textArea = textArea;

        for (int i = 0; i < opciones.length; i++) {
            this.add(opciones[i]);
        }
    }

    public boolean action(Event ev, Object obj) {
        textArea.setText(obj.toString());
        return false;
    }
}

class MiLista extends List {

    TextArea textArea;

    public MiLista(int rows, boolean multipleMode, String[] deportes, TextArea textArea) {
        super(rows, multipleMode);

        for (int i = 0; i < deportes.length; i++) {
            this.add(deportes[i]);
        }

        this.textArea = textArea;

    }

    public boolean handleEvent(Event ev) {

        if (ev.id == Event.LIST_SELECT || ev.id == Event.LIST_DESELECT) {
            textArea.setText(" ");

            for (int i = 0; i < this.getSelectedItems().length; i++) {
                textArea.setText(textArea.getText().concat("\n").concat(this.getSelectedItems()[i]));

            }

            return true;
        }

        return false;
    }

}

class MiCanvas extends Canvas {
    int posx = 20;
    int posy = posx;
    public MiCanvas() {
        super();
        this.setSize(150, 150);
        this.setBackground(Color.yellow);
        this.setForeground(Color.red);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.fillRect(posx, posy, 30, 30);
        g.setColor(Color.red);
        
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        posx = x;
        posy = y;
        
        repaint();
                
        return false;
    }

}

class MiCheckBoxGroup extends Panel{
    Checkbox checkBoxes[];
    TextField resultado;

    public MiCheckBoxGroup(String[] elementos) {
        super();
        this.setLayout(new GridLayout(elementos.length +1, 1));
        checkBoxes = new Checkbox[elementos.length];
        
        for (int i=0; i<elementos.length; i++){
            checkBoxes[i] = new Checkbox(elementos[i]);
        }
    }
    
}