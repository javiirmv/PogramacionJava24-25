/*
Modificar el contenido de cada elemento del vetor
multiplicandolo por 2
 */
package Primera;


public class Ejercicio015_2 {
    public static void main(String arg[]){        
        int datos[] = {-17,-5,-93};
        int posicion = 0;
        
        for (int i = 1; i < datos.length ; i++){
            if (datos[i] > datos[posicion]){
                posicion = i;
            }
        }
        
        System.out.println(datos[posicion]);

    }
}
