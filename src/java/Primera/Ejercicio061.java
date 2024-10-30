package Primera;

// Sumar enteros desde programa principal y 
public class Ejercicio061 {

    public static void main(String arg[]) {
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'a';
        char sustituto = 'X';
       
        cambiar(frase, sustituir, sustituto);
        
        System.out.println(frase);
    }

    public static void cambiar(char[] frase, char sustituir, char sustituto) {
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == sustituir){
                frase[i] = sustituto;
            }           
        }


    }
}
