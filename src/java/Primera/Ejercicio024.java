/*
Pasar una posicion a la izquierda:
20,30,40,50,10
 */
package Primera;

public class Ejercicio024 {

    public static void main(String arg[]) {

        int datos[] = {10, 20, 30, 40, 50};
        int multiplos[] = {3, 5, 7};

        for (int i = 0; i < multiplos.length; i++) {

            for (int x = 0; x  < datos.length; x++ ) {
                System.out.print(datos[x] * multiplos[i] + " ");
            }
            
            System.out.println("");
        }

    }
}
