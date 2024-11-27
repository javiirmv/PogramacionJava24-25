/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class EX2 {

    public static void main(String[] args) {
        int notas[][] = {
            {3, 4, 8, 9},
            {4, 5, 7, 10},
            {2, 7, 10, 8},
            {5, 3, 6, 7},
            {4, 2, 5, 8},};
        String asignaturas[] = {"Programación", "Marcas", "Entornos", "Base Datos"};
        String alumnos[] = {"Alumno1", "Alumno2", "Alumno3", "Alumno4", "Alumno5"};

        double medias = 0;
        int suspensas = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < 5) {
                    System.out.printf("%s ha suspendido %s\n", alumnos[i], asignaturas[j]);
                    medias += notas[i][j];
                    suspensas++;
                }
            }
        }

        double mediaSuspensas = medias / suspensas;

        System.out.printf("La media de suspensas es: %.2f", mediaSuspensas);
        System.out.println();

        for (int i = 0; i < notas.length; i++) {
            double mediaAlumno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                mediaAlumno += (notas[i][j]);
            }

            if (mediaAlumno / notas[i].length > 5) {
                System.out.printf("La media de %s es %.2f\n", alumnos[i], (mediaAlumno / notas[i].length));
            }
        }

    }

}
