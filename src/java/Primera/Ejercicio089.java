package Primera;

public class Ejercicio089 {

    public static void main(String arg[]) {
        String frase = "Habían una vez un circo ";
        String fraseA = "";
        String fraseB = "";

        boolean primera = true;

        int posicion = 0;

        while (posicion > -1 && posicion < frase.length()) {
            int fin = frase.indexOf(' ', posicion + 1);
            if (fin > -1) {
                String inicio = frase.substring(posicion, fin);

                if (primera) {
                    fraseA = fraseA.concat(inicio);
                } else {
                    fraseB = fraseB.concat(inicio);
                }
                
                primera = !primera;
                
                posicion = frase.indexOf(' ', posicion + 1);
            } else {
                break;
            }

        }

        System.out.println(fraseA);
        System.out.println(fraseB);

    }
}
