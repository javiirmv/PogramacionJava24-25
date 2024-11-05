package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio069 {

    public static void main(String arg[]) {
        char frase1[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[250];
        char frase3[] = new char[250];

        int cont = 0;
        int vecesDuplicar = 2;
        for (int x = 0; x < vecesDuplicar; x++) {
            for (int i = 0; i < frase1.length; i++) {
                cont++;
                frase2[cont] = frase1[i];

            }
        }

        System.out.println(frase2);
        System.out.println();

        for (int cont2 = 0, i = 0; cont2 < frase1.length * vecesDuplicar; cont2++, i++) {
            frase3[cont2] = frase1[i];
            if (i >= frase1.length-1) {
                i = -1;
            }
        }

        System.out.println(frase3);

    }

}
