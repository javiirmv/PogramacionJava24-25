package Primera;

public class Ejercicio064 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', 'n', 'n', 'n', ' ', 'u', 'n', 'n', 'n', 
            ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', 
            ' ', 'n', 'n', 'n', 'n', 'M', 'a', 'n', 'c', 'h', 'a'};
        char subcadena[] = {'n', 'n', 'n'};
        int contador = 0;

        for (int i = 0; i < frase.length - 1; i++) {
            int subContador = 0;

            for (int x = 0; x < subcadena.length && i <= frase.length - subcadena.length ; x++) {
                if (frase[i + x] == subcadena[x]) {
                    subContador++;
                } else {
                    break;
                }
            }

            if (subContador == subcadena.length) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
