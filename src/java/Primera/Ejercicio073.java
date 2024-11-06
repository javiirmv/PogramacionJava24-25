package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio073 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'n';
        for (int i = 0; i < frase.length - 1; i++) {
            if (frase[i] == sustituir) {

                for (int x = i; x < frase.length - 1; x++) {
                    frase[x] = frase[x + 1];

                }
                frase[frase.length - 1] = ' ';
            } 
        }

        System.out.println(frase);

    }

}
