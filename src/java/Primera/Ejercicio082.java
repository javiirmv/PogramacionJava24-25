package Primera;

public class Ejercicio082 {

    public static void main(String arg[]) {
        String frase[] = {"en un lugar", "de la Mancha", ",de cuyo nombre", "no quiero acordarme"};
        String subCadena = "en";

        for (int i = 0; i < frase.length; i++) {
            frase[i] = frase[i].replace(subCadena, subCadena.toUpperCase());
            frase[i] = frase[i].concat(" - fin.");
            System.out.println(frase[i]);

        }

        

    }
}
