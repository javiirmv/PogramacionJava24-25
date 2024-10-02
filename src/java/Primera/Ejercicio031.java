/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio031 {

    public static void main(String arg[]) {

        int tabla[][] = {
            {10, 20, 30, 40, 50},
            {50, 60, 70, 80, 80},
            {90, 100, 110, 120, 30}};

        String productos[] = {"Naranjas", "Manzanas", "Peras"};
        double precios[] = {1.5, 2, .8};

        double precioTotal = 0;

        for (int i = 0; i < tabla.length; i++) {
            double euros = 0;

            for (int j = 0; j < tabla[i].length; j++) {
                euros += tabla[i][j] * precios[i];
            }

            precioTotal += euros;
            System.out.printf("Se han vendido %.2f euros de %s \n", euros, productos[i]);
        }

        System.out.printf("En total he ganado %.2f euros\n", precioTotal);

    }
}
