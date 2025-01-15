package Segunda.Ejercicio09;

import java.awt.Event;
import java.awt.Frame;


public class Restaurante extends Frame {

    String comidas[] = {"Desayuno", "Almuerzo", "Cena"};
    String platos[][] = {
        {"Café", "Leche", "Tostadas", "Aire"},
        {"Paella", "Sopa", "Macarrones", "Cachopo"},
        {"Tortilla", "Sopa", "Arroz 534 delicias", "Kebab"},
    };
    
    public static void main(String[] args) {
        Restaurante app = new Restaurante();
    }

    public Restaurante() {
        super("Restaurante Salesianos");

        setUp();

        this.pack(); // Meter dentro del frame
        this.setSize(400, 300); // Pone el tamaño del objeto
        this.setVisible(true);

    }

    public void setUp() {
       

    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;

        }

        return false;
    }

}
