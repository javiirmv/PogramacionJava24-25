package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio074_2 {

    public static void main(String arg[]) {
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char[] sustituir = {'e', 'n', ' '};

        for (int i = 0; i <= frase.length - sustituir.length; i++) {
            int cont = 0;

            for (int j = 0; j < sustituir.length; j++) {
                if (frase[i + j] == sustituir[j]) {
                    cont++;
                }
            }

            if (cont == sustituir.length) {
                for (int k = i; k < frase.length - sustituir.length; k++) {
                    frase[k] = frase[k + sustituir.length];
                }
                
                for (int k = frase.length - sustituir.length; k < frase.length; k++) {
                    frase[k] = ' ';
                }
                
                i--; 
            }
        }

        System.out.println(frase);

    }

}