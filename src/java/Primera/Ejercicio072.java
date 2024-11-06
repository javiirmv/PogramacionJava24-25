package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio072 {

    public static void main(String arg[]) {
        char frase[] = {' ', 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e'};
        char frase2[] = new char[150];
        int cont = 0;
        for (int i = frase.length - 1, j = 0; i >= 0; i--, j++) {
            if (frase[i] != ' ') {
                cont++;

            } else {
                for (int x = cont; x > 0; x--) {
                    frase2[j - x] = frase[i + cont - x + 1];
                }
                
                frase2[j] = ' ';
                cont = 0;
            }
        }

       System.out.println(frase2);

    }

}
