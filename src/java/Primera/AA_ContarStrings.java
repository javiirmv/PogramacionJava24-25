package Primera;

public class AA_ContarStrings {

    public static void main(String arg[]) {
        String frase = "En un lugar de la Mancha Mancha, de cuyo nombre no quiero acordarme";

        //frase = frase.replace('a', 'X');
        System.out.println(frase);

        
        int posicion = 0;
        int contador = 0;
        
        while (frase.indexOf("Mancha", posicion) != -1) {
            posicion = frase.indexOf("Mancha", posicion);
            posicion++;
            contador++;
        }
        System.out.println("Aparece " + contador + " veces.");
        
        
    }
}