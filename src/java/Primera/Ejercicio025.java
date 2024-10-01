/*
Pasar una posicion a la izquierda:
20,30,40,50,10
 */
package Primera;

public class Ejercicio025 {

    public static void main(String arg[]) {

        int maxNumber = 10;

        for (int i = 1; i <= maxNumber; i++) {

            System.out.println("Tabla del: " + i);

            for (int x = 1; x <= 10; x++) {
                System.out.print(x * i + " ");
            }

            System.out.println();
        }

    }
}
