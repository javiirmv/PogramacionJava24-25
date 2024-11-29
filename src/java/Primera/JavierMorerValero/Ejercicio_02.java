/*
Dado un String y una palabra específica, implementa un programa que busque todas las apariciones 
de la palabra en el String y la oculte con asteriscos.  También deberá mostrar las posiciones 
en las que ha aparecido la palabra dentro del String.

“El sol brilla, porque el sol es brillante”
“sol”
Resultado:  
“El *** brilla, porque el *** es brillante”
Posiciones: 3, 25	
 */
package Primera.JavierMorerValero;

public class Ejercicio_02 {

    public static void main(String arg[]) {

        String frase = "El sol brilla, porque el sol es brillante";
        String palabra = "sol";

        for (int i = 0; i <= frase.length() - palabra.length(); i++) {
            int cont = 0;

            for (int x = 0; x < palabra.length(); x++) {
                if (frase.charAt(i + cont) == palabra.charAt(cont)) {
                    cont++;
                }
            }

            if (cont == palabra.length()) {
                System.out.println("Posiciones: " + i);

                for (int x = 0; x < palabra.length(); x++) {
                    frase = frase.substring(0, i+x).concat(Character.toString('*')).concat(frase.substring(i+x+1));

                }
            }

        }
        System.out.println(frase);

    }

}
