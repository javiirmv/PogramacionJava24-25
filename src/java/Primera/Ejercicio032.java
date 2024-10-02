/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio032 {

    public static void main(String arg[]) {

        int salas[][] = {
            {10, 20, 30, 40, 50, 200, 180},
            {50, 60, 70, 80, 80, 300, 198},
            {90, 100, 110, 120, 130, 150, 120}};

        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        int ventas[] = {0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                ventas[j] += salas[i][j];
            }
        }
        
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < dias.length; i++) {
            if (ventas[i] > ventas[mayor]) {
                mayor = i;
            }

            if (ventas[i] < ventas[menor]) {
                menor = i;
            }
        }

        System.out.printf("El día que más se vendió fue el %s con %d\n", dias[mayor], ventas[mayor]);
        System.out.printf("El día que menos se vendió fue el %s con %d\n", dias[menor], ventas[menor]);

    }
}
