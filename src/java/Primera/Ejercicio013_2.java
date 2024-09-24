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

public class Ejercicio013_2 {

    public static void main(String arg[]) {
        int dividendo = 9;
        int divisor = 2;
        int cociente = 0;
        int resto = 0;
        
        int startDividendo = dividendo;
        
        while (dividendo>=divisor){
            dividendo -= divisor;
            cociente ++;
        }
        
        resto = dividendo;

        System.out.printf("%d divido para %d es %d, resto: %d\n",startDividendo,divisor,cociente,resto);
    }
}
