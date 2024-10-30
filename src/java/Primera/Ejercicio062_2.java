package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio062_2 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'a';
        char[] sustituto = {'X', 'X', 'V'};

        char[] frase2 = cambiar(frase, sustituir, sustituto);

        System.out.println(frase2);
    }

    public static char[] cambiar(char[] frase, char sustituir, char[] sustituto) {
        char fraseMod[] = new char[50];
  

        for (int i = 0, j = 0; i < frase.length; i++, j++) {

            if (frase[i] == sustituir) {
                for (char letter: sustituto) {
                    fraseMod[j] = letter;
                    j++;
                }
            }else{
                fraseMod[j] = frase[i];
            }
        }

        return fraseMod;

    }
}
