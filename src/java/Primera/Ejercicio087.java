package Primera;

public class Ejercicio087 {

    public static void main(String arg[]) {
        String frase = "Había una vez un circo que alegraba siempre el corazón ";

        int posicion = frase.indexOf(' ');

        while (posicion > -1) {
            String inicio = frase.substring(0, posicion).concat("a");
            String fin = frase.substring(posicion);
            frase = inicio.concat(fin);
            posicion = frase.indexOf(' ', posicion + 2);
        }
        
        System.out.println(frase);

    }
}
