/*
Implementa un programa en el que, dada una cadena de caracteres, elimine todos los 
caracteres duplicados consecutivos.  Actuando sobre la cadena original.
Ennn un luugarrr dde La Maaaancha
En un lugar de La Mancha	
            while (frase[i + cont] == frase[i + cont + 1]) {
                frase[i + cont] = frase[i + 1 + cont];
                cont++;

            }
 */
package Primera.JavierMorerValero;

public class Ejercicio_04 {

    public static void main(String arg[]) {

        char frase[] = {'E', 'n', 'n', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'u', 'g', 'a', 'r', 'r', 'r', ' ', 'd', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'a', 'a', 'a', 'n', 'c', 'h', 'a', ' ', ' '};

        int i = 1;
        int palabras = 0;
        while (palabras < frase.length - 1) {
            palabras++;
            int cont = 0;
            if (frase[i] == frase[i - 1] && i < frase.length) {
                for (int x = i; x < frase.length - 1; x++) {
                    frase[x + cont - 1] = frase[x + cont];
                }

                cont++;
            } else {
                i++;
            }
        }

        System.out.println(frase);

    }

}
