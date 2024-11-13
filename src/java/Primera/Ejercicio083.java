package Primera;

public class Ejercicio083 {

    public static void main(String arg[]) {
        String frase = "Había una vez, un circo, que alegraba siempre el corazón.";
        int posicion = frase.indexOf(' ');

        while (posicion > -1) {
            String inicio = frase.substring(0, posicion);
            String fin = frase.substring(++posicion);
            frase = inicio.concat(fin);
            posicion = frase.indexOf(' ', posicion+1);
        }

        System.out.println(frase);
    }
}
