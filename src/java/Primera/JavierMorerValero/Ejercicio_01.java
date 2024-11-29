/*
Implementa una función que reciba un vector de 10 enteros y un número entero ‘n’ y devuelva
un nuevo vector que contenga sólo los elementos del primer vector que sean mayores que ‘n’.
8 + 4 +7 = 19
 */
package Primera.JavierMorerValero;

public class Ejercicio_01 {

    public static void main(String arg[]) {

        int[] numeros = {40, 70, 110, 20, 15, 35, 95, 65, 90, 200};
        int n = 50;

        int[] mayores = numerosMayores(n, numeros);
        
        for (int i = 0; i < mayores.length; i++){
            System.out.println(mayores[i]);
        }
        
    }

    public static int[] numerosMayores(int n, int[] numeros) {
        int cont = 0;
        int[] mayores = new int[numeros.length];

        for (int i = 0; i < mayores.length; i++) {
            if (numeros[i] > n){
                mayores[cont] = numeros[i];
                cont++;
            }
        }

        return mayores;
    }

}
