/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class EX4_3 {

    public static void main(String[] args) {

        String frase = "Había una vez, un circo, que alegraba siempre el corazón. ";
        int inicio = 0;
        int fin = frase.indexOf(' ');

        int contVocales = 0;

        char vocales[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        while (fin != -1) {
            boolean tieneVocal = false;
            while (inicio < fin) {
                for (int x = 0; x < vocales.length; x++) {
                    if (vocales[x] == frase.charAt(inicio)) {
                        tieneVocal = true;
                    }
                }
                inicio++;
            }
            if (tieneVocal) {
                contVocales++;
            }
            inicio = fin + 1;
            fin = frase.indexOf(' ', inicio);
        }

        System.out.println(contVocales);
    }

}
