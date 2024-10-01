/*
Pasar una posicion a la izquierda:
20,30,40,50,10
 */
package Primera;

public class Ejercicio028 {

    public static void main(String arg[]) {

        int tabla[][] = {
            {10, 20, -30, -40},
            {50, 60, -70, 80, },
            {90, 100, -110, -120}};

        int v1[] = {2,4,6};
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] * v1[i] + " ");
            }
            System.out.println();
        }
    }
}
