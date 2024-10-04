/*
/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio034 {

    public static void main(String arg[]) {

        int salas[][] = {
            {10, 20, 30, 40, 50, 200, 180},
            {50, 60, 70, 80, 80, 300, 198},
            {90, 100, 110, 120, 130, 150, 120},
            {9, 199, 150, 180, 13, 100, 190}};

        String peliculas[] = {"Joker", "Soy Nevenka", "Buffalo Kids", "Los destellos"};
        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        int max = 0;
        int maxJ = 0;
        int maxI = 0;

        int min = 0;
        int minJ = 0;
        int minI = 0;

        int ventas[] = {0, 0, 0, 0};
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                ventas[i] += salas[i][j];
                if (salas[i][j] > max) {
                    max = salas[i][j];
                    maxJ = j;
                    maxI = i;
                    min = max;
                }

                if (salas[i][j] < min) {
                    min = salas[i][j];
                    minJ = j;
                    minI = i;
                }
            }
        }

        System.out.printf("El día mas vendido fue %s, con la peli %s, con %d entradas vendidas.\n", dias[maxJ], peliculas[maxI], salas[maxI][maxJ]);
        System.out.printf("El día mas menos fue %s, con la peli %s, con %d entradas vendidas.\n", dias[minJ], peliculas[minI], salas[minI][minJ]);

    }
}
