package Primera;

public class Ejercicio065 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0;

        for (int i = 0; i < frase.length; i++) {

            if (frase[i] == ' ') {

                for (int x = 0; x < (i - inicio) / 2; x++) {
                    char aux = frase[inicio  + x];
                    frase[inicio + x] = frase[i - x - 1];
                    frase[i - x - 1] = aux;

                }

                inicio = i +1;
            }

        }

        System.out.println(frase);

    }
}
