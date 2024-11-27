package Primera;

public class AA_PalabrasReves {

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

                for (int x = 0; x < cont / 2; x++) {
                    char aux = frase[i - cont + x];
                    frase[i - cont + x] = frase[i - 1 - x];
                    frase[i - 1 - x] = aux;
                }


            }

        }

        System.out.println(frase);

    }
}
