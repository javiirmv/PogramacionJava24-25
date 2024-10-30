package Primera;

public class Ejercicio063 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[100];

        for (int i = 0; i < frase.length; i++) {
            frase2[i] = frase[i];
        }

        char sustituir = 'n';
        char[] sustituto = {'X', 'Y', 'Z'};

        cambiar(frase2, sustituir, sustituto);
        System.out.println(frase2);
    }

    public static void cambiar(char[] frase, char sustituir, char[] sustituto) {

        for (int i = frase.length; i > 0; i--) {
            if (frase[i - 1] == sustituir) {
                for (int z = 0; z < sustituto.length; z++) {
                    for (int x = frase.length - i, j = 1; x > 0; x--, j++) {
                        frase[frase.length - 1 - j] = frase[frase.length - 2 - j];
                    }
                    frase[i - 1 ] = sustituto[sustituto.length - 1 - z];
                    frase[i +z] = sustituir;
                }

            }
        }

    }
}
