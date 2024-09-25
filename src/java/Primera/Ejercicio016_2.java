/*
Modificar el contenido de cada elemento del vetor
multiplicandolo por 2
 */
package Primera;

public class Ejercicio016_2 {

    public static void main(String arg[]) {

        int datos[] = {-17, -5, -93, 92, 104};
        int mayor = 0;
        int menor = 0;

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > datos[mayor]) {
                mayor = i;
            }
                        
            if (datos[i] < datos[menor]){
                menor = i;
            }
        }

        System.out.printf("El mayor es: %d, y el menor es %d\n", datos[mayor], datos[menor]);

    }
}
