package Primera;

public class Ejercicio084 {

    public static void main(String arg[]) {
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String vector[];
        int posicion = frase.indexOf(' ');
        int cont = 0;
        while (posicion > -1) {
            cont++;
            posicion = frase.indexOf(' ', posicion + 1);
        }

        posicion = 0;

        vector = new String[cont];

        for (int i = 0; i < cont; i++) {
            String numFrase = frase.substring(posicion, frase.indexOf(' ', posicion)+1);
            posicion = frase.indexOf(' ', posicion)+1;
            vector[i] = numFrase;
        }

        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < (vector.length - 1 - i); j++) {
                if (vector[j].charAt(0) > vector[j+ 1].charAt(0)) {
                    String inter = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = inter;
                }
            }
        }

        frase = "";

        for (int i = 0; i < vector.length; i++) {
            frase = frase.concat(vector[i]);
        }

        System.out.println(frase);

    }
}
