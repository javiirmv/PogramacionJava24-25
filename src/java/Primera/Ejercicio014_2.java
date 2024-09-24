/*
Modificar el contenido de cada elemento del vetor
multiplicandolo por 2
 */
package Primera;


public class Ejercicio014_2 {
    public static void main(String arg[]){
        int datos[] = {17,33,4,75,170};
        
        for (int i = 0; i < datos.length ; i++){
            datos[i] *= 2;
            System.out.println(datos[i]);
        }
            
    }
}
