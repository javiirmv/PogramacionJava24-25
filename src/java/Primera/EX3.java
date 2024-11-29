/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class EX3 {

    public static void main(String[] args) {

        String[] escrito1 = {"", "Uno", "Dos", "Tres", "Cuatro",
            "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
        String[] escrito2 = {"", "Diez y", "Veinte y", "Treinta y", "Cuerenta y",
            "Ciencuenta y", "Sesenta y", "Setenta y", "Ochenta y", "Noventa y"};
        String[] escrito3 = {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos",
            "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};
        int numero = 198;

        for (int i = 2; i >= 0; i--) {
            int numeroPotenciado = (int) Math.pow(10, i);
            int numeroTexto = ((numero / numeroPotenciado) % 10);

            if (numeroTexto != 0) {
                if (i == 2) {
                    System.out.print(escrito3[numeroTexto] + " ");
                } else if (i == 1) {
                    System.out.print(escrito2[numeroTexto] + " ");
                } else {
                    System.out.print(escrito1[numeroTexto] + " ");
                }
            }

        }

    }

}
