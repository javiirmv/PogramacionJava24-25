/*
 Resta con divisiones

9/2 = 0
7/2 = 1
5/2 = 2
3/2 = 3
1/2 = 4

resto 1

 */
package Primera;

public class Ejercicio013 {

    public static void main(String arg[]) {
        int dividendo = 3;
        int divisor = 3;
        int cociente = 0;
        int resto = 0;
        
        for (int i = dividendo; i >= divisor; i = i - divisor) {
            cociente ++;
            resto = i - divisor;
        }

        System.out.println("Cociente: " + cociente + " Resto: " + resto);
    }
}
