/*
Negativos de array se conviertan en positivos
 */
package Primera;

public class Ejercicio018_2 {

    public static void main(String arg[]) {

        int datos[] = {10, -20, 30, -40, 50};

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > 0){
                datos[i] *= 2;
            } else {
                datos[i] *= -1;
            }
            
            System.out.println(datos[i]);
        }

    }
}
