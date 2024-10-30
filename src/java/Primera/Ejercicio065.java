package Primera;

public class Ejercicio065 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};

        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == ' ') {
                int cont = 0;
                for (int x = i - 1; x >= 0; x--) {
                    if (frase[x] != ' ') {
                        cont++;
                        System.out.print(frase[x]);
                    } else {
                        break;
                    }
                    System.out.print(cont);

                }
                System.out.print(" ");
            }
        }

    }
}
