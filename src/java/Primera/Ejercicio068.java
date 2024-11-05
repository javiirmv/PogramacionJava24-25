package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio068 {

    public static void main(String arg[]) {
        char frase1[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[250];
        char caracter = 'a';
        char[] subCadena = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0, j = 0; i < frase1.length; i++, j++) {
            if (frase1[i] == caracter) {
                for (int x = 0; x < subCadena.length; x++) {
                    frase2[j++] = subCadena[x];
                }
                j += 10;

            } else {
                
                frase2[j] = frase1[i];
            }

        }

        System.out.println(frase2);

    }

}
