package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio076 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'U', 'n', ' ', 'l', 'u', 'g', 'A', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};

        for (int i = 0; i < frase.length; i++) {

            switch (frase[i]) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    frase[i] = Character.toUpperCase(frase[i]);
                    break;

                case 'A': case 'E': case 'I': case 'O': case 'U':
                    frase[i] = Character.toLowerCase(frase[i]);
                    break;
                    
                default:
                    frase[i] = '-';
                    break;
            }

        }

        System.out.println(frase);

    }

}
