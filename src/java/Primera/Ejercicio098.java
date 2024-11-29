/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class Ejercicio098 {

    public static void main(String[] args) {

        toHexadecimal(302, 0);

    }

    public static void toHexadecimal(int number, int i) {
        char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (number <= 0) {
            return;
        } else {
            toHexadecimal(number / 16, i + 1);
            System.out.print(hexadecimal[number % 16]);

        }

    }
}
