/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class EX4 {

    public static void main(String[] args) {

        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0;
        int fin = 0;
        int contVocales = 0;

        char vocales[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == ' ') {
                fin = i;
                boolean mayus = false;
                while (inicio < fin) {
                    for (int x = 0; x < vocales.length; x++) {
                        if (frase[inicio] == vocales[x]) {
                            mayus = true;
                        }
                    }

                    inicio++;
                }
                if (mayus) {
                    contVocales++;
                }
                inicio = i + 1;
            }

        }

        System.out.println(contVocales);
    }

}
