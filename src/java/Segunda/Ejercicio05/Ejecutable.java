package Segunda.Ejercicio05;

import java.util.Random;

public class Ejecutable {

    public static void main(String[] args) {

        Random r;

        r = new Random();

        int numAleatorio = r.nextInt(30);
        
        System.out.println(numAleatorio);

    }
}
