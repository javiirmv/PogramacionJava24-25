/*
Modificar el contenido de cada elemento del vetor
multiplicandolo por 2
 */
package Primera;

public class Ejercicio017 {

    public static void main(String arg[]) {

        int datos[] = {10, 20, 30, 40, 50};
        int start = 0;
        int aux = 0;
        
        for (int i = 0; i < datos.length / 2; i++) {
            int otherPosition = datos.length - i - 1;
            aux = datos[i];
            datos[i] = datos[otherPosition];
            datos[otherPosition] = aux;
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }

    }
}
