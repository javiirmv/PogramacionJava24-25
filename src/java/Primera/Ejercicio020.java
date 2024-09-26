/*
Pasar una posicion a la izquierda:
20,30,40,50,10
 */
package Primera;

public class Ejercicio020 {

    public static void main(String arg[]) {

        int datos[] = {10, 20, 30, 40, 50};
        int aux = datos[0];

        for (int i = 0; i < datos.length; i++) {

            if (i == datos.length - 1) {
                datos[i] = aux;
            } else {
                datos[i] = datos[i + 1];
            }

            System.out.println(datos[i]);

        }
    }
}
