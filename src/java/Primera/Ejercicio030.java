/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio030 {

    public static void main(String arg[]) {

        int tabla[][] = {
            {10, 20, 30, 40, 50},
            {50, 60, 70, 80, 80},
            {90, 100, 110, 120, 30}};

        String productos[] = {"Naranjas", "Manzanas", "Peras"};

        for (int i = 0; i < tabla.length; i++) {
            int kilos = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                kilos += tabla[i][j];
            }
            System.out.printf("Se han vendido %d kilos de %s \n", kilos, productos[i]);
        }
    }
}
