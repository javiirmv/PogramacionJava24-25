/*
/*
Mostrar kilos de cada producto que se han vendido

 */
package Primera;

public class Ejercicio035 {

    public static void main(String arg[]) {

        int notas[][] = {
            {7, 9, 3, 8},
            {10, 9, 9, 8},
            {9, 10, 7, 1},
            {3, 10, 5, 6},
            {8, 5, 4, 5}};

        String alumnos[] = {"Javier Marías", "Antonio Muñoz", "Palazon", "Mario", "Javier"};
        String asignaturas[] = {"Programación", "Leng.Marcas", "Web", "Fol"};

        double vAlumnosNota[] = {0, 0, 0, 0, 0};
        double vAsigNota[] = {0, 0, 0, 0};

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                vAlumnosNota[i] += notas[i][j];
                vAsigNota[j] += notas[i][j];
            }
        }

        int mayorPos = 0;
        int menorPos = 0;

        int mayorAsign = 0;
        int menorAsign = 0;

        for (int i = 0; i < vAlumnosNota.length; i++) {

            if (vAlumnosNota[i] > vAlumnosNota[mayorPos]) {
                mayorPos = i;
            }

            if (vAlumnosNota[i] < vAlumnosNota[mayorPos]) {
                menorPos = i;
            }
        }

        for (int i = 0; i < vAsigNota.length; i++) {

            if (vAsigNota[i] > vAsigNota[mayorAsign]) {
                mayorAsign = i;
            }

            if (vAsigNota[i] < vAsigNota[mayorAsign]) {
                menorAsign = i;
            }
        }

        System.out.printf("El mejor alumno es: %s con una media de %.2f\n", alumnos[mayorPos], vAlumnosNota[mayorPos] / asignaturas.length);
        System.out.printf("El peor alumno es: %s con una media de %.2f\n", alumnos[menorPos], vAlumnosNota[menorPos] / asignaturas.length);

        System.out.printf("La mejor asignatura es: %s con una media de %.2f\n", asignaturas[mayorAsign], vAsigNota[mayorPos] / alumnos.length);
        System.out.printf("La mejor peor es: %s con una media de %.2f\n", asignaturas[menorAsign], vAsigNota[menorAsign] / alumnos.length);

    }
}
