package Primera;

public class Ejercicio089_2 {

    public static void main(String arg[]) {
        String frase = "Había una vez un circo ";
        String fraseA = "";
        String fraseB = "";

        boolean primera = true;

        int inicio = 0;
        int fin = frase.indexOf(' ');

        while (fin != -1) {
            String palabra = frase.substring(inicio, fin+1);

            if (primera) {
                fraseA = fraseA.concat(palabra);
            } else {
                fraseB = fraseB.concat(palabra);
            }

            primera = !primera;

            inicio = fin+1;
            fin = frase.indexOf(' ', inicio);

        }

        System.out.println(fraseA);
        System.out.println(fraseB);

    }
}
