package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio074 {

    public static void main(String arg[]) {
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char[] sustituir = {'e', 'n', ' '};
        int globalCount = 0;

        for (int i = 0; i <= frase.length - sustituir.length; i++) {
            int cont = 0;

            for (int j = 0; j < sustituir.length - 1; j++) {
                if (frase[i + j] == sustituir[j]) {
                    cont++;
                }
            }

            globalCount += cont;

            if (cont >= sustituir.length - 1) {
                for (int x = i; x < frase.length - (cont + 1); x++) {
                    frase[x] = frase[x+cont+1];
                }
            }

        }
        for (int k = frase.length - (globalCount + 1); k < frase.length; k++) {
            frase[k] = ' ';
        }
        
        System.out.println(frase);
    }

}
