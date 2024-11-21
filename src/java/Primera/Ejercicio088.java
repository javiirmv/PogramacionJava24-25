package Primera;

public class Ejercicio088 {

    public static void main(String arg[]) {
        String frase = "Habían una    vez   un     circo   que   alegraba   siempre    elcorazón   cora fsfsd a   ";

        int posicion = frase.indexOf(' ');

        while (posicion > -1) {
            String inicio = frase.substring(0, posicion);

            while (posicion < frase.length() && frase.charAt(posicion) == ' ') {
                posicion++;
            }
            --posicion;

            String fin = frase.substring(posicion);
            frase = inicio.concat(fin);
            
            posicion = frase.indexOf(' ', posicion + 1);

        }

        System.out.println(frase);

    }
}
