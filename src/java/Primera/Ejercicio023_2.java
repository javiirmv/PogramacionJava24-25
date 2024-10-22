/*
Pasar una posicion a la izquierda:
20,30,40,50,10
 */
package Primera;

public class Ejercicio023 {

    public static void main(String arg[]) {

        int datos[] = {10, 20, 30, 40, 50};

        for (int vueltas = datos.length; vueltas > 0; vueltas--) {

            int aux = datos[datos.length - 1];

            for (int i = datos.length - 1; i > 0; i--) {
                datos[i] = datos[i - 1];
            }

            datos[0] = aux;
            for (int i = 0; i < datos.length; i++) {
                System.out.println(datos[i]);
            }

            System.out.println("-------------");
        }

    }
}
