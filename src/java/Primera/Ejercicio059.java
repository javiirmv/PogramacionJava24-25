package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio059 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};

        char[] fraseMod = sustituirPalabras(frase);

        System.out.println(fraseMod);
    }

    public static char[] sustituirPalabras(char[] frase) {

        char fraseMod[] = new char[50];

        for (int i = 0; i < frase.length; i++) {
            fraseMod[i] = frase[i];
            if (frase[i] == ' ') {
                fraseMod[i] = 'X';
            }
        }

        return fraseMod;

    }
}
