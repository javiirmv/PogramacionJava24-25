/*
Modificar el contenido de cada elemento del vetor
multiplicandolo por 2
 */
package Primera;

public class Ejercicio016 {

    public static void main(String arg[]) {

        int datos[] = {-17, -5, -93, 92, 104};
        int mayor = datos[0];
        int menor = datos[0];

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i];
            }
            
            if (datos[i] < menor){
                menor = datos[i];
            }
        }

        System.out.printf("El mayor es: %d, y el menor es %d\n", mayor, menor);

    }
}
