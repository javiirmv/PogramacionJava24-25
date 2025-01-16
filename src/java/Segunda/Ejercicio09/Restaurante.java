package Segunda.Ejercicio09;

import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Color;

public class Restaurante extends Frame {

    String comidas[] = {"Desayuno", "Almuerzo", "Cena"};
    String platos[][] = {
        {"Café", "Leche", "Tostadas", "Aire"},
        {"Paella", "Sopa", "Macarrones", "Cachopo"},
        {"Tortilla", "Sopa", "Arroz 534 delicias", "Kebab"},};

    Choice chComida;
    List[] listasPlatos;
    List presentar;
    TextField texto;

    public static void main(String[] args) {
        Restaurante app = new Restaurante();
    }

    public Restaurante() {
        super("Restaurante Salesianos");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(800, 600); // Pone el tamaño del objeto
        this.setVisible(true);

    }

    public void setUp() {

        this.add("North", new Label("Elige tu comanda", Label.CENTER));
        this.chComida = new Choice();

        for (int i = 0; i < comidas.length; i++) {
            chComida.add(comidas[i]);
        }

        this.add("West", chComida);

        this.listasPlatos = new List[this.comidas.length];

        for (int i = 0; i < this.comidas.length; i++) {
            listasPlatos[i] = new List(5, true);

            for (int j = 0; j < platos[i].length; j++) {
                listasPlatos[i].add(platos[i][j]);
            }

        }

        presentar = listasPlatos[0];
        this.add("East", presentar);
        texto = new TextField("", 40);

        this.add("South", texto);

    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;

        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Choice) {
                this.remove(presentar);

                presentar = this.listasPlatos[chComida.getSelectedIndex()];

                texto.setText(comidas[chComida.getSelectedIndex()].concat(": "));

                this.add("East", presentar);
                this.setVisible(true);
            }
        } else if (ev.id == Event.LIST_SELECT || ev.id == Event.LIST_DESELECT) {
            
            String frase = comidas[chComida.getSelectedIndex()].concat(": ");
            
            for (int i = 0; i < presentar.getSelectedItems().length; i++){
                frase = frase.concat(presentar.getSelectedItems()[i]).concat(" ");
            }
            
            
            texto.setText(frase);
        }

        return false;
    }

}
