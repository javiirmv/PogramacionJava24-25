/*
Implementar un método al que se le pase una matriz de 3*3 de enteros y devuelva otra matriz de 3*3 
con los valores de la matriz original rotados 90º.  Tal y como veis en el ejemplo.  
El contenido de la matriz rotada debe mostrarse por pantalla.	
 */
package Primera.JavierMorerValero;

public class Ejercicio_03 {

    public static void main(String arg[]) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

        int[][] matrizRotada = rotar90(matriz);

        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = matrizRotada[i].length - 1; j >= 0; j--) {
                System.out.print(matrizRotada[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] rotar90(int[][] matriz) {
        int[][] nuevaMatriz = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                nuevaMatriz[i][j] = matriz[j][i];
            }
        }

        return nuevaMatriz;

    }

}
