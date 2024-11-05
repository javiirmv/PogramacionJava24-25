package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio070 {

    public static void main(String arg[]) {
        char frase1[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[250];
        int i = 0;

        for (i = 0; i < frase1.length; i++) {
            frase2[i] = frase1[i];
        }

        
        for (int x = i, j= 0; j < frase1.length; x++, j++) {
            frase2[x] = frase1[frase1.length - 1 - j];
        }
        
        System.out.println(frase2);

    }

}
