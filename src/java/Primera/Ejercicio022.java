/*
Bucles anidados
 */
package Primera;

public class Ejercicio022 {

    public static void main(String arg[]) {

        int contador = 0;
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Fila: " + i + ", columna: "+ j);
                contador++;
            }
        }
        
        System.out.println("Se ha ejecutado " + contador + " veces.");
        
    }
}
