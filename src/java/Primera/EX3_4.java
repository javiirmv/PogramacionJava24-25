/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class EX3_4 {

    public static void main(String[] args) {

        String[][] textoNumeros = {{"", "Uno", "Dos", "Tres", "Cuatro",
            "Cinco", "Seis", "Siete", "Ocho", "Nueve"},
        {"", "Diez y", "Veinte y", "Treinta y", "Cuerenta y",
            "Ciencuenta y", "Sesenta y", "Setenta y", "Ochenta y", "Noventa y"},
        {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos",
            "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"}
        };

        toText(213, textoNumeros, 0);

    }

    public static void toText(int number, String[][] text, int i) {
        if (number > 0) {
            toText(number / 10, text, i+1);
            System.out.print(text[i][number % 10] + " ");
        }
    }
}
