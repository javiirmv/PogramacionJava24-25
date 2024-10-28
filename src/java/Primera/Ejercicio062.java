package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio062 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'a';
        char[] sustituto = {'X', 'X', 'V'};

        char[] frase2 = cambiar(frase, sustituir, sustituto);

        System.out.println(frase2);
    }

    public static char[] cambiar(char[] frase, char sustituir, char[] sustituto) {
        char fraseMod[] = new char[50];

        int contador = 0;

        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == sustituir) {
                frase[i] = sustituto[contador];
                contador++;
            }
        }
        
        return frase;                

    }
}
