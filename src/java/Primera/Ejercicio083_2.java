package Primera;

public class Ejercicio083_2 {

    public static void main(String arg[]) {
        String frase = "Había una vez, un circo, que alegraba siempre el corazón. ";
        int posicion = frase.indexOf(' ');

        while (posicion != -1) {
            frase = frase.substring(0,posicion).concat(frase.substring(++posicion)); 
            posicion = frase.indexOf(' ', posicion+1);
        }

        System.out.println(frase);
        
    }
}
