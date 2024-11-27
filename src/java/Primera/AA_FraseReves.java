package Primera;

// Sumar enteros desde programa principal y 
public class AA_FraseReves {

    public static void main(String arg[]) {
        char frase1[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[250];

        for (int i = 0; i < frase1.length; i++) {
            frase2[i] = frase1[frase1.length-1-i];
            
        }
        System.out.println(frase2);

    }

}
