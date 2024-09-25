/*
Negativos de array se conviertan en positivos
 */
package Primera;

public class Ejercicio019 {

    public static void main(String arg[]) {

        int datos[] = {10, -20, 30, -40, 50};
        int media = 0;
        
        for (int i = 0; i < datos.length; i++) {
            media += datos[i];
        }
        
        media = media / datos.length;
        
        System.out.println(media);

    }
}
