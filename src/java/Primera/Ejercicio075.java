package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio075 {

    public static void main(String arg[]) {
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int cont = 0;

        for (int i = 0; i < frase.length; i++) {

            if (frase[i] == ' ') {
                frase[i - cont] = Character.toUpperCase(frase[i - cont]);
                frase[i - 1] = Character.toUpperCase(frase[i - 1]);

                cont = 0;
            } else {
                cont++;
            }

        }

        System.out.println(frase);

    }

}
