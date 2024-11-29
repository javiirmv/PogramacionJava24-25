/*
Implementar un método recursivo que reciba un número entero y devuelva la suma de sus dígitos. 	
 */
package Primera.JavierMorerValero;

public class Ejercicio_05 {

    public static void main(String arg[]) {

        int number = 847;

        System.out.println(sumarDigitos(number, 0));

    }

    public static int sumarDigitos(int number, int suma) {

        if (number <= 0) {
            return suma;
        } else {
            suma = sumarDigitos(number / 10, (number % 10) + suma);
        }

        return suma;
    }

}
