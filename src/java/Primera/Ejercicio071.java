package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio071 {

    public static void main(String arg[]) {
        char frase1[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char subcad1[] = {'e', 'n', ' '};
        char subcad2[] = {'X', 'X', 'X', 'X', 'X'};
        char cadena2[] = new char[150];

        for (int i = 0, j = 0; i < frase1.length; i++,  j++) {
            int contCadena = 0;
            for (int x = 0; x < subcad1.length; x++) {
                if (x+i < frase1.length - subcad1.length && frase1[i + x] == subcad1[x]) {
                    contCadena++;
                }
            }

            if (contCadena >= subcad1.length) {
                for (int x = 0; x < subcad2.length; x++){
                    cadena2[j++] = subcad2[x];
                }
                j--;
            } else {
                cadena2[j] = frase1[i];
            }
        }
        
        System.out.println(cadena2);

    }

}
