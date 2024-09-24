/*
Modificar el contenido de cada elemento del vetor
multiplicandolo por 2
 */
package Primera;


public class Ejercicio015 {
    public static void main(String arg[]){
        int datosOld[] = {17,33,4,95,170,5};
        int datos[] = {-17,-5,-93};
        int mayor = datos[0];
        
        for (int i = 0; i < datos.length ; i++){
            if (datos[i] > mayor){
                mayor = datos[i];
            }
        }
        
        System.out.println(mayor);

    }
}
