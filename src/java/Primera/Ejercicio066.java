package Primera;

public class Ejercicio066 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};

        for (int i = 0; i < frase.length; i++) {
            int cont = 0;

            if (frase[i] == ' ') {
                for (int x = i - 1; x >= 0; x--) {
                    if (frase[x] != ' ') {
                        cont++;
                    } else {
                        break;
                    }

                }
                
                for (int j = 1; j < cont; j++) {
                    for (int x = cont; x > 1; x--) {
                        char aux = frase[i - x + 1];
                        frase[i - x + 1] = frase[i - x];
                        frase[i - x] = aux;
                    }
                }

            }

        }

        System.out.println(frase);
    }
}